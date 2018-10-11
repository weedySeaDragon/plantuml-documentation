package com.ashleycaroline.plantuml.generateDocInfo;


import java.util.ArrayList;
import java.util.stream.Collectors;


import static com.ashleycaroline.plantuml.generateDocInfo.GeneratorConsts.*;
import static com.ashleycaroline.plantuml.generateDocInfo.StringPadder.*;
import static java.lang.Integer.min;



/********************************************************************************
 *
 *  Class:  ColorSampleRSTWriter
 *
 *  Responsibility: Given a list of color names and puml RST directives, creates
 *   a text file that is a RST table of all of the colors.
 *
 *
 * Here is an example of the table:
 *
 * +------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+
 * |.. uml:: puml/APPLICATION.puml                  |.. uml:: puml/AliceBlue.puml                    |.. uml:: puml/AntiqueWhite.puml                 |.. uml:: puml/Aqua.puml                         |.. uml:: puml/Aquamarine.puml                   |
 * |                                                |                                                |                                                |                                                |                                                |
 * |application                                     |alice blue                                      |AntiqueWhite                                    |Aqua                                            |Aquamarine                                      |
 * |                                                |                                                |                                                |                                                |                                                |
 * +------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+------------------------------------------------+
 *
 *
 *  @file ColorSampleRSTWriter
 *  @project documentation  (local project name)
 *
 *  @author Ashley Engelund   ashley@ashleycaroline.com | weedySeaDragon@github
 *  @since 11 Oct 2018
 *
 ********************************************************************************/


public class ColorSampleRSTWriter {


    private static final Integer TABLE_COLUMN_LENGTH = 48;
    private static final Integer TABLE_NUM_COLUMNS = 5;


    private ArrayList< String > _colors = new ArrayList<>();


    // ================================================


    public void add_color( String colorName ) {

        _colors.add( colorName );
    }


    public ArrayList< String > get_colors() {

        return _colors;
    }


    /**
     * @return [String] the ReStructuredText table filled with the colors we have
     */
    public String generate_rst_table() {

        StringBuilder rstSB = new StringBuilder();

        ArrayList< String > current_group_of_colors = new ArrayList<>();

        // return result fast if we're empty
        if ( this.get_colors().isEmpty() ) {
            return "";
        }

        rstSB.append( table_header() );

        // get the colors in groups of X, where X = TABLE_COLUMN_NUM

        Integer current_group_num = 0;

        while ( ( current_group_num * TABLE_NUM_COLUMNS ) < _colors.size() ) {
            current_group_of_colors.clear();

            // get next set of color names for the next row
            int actual_num_colors = min( TABLE_NUM_COLUMNS, _colors.size() - ( current_group_num * TABLE_NUM_COLUMNS ) );

            for ( int col_num = 0; col_num < actual_num_colors; col_num++ ) {
                current_group_of_colors.add( _colors.get( ( current_group_num * TABLE_NUM_COLUMNS ) + col_num ) );
            }

            // create the next row
            rstSB.append( table_row_for( current_group_of_colors ) );

            current_group_num++;
        }



        return rstSB.toString();

    }
    // ------------------------------------------------


    /**
     * Generate the string for the next row in the RST table for these colors.
     * Put a row separator string on the bottom.
     * (Assume the previous row or start of the table has put a row separator line before this whole row.)
     * <p>
     * Each row in the table has these lines:
     * - puml_column
     * - blank_line
     * - color_name_line
     *
     * @param colors [List<String>]  the list of colors
     *
     * @return [String]
     */
    protected String table_row_for( ArrayList< String > colors ) {

        StringBuilder row_string = new StringBuilder();

        ArrayList< String > puml_strings = puml_strings( colors ); // puml directive line for each of the colors

        row_string.append( make_row_for( puml_strings ) );

        row_string.append( blank_line() );

        row_string.append( make_row_for( colors ) );  // color names

        row_string.append( row_separator_line() );

        return row_string.toString();
    }


    /**
     * Create the string for a row, where each column N is a padded string for columnBodies[N]
     * If the size of columnBodies is less than the number of columns in a row, create the remaining columns
     * with just blank strings.
     *
     * @param columnStrings ArrayList<String> list of the strings that are the bodies of each of the columns in the row
     *
     * @return String the entire row
     */
    protected String make_row_for( ArrayList< String > columnStrings ) {

        StringBuilder colsSB = new StringBuilder();
        Integer num_cols_actually_created = 0;

        num_cols_actually_created = min( TABLE_NUM_COLUMNS, columnStrings.size() );

        for ( int col_num = 0; col_num < num_cols_actually_created; col_num++ ) {
            colsSB.append( column_for( columnStrings.get( col_num ), col_num ) );
        }

        if ( num_cols_actually_created < TABLE_NUM_COLUMNS ) {

            int remainingCols = TABLE_NUM_COLUMNS - num_cols_actually_created;

            for ( int col_num = 0; col_num < remainingCols; col_num++ ) {
                colsSB.append( column_for( "", col_num + num_cols_actually_created ) );
            }
        }

        return colsSB.toString();
    }


