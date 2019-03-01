.. index:: keywords common to all diagrams


.. _global_keywords_and_options:

Global Keywords and Options
###########################


Also see:

- Creole markup

- Settings (skinparams)

- Notes


.. uml:: puml/current_path.puml


.. index:: @start
   keyword: @startXXX
   seealso: @start; @startuml
   seealso: @start; @startditaa
   seealso: @start; @startjcckit


.. _at_start:

============================
@start[uml | ditaa | jcckit]
============================

*from the FAQ:*

.. pull-quote::

   The @startuml/@startditaa/@startjcckit is useful to determine the type of diagram (uml, ditaa, jcckit...),
   and because you can optionally put a filename after the @startXXX. This also allows to have several diagrams inside the same file.




.. index:: @startuml
   keyword: @startuml

.. startuml:

---------
@startuml
---------


.. todo::

   @startuml - explain that it's the most common, but there are others



.. index:: @startditaa
   keyword: @startditaa

.. startditaa:

-----------
@startditaa
-----------


.. todo::

   @startditaa - explain t



.. index:: @startjcckit
   keyword: @startjcckit

.. startditaa:

------------
@startjcckit
------------


.. todo::

   @startjcckit - explain t




.. index:: rectangle
   pair: rectangle; keywords common to all diagrams

.. _rectangle:

=========
Rectangle
=========

:Usage:     :code:`rectangle <name> [ <color>] { <items listed on a new line> }`

            Puts a rectangular box around the items that are listed within the brackets (:code:`{}`).


========================
Diagram Layout Direction
========================

Default direction is :code:`top to bottom`

:Usage:     :code:`[ top to bottom direction | left to right direction ]`




============================
Titles, Headers, and Footers
============================

-----
Title
-----

-------
Caption
-------

------
Legend
------

------
Header
------

------
Footer
------


.. index:: newpage
   pair newpage; keywords common to all diagrams

.. _newpage:

====================
Page Break (newpage)
====================

:Usage:     :code:`newpage`

            Breaks up the diagram into another page.  Equivalent to a "page break"

Only works on these pages (confirmed these only):

* Use Case
* Sequence


.. todo::
   newpage is common to what diagrams exactly? Check the source code



================
Images and Icons
================

------
Images
------

-----
Icons
-----

====
Zoom
====

========
Comments
========

=============
Include files
=============


=========
Constants
=========


.. index:: macros

.. _macros:

======
Macros
======

(explanation)

A macro can include another macro (must it be previously defined?)

A macro can be polymorphic with argument count.


-----------------
Special Variables
-----------------


.. index:: %date%
   pair date; special variables
   pair date; current date and time

.. _date:

^^^^^^
%date%
^^^^^^

%date%  the current date and time

* format: Date format can be specified using format specified in SimpleDataFormat documentation `https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html`_

  ex: default format:  %date%

  ex: format...  %date[yyyy.MM.dd 'at' HH:mm]%



.. index:: %dirpath%
   pair dirpath; special variables
   pair dirpath; path of a file

.. _dirpath:

^^^^^^^^^
%dirpath%
^^^^^^^^^

%dirpath%	Path of the current file

- for use with including files -- to specify a path

- does not render anything when used in a diagram



.. index:: %filename%
   pair filename; special variables
   pair filename; name of the current file

.. _filename:

^^^^^^^^^^
%filename%
^^^^^^^^^^

%filename%	Name of the current file

- for use with including files -- to specify a path

- does not render anything when used in a diagram




- default values

- !ifdef !else !endif

- !ifndef

- && (boolean AND)

- || (boolean OR)

- !import (a zipped library)

- ## (append text to a macro)



You can use system environment variable or constant definition when using include:

.. code::

   !include %windir%/test1.txt
   !define PLANTUML_HOME /home/foo
   !include PLANTUML_HOME/test1.txt


