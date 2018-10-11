Command Line Reference
######################

To run from the command line:

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