    /**
     * Create a the column string with the body of the column = the puml directive for this color name
     *
     * @param colorName    [String] -
     * @param entry_number [Integer] -
     *
     * @return String - the string for this entry in the table, including a new separator line if appropriate.
     */
    protected String puml_column( String colorName, Integer entry_number ) {

        Integer col_num = entry_number % TABLE_NUM_COLUMNS;

        String puml_str = PUML_RST_DIRECTIVE + colorName + PUML_EXT;
        return column_for( puml_str, col_num );
    }


    private ArrayList< String > puml_strings( ArrayList< String > colors ) {

        return colors.stream()
                     .map( this::puml_for )
                     .collect( Collectors.toCollection( ArrayList::new ) );
    }


    private String puml_for( String colorName ) {

        return PUML_RST_DIRECTIVE + colorName + PUML_EXT;
    }



    /**
     * Create a padded column string for this column number.
     * <p>
     * If this is the first column ( column_number == 0 ), then start with the ROW_START.
     * If this is the last column ( column_number == COLORS_TABLE_NUM_COLS - 1 ), then end with the ROW_END
     * and follow it with the separator line.
     *
     * @param body    [String] - the string that needs to be padded
     * @param col_num [Integer] - the column number for this column. Used to determine the column ending.
     *
     * @return String - the string for this entry in the table, including a new separator line if appropriate.
     */
    protected String column_for( String body, Integer col_num ) {

        return RST_TABLE_COL_SEP +
                paddedColumnBody( body ) +
                end_for_col( col_num );
    }




    /**
     * Pad a string with spaces so that the length = table column length
     *
     * @param unpaddedBody [String] the string that needs to be padded
     *
     * @return [String] the space padded string
     */
    protected String paddedColumnBody( String unpaddedBody ) {

        return padStringWithSpaces( unpaddedBody, TABLE_COLUMN_LENGTH );

    }


    /**
     * If this is the last column in a row, then we need to append the row end string.
     * Else the next column will add the separator string that will follow this one, so return an empty string.
     *
     * @param col_num [Integer] the column number (0 == first, starting column in a row)
     *
     * @return [String] the string that should end this column, if any.
     */
    protected String end_for_col( Integer col_num ) {

        return col_num == TABLE_NUM_COLUMNS - 1 ? RST_TABLE_ROW_END : "";

    }


    /**
     * @return [String]  a blank line *within* a table row; all columns are filled with spaces
     */
    protected String blank_line() {

        StringBuilder blankLineSB = new StringBuilder();

        for ( int col_num = 0; col_num < TABLE_NUM_COLUMNS; col_num++ ) {

            blankLineSB.append( RST_TABLE_COL_SEP )
                       .append( paddedColumnBody( "" ) )
                       .append( end_for_col( col_num ) );
        }

        return blankLineSB.toString();

    }


    /**
     * If this is the last column in a row, we need to put a row separator string after it,
     * so return the row separator string.
     * Else just return an empty string.
     *
     * @param col_num [Integer] the column number (0 == first, starting column in a row)
     *
     * @return [String] the row separator string if this is the last column in a row, else an empty string.
     */
    protected String row_separator_line_if_needed( Integer col_num ) {

        return col_num == TABLE_NUM_COLUMNS - 1 ? row_separator_line() : "";

    }


    protected String row_separator_line() {

        final char dash = '-';
        final String colStart = "+";

        StringBuilder sepLineSB = new StringBuilder();

        sepLineSB.append( colStart );

        for ( Integer i = 0; i < TABLE_NUM_COLUMNS; i++ ) {
            sepLineSB.append( padString( "", TABLE_COLUMN_LENGTH, dash ) )

                     .append( colStart );
        }
        sepLineSB.append( "\n" );

        return sepLineSB.toString();
    }


    // -------------------------------------------------------


    /**
     * Create a string that is blank columns for the remainder of the row, followed by a row separator string.
     * Use the last_entry_num to calculate how many blank columns are needed for the remainer of the row.
     *
     * @param next_entry_num [Integer] - the entry number for the last entry written
     *
     * @return
     */
    private String blank_cols_for_row_remainder( Integer next_entry_num ) {

        StringBuilder row_remainderSB = new StringBuilder();

        Integer last_col_num = next_entry_num % TABLE_NUM_COLUMNS;

        Integer cols_needed = TABLE_NUM_COLUMNS - last_col_num;

        for ( Integer i = 0; i < cols_needed; i++ ) {
            row_remainderSB.append( puml_column( "", next_entry_num + i ) );
        }

        return row_remainderSB.toString();

    }


    private String table_header() {

        return row_separator_line();
    }


}  // end class ColorSampleRSTWriter
