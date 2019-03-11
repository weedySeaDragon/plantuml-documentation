package com.ashleycaroline.plantuml.generateDocInfo;

/********************************************************************************
 *
 *  Class:  PlantumlInfoGenerator
 *
 *  Responsibility: Get information out of PlantUML that can be used for documentation:
 *    - authors: the list of PlantUML authors  (java -jar plantuml -authors)
 *    - help: help info     (java -jar plantuml -help)
 *    - patterns: Regular Expression patterns that can used in PlantUML diagrams (java -jar plantuml -patterns)
 *    - language: keywords for diagrams and skinparam (java -jar plantuml -language)
 *      - colors used -> color sample files
 *
 *  (The command lines to get the raw info from PlantUML are in the parentheses.)
 *
 *  This reads data from the raw info directly from the PlantUML classes and methods and then manipulates it to
 *  produce useful things. (RST files, color samples, etc.)
 *
 *
 *  @file PlantumlInfoGenerator
 *  @project documentation  (local project name)
 *
 *  @author Ashley Engelund   ashley@ashleycaroline.com | weedySeaDragon@github
 *  @since 30 Sep 2018
 *
 ********************************************************************************/


import com.google.common.io.Resources;
import net.sourceforge.plantuml.command.UmlDiagramFactory;

import net.sourceforge.plantuml.syntax.LanguageDescriptor;
import net.sourceforge.plantuml.version.PSystemVersion;
import org.reflections.Reflections;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


import static com.ashleycaroline.plantuml.generateDocInfo.GeneratorConsts.*;


import static com.ashleycaroline.plantuml.generateDocInfo.StringPadder.padStringWithSpaces;


public class PlantUmlInfoGenerator {

    // these are protected so that tests can access them
    
    protected static final String TEMPLATES = "templates";
    
    protected static final String RESOURCE_TEMPLATES_DIR = Resources.getResource( TEMPLATES ).getPath();
    protected static final String RESOURCE_PUML_GEND_DIR = Resources.getResource( PLANTUML_GENERATED ).getPath();
    protected static final String RESOURCE_PUML_OUTFILES_DIR = Resources.getResource( PUML_FILES_BASE_DIR ).getPath();
    protected static final String RESOURCE_COLOR_OUTFILES_DIR = Resources.getResource( COLOR_FILES_DIR ).getPath();


    protected static final String PUML_COLOR_TEMPLATE_FN = "puml-color-file-template.txt";

    protected static final String COLOR_REPLACEMENT_PATTERN = "COLOR_NAME";

    protected static final String OUTPUTFN_PREFIX = "plantUML-";

    protected static final String COLOR_NAMES_TABLE_FILENAME = "COLOR_NAMES_RST_TABLE.TXT";
    protected static final String COLORS_ONLY_TABLE_FILENAME = "COLORS_RST_TABLE.TXT";

    
    protected static final String NAMES_AND_COLORS_SEPARATOR = "+-----------------------+------------------------------------------------+\n";
    protected static final String NAMES_AND_COLORS_HEADER    = "| color name            | example                                        |\n";
    protected static final Integer NAMES_AND_COLORS_COL1_LENGTH = 22;
    protected static final Integer NAMES_AND_COLORS_COL2_LENGTH = NAMES_AND_COLORS_SEPARATOR.length() - 1 - 1 - NAMES_AND_COLORS_COL1_LENGTH - 1 - 1 - 1;
    //  = total length - space -s tartingChar - column 1 length - middleChar - endingChar - newlineChar


    protected static final String ROW_START = "| ";


    public static List< String > getPlantUMLAuthors() {

        return PSystemVersion.getAuthorsStrings( false );
    }


    public static void writePUMLColorFiles() throws IOException {

        // read in the colors
        List< String > colors = readFileIntoList( RESOURCE_PUML_GEND_DIR, OUTPUTFN_PREFIX + "color" + TEXT_EXT );

        // write them out
        writePUMLColorFilesFor( colors );

    }


