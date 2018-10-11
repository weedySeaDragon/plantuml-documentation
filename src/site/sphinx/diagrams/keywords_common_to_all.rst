.. index:: keywords common to all diagrams



.. _global_keywords_and_options:

Global Keywords and Options
###########################

Also see:

- Creole markup

- Settings (skinparams)

- Notes




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


======
Macros
======

- Date and Time

- dirpath

- filename

- default values

- !ifdef !else !endif

- !ifndef

- && (boolean AND)

- || (boolean OR)

- !import (a zipped library)

- ## (append text to a macro)


A macro can include another macro (must it be previously defined?)

A macro can be polymorphic with argument count.

You can use system environment variable or constant definition when using include:

.. code::

   !include %windir%/test1.txt
   !define PLANTUML_HOME /home/foo
   !include PLANTUML_HOME/test1.txt


