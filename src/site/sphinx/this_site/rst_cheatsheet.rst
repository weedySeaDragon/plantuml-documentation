RST Cheatsheet
##############


Great RST and Sphinx documentation:  http://openalea.gforge.inria.fr/doc/openalea/doc/_build/html/source/sphinx/rest_syntax.html


list of Awesome Sphinx stuff: `<https://github.com/yoloseem/awesome-sphinxdoc>`_.


https://github.com/ralsina/rst-cheatsheet/blob/master/rst-cheatsheet.rst

https://brandons-sphinx-tutorial.readthedocs.io/en/latest/quick-sphinx.html

https://brandons-sphinx-tutorial.readthedocs.io/en/latest/quick-rst.html

http://docutils.sourceforge.net/docs/user/rst/quickref.html


---------
Indexing:
---------

* index directive:

`<http://www.sphinx-doc.org/en/master/usage/restructuredtext/directives.html?#directive-index>`_


`.. index::`

`.. index:: BNF, grammar, syntax, notation`  creates 4 entries for the following block




***********
References:
***********


Internal links are :refs:

#. first define a label -- it MUST precede a section header if it has no caption

#. then you can link to it with just the :code:`:ref:`labelname_`` label name followed by an underscore **_**


.. _rst_internal_link_example:

-----------------
Internal Link Ref
-----------------

   this is the caption for the link

   This is the content for the label :code:`.. _rst_internal_link_example:`.  Note that has only **one** colon (not the double ones as for most directives)




External hyperlinks, like `Python
<http://www.python.org/>`_.

`RST Syntax <https://thomas-cokelaer.info/tutorials/sphinx/rest_syntax.html>`_.



*********************************************
Section Header Hierarchy (over- & underlines)
*********************************************


Titles are underlined (or over- and underlined) with
a nonalphanumeric character at least as long as the
text.

A lone top-level section is lifted up to be the
document's title.


Note that these all require an overline and underline.


.. csv-table:: **Heading Heirarchy Chars (python conventions)**
   :header: "Level", "character"
   :widths: 40, 10


   "Title/H1 (top level)", \# *overline is optional*
   "H2 (chapter)", \* requires overline
   "H3 (section)", \=
   "H4 (subsection)", \- requires overline!
   "H5 (sub-subsection)", \^



Just see the top of this page for the Title format.  Here's the source for the title of this page:


::

   RST Cheatsheet
   ##############


***************
Chapter example
***************

::

   ***************
   Chapter Example
   ***************

===============
Section example
===============

::

   ===============
   Section Example
   ===============

------------------
Subsection example
------------------

::

   ------------------
   Subsection Example
   ------------------