    /**
     * For each color:
     * - create a .puml file based on the template file (just shows a square of the color)
     * - add an entry to the names and colors  file (a RST Table with the names and .puml color samples)
     * - add an entry to the color file (a RST Table with just the .puml color samples)
     * <p>
     * Here's an example of what the names and colors file looks like:
     * <p>
     * +----------------------+------------------------------------------------+
     * | color name           | example                                        |
     * | Grey                 | .. uml:: source/puml/Grey.puml                 |
     *
     * @param colorNames The list of names of all of the colors recognized by PlantUML
     *
     * @exception  IOException if there is any kind of IO problem writing the files
     */
    public static void writePUMLColorFilesFor( List< String > colorNames ) throws IOException {

        ColorSampleRSTWriter colorSampleRSTWriter = new ColorSampleRSTWriter();

        StringBuilder names_and_colors_rstTableMarkupSB = new StringBuilder();

        // read in the template file
        String templateFile = readFileIntoString( RESOURCE_TEMPLATES_DIR, PUML_COLOR_TEMPLATE_FN );

        names_and_colors_rstTableMarkupSB.append( names_and_colors_table_header() );

        for ( Object colorName : colorNames.toArray() ) {

            String colorNameStr = (String) colorName;
            writePUMLColorFile( colorNameStr, templateFile );

            String puml_str = PUML_RST_DIRECTIVE + colorNameStr + PUML_EXT;

            names_and_colors_rstTableMarkupSB.append( names_and_colors_entry( colorNameStr, puml_str ) );

            colorSampleRSTWriter.add_color( colorNameStr );
        }

        System.out.println( names_and_colors_rstTableMarkupSB.toString() );

        writeToResourceFile( RESOURCE_PUML_OUTFILES_DIR, COLOR_NAMES_TABLE_FILENAME, names_and_colors_rstTableMarkupSB.toString() );
        writeToResourceFile( RESOURCE_PUML_OUTFILES_DIR, COLORS_ONLY_TABLE_FILENAME, colorSampleRSTWriter.generate_rst_table() );

    }


    private static void writePUMLColorFile( String colorStr, String templateFile ) {

        String colorReplacedContents = templateFile.replaceAll( COLOR_REPLACEMENT_PATTERN, colorStr );
        writeToResourceFile( RESOURCE_COLOR_OUTFILES_DIR, colorStr + PUML_EXT, colorReplacedContents );
    }


    private static String names_and_colors_table_header() {

        return NAMES_AND_COLORS_SEPARATOR +
                NAMES_AND_COLORS_HEADER +
                NAMES_AND_COLORS_SEPARATOR;
    }


    private static String names_and_colors_entry( String colorStr, String puml_str ) {

        String entry = ROW_START +
                padStringWithSpaces( colorStr, NAMES_AND_COLORS_COL1_LENGTH ) +
                RST_TABLE_COL_SEP +
                padStringWithSpaces( puml_str, NAMES_AND_COLORS_COL2_LENGTH ) +
                RST_TABLE_ROW_END +
                NAMES_AND_COLORS_SEPARATOR;
        return entry;
    }


    public static void writeKeywordsToSeparateFiles() {

        Map< String, List< String > > keywordsMap = getPlantUMLKeywords();

        keywordsMap.forEach( ( key, value ) -> {

            String outputString = "";

            outputString = value.stream().collect( Collectors.joining( "\n" ) );

            // write the entries out
            writeToPUMLGenResourceFile( OUTPUTFN_PREFIX + key + TEXT_EXT, outputString );

        } );

    }


    private static void writeToPUMLGenResourceFile( String fileName, String fileContents ) {

        writeToResourceFile( RESOURCE_PUML_GEND_DIR, fileName, fileContents );
    }


    private static void writeToResourceFile( String dir, String fileName, String fileContents ) {

        Path writePathFN = Paths.get( dir, fileName );

        try {
            Files.isWritable( writePathFN );

            BufferedWriter writer = Files.newBufferedWriter( writePathFN, StandardCharsets.UTF_8 );
            writer.write( fileContents );
            writer.flush();
            writer.close();
        } catch ( IOException e ) {
            String errMsg = "\n\n ERROR: Could not write to " + writePathFN;
            System.out.println( errMsg );
            System.err.println( errMsg );
            e.printStackTrace();
        }

    }


    public static Map< String, List< String > > getPlantUMLKeywords() {

        Map< String, List< String > > keywordsMap = new HashMap<>();

        String startSectionRegexpStr = ";([\\w]+)\\s*";
        Pattern startSectionRegexp = Pattern.compile( startSectionRegexpStr );
        String sectionEntryCountRegexpStr = ";([\\d]+)\\s*";
        Pattern sectionEntryCountRegexp = Pattern.compile( sectionEntryCountRegexpStr );
        Pattern endOfFileRegexp = Pattern.compile( ";EOF\\s*" );

        String rawKeywordsString = getPlantUMLLanguageInfo();

        List< String > currentList = new ArrayList<>();

        Scanner scanner = new Scanner( rawKeywordsString );
        while ( scanner.hasNextLine() ) {
            String line = scanner.nextLine();

            // process the line

            if ( !line.trim().isEmpty() ) {  // ignore empty and blank lines

                if ( !sectionEntryCountRegexp.matcher( line ).matches() ) {  // ignore entry count lines

                    if ( !endOfFileRegexp.matcher( line ).matches() ) {  // ignore the end of file line

                        Matcher startSectionMatcher = startSectionRegexp.matcher( line );
                        if ( startSectionMatcher.matches() ) {
                            String key = startSectionMatcher.group( 0 );
                            currentList = new ArrayList<>();
                            keywordsMap.put( key.substring( 1 ), currentList ); // remove the starting ';' from key
                        } else {
                            currentList.add( line );
                        }

                    }
                }
            }

        }
        scanner.close();

        return keywordsMap;
    }


