
.. index:: command line

Command Line Reference
######################

run from the command line:

****************
1. Requirements:
****************


   Java

    The latest version fo PlantUML downloaded


Run::

    java -jar planutml.jar

Note:  "plantuml.jar" must either be in your PATH or you need to specify the exact path (full location with folders/directories)



****************************
Helpful command line options
****************************


:Help:  See all of the command line options available by running

   :code:`java -jar plantuml.jar -help`


:Search path:         You can specify the java property plantuml.include.path in the command line.

   For example:

   :code:`java -Dplantuml.include.path="c:/mydir" -jar plantuml.jar atest1.txt`

   Note the this -D option has to put before the -jar option. -D options after the -jar option will be used to define constants within plantuml preprocessor.


* See all of the regular expression patterns that PlantUML uses as it parses instructions::

    java -jar ./Documents/dev/plantuml.1.2017.16.jar -pattern



* language items and skinparams


Running::

    java -jar plantuml.jar -language


Will show you all keywords, skinparameter keywords, and color names.


.. index:: command line options

.. _command_line_options:

********************
Command Line Options
********************

.. todo::

   In the midst of reorganizing these into helpful groups



.. container:: keyword commandline-option

   -I<path to a file to include>

This is the same as using the :code:`!include` directive to include a file



.. container:: keyword commandline-option

   -metadata

Extracts the PlantUML source from a :code:`.png` file.


.. container:: keyword commandline-option

   -help


.. container:: keyword commandlin-option

   -gui

run the graphical user interface


.. index:: generated image type
   pair: command line options; generated image type

.. _command_line_options_generated_image_type:

----------------------------
Set the Generated Image Type
----------------------------

.. index:: -tpng
   pair: command line options; -tpng

.. container:: keyword commandlin-option

   -tpng

generate images using PNG format (default)


.. index:: -tsvg
   pair: command line options; -tsvg

.. container:: keyword commandlin-option

   -tsvg

generate images using SVG format


.. index:: -teps
   pair: command line options; -teps

.. container:: keyword commandlin-option

   -teps

generate images using EPS format



.. index:: -tpdf
   pair: command line options; -tpdf

.. container:: keyword commandlin-option

   -tpdf

generate images using PDF format




.. index:: -tvdx
   pair: command line options; -tvdx

.. container:: keyword commandlin-option

   -tvdx

generate images using VDX format




.. index:: -txmi
   pair: command line options; -txmi

.. container:: keyword commandlin-option

   -txmi

generate XMI file for class diagram




.. index:: -tscxml
   pair: command line options; -tscxml

.. container:: keyword commandlin-option

   -tscxml

generate SCXML file for state diagram




.. index:: -thtml
   pair: command line options; -thtml

.. container:: keyword commandlin-option

   -thtml

generate HTML file for class diagram




.. index:: -ttxt
   pair: command line options; -ttxt

.. container:: keyword commandlin-option

   -ttxt

generate images with ASCII art




.. index:: -tutxt
   pair: command line options; -tutxt

.. container:: keyword commandlin-option

   -tutxt

generate images with ASCII art using Unicode characters




.. index:: -tlatex
   pair: command line options; -tlatex

.. container:: keyword commandlin-option

   -tlatex

generate images using LaTeX/Tikz format




.. index:: -tlatex:nopreamble
   pair: command line options; -tlatex:nopreamble

.. container:: keyword commandlin-option

   -tlatex:nopreamble

generate images using LaTeX/Tikz format without preamble



.. index:: -preproc
   pair: command line options; -preproc

.. container:: keyword commandlin-option

   -preproc

output preprocessor text of diagrams



---------------------------------
File Locations (input and output)
---------------------------------


.. index:: -o[utput]
   pair: command line options; -o[utput]

.. container:: keyword commandlin-option

   -o[utput] "dir"

generate images in the specified directory





.. index:: -r[ecurse]
   pair: command line options; -r[ecurse]

