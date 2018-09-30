
How This Documentation Is Generated
***********************************

Using Sphinx http://www.sphinx-doc.org/en/stable/index.html

* Has support for internationalization

Files can be simple markup (.md) or .rst


Insert a PlantUML
-----------------

.. uml:: how_to_generate_site.puml

:caption: this reads a .uml file and then calls PlantUML to generate the diagram (.png in this case)

    Here is the code used to insert that diagram:

.. literalinclude:: how_to_generate_site.puml




Ideas
-----

1. Getting the list of all commands and options

The command line `-pattern` option will generate all of the regexs used for all commands.
Can we take those and do some substitutions to make them human readable?

uml:: gen_reference_from_regexs.puml

Create an index of all terms

