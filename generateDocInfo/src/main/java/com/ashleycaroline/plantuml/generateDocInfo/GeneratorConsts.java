package com.ashleycaroline.plantuml.generateDocInfo;


import com.google.common.io.Resources;

import java.nio.file.Path;
import java.nio.file.Paths;



/********************************************************************************
 *
 *  Class:  GeneratorConsts
 *
 *  Responsibility: Hold all constant definitions needed for this package/module.
 *
 *
 *  file GeneratorConsts
 *  project: plantuml-documentation  (local project name)
 *
 *  @author Ashley Engelund   ashley@ashleycaroline.com | weedySeaDragon@github
 *  @since 02 Oct 2018
 *
 *
 ********************************************************************************/


public class GeneratorConsts {

    static final String PLANTUML_GENERATED = "plantuml-generated";

    static final String TEXT_EXT = ".txt";
    static final String PUML_EXT = ".puml";

    static final String PUML_FILES_BASE_DIR = "puml";
    static final String COLOR_FILES_DIR = PUML_FILES_BASE_DIR + "/" + "colors";

    static final String PUML_RST_DIRECTIVE = ".. uml:: " + COLOR_FILES_DIR + "/";

    static final String RST_TABLE_COL_SEP = "|";
    static final String RST_TABLE_ROW_END = "|\n";


}  // end class GeneratorConsts
