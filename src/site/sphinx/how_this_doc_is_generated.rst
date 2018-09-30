
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



Insert code
-----------
Could scan the code for commands like this code read directly from /src/net/sourceforge/plantuml/activitydiagram3/command/CommandNoteLong3.java:)

.. literalinclude:: /../../net/sourceforge/plantuml/activitydiagram3/command/CommandGoto.java
    :lines: 51-58
    :language: java

The code above was read directly with a rST directive that takes the filename, lines to read, and language (java).

Since the actual code is read, that means that the documentation is always up to date with what's in the code.

And then automatically create the documentation for all of the commands and all of the options.


Ideas
-----

1. Getting the list of all commands and options

The command line `-pattern` option will generate all of the regexs used for all commands.
Can we take those and do some substitutions to make them human readable?

.. uml:: gen_reference_from_regexs.puml

2. Create an index of all terms

