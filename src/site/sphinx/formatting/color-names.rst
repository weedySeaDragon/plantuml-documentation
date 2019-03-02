.. index:: color names
   see: colors; color names
   see: all colors; color names

.. _all_color_names:

Color Names and Samples
#######################

These are all of the defined color names in PlantUML_, in alphabetical order by name.  (And yes, the little square of each color was generated using PlantUML_.  The source is at the bottom of this page.)

You can use these by putting a :code:`#` in front of the name.  See the specific keywords and options for examples.


.. include:: puml/COLORS_RST_TABLE.TXT


**PlantUML_ source for the AliceBlue square of color:**

(An example of how they all look, except the color name *e.g. AliceBlue* is set to each respective color name.)


.. code-block::  text

   @startuml

   skinparam ClassBackgroundColor #AliceBlue
   skinparam ClassFontColor #AliceBlue
   skinparam ClassBorderColor #AliceBlue

   skinparam ClassStereotypeFontSize 0
   skinparam CircledCharacterFontSize 0
   skinparam CircledCharacterRadius 0
   skinparam ClassBorderThickness 0
   skinparam Shadowing false

   class Dummy

   @enduml


It's a bit of a kludge, but given a list of all of the color names and a generic template for the :code:`.puml` file
needed, I quickly generated all of the .puml files.  (The list of all color names came from running the PlantUML command :code:`java -jar plantuml -language`
