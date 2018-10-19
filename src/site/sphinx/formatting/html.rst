.. index:: HTML
   see: Legacy HTML support; HTML

.. _html:

HTML
####

PlantUML supports a very small amount of basic HTML.

`Reference and Info on the PlantUML site <http://plantuml.com/creole>`_


=================
Keywords / Syntax
=================

.. index:: HTML text formatting (HTML)
   pair: HTML; text formatting (HTML)


---------------
Formatting text
---------------

.. index:: bold text (HTML)
   pair:  HTML; text formatting (HTML)


.. index:: italic text
   pair: HTML; text formatting (HTML)


.. index:: strike-out text (HTML)
   pair: HTML; text formatting (HTML)


.. index:: underline text (HTML)
   pair: HTML; text formatting (HTML)

.. index:: wavy underline text (HTML)
   pair: HTML; text formatting (HTML)

<b> for :index:`bold text<triple: bold; text; HTML>`
<i> for :index:`italic text<triple: italic; text; HTML>`
<s> to :index:`strike out text<triple: strike out; text; HTML>`
<u> to :index:`underline text<triple: underline; text; HTML>`
<w> to :index:`wave underline text<triple: wavy underline; text; HTML>`

.. index:: font size (HTML)
   pair: HTML; text formatting (HTML)

<size:nn> to change :index:`font size<triple: font size; text; HTML>`



.. index:: text color (HTML)
   triple: HTML; color; text formatting (HTML)

-----
Color
-----

<u:#AAAAAA> or <u:colorName> for underline

example:


<s:#AAAAAA> or <s:colorName> for strike text

example:


<w:#AAAAAA> or <w:colorName> for wave underline text

example:


* You can change <color:red>text color</color>
* You can change <back:cadetblue>background color</back>
* You can change <size:18>size</size>
* You use <u>legacy</u> <b>HTML <i>tag</i></b>
* You use <u:red>color</u> <s:green>in HTML</s> <w:#0000FF>tag</w>


<color:#AAAAAA> or <color:colorName>
<back:#AAAAAA> or <back:colorName> for background color




----------------
Inserting Images
----------------
.. index:: image
   pair: image; HTML


<img:file://logo3.png>
  - inserts the logo3.png file

<img:http://plantuml.com/logo3.png>
  - inserts the file from that location on the internet

