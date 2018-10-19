package com.ashleycaroline.plantuml.generateDocInfo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import net.sourceforge.plantuml.sequencediagram.SequenceDiagramFactory;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



class PlantumlInfoGeneratorTest {

    @Test
    void writePUMLColorFiles() throws IOException {

        PlantUmlInfoGenerator.writePUMLColorFiles();
    }


    @Test
    void writePUMLColorFilesFor() throws IOException {

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("red");

        PlantUmlInfoGenerator.writePUMLColorFilesFor(colors);

        // assert: the files exist, aren't empty, have the right contents

        assertTrue( Files.exists( Paths.get(PlantUmlInfoGenerator.RESOURCE_COLOR_OUTFILES_DIR, "blue.puml"))  );
        assertTrue( Files.exists( Paths.get(PlantUmlInfoGenerator.RESOURCE_COLOR_OUTFILES_DIR, "red.puml"))  );

        List<String> bluePuml = readFileIntoList(PlantUmlInfoGenerator.RESOURCE_COLOR_OUTFILES_DIR, "blue.puml");
        assertEquals("@startuml", bluePuml.get(0));
        assertEquals("skinparam ClassBackgroundColor #blue", bluePuml.get(2));
        assertEquals("skinparam ClassFontColor #blue", bluePuml.get(3));
        assertEquals("skinparam ClassBorderColor #blue", bluePuml.get(4));

        assertEquals("skinparam ClassStereotypeFontSize 0", bluePuml.get(6));
        assertEquals("skinparam CircledCharacterFontSize 0", bluePuml.get(7));
        assertEquals("skinparam CircledCharacterRadius 0", bluePuml.get(8));
        assertEquals("skinparam ClassBorderThickness 0", bluePuml.get(9));
        assertEquals("skinparam Shadowing false", bluePuml.get(10));

        assertEquals("class Dummy", bluePuml.get(12));
        assertEquals("@enduml", bluePuml.get(14));

        List<String> redPuml = readFileIntoList(PlantUmlInfoGenerator.RESOURCE_COLOR_OUTFILES_DIR, "red.puml");
        assertEquals("skinparam ClassBackgroundColor #red", redPuml.get(2));
        assertEquals("skinparam ClassFontColor #red", redPuml.get(3));
        assertEquals("skinparam ClassBorderColor #red", redPuml.get(4));
    }



    private static List<String> readFileIntoList(String dir, String fileName) throws IOException {

        //Get file from resources folder
        return Files.readAllLines(Paths.get(dir, fileName), StandardCharsets.UTF_8);

    }

    @Test
    void writeKeywordsToSeparateFiles() {

        PlantUmlInfoGenerator.writeKeywordsToSeparateFiles();

    }

    @Test
    void getPlantUMLKeywords() {
        Map<String, List<String>> keywordsMap = PlantUmlInfoGenerator.getPlantUMLKeywords();

        assertFalse(keywordsMap.isEmpty());

        assertEquals(5, keywordsMap.keySet().size());

        assertTrue(keywordsMap.containsKey("type"));
        assertFalse(keywordsMap.get("type").isEmpty());

        assertTrue(keywordsMap.containsKey("keyword"));
        assertFalse(keywordsMap.get("keyword").isEmpty());

        assertTrue(keywordsMap.containsKey("preprocessor"));
        assertFalse(keywordsMap.get("preprocessor").isEmpty());

        assertTrue(keywordsMap.containsKey("skinparameter"));
        assertFalse(keywordsMap.get("skinparameter").isEmpty());

        assertTrue(keywordsMap.containsKey("color"));
        assertFalse(keywordsMap.get("color").isEmpty());

        assertFalse(keywordsMap.containsKey("EOF"));
    }

    @Test
    void getPlantUMLLanguageInfo() {

        String keywords = PlantUmlInfoGenerator.getPlantUMLLanguageInfo();
        System.out.println(keywords);

        assertFalse(keywords.isEmpty());

    }


    @Test
    void getPlantUMLAuthors() {

        List<String> plantUMLauthors = PlantUmlInfoGenerator.getPlantUMLAuthors();

        assertFalse(plantUMLauthors.isEmpty());

        // plantUMLauthors.forEach( author -> {System.out.printf("%s\n", author);} );

        assertTrue(plantUMLauthors.stream().anyMatch(a -> a.contains("Arnaud Roques")));

    }


    @Test
    void getPlantUMLRegexPatterns() throws IOException, ClassNotFoundException {

        Map<String, List<String>> result = PlantUmlInfoGenerator.getPlantUMLDiagramRegexPatterns();

        assertFalse(result.isEmpty());

        printMap(result);

        assertEquals(12, result.keySet().size());
        assertTrue(result.keySet().contains("SequenceDiagram"), "was false. result.keySet= " + result.keySet().toString());
        assertFalse(result.get("SequenceDiagram").isEmpty());

    }


    @Test
    void getPlantUMLClassDiagramName_forSequenceDiagram() {

        String result = PlantUmlInfoGenerator.getPlantUMLClassDiagramName(SequenceDiagramFactory.class);

        assertEquals("SequenceDiagram", result);

    }


    @Test
    void getPlantUMLClassPatterns_forSequenceDiagram() {

        List<String> result = PlantUmlInfoGenerator.getPlantUMLClassKeywords(SequenceDiagramFactory.class);

        assertFalse(result.isEmpty());
        assertEquals(75, result.size());
        assertEquals("(?i)^!pragma[\\s ]+([A-Za-z_][A-Za-z_0-9]*)(?:[\\s ]+(.*))?$", result.get(1));
    }






    // ----------------------------------------------------

    private void printMap(Map<String, List<String>> pumlMap) {

        pumlMap.forEach((k, v) -> {
            System.out.printf("\n\n\n%s:", k.toString());
            v.forEach(s -> {
                System.out.printf("\n\n  %s", s);
            });
        });

    }

} // end class PlantumlInfoGeneratorTest