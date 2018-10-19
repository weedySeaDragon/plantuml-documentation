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


Index Directive: triples, etc.
------------------------------

.. code::

   .. index::
      single: aaexecution

      pair: aaexecution; zzsub2
         Creates 2 entries:  (1)  "aaexecution" as the main entry with "zzsub2 as a subentry for it, and
            (2) "zzsub2" as the main entry with "aaexecution" as the subentry for it.

      module: __main__
         Automatically creates a paired entry for "module" and "aasys". Equivalent to "pair: module, aasys"

      module: aasys
         Automatically creates a paired entry for "module" and "aasys". Equivalent to "pair: module, aasys"

      triple: aamodule; aasearch; aapath
         Creates a paired entry for the first and (second + third, separated by a space):
            aamodule
               aasearch aapath

         Creates a paired entry for the second and (third + first, separated by _comma_):
            aasearch
               aapath, aasearch

            Maybe this shows that 'aapath' is a sub entry for aasearch??

         Creates a paired entry for the third and (first + second, separated by a space):
            aapath
               aamodule aasearch



      keyword:  zzkeyword
         Automatically creates a paired entry for "keyword" and "aasys". Equivalent to "pair: keyword, aasys"

      operator: zzoperator
         Automatically creates a paired entry for "operator" and "aasys". Equivalent to "pair: operator, aasys"

      object:  zzobject
         Automatically creates a paired entry for "object" and "aasys". Equivalent to "pair: object, aasys"

      exception: zzexception
         Automatically creates a paired entry for "exception" and "aasys". Equivalent to "pair: exception, aasys"

      statement: zzstatement
         Automatically creates a paired entry for "statement" and "aasys". Equivalent to "pair: statement, aasys"

      builtin: zzbuiltin
         Automatically creates a paired entry for "builtin" and "aasys". Equivalent to "pair: builtin, aasys"

      triple:
         Creates 3 entries:  a main entry for each item with a sub entry that consists of the other 2.


         This directive:

            .. index::
               single: aaexecution
               pair: aaexecution; zzsub2
               triple: aatriple1; aatriple2; aatriple3

         Produces this:

            aatriple1
               aatriple2 aatriple3
            aatriple2
               aatriple3, aatriple1
            aatriple3
               aatriple1 aatriple2

         (Is there a bug in it?  The first and third entries don't have commas like the second does)





Different cross-referencing directives
--------------------------------------

see  `Sphinx: Roles: Cross referencing syntax <http://www.sphinx-doc.org/en/stable/usage/restructuredtext/roles.html#cross-referencing-syntax>`_


And how about linking to :code:`:topic:`topic-name``?  Nope.  How about :code:`:ref:`topic-name`` ? nope.


- trying to cross reference :token:`order_number`



- try to find an existing way to show a command and options



things to try
-------------

- fields lists:  another positional thing (colon; on the same line)
  - http://docutils.sourceforge.net/docs/ref/rst/restructuredtext.html#field-lists




Examples and inspiration:
-------------------------

* nicely done : shows small images of how each thing will look when formatted: https://ogom.github.io/draw_uml/plantuml/


