.. index:: creole
   see: creole markup; creole

Creole Markup
#############


'Creole markup' is a small language that lets you do addition markup (styling).


Reference on the PlantUML_ site: `Creole <http://plantuml.com/creole>`_

Wikipedia entry: `Creole markup <https://en.wikipedia.org/wiki/Creole_%28markup%29>`_

.. todo::

  look at src/net/sourceforge/plantuml/graphic/Splitter.java for some regex


=================
Keywords / Syntax
=================


.. index::
   pair: creole; text formatting

----------------
Formatting text:
----------------


:index:`bold text<triple:bold; text; creole>`
  This is **bold**

:index:`italics text<triple:italics; text; creole>`
  This is //italics//

:index:`monospaced text<triple:monospace; text; creole>`
  This is ""monospaced""

:index:`strike out text<triple:strike out; text; creole>`
  This is --strike out--

:index:`underline text<triple:underline; text; creole>`
  This is __underlined__

:index:`wavy underline text<triple:wavy underline; text; creole>`
  This is ~~waved~~



.. index::
   triple: formatting; lists; creole

-----
Lists
-----

.. index::
   triple: formatting; bullet lists; creole

Not numbered (bullet lists):

* Bullet list

  * Second item

  ** Sub item



.. index::
   triple: formatting; numbered lists; creole

Numbered:

  # Numbered list

  # Second item

  ## Sub item

  ## Another sub item

  # Third item



.. index::
   triple: formatting; lines; creole

-----
Lines
-----

You can have horizontal line

\----

Or double line

\====

Or strong line

\____

Or dotted line

\..My title..



.. index::
   triple: formatting; headings; creole

--------
Headings
--------

= Extra-large heading

== Large heading

=== Medium heading

==== Small heading



.. index::
   pair: icon; creole

-----
Icons
-----

Icons can be inserted...

OpenIconic  Website,


putting this in your plant uml file:

.. code-block:: none

         @startuml
         listopeniconic
         @enduml


will produce a diagram showing all icons you can use:

.. uml:: puml/icons-all.puml

