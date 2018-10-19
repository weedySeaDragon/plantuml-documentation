# Create PUML files for all Deployment elements
#
#  TODO  refactor:  DRY font methods
#

import os.path
from pathlib import Path

PUML_EXT = ".puml"
OUTPUT_DIR = "element-skinparam-pumls"

# Background Color

# Border Color

NEWLINE = "\n"
SPC = " "

# Example:
STARTUML = "@startuml" + NEWLINE
ENDUML = "@enduml"
INCLUDE_STYLE = "!include ../../../plantuml-styles/plantuml-ae-noshadowing.iuml" + NEWLINE
TITLE = "title "
SKINPARAM = "skinparam "

FONT = "Font"
COLOR = "Color"
SIZE = "Size"
STYLE = "Style"
NAME = "Name"
STEREOTYPE = "Stereotype"
BORDER = "Border"
BACKGROUND = "Background"

FONT_SIZE = 18
FONT_STYLE = 'italic'
FONT_NAME = 'Papyrus'
FONT_COLOR = 'red'
BACKGROUND_COLOR = 'lawnGreen'
BORDER_COLOR = 'red'

STEREOTYPE_STR = '<<Stereotype>>'

# --------------------------------------------

def save_file( path, fname, contents ):
    with open( os.path.join( path, fname ), 'w' ) as f:
        f.write( contents )


def make_filename(sk_option):
    return (sk_option + PUML_EXT).replace( ' ', '-' )


# @startuml
# !include ../../../plantuml-styles/plantuml-ae-noshadowing.iuml
#
# title AgentFontSize 18
# skinparam AgentFontSize 18
#
# agent agent
#
# @enduml

def puml_start( sk_option ):
    puml_str = STARTUML
    puml_str += INCLUDE_STYLE
    puml_str += NEWLINE
    puml_str += SKINPARAM + sk_option + NEWLINE
    puml_str += NEWLINE
    puml_str += TITLE + sk_option + NEWLINE
    puml_str += NEWLINE
    return puml_str


def puml_end( itemName , suffix_str):
    puml_str = itemName.lower() + SPC + itemName + SPC + suffix_str + NEWLINE
    puml_str += ENDUML
    return puml_str


def create_background_color(itemname, suffix, color, outpath ):
    sk_option = itemname + suffix + BACKGROUND + COLOR + SPC + color
    background_color_str = puml_start(sk_option) + puml_end(itemname, '')
    fname = make_filename(sk_option)
    save_file( outpath, fname, background_color_str )


def create_border_color(itemname, suffix, color, outpath ):
    sk_option = itemname + suffix + BORDER + COLOR + SPC + color
    border_color_str = puml_start(sk_option) + puml_end(itemname, '')
    fname = make_filename(sk_option)
    save_file( outpath, fname, border_color_str )




def font_option( itemName, suffix, value, variation ):
    return itemName + suffix + FONT + variation + SPC + value


def create_font_size( itemName, suffix, itemSuffixStr, size ):
    sk_option = font_option( itemName, suffix, str( size ), SIZE )

    return puml_start( sk_option ) + puml_end( itemName, itemSuffixStr )


def create_font_style( itemName, suffix, itemSuffixStr, style ):
    sk_option = font_option( itemName, suffix, style, STYLE )
    return puml_start( sk_option ) + puml_end( itemName, itemSuffixStr )


def create_font_name( itemName, suffix, itemSuffixStr, name ):
    sk_option = font_option( itemName, suffix, name, NAME )
    return puml_start( sk_option ) + puml_end( itemName, itemSuffixStr  )


def create_font_color( itemName, suffix, itemSuffixStr, color ):
    sk_option = font_option( itemName, suffix, color, COLOR )
    return puml_start( sk_option ) + puml_end( itemName, itemSuffixStr  )


def create_font_files( itemname, itemsuffix, itemSuffixStr, outpath ):

    font_size_str = create_font_size( itemname, itemsuffix, itemSuffixStr, FONT_SIZE )
    fname = make_filename( font_option( itemname, itemsuffix, str( FONT_SIZE ), SIZE ) )
    save_file( outpath, fname, font_size_str )

    font_style_str = create_font_style( itemname, itemsuffix, itemSuffixStr, FONT_STYLE )
    fname = make_filename( font_option( itemname, itemsuffix, FONT_STYLE, STYLE ) )
    save_file( outpath, fname, font_style_str )

    font_name_str = create_font_name( itemname, itemsuffix, itemSuffixStr, FONT_NAME )
    fname = make_filename( font_option( itemname, itemsuffix, FONT_NAME, NAME ) )
    save_file( outpath, fname, font_name_str )

    font_color_str = create_font_color( itemname, itemsuffix, itemSuffixStr, FONT_COLOR )
    fname = make_filename( font_option( itemname, itemsuffix, FONT_COLOR, COLOR ) )
    save_file( outpath, fname, font_color_str )


# --------------------------------------------------------------

elements = { 'Agent',
             'Artifact',
             'Boundary',
             'Card',
             'Cloud',
             'Component',
             'Control',
             'Database',
             'Entity',
             'File',
             'Folder',
             'Frame',
             'Interface',
             'Node',
             'Package',
             'Queue',
             'Rectangle',
             'Stack',
             'Storage',
             'Usecase' }

# make the output directory if it doesn't exist

if (not os.path.exists( OUTPUT_DIR )):
    os.mkdir( OUTPUT_DIR )

outpath = Path( OUTPUT_DIR )

for element in elements:

    create_font_files( element, '', '', outpath )

    create_font_files( element, STEREOTYPE, STEREOTYPE_STR, outpath )

    create_background_color( element, '', BACKGROUND_COLOR, outpath )
    create_border_color( element, '', BORDER_COLOR, outpath )