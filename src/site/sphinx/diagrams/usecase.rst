.. index:: UML Use Case diagram
   pair: diagram; UML Use Case diagram
   see: Use Case diagram; UML Use Case diagram


.. |ucasediag| replace:: UML Use Case Diagram

.. |ucasediag_ref| replace:: use_case_diagram_




.. _use_case_diagram:

UML Use Case Diagram
####################



.. index:: graphic paths (arrows)
   pair: UML Use Case diagram; graphic paths (arrows)
   triple: formatting; graphic paths (arrows); UML Use Case diagram
   see: arrows; graphic paths (arrows)
   see: messages; graphic paths (arrows)

======================
Graphic Paths (Arrows)
======================


Graphic paths in Use Case diagrams use *arrows*  to show relationships between use cases and actors.

Here is a Use Case diagram showing the different arrow head styles and arrow colors:

.. uml:: puml/usecase-arrows.puml


Here is the code for the above diagram:

.. literalinclude:: puml/usecase-arrows.puml



.. index::
   triple: graphic paths (arrows); formatting; arrow heads
   triple: arrow heads; formatting; UML Use Case diagram
   pair: arrow heads; UML Use Case diagram

.. _use_case_arrow_heads:

-----------
Arrow Heads
-----------



.. index::
   triple: arrow lines; formatting; UML Use Case diagram
   triple: graphic paths (arrows); formatting; arrow lines
   pair: arrow lines; UML Use Case diagram


.. _use_case_arrow_lines:

-----------
Arrow Lines
-----------

* Can make them long so that they are drawn longer.

Ex:

.. todo::
   show arrow lines of different lengths. (dashed, dotted); with directions within



.. _use_case_arrow_color:

.. index::
   triple: graphic paths (arrows); formatting; color

-----------
Arrow Color
-----------

You can change the color of an arrow by putting the color within square brackets just before the ending arrow-head characters:

Ex:  :code:`-[#magenta]>>`  will create a magenta colored unfilled arrow with a solid line

Ex:  :code:`--[#939393]>`  will create a gray colored filled arrow with a dashed line


* cannot have *both* color and *direction* in an arrow line



.. index::
   triple: graphic paths (arrows); formatting; direction

---------------
Arrow Direction
---------------

* left, right, up, down
* does it always work???
* cannot have *both* color and *direction* in an arrow line



.. index:: notes
   pair: notes; UML Use Case diagram

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




* either *direction* or *alias*  Can't have both


.. uml:: puml/usecase-notes.puml



---------------------------
Connecting Notes to Objects
---------------------------

* note must have an alias so that you can refer to it

Instead of using code (text) for an arrow to connect a note, you use 2 dots (periods): :code:`..`

Here is an example (shortened from the above diagram):

.. uml:: puml/usecase-notes-connected.puml


and here is the code for that diagram:

.. literalinclude:: puml/usecase-notes-connected.puml


