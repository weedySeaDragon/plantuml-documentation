package com.ashleycaroline.plantuml.generateDocInfo;


import com.google.common.io.Resources;

import java.nio.file.Path;
import java.nio.file.Paths;



/********************************************************************************
 *
 *  Class:  GeneratorConsts
 *
 *  Responsibility: 
 *
 *
 *  @file GeneratorConsts
 *  @project documentation  (local project name)
 *
 *  @author Ashley Engelund   ashley@ashleycaroline.com | weedySeaDragon@github
 *  @since 02 Oct 2018
 *
 *
 ********************************************************************************/


public class GeneratorConsts {

    public static final String TEMPLATES = "templates";
    public static final String RESOURCE_TEMPLATES_DIR = Resources.getResource( TEMPLATES ).getPath();

    public static final String PLANTUML_GENERATED = "plantuml-generated";
    public static final String RESOURCE_PUML_GEND_DIR = Resources.getResource( PLANTUML_GENERATED ).getPath();

    public static final String PUML_FILES_DIR = "puml";
    public static final String RESOURCE_PUML_OUTFILES_DIR = Resources.getResource( PUML_FILES_DIR ).getPath();

    public static final String COLOR_NAMES_TABLE_FILENAME = "COLOR_NAMES_RST_TABLE.TXT";
    public static final String COLORS_ONLY_TABLE_FILENAME = "COLORS_RST_TABLE.TXT";

    public static final String TEXT_EXT = ".txt";
    public static final String PUML_EXT = ".puml";

    public static final String PUML_RST_DIRECTIVE = ".. uml:: puml/";

    protected static final String RST_TABLE_COL_SEP = "|";
    protected static final String RST_TABLE_ROW_END = "|\n";

    public static final String PUML_COLOR_TEMPLATE_FN = "puml-color-file-template.txt";
    public static final String COLOR_REPLACEMENT_PATTERN = "COLOR_NAME";



    public static final Path SOURCE_DIR_PATH =
            Paths.get( "com", "ashleycaroline", "plantuml", "generateDocInfo", "plantuml-generated" );


    public static final String HELP_FN = "help";
    public static final String LANGUAGE_FN = "language";
    public static final String PATTERN_FN = "pattern";


    public static final String OUTPUTFN_PREFIX = "plantUML-";


}  // end class GeneratorConsts
