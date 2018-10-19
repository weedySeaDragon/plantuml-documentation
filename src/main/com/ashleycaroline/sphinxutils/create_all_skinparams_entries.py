# Given an input file with each line = a skinparam option,
# create an output file with:
#   - an 'entry' for each skinparam option,
#   - a line at the top of every letter that is a link to the appropriate section,
#   - a letter header at the start of each section of entries that starts with that letter,
#   - a link back to the top at the end of each section
#
# where an 'entry'  for skinparam option "ActivityBackgroundColor" =
#
#
#  .. index:: ActivityBackgroundColor
#     pair: skinparam; ActivityBackgroundColor
#
#  .. _skinparam_ActivityBackgroundColor:
#
#  .. container:: keyword
#
#     ActivityBackgroundColor
#
#
#  :Usage:
#      :code:`ActivityBackgroundColor zz`
#
#
#  :Applies to:
#
#  zz
#
#
#  :Example:   :code:`skinparam ActivityBackgroundColor zz`:
#
#   .. uml:: puml/sk-ex/handwritten-class-zz.puml
#
#
#
#  TODO:  read entry data from a csv file so information is not clobbered.
#

NEWLINE = "\n"

ROOT_DIR = "../../../../site/sphinx/formatting/"
INPUT_FILENAME = ROOT_DIR + "plantuml-generated/plantUML-skinparameter.txt"
OUTPUT_FILENAME = ROOT_DIR  + "all_skinparams_entries-generated.rst"

INDENT4 = "    "

ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
ALPHA_LINKS_CONTAINER = ".. container:: alphabet-links"

ALPHA_LETTER_REF_START = ":ref:`"
ALPHA_LETTER_REF_LINK_START = "<"
ALPHA_LETTER_REF_END = ">`  "

TO_THE_TOP_CONTAINER = ".. container:: to-the-top"
TO_THE_TOP_REF = "   :ref:`back up to the top <top>`"

TO_THE_TOP_LINES = NEWLINE + NEWLINE + TO_THE_TOP_CONTAINER + NEWLINE + NEWLINE + TO_THE_TOP_REF + NEWLINE

LETTER_SECTION_LINK_START = ".. _"
LETTER_SECTION_LINK_END = ":"
LETTER_SECTION_HEADING_MARKER = "--"  # if it's only 1 long, it's interpreted as a bullet list

CODE_START = ":code:`"
CODE_END = "`"

UML_TAG = ".. uml:: "

PLACEHOLDER = "zz"
SP_PLACEHOLDER = " " + PLACEHOLDER

ENTRY_INDEX_DIRECTIVE_START = ".. index:: "
ENTRY_INDEX_PAIR_START = "    pair: skinparam; "

ENTRY_REFERENCE_LINE_START = ".. _"
ENTRY_REFERENCE_LINE_END = ":"

ENTRY_CONTAINER_DIRECTIVE_LINE = ".. container:: keyword"

ENTRY_USAGE_TAG_LINE = ":Usage:" + NEWLINE
ENTRY_USAGE_START = INDENT4 + CODE_START
ENTRY_USAGE_END = CODE_END

ENTRY_APPLIES_TO_TAG_LINE = ":Applies to:" + NEWLINE

ENTRY_EXAMPLE_LINE_START = ":Example:" + INDENT4 + CODE_START
ENTRY_EXAMPLE_LINE_END = CODE_END + ":" + NEWLINE

ENTRY_UML_LINE_START = UML_TAG + " " + "puml/sk-ex/"

PUML_FILE_EXTENSION = ".puml"

TAG_SEPARATOR_LINES = NEWLINE + NEWLINE

ENTRY_SEPARATOR_LINES = TAG_SEPARATOR_LINES + TAG_SEPARATOR_LINES

# -----------------------------------------------------------------------------


def read_input_file( filename ):
    skinparam_options = list()

    with open( filename, 'r' ) as f:
        skinparam_options = f.readlines()

    return skinparam_options