    public static String getPlantUMLLanguageInfo() {

        try ( ByteArrayOutputStream outStream = new ByteArrayOutputStream() ) {
            PrintStream printStream = new PrintStream( outStream );
            LanguageDescriptor languageD = new LanguageDescriptor();
            languageD.print( printStream );

            return outStream.toString();

        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     *
     * @return a Map of PlantUML diagrams and all of the regular expressions for each
     */
    public static Map< String, List< String > > getPlantUMLDiagramRegexPatterns() {

        Map< String, List< String > > resultMap = new TreeMap<>();

        Set< Class< ? extends UmlDiagramFactory > > umlDiagramFactorySubclasses = getPlantUMLDiagramFactorySubclasses();

        resultMap = umlDiagramFactorySubclasses.stream()
                .collect( Collectors.toMap(
                        PlantUmlInfoGenerator::getPlantUMLClassDiagramName,
                        PlantUmlInfoGenerator::getPlantUMLClassKeywords ) );

        // remove any entries that didn't have any keywords
        Collection< List< String > > orderedValues = resultMap.values();
        orderedValues.removeIf( l -> l.isEmpty() );

        return resultMap;

    }


    public static String getPlantUMLClassDiagramName( Class< ? extends UmlDiagramFactory > plantUmlClass ) {

        final String removeFactoryStr = "Factory";

        return ( plantUmlClass.getSimpleName().replaceAll( removeFactoryStr, "" ) );
    }


    /**
     * This method is take from net.sourceforge.plantuml.Run.class : private static void printPattern(UmlDiagramFactory
     * factory) That method is private, so we have to duplicate it here
     * <p>
     * TODO perhaps it'd be easier to just hardcode the list of classes. For example:  the BpmDiagramFactory  only has a
     * constructor with a required DiagramType that must be passed to it. What to do about that -- and those classes
     * that it creates?
     *
     * @param plantUmlClass [Class] - the class that we'll get the keywords from
     *
     * @return [String] - a list of the keywords
     */
    public static List< String > getPlantUMLClassKeywords( Class< ? extends UmlDiagramFactory > plantUmlClass ) {

        List< String > diagramPatterns = new ArrayList<>();

        UmlDiagramFactory pumlObject = null;

        Constructor pumlConstructor = null;
        try {
            pumlConstructor = plantUmlClass.getDeclaredConstructor();
            pumlConstructor.setAccessible( true );

            pumlObject = (UmlDiagramFactory) pumlConstructor.newInstance();

            diagramPatterns = pumlObject.getDescription(); //patternStringForPlantUMLFactory( pumlObject );

        } catch ( NoSuchMethodException e ) {
            // there are some classes that don't have a constructor without arguments.
            // It's not clear that we need to use them anyway.
            System.out.println( "  Skipping class " + plantUmlClass.getName() + " :  constructor method not found." );

        } catch ( InstantiationException | IllegalAccessException | InvocationTargetException e ) {
            // TODO show more info about the error
            e.printStackTrace();
        }
        return diagramPatterns;
    }


    public static void printMap( Map< String, List< String > > pumlMap ) {

        pumlMap.forEach( ( k, v ) -> {
            System.out.printf( "\n\n%s", k.toString() );
            v.forEach( s -> {
                System.out.printf( "\n  %s", s );
            } );
        } );

    }

    // ------------------------------------------------


    private static String patternStringForPlantUMLFactory( UmlDiagramFactory plantUmlFactor ) {

        return plantUmlFactor.getDescription().toString();
    }


    /**
     * Get a list of all classes that are subclasses of plantuml UMLDiagramFactory class
     *
     * @return [Set of the classes] - all classes found
     */
    private static Set< Class< ? extends UmlDiagramFactory > > getPlantUMLDiagramFactorySubclasses() {

        final List< String > plantUMLObjs = List.of( "" );

        Reflections reflections = new Reflections( "net.sourceforge.plantuml" );

        return reflections.getSubTypesOf( UmlDiagramFactory.class );
    }


    private static String readFileIntoString( String dir, String fileName ) throws IOException {

        //Get file from resources folder
        List< String > lines = Files.readAllLines( Paths.get( dir, fileName ), StandardCharsets.UTF_8 );

        return lines.stream().collect( Collectors.joining( "\n" ) ).toString();
    }


    private static List< String > readFileIntoList( String dir, String fileName ) throws IOException {

        //Get file from resources folder
        return Files.readAllLines( Paths.get( dir, fileName ), StandardCharsets.UTF_8 );
    }


}  // end class PlantumlInfoGenerator
