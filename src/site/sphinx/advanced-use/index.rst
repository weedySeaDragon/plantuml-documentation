

Advanced Use
############

**Where to put these:**

- hyperlinks http://plantuml.com/link  (Language reference?)


* can show the current path by using :code:`path` as the only line in the body of a :code:`.puml` file

.. code-block:: text

   @startuml
   path
   @enduml



************
Preprocessor
************

- !define, !undef


- including files

  - can .zip a file and include it

  - You can use system environment variable or constant definition when using include

  .. code:: text

     !include %windir%/test1.txt
     !define PLANTUML_HOME /home/foo
     !include PLANTUML_HOME/test1.txt




- include URL

- constants

- date and time


******
Macros
******

- !definelong

- !enddefinelong

- default values for macro parameters :code:`!define some_macro(x, y = "some default" , z = 'another default' ) x and y and z`

- conditions


- append text to a macro argument use the ## syntax.

- a macro can be defined by another macro

- can have varying argument count (polymorphic)



********************
Icon Sets ("StdLib")
********************


.. code:: text

   @startuml
   listicons
   @enduml


*******
Sprites
*******

   @startuml
   listicons
   @enduml



***************************
Running from Other Programs
***************************


====
Java
====

:Ex:

======
Python
======

:Ex:




* Can extract the original PlantUML_ source from a PNG file with the :code:`-metadata` option:

.. code-block:: text

   -metadata		To retrieve PlantUML_ sources from PNG images


see: https://mrhaki.blogspot.com/2016/12/plantuml-pleasantness-get-plantuml.html


-----------------------
Running via an ANT Task
-----------------------


