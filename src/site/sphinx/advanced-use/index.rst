

Advanced Use
############


******
Macros
******


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


====
Misc
====

* can show the current path by using :code:`path` as the only line in the body of a :code:`.puml` file

.. code-block:: text

   @startuml
   path
   @enduml



* Can extract the original PlantUML_ source from a PNG file with the :code:`-metadata` option:

.. code-block:: text

   -metadata		To retrieve PlantUML_ sources from PNG images


see: https://mrhaki.blogspot.com/2016/12/plantuml-pleasantness-get-plantuml.html


-----------------------
Running via an ANT Task
-----------------------


