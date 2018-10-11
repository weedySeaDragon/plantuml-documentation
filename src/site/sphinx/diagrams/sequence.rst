.. index:: UML Sequence diagram
   pair: diagram; UML Sequence diagram
   see: Sequence diagram; UML Sequence diagram

.. |ppt| replace:: **participant**

.. |ppts| replace:: **participant**

.. |ppt_ref| replace:: participant_

.. |ppts_ref| replace:: participant_

.. |is_the_frame_name| replace:: is the frame name in the pentagon in the upper left hand corner.


UML Sequence Diagram
####################


A UML Sequence diagram shows how messages go back and forth between objects over time. It is an *interaction diagram.*


The basic syntax for a line in a sequence diagram shows that one participant is sending a message to another participant:

   **participant   ->   the other participant: the message**

More formally:  :code:`<participant 1> <directional arrow> <participant 2>: <message>`


**Sequence diagram showing interaction between Alice and Bob:**

.. uml:: puml/sequence-1simple-bob-alice.puml
   :scale: 85 %

Here is the source for the diagram:

.. code-block:: text

   @startuml

   Alice -> Bob: Valid Authentication Request
   Bob -> RequestHandler: formatted Authenticated Request (VALID)
   RequestHandler --> Bob: Request Authenticated Response (OK)
   Bob --> Alice: Authentication Response (OK)

   Alice -> Bob: Invalid Authentication Request
   Bob --> RequestHandler: formatted Authenticated Request (INVALID)
   RequestHandler --> Bob: Request Authenticated Response (DENIED)
   Alice <-- Bob: Authentication Response (DENIED)

   @enduml



.. index::
   pair: keywords; UML Sequence diagram

*******************************
Keywords (a.k.a. Graphic Nodes)
*******************************


**Be sure to also read about the keywords and options that can be applied to all diagrams:**
:ref:`Global keywords and options <global_keywords_and_options>`


.. index:: participant
   pair: participant; UML Sequence diagram
   pair: participant; as <alias>
   pair: participant; color
   pair: participant; order

============
participant
============

:Usage:  :code:`participant "<display label>"`

         :code:`[ as <some alias> ]`

         :code:`[ #<color name | hexcode> ]`

         :code:`[ << [(<letter>, <color>)] [stereotype name] >>]`

         :code:`[ order <number> ]`

Participants are the *message senders.* \
Use the `participant` keyword to give a name to a message sender and optionally give it an alias and format it.

If the displayed label for a |ppt| has spaces or special characters, put quotes around it.  (Ex: :code:`"Request Handler"`)

You don't have to use the :code:`participant` keyword because PlantUML will automatically display a sender whenever it encounters one in the source.
But using the keyword gives you the ability to set the following options:

:Options:

  :as <some alias>: provide an alias for the participant.  This is useful if the displayed name is long; you can just use the shorter alias in the rest of the source.

      Ex: :code:`participant "Request Handler" as  RH`

  :color #<colorName | hexCode>: set the color of the image displayed. Use a :doc:`color name<../formatting/color-names>` or hex code.


      Ex: :code:`participant Alice #lightGreen`


  :<< [(<letter>, <color name>)] [<stereotype text>] >>: (stereotype box) ...

      Ex: :code:`participant "Request Handler" << (S, #lightBlue) server >>`


  .. index::
      triple: syntax error; participant order; UML Sequence diagram

  :order <number>: set the specific order for the participant.  Otherwise PlantUML just orders the participants as it encounters them.

      **order must come last else you'll get a syntax error!**

      Ex: :code:`participant "Request Handler" order 3`


:Example:

.. uml:: puml/sequence-2-bob-alice.puml
   :scale: 80%