.. container:: keyword commandlin-option

   -r[ecurse]

recurse through directories




.. index:: -I
   pair: command line options; -I

.. container:: keyword commandlin-option

   -I<file>

include file as if '!include file' were used


.. container:: keyword commandlin-option

   -I<file pattern>

include files with pattern






.. index:: -e[xclude]
   pair: command line options; -e[xclude]

.. container:: keyword commandlin-option

   -e[xclude] <pattern>

exclude files that match the provided pattern





.. index:: -checkmetadata
   pair: command line options; -checkmetadata

.. container:: keyword commandlin-option

   -checkmetadata

Skip PNG files that don't need to be regenerated





.. index:: -overwrite
   pair: command line options; -overwrite

.. container:: keyword commandlin-option

   -overwrite

allow to overwrite read only files



.. index:: -p[ipe]
   pair: command line options; -p[ipe]

.. container:: keyword commandlin-option

   -p[ipe]

use stdin for PlantUML source and stdout for PNG/SVG/EPS generation



-------------------------------
Additional Information In Files
-------------------------------




----
Misc
----






.. index:: -D
   pair: command line options; -D

.. container:: keyword commandlin-option

   -D<VAR1=value>

set a preprocessing variable as if '!define VAR1 value' were used





.. index:: -S
   pair: command line options; -S

.. container:: keyword commandlin-option

   -S<param1=value>

set a skin parameter as if 'skinparam param1 value' were used






.. index:: -charset
   pair: command line options; -charset

.. container:: keyword commandlin-option

   -charset <xxx>

use a specific charset (default is UTF-8)






.. index:: -metadata
   pair: command line options; -metadata

.. container:: keyword commandlin-option

   -metadata

retrieve PlantUML sources from PNG images





.. index:: -nometadata
   pair: command line options; -nometadata

.. container:: keyword commandlin-option

   -nometadata

NOT export metadata in PNG/SVG generated files






.. index::  -v[erbose]
   pair: command line options;  -v[erbose]

.. container:: keyword commandlin-option

   -v[erbose]

have log information





.. index:: -quiet
   pair: command line options; -quiet

.. container:: keyword commandlin-option

   -quiet

NOT print error message into the console





.. index:: -debugsvek
   pair: command line options; -debugsvek

.. container:: keyword commandlin-option

   -debugsvek

generate intermediate svek files






.. index:: -encodesprite
   pair: command line options; -encodesprite

.. container:: keyword commandlin-option

   -encodesprite 4|8|16[z] "file"

encode a sprite at gray level (z for compression) from an image





.. index:: -computeurl
   pair: command line options; -computeurl
   single: -encodeurl
   pair: command line options; -encodeurl

.. container:: keyword commandlin-option

   -computeurl | -encodeurl

compute the encoded URL of a PlantUML source file





.. index:: -decodeurl
   pair: command line options; -decodeurl

.. container:: keyword commandlin-option

   -decodeurl

retrieve the PlantUML source from an encoded URL







.. index:: -pipeimageindex
   pair: command line options; -pipeimageindex

.. container:: keyword commandlin-option

   -pipeimageindex <N>

generate the Nth image with pipe option





.. index:: -extractstdlib
   pair: command line options; -extractstdlib

.. container:: keyword commandlin-option

   -extractstdlib

extract PlantUML Standard Library into stdlib folder




.. index:: -filename
   pair: command line options; -filename

.. container:: keyword commandlin-option

   -filename <a filename>

"example.puml"	To override %filename% variable





.. index:: check configuration or syntax
   pair: command line options; check configuration or syntax

.. _cmd_option_check_config_syntax:

----------------------------------
PlantUML Configuration or Syntax
----------------------------------

.. todo::

   move options about syntax into a different grouping




.. index:: -testdot
   pair: command line options; -testdot

.. container:: keyword commandlin-option

   -testdot

test the installation of graphviz




.. index:: -graphvizdot
   pair: command line options; -graphvizdot

