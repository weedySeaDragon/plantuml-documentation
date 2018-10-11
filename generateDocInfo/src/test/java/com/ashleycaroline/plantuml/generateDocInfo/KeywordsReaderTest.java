package com.ashleycaroline.plantuml.generateDocInfo;


import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class KeywordsReaderTest {


    @Test
    void readLanguageFile() {

        List<String> languageContents = KeywordsReader.readLanguageFile();

        assertEquals(795, languageContents.size());
    }



} // end class KeywordsReaderTest