.. code::

   @startuml

   participant "Request Handler" as RH  << (S,#ADD1B2) Server >> order 3

   participant Alice #lightGreen
   participant Bob #white

   Alice -> Bob: Valid Authentication Request
   Bob -> RH: formatted Authenticated Request (VALID)
   RH --> Bob: Request Authenticated Response (OK)
   Bob --> Alice: Authentication Response (OK)

   Alice -> Bob: Invalid Authentication Request
   Bob --> RH: formatted Authenticated Request (INVALID)
   RH --> Bob: Request Authenticated Response (DENIED)
   Alice <-- Bob: Authentication Response (DENIED)

   @enduml


You can show a message coming from or going to a participant not in the scope of the current diagram by using :code:`]` or :code:`[`

* :code:`]` shows a message *going to* outside the scope of the diagram (to a participant not in the diagram)
* :code:`[` shows a message *coming from* outside the scope of the diagram (from a participant not in the diagram)


..index:: actor
   pair: keywords; UML Sequence diagram

.. index:: actor
   pair: actor; UML Sequence diagram
   pair: actor; as <alias>
   pair: actor; color
   pair: actor; order

=====
actor
=====

.. image:: images/actor.png
   :height: 35px
   :align: left
   :alt: a simple stick figure type drawing of a person

:code:`actor` is a stereotype (synonym) for |ppt_ref| that displays a person stick figure instead of the standard box.  All of the same options as |ppt_ref| can be used.

         .. uml:: puml/seq-actor-simple-ex.puml
            :height: 100px



..index:: boundary
   pair: keywords; UML Sequence diagram

.. index:: boundary
   pair: boundary; UML Sequence diagram
   pair: boundary; as <alias>
   pair: boundary; color
   pair: boundary; order

========
boundary
========

.. image:: images/boundary.png
   :height: 25px
   :align: left
   :alt: a short vertical line connected with a horizontal line to a circle

:code:`boundary` is a stereotype (synonym) for |ppt_ref| that displays a boundary image instead of the standard box.  All of the same options as |ppt_ref| can be used.

         .. uml:: puml/seq-boundary-simple-ex.puml
            :height: 100px



..index:: entity
   pair: keywords; UML Sequence diagram

.. index:: entity
   pair: entity; UML Sequence diagram
   pair: entity; as <alias>
   pair: entity; color
   pair: entity; order

======
entity
======

.. image:: images/entity.png
   :height: 25px
   :align: left
   :alt: a circle with a horizontal line under it

:code:`entity` is a stereotype (synonym) for |ppt_ref| that displays an entity image instead of the standard box.  All of the same options as |ppt_ref| can be used.

         .. uml:: puml/seq-entity-simple-ex.puml
            :height: 100px



..index:: control
   pair: keywords; UML Sequence diagram

.. index:: control
   pair: control; UML Sequence diagram
   pair: control; as <alias>
   pair: control; color
   pair: control; order

=======
control
=======

.. image:: images/control.png
   :height: 25px
   :align: left
   :alt: an arrow that points back to itself in a circle

:code:`control` is a stereotype (synonym) for |ppt_ref| that displays a control image instead of the standard box.  All of the same options as |ppt_ref| can be used.

         .. uml:: puml/seq-control-simple-ex.puml
            :height: 100px



..index:: database
   pair: keywords; UML Sequence diagram

.. index:: database
   pair: database; UML Sequence diagram
   pair: database; as <alias>
   pair: database; color
   pair: database; order

========
database
========

.. image:: images/database.png
   :height: 25px
   :align: left
   :alt: a cylinder

:code:`database` is asynonym for |ppt_ref| that displays a database image instead of the standard box.  All of the same options as |ppt_ref| can be used.

         .. uml:: puml/seq-database-simple-ex.puml
            :height: 100px



.. index:: create
   triple: UML Sequence diagram; participant; create
   pair: UML Sequence diagram; create

======
create
======

:code:`create` puts the first occurrence of the diagram for the |ppt_ref| within the diagram where this word appears instead of at the top of the page.
Helps to show that an object is actually *created* at that point in time.

:Usage:  :code:`create` <name> :code:`order` <order number>

* cannot use "as"


            .. uml:: puml/seq-create-ex.puml
               :height: 150px


            .. code-block:: text

               @startuml
               actor Alice #SaddleBrown
               entity "Auth System" as authSys #lightGreen

               Alice -> authSys: Authentication Request

               create wrappedRequest
               authSys -> wrappedRequest: new request()
               Alice <-- authSys: response
               @enduml


            In the example above, :code:`create "Auth System"` is used to show exactly when the *wrappedRequest* is created




.. index:: graphic paths (arrows)
   pair: UML Sequence diagram; graphic paths (arrows)
   triple: formatting; graphic paths (arrows); UML Sequence diagram
   see: arrows; graphic paths (arrows)
   see: messages; graphic paths (arrows)

======================
Graphic Paths (Arrows)
======================


Arrows are used to show **messages** sent to and from |ppts_ref| along a *graphic path.*

.. index::
   triple: graphic paths (arrows); formatting; arrow heads
   pair: arrow heads; formatting


.. _arrow heads:

-----------
Arrow Heads
-----------

Solid arrow heads represent *synchronous* messages.  Open (not filled in) arrow heads represent *asynchronous* messages.  (See the UML 2.5 Specification, section 17.4.4.1 Message Notation)

* :code:`>>`  creates an unfilled arrow pointing to the right (This is an *asynchronous* message.)
* :code:`<<`  creates an unfilled arrow pointing to the left (This is an *asynchronous* message.)
* :code:`>`  creates a filled (solid) arrow head pointing to the right (This is a *synchronous* message.)
* :code:`<`  creates a filled (solid) arrow head pointing to the left  (This is a *synchronous* message.)
* :code:`\\` creates the top half (only) of an unfilled arrow pointing to the right
* :code:`//` creates the bottom half (only) of an unfilled arrow pointing to the right
* :code:`\\` creates the top half (only) of a filled arrow pointing to the right
* :code:`/` creates the bottom half (only) of a filled arrow pointing to the right
* :code:`o` puts a final "o" at arrow head, denoting a *lost* message
* :code:`x` puts an ***X*** at the end, denoting a *destruction* message.

.. uml:: puml/seq-arrow-heads.puml


You can create a  bidirectional arrow by putting arrow heads at both ends of a line.  Ex:  :code:`<->`




.. index::
   pair: arrow lines; formatting
   triple: graphic paths (arrows); formatting; arrow lines

.. _arrow_lines:

-----------
Arrow Lines
-----------

Solid lines show messages sent.  Dashed lines represent *reply* messages.

An object creation Message has a dashed line with an open arrow head.


* :code:`-` creates a solid line


* :code:`--` (two dashes instead of just one) creates dotted line


You can make *dashed* :ref:`arrow lines <arrow_lines>` as long as you want, but they will be drawn only as long as needed and
calculated by Graphviz.

Ex:  You can do this:

.. code::

      @startuml

      title
       These arrows are very long
       but their length is calculated.

       The length you make them is
       ignored in Sequence Diagrams.

      end title


      A ----------------------------------->> B
      A <<----------> B
      A <- B

      @enduml


And it will be rendered/drawn like this:

.. uml:: puml/seq-arrow-long.puml



.. index::
   triple: graphic paths (arrows); formatting; color

.. _arrow_color:

-----------
Arrow Color
-----------

You can change the color of an arrow by putting the color within square brackets just before the ending arrow-head characters:

Ex:  :code:`-[#magenta]>>`  will create a magenta colored unfilled arrow with a solid line

Ex:  :code:`--[#939393]>`  will create a gray colored filled arrow with a dashed line



.. uml:: puml/seq-arrow-colors.puml



.. index:: autonumber graphic paths
   triple: UML Sequence diagram; autonumber; graphic paths

------------------------
Autonumber Graphic Paths
------------------------

:Usage:     :code:`autonumber [start | resume ] [increment] [format]`


 - automatically number each arrow in the sequence

 - can format the numbering: "<b>(<u>##</u>)"

   - must be in double quotes
   - accepts simple printf type formatting (## 0  etc)

* autonumber [stop]


.. index:: lifeline
   pair: lifeline; UML Sequence Diagram
   see: ExecutionSpecification; lifeline

==================================
Lifelines (ExecutionSpecification)
==================================

The :code:`activate` and :code:`deactivate` keywords are used to denote |ppt_ref| activation and deactivation on its lifeline.
The UML 2.5 specification refers to this as an ExecutionSpecification: exactly what messages are called, and in what order, are specified in this particular section of the diagram.

You can also explictly :code:`destroy` the lifeline of a |ppt_ref|, showing when it is destroyed.


.. index:: activate
   triple: activate; lifeline;  UML Sequence diagram

--------
activate
--------

:Usage:      :code:`activate <participant> [color]`




.. index:: deactivate
   triple: deactivate; lifeline;  UML Sequence diagram

----------
deactivate
----------

:Usage:        :code:`deactivate <participant>`



.. index:: destroy
   triple: destroy; lifeline;  UML Sequence diagram

-------
destroy
-------

:Usage:        :code:`destroy <participant>`




.. index:: grouping box
   pair: frame; UML Sequence diagram
   seealso: box; grouping box
   triple: UML Sequence diagram; frame; box

=======================
Frames Around Fragments
=======================

Frames are rectangular boxes around a fragment (or sub-clause) of a sequence.  It is a box around certain participants and messages.
There is a name in the upper-left corner of the box and, in the case of a :ref:`group box <group>`,  optionally a label across the top of the box.

* All grouping box keywords must have a corresponding :code:`end` to signal where the box ends
* You can nest grouping boxes
* You cannot use a `note` within a grouping box
* See section 17.6 in the UML 2.5 Specification
* PlantUML does not implement all InteractionOperator kinds, but you can use the :ref:`group box <group>` to put in the name of any InteractionOperator you want.



.. index:: alternatives frame
   triple: UML Sequence diagram; frame;alternatives frame
   see: alt; alternatives frame


.. _alt:

---
alt
---

:Usage:  :code:`alt "<text>"`

         InteractionOperator *alt* is used to show one or more *alternative* sequences that can happen.  A dashed line
         is used between the possible alternative sequences.

         *alt* |is_the_frame_name|

         *text* is displayed in square brackets (:code:`[]`) at the top of the frame; it describes or labels frame as a whole.




.. index:: else frame
   pair: alternatives frame; else frame
   triple: UML Sequence diagram; frame;else frame

^^^^
else
^^^^

:Usage:  :code:`else "<text>"`

         In the UML specification, *else* is the default sequence in a list of :ref:`alternative <alt>` sequences.
         The *else* InteractionOperator is used to show the sequence that will be used if the none of conditions for
         the *alt* alternatives can be met.  *else* |is_the_frame_name|

         But in ***PlantUML** this is how you label different alternatives.  You can use the :ref:`group <group>`
         keyword to specifically display the word "else" and use it per the UML Specification.

         *text* is displayed in square brackets (:code:`[]`) at the top of the frame; it describes or labels this alternative.






.. index:: opt frame
   triple: UML Sequence diagram;  frame; opt frame

---
opt
---

:Usage:  :code:`opt "<text>"`

         An *optional* sequence.  It either happens or not.

         *opt* |is_the_frame_name|

         *text* is displayed in square brackets (:code:`[]`) at the top of the frame; it describes or labels frame as a whole.


.. index:: loop frame
   triple: UML Sequence diagram; frame;loop frame

----
loop
----

:Usage:  :code:`loop "<text>"`

         Shows a sequence that *loops*.

         *loop* |is_the_frame_name|

         *text* is displayed in square brackets (:code:`[]`) at the top of the frame; it describes or labels frame as a whole.



.. index:: parallel frame
   triple: UML Sequence diagram; frame; parallel frame
   see: par; parallel frame

---
par
---

:Usage:  :code:`par "<text>"`

         Shows a *parallel* sequence.

         *par* |is_the_frame_name|

         *text* is displayed in square brackets (:code:`[]`) at the top of the frame; it describes or labels frame as a whole.


.. index:: break frame
   triple: UML Sequence diagram; frame;break frame

-----
break
-----

:Usage:  :code:`break <text>`

         shows that a sequence breaks.  It stops (does not perform) any of the remaining sequence does this instead.

         *break* |is_the_frame_name|

         *text* is displayed in square brackets (:code:`[]`) at the top of the frame; it describes or labels frame as a whole.


.. index:: critical frame
   triple: UML Sequence diagram; frame;critical frame

--------
critical
--------

:Usage:  :code:`critical "<text>"`

         A fragment of a sequence that cannot be "interleaved" by other fragments (e.g. parallel fragments, etc.).

         *critical* |is_the_frame_name|

         *text* is displayed in square brackets (:code:`[]`) at the top of the frame; it describes or labels frame as a whole.



.. index:: group frame
   triple: UML Sequence diagram; frame;group frame

.. _group:

-----
group
-----


:Usage:  :code:`group "<frame name>"`

          allows you to fully specify the frame name.

          *frame name* |is_the_frame_name|

          Note that you cannot add *text* after the frame name.





.. index:: InteractionUse frame
   triple: UML Sequence diagram; InteractionUse; frame
   see: reference frame; InteractionUse frame

================================
Reference Frame (InteractionUse)
================================


:Usage:  :code:`ref "<frame name>"`

          A *reference* to some other interaction.
          *ref* |is_the_frame_name|



.. index:: delay
   pair:  UML Sequence diagram; delay


=====
delay
=====

:Usage:  :code:`... [<text> ...]`

         Indicates a delay in the diagram. You can optionally add text to describe the delay.



.. index:: spacing
   triple: UML Sequence diagram; spacing; spacing lines

=======
Spacing
=======

* |||  or ||<number of pixels>||




.. index:: divider
   pair: UML Sequence diagram; divider

========
Dividers
========


=====
Notes
=====

.. index::
   triple: notes; participant; UML Sequence diagram


* for participants:

  - put this under section about participants?


.. index::
   triple: notes; graphic paths (arrows); UML Sequence diagram


* for graphic paths (messages)

  - put this info under the section about graphic paths?


.. index:: newpage
   pair: newpage;  UML Sequence diagram
   see: new page; newpage
   see: page break; newpage


=======
newpage
=======

.. todo::  newpage - is this common?  or only on sequence diagrams?



.. index::
   pair: skinparams; UML Sequence diagram

****************************************
Skinparams specific to Sequence Diagrams
****************************************

.. todo::
   grep/ extract all skinparams that start with Sequence and inset them into sequence.rst


----


**A longer sequence of events with some skinparam styles used:**


.. uml:: puml/sequence-2complex.puml
   :scale: 75 %
   :caption: :doc:`View the source for this diagram here <puml/sequence-2complex-source>`