def create_entry_for( skinparam_option ):
    entry_str = ""

    entry_str += ENTRY_INDEX_DIRECTIVE_START + skinparam_option + NEWLINE
    entry_str += ENTRY_INDEX_PAIR_START + skinparam_option + NEWLINE
    entry_str += NEWLINE
    entry_str += ENTRY_REFERENCE_LINE_START + skinparam_option + ENTRY_REFERENCE_LINE_END + NEWLINE
    entry_str += NEWLINE
    entry_str += ENTRY_CONTAINER_DIRECTIVE_LINE + NEWLINE
    entry_str += NEWLINE
    entry_str += INDENT4 + skinparam_option + NEWLINE
    entry_str += TAG_SEPARATOR_LINES

    # usage
    entry_str += ENTRY_USAGE_TAG_LINE
    entry_str += ENTRY_USAGE_START + skinparam_option + " " + PLACEHOLDER + ENTRY_USAGE_END + NEWLINE
    entry_str += NEWLINE
    entry_str += INDENT4 + PLACEHOLDER + "_description" + NEWLINE
    entry_str += TAG_SEPARATOR_LINES

    # applies to
    entry_str += ENTRY_APPLIES_TO_TAG_LINE
    entry_str += NEWLINE
    entry_str += INDENT4 + PLACEHOLDER + NEWLINE
    entry_str += TAG_SEPARATOR_LINES

    #example
    entry_str += ENTRY_EXAMPLE_LINE_START + skinparam_option + SP_PLACEHOLDER + ENTRY_EXAMPLE_LINE_END
    entry_str += NEWLINE
    entry_str += INDENT4 + ENTRY_UML_LINE_START + skinparam_option + "-" + PLACEHOLDER + PUML_FILE_EXTENSION + NEWLINE

    entry_str += ENTRY_SEPARATOR_LINES

    return entry_str


# create the line at the top with links for each letter section in the page ( = the alphabet, with each letter a link)
#
# .. container:: alphabet_links
#
#   :ref:`A<A>`  :ref:`B<B>` ....  C D E F G H I J K L M N O P Q R S T U V W X Y Z
def create_alphabet_links():
    alpha_links = ""
    alpha_links += ALPHA_LINKS_CONTAINER + NEWLINE
    alpha_links += NEWLINE
    alpha_links += INDENT4

    for letter in ALPHABET:
        alpha_links += ALPHA_LETTER_REF_START + letter + ALPHA_LETTER_REF_LINK_START +letter + ALPHA_LETTER_REF_END

    alpha_links += NEWLINE + NEWLINE + NEWLINE

    return alpha_links


# Ex:
# .._A:
#
#  --
#  A
#  --

def create_letter_section_header(letter):
    section_header = ""

    section_header += LETTER_SECTION_LINK_START + letter + LETTER_SECTION_LINK_END + NEWLINE
    section_header += NEWLINE
    section_header += LETTER_SECTION_HEADING_MARKER + NEWLINE
    section_header += letter + NEWLINE
    section_header += LETTER_SECTION_HEADING_MARKER + NEWLINE
    section_header += NEWLINE

    return section_header

# -----------------------------------------------


entries = read_input_file(INPUT_FILENAME)


output_str = ""

output_str += create_alphabet_links()

entries.sort()

current_letter = entries[0][0]

output_str += create_letter_section_header(current_letter)

for entry in entries:
    if current_letter != entry[0]:
        current_letter = entry[0]
        output_str += TO_THE_TOP_LINES
        output_str += ENTRY_SEPARATOR_LINES
        output_str += create_letter_section_header(current_letter)

    if entry.endswith(NEWLINE):
        clean_entry = entry[:(len(entry) - 1)]
    else:
        clean_entry = entry

    output_str += create_entry_for(clean_entry)

output_str += TO_THE_TOP_LINES


with open( OUTPUT_FILENAME, 'w') as f:
    f.write(output_str)
