package com.ashleycaroline.plantuml.generateDocInfo;


import java.util.Arrays;


/********************************************************************************
 *
 *  Class:  StringPadder
 *
 *  Responsibility: utility functions to pad Strings:
 *      - given a string, pad it with a character out so that the string is length X
 *      - given a string, pad it with spaces so that the string is length X
 *
 *
 *  file: StringPadder.java
 *  project: plantuml-documentation  (local project name)
 *
 *  @author Ashley Engelund   ashley@ashleycaroline.com | weedySeaDragon@github
 *  @since 11 Oct 2018
 *
 ********************************************************************************/


public class StringPadder {

    private final static Character SPACE = ' ';


    // ================================================


    /**
     * Pad a string with spaces so that the length of str  = maxLength
     *
     * @param maxLength [Integer] - the total length we're aiming for
     * @param str       [String] - a given string
     *
     * @return String - the padded string
     */
    public static String padStringWithSpaces( String str, Integer maxLength ) {

        return padString( str, maxLength, SPACE );
    }


    public static String padString( String str, Integer maxLength, char fillCharacter ) {

        char[] repeat = new char[maxLength - str.length()];
        Arrays.fill( repeat, fillCharacter );
        return (str + new String( repeat ));
    }


    // ------------------------------------------------


}  // end class StringPadder
