.. index:: learning


Learning
########

Figuring out how to do stuff.


TOC
---

How to show just the main entries for subdirs?

- use 'index' for each subdir?



.. _section_labels:

Labels
------

:code:`.. _<label name>:`

- an *anchor* that starts with an underscore ('_') and is any arbitrary name (= the label name).

  - **must be followed by a *section header*!**

  - note that it has only **one** colon after it, not 2 like directives do


then you can refer to that *label* later with a reference :code:`:ref:`label_name`` with the same syntax as a link BUT WITHOUT THE LEADING UNDERSCORE

.. code::

   .. _my_reference_label::

      This must be some sort of section header
      ----------------------------------------

      blah blah blah


   <stuff here....>


   blah blah blah  see :ref:`my-reference-label_`


This is a link to the label section above: :ref:`section_labels`




Different cross-referencing directives
--------------------------------------

see  `Sphinx: Roles: Cross referencing syntax <http://www.sphinx-doc.org/en/stable/usage/restructuredtext/roles.html#cross-referencing-syntax>`_



Can we now link to options and topics?  Let's try:  Here is a :option:`participant as` link to the option "as"
using :code:`:option:`participant as``  Yay!  that works! (it is literally this link: :code:`#cmdoption-arg-participant`


And how about linking to :code:`:topic:`topic-name``?  Nope.  How about :code:`:ref:`topic-name`` ? nope.


- trying to cross reference :token:`order_number`



- try to find an existing way to show a command and options



things to try
-------------

- fields lists:  another positional thing (colon; on the same line)
  - http://docutils.sourceforge.net/docs/ref/rst/restructuredtext.html#field-lists


- grammar production display?

.. productionlist:: example_production_list
   participant: ["]`display_name`["] ["as" `alias`]
              : [ "#"(`color_name` | `hex_value` ) ]
              : [ "<<"   ">>" ]
              : [ "order" `order_number` ]


  - is complicated to look at.  could do that later on a more technical page.  (Plus it all has to be done by hand.  blech.)




Examples and inspiration:
-------------------------

* nicely done : shows small images of how each thing will look when formatted: https://ogom.github.io/draw_uml/plantuml/