.. container:: keyword commandlin-option

   -graphvizdot <executable file>

specify dot executable




.. index:: -checkversion
   pair: command line options; -checkversion

.. container:: keyword commandlin-option

   -checkversion

check if a newer version is available for download




.. index:: -syntax
   pair: command line options; -syntax

.. container:: keyword commandlin-option

   -syntax

report any syntax error from standard input without generating images




.. index:: -checkonly
   pair: command line options; -checkonly

.. container:: keyword commandlin-option

   -checkonly

check the syntax of files without generating images




.. index:: -failfast
   pair: command line options; -failfast

.. container:: keyword commandlin-option

   -failfast

stop processing as soon as a syntax error in diagram occurs




.. index:: -failfast2
   pair: command line options; -failfast2

.. container:: keyword commandlin-option

   -failfast2

do a first syntax check before processing files, to fail even faster




--------------------------
Statistics and Performance
--------------------------



.. index:: -duration
   pair: command line options; -duration

.. container:: keyword commandlin-option

   -duration

print the duration of complete diagrams processing



.. index:: -nbthread
   pair: command line options; -nbthread

.. container:: keyword commandlin-option

   -nbthread <N>

use (N) threads for processing




.. index:: -nbthread auto
   pair: command line options; -nbthread auto

.. container:: keyword commandlin-option

   -nbthread auto

use 8 threads for processing




.. index:: -timeout
   pair: command line options; -timeout

.. container:: keyword commandlin-option

   -timeout <N>

Processing timeout in (N) seconds. Defaults to 15 minutes (900 seconds).


.. index:: -enablestats
   pair: command line options; -enablestats

.. container:: keyword commandlin-option

   -enablestats

enable statistics computation




.. index:: -disablestats
   pair: command line options; -disablestats

.. container:: keyword commandlin-option

   -disablestats

disable statistics computation (default)




.. index:: -htmlstats
   pair: command line options; -htmlstats

.. container:: keyword commandlin-option

   -htmlstats

output general statistics in file plantuml-stats.html




.. index:: -xmlstats
   pair: command line options; -xmlstats

.. container:: keyword commandlin-option

   -xmlstats

output general statistics in file plantuml-stats.xml




.. index:: -realtimestats
   pair: command line options; -realtimestats

.. container:: keyword commandlin-option

   -realtimestats

generate statistics on the fly rather than at the end




.. index:: -loopstats
   pair: command line options; -loopstats

.. container:: keyword commandlin-option

   -loopstats

continuously print statistics about usage




.. index:: -splash
   pair: command line options; -splash

.. container:: keyword commandlin-option

   -splash

display a splash screen with some progress bar




.. index:: -progress
   pair: command line options; -progress

.. container:: keyword commandlin-option

   -progress

display a textual progress bar in console




.. index::  print out information about PlantUML
   pair: command line options;  print out information about PlantUML

.. _cmd_options_print_info:

------------------------------------
Print Out Information about PlantUML
------------------------------------




.. index:: -h[help]
   pair: command line options; -h[help]

.. container:: keyword commandlin-option

   -h[help]

display this help message






.. index:: -language
   pair: command line options; -language

.. container:: keyword commandlin-option

   -language

print the list of PlantUML keywords





.. index:: -pattern
   pair: command line options; -pattern

.. container:: keyword commandlin-option

   -pattern

print the list of Regular Expression used by PlantUML





.. index:: -printfonts
   pair: command line options; -printfonts

.. container:: keyword commandlin-option

   -printfonts

print fonts available on your system





.. index:: -author[s]
   pair: command line options; -author[s]

.. container:: keyword commandlin-option

   -author[s]

print information about PlantUML authors





.. index:: -version
   pair: command line options; -version

.. container:: keyword commandlin-option

   -version

display information about PlantUML and Java versions





.. index:: -stdlib
   pair: command line options; -stdlib

.. container:: keyword commandlin-option

   -stdlib

print standart library info

