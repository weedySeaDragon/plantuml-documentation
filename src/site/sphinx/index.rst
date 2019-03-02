Ashley's PlantUML_ Documentation
################################


I wrote this because I find the documentation for PlantUML_ lacking.  It's hard to figure out exactly what commands
can and cannot be used in what contexts.  It's not obvious how to find all of the options for skinparams (which set the style / look & feel for your diagrams)


PlantUML_ is really helpful.  If it were easier to use, it would be even more helpful!
Creating better documentation helps make it easier to use.  This is a way I can contribute.

Note that this is a *total work in progress.*  I'm just getting started with this.
If you have any suggestions, corrections, questions, or contributions, please do let me know:  ashley.engelund@gmail.com


**What this is... and isn't**

This is documentation about how to use  PlantUML_ the commands, keywords, options, and other information you need to
produce diagrams with  PlantUML_.

This is *not* a tutorial about UML diagrams, although there are places where I do explain a little bit about them.
A little web searching will provide you with all sorts of information on UML diagram notation.  Here is a formal specification
of UML as a whole: `The official UML site <http://www.uml.org/>`_ and a beginner friendly site about UML diagrams and notation: `UML-Diagrams.org <http://uml-diagrams.org>`_

This documentation is a very, very early version.  I'm still figuring out how I want to format things, how to best index terms, and
I've just begun to documenting a few diagrams (UML Use Cases and Sequence diagrams).

**Diagrams**

For each diagram, I've tried to include both visual (diagram) and text examples of what each keyword does.
I'll eventually list all of the applicable `skinparams`


=================================
Pages that currently have content
=================================



---------------------------------------------
:ref:`UML Use Case Diagram <use_case_diagram>`
---------------------------------------------

----------------------------------------------
:ref:`UML Sequence Diagram <sequence_diagram>`
----------------------------------------------


---------------------------------------------------
:ref:`All Skinparams (Skin Parameters) <skinparam>`
---------------------------------------------------

   A reference of *all* `skinparam` settings.  I'm working on writing up definitions and examples.


------------------------------------------------
:ref:`Color Names and Samples <all_color_names>`
------------------------------------------------

   This page that shows **every color name with a small example (a small square swatch) of the color**

   I created this as a handy way of seeing what each named color looks like.


=========================
Known problems and issues
=========================

- **!include directive is not working**

  There is a problem with using :code:`!include` with the current plantuml.jar and building this documentation with Sphinx.

  This means that I am currently unable to include my default stylesheet (my .iuml file)
  and I am unable to include content for many diagrams.  (For example, I use the same 'wake to an alarm clock' activity for the Activity diagram examples.)


======================================
All Pages (detailed table of contents)
======================================


.. toctree::
   :caption: Diagrams
   :maxdepth: 3

   diagrams/index
   diagrams/activity
   diagrams/archimate
   diagrams/asciimath
   diagrams/class
   diagrams/component
   diagrams/deployment
   diagrams/ditaa
   diagrams/gantt
   diagrams/graphviz-dot
   diagrams/jlatexmath
   diagrams/keywords_common_to_all
   diagrams/object
   diagrams/sequence
   diagrams/state
   diagrams/timing
   diagrams/usecase
   diagrams/wireframe


.. toctree::
   :caption: Style and Layout
   :maxdepth: 3

   formatting/index
   formatting/using-skin-params
   formatting/color-names
   formatting/html
   formatting/creole
   formatting/all-skin-params


.. toctree::
   :caption: Advanced Use
   :maxdepth: 3

   advanced-use/index


.. toctree::
   :caption: Misc.

   this_site/index
   changelog


.. comment
   diagrams/*
   diagrams/**/*
   this_site/*
   this_site/**/*



------------------
Indices and tables
------------------


* :ref:`genindex`
* :ref:`search`

