.. index:: UML Use Case diagram
   pair: diagram; UML Use Case diagram
   see: Use Case diagram; UML Use Case diagram


.. |ucasediag| replace:: UML Use Case Diagram

.. |ucasediag_ref| replace:: use_case_diagram_



.. _use_case_diagram:

UML Use Case Diagram
####################

A **use case** is a specification for some behavior. It's usually a specification so that some entity -- an **actor** -- can
achieve some *goal,* like *making a purchase* or *updating payment information.*
An *actor* can be a person or some other system or entity that interacts with the *use case.*

The `UML-Diagrams.org site <https://www.uml-diagrams.org/use-case.html>`_ has some good explanations and examples of use case
diagrams and the notations for and components of them.

You can read more about formal UML Use case definitions and diagrams in the UML Specification section 18: "Use Cases."


.. index::
   pair: keywords; UML Use Case diagram

.. _usecase_keywords:

********
Keywords
********



.. index:: arrows (graphic paths)
   pair: UML Use Case diagram; arrows (graphic paths)
   see: arrows; arrows (graphic paths)
   see: messages; arrows (graphic paths)

======================
Arrows (Graphic Paths)
======================


Graphic paths in Use Case diagrams use *arrows*  to show relationships between use cases and actors.

Here is a Use Case diagram showing the different arrow head styles and arrow colors:

.. uml:: puml/usecase-arrows.puml


Here is the code for the above diagram:

.. literalinclude:: puml/usecase-arrows.puml



.. index:: arrow heads
   pair: arrow heads; UML Use Case diagram
   pair: arrow heads; arrows (graphic paths)

.. _use_case_arrow_heads:

-----------
Arrow Heads
-----------



.. index:: arrow lines
   pair: arrow lines; UML Use Case diagram
   pair: arrows (graphic paths); arrow lines

.. _use_case_arrow_lines:

-----------
Arrow Lines
-----------

* Can make them long so that they are drawn longer.

Ex:

.. todo::
   show arrow lines of different lengths. (dashed, dotted); with directions within



.. _use_case_arrow_color:


.. index:: arrow color
   pair: arrows (graphic paths);  arrow color
   pair: arrows (graphic paths);  color

-----------
Arrow Color
-----------

You can change the color of an arrow by putting the color within square brackets just before the ending arrow-head characters:

Ex:  :code:`-[#magenta]>>`  will create a magenta colored unfilled arrow with a solid line

Ex:  :code:`--[#939393]>`  will create a gray colored filled arrow with a dashed line


* cannot have *both* color and *direction* in an arrow line



.. index:: arrow direction
   pair: arrows (graphic paths); direction
   pair: arrows (graphic paths); arrow direction

---------------
Arrow Direction
---------------

* left, right, up, down
* does it always work???
* cannot have *both* color and *direction* in an arrow line



.. index:: note
   pair: note; UML Use Case diagram
   pair: use case; note
   pair: alias; note
   pair: actor; note
   keyword: note
   keyword: as

.. _usecase_notes:

=====
Notes
=====

You can use the note left of , note right of , note top of , note bottom of keywords to define notes related to a single object.

A note can be also define alone with the note keywords, then linked to other objects using the .. symbol.


:Usage for a note positioned relative to an object:     :code:`note  <direction> of <actor | use case> [#<color name | hex code>] :  <note text>`

                                                         or written with many lines:

                                                         .. code-block:: text

                                                            note  <direction> of <actor | use case> [#<color name | hex code>]
                                                              <note text on 1 or more separate lines>
                                                            end note



:Usage for a note given an alias:      :code:`note "<note text>" [as <alias>] [#<color name | hex code>]`

                                       or written with many lines:

                                       .. code-block:: text

                                          note  <direction> of <actor | use case> [#<color name | hex code>]
                                          <note text on 1 or more separate lines>
                                          end note




.. note::

   You can create a note that is positioned relative to an object *or* a note that has an alias.  You can't create
   a note that is both positioned *and* has an alias.


.. uml:: puml/usecase-notes.puml


.. index:: note connection
   pair: note; connect
   pair: note connection; UML Use Case diagram

.. _usecase_note_connection:

---------------------------
Connecting Notes to Objects
---------------------------

To connect a note to an object, the note must have an *alias*.  You use an arrow to connect a note (using the alias for it) to an object.  Any valid arrow can be used.


Here is a very ugly example that uses differen kinds of arrows to connect a note.  (It's shortened from the above diagram)

.. uml:: puml/usecase-notes-connected.puml


and here is the code for that diagram:

.. literalinclude:: puml/usecase-notes-connected.puml




.. index::
   pair: skinparam; UML Use Case diagram

****************************************
Skinparams specific to Use Case Diagrams
****************************************


.. code:: text

   UsecaseBackgroundColor
   UsecaseBorderColor
   UsecaseBorderThickness

   UsecaseFontColor
   UsecaseFontName
   UsecaseFontSize
   UsecaseFontStyle

   UsecaseStereotypeFontColor
   UsecaseStereotypeFontName
   UsecaseStereotypeFontSize
   UsecaseStereotypeFontStyle