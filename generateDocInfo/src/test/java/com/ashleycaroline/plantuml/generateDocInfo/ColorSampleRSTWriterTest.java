package com.ashleycaroline.plantuml.generateDocInfo;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;



class ColorSampleRSTWriterTest {


    @Test
    void generate_rst_table() {

        ColorSampleRSTWriter colorWriter = new ColorSampleRSTWriter();

        colorWriter.add_color( "red" );
        colorWriter.add_color( "blue" );
        colorWriter.add_color( "green" );
        colorWriter.add_color( "yellow" );
        colorWriter.add_color( "orange" );
        colorWriter.add_color( "magenta" );

        String expectedRSTstring =
                "+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+\n" +
                        "|.. uml:: puml/red.puml                          |.. uml:: puml/blue.puml                         |.. uml:: puml/green.puml                        |.. uml:: puml/yellow.puml                       |.. uml:: puml/orange.puml                       |\n" +
                        "|                                                |                                                |                                                |                                                |                                                |\n" +
                        "|red                                             |blue                                            |green                                           |yellow                                          |orange                                          |\n" +
                        "+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+\n" +
                        "|.. uml:: puml/magenta.puml                      |                                                |                                                |                                                |                                                |\n" +
                        "|                                                |                                                |                                                |                                                |                                                |\n" +
                        "|magenta                                         |                                                |                                                |                                                |                                                |\n" +
                        "+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+\n";


        assertEquals( expectedRSTstring, colorWriter.generate_rst_table() );

    }


    @Test
    void generate_rst_table_empty_list() {

        ColorSampleRSTWriter colorWriter = new ColorSampleRSTWriter();


        String expectedRSTstring = "";

        assertEquals( expectedRSTstring, new ColorSampleRSTWriter().generate_rst_table() );

    }


    @Test
    void table_row_for() {

        ArrayList< String > colors = new ArrayList<>();
        colors.add( "red" );
        colors.add( "blue" );
        colors.add( "green" );

        String expectedTableRow =

                "|.. uml:: puml/red.puml                          |.. uml:: puml/blue.puml                         |.. uml:: puml/green.puml                        |                                                |                                                |\n" +
                "|                                                |                                                |                                                |                                                |                                                |\n" +
                "|red                                             |blue                                            |green                                           |                                                |                                                |\n" +
                "+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+\n";

        assertEquals( expectedTableRow, new ColorSampleRSTWriter().table_row_for( colors ) );

    }


    @Test
    void make_row_for() {

        ArrayList< String > colors = new ArrayList<>();
        colors.add( "red" );
        colors.add( "blue" );
        colors.add( "green" );

        String expectedRow = "|red                                             |blue                                            |green                                           |                                                |                                                |\n";

        assertEquals( expectedRow, new ColorSampleRSTWriter().make_row_for( colors ) );
    }


    @Test
    void colors_blank_line() {

        String expectedStr = "|                                                |                                                |                                                |                                                |                                                |\n";

        assertEquals( expectedStr, new ColorSampleRSTWriter().blank_line() );
    }


    @Test
    void end_for_col() {

        ColorSampleRSTWriter colorsWriter = new ColorSampleRSTWriter();

        assertEquals( "", colorsWriter.end_for_col( 0 ) );
        assertEquals( "", colorsWriter.end_for_col( 1 ) );
        assertEquals( "", colorsWriter.end_for_col( 2 ) );
        assertEquals( "", colorsWriter.end_for_col( 3 ) );
        assertEquals( "|\n", colorsWriter.end_for_col( 4 ) );

    }


    @Test
    void separator_for_col() {

        ColorSampleRSTWriter colorsWriter = new ColorSampleRSTWriter();

        String last_row_sep = colorsWriter.row_separator_line();

        assertEquals( "", colorsWriter.row_separator_line_if_needed( 0 ) );
        assertEquals( "", colorsWriter.row_separator_line_if_needed( 1 ) );
        assertEquals( "", colorsWriter.row_separator_line_if_needed( 2 ) );
        assertEquals( "", colorsWriter.row_separator_line_if_needed( 3 ) );
        assertEquals( last_row_sep, colorsWriter.row_separator_line_if_needed( 4 ) );

    }


    @Test
    void colors_table_separator_line() {

        ColorSampleRSTWriter colorsWriter = new ColorSampleRSTWriter();

        String sepLine = "+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+\n";

        String generatedLine = colorsWriter.row_separator_line();

        //assertEquals( sepLine.length(), generatedLine.length() );
        assertEquals( sepLine, generatedLine );
    }

} // end class ColorSampleRSTWriterTest