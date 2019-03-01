.. PlantUML documentation master file, created by
   sphinx-quickstart on Thu Sep 14 00:14:23 2017.


Ashley's PlantUML Information
#############################


I wrote this because I find the documentation for PlantUML lacking.  It's hard to figure out exactly what commands
can and cannot be used in what contexts.  It's not obvious how to find all of the options for skinparams (which set the style / look & feel for your diagrams)


PlantUML is really helpful.  If it were easier to use, it would be even more helpful!
Documenting it better helps to make it easier to use and is something I can contribute.

Note that this is a total work in progress.  I'm just getting started with this.
If you have any suggestions, contributions, or questions, let me know:  ashley.engelund@gmail.com

=========================
What this is... and isn't
=========================

This is documentation about how to use PlantUML:  the commands, keywords, options, and other information you need to
produce diagrams with PlantUML.

This is *not* a tutorial about UML diagrams, although there are places where I do explain a little bit about them.
A little web searching will provide you with all sorts of information on UML diagram notation.  Here is a formal specification
of UML as a whole: `The official UML site <http://www.uml.org/>`_ and a beginner friendly site about UML diagrams and notation: `UML-Diagrams.org <http://uml-diagrams.org>`_

This is a very, very early version.  I'm still figuring out how I want to format things, how to best index terms, and
I've just begun to documenting a few diagrams (UML Use Cases and Sequence diagrams).


----------------------------------------------------
Here are the pages that have some content right now:
----------------------------------------------------

*Note these are all in progress*

- **Diagrams**

   For each diagram, I've tried to include both visual (diagram) and text examples of what each keyword does.
   I'll eventually list all of the applicable `skinparams`

   - **UML Use Case Diagram:**
     :ref:`UMLUse Case Diagram <use_case_diagram>`


   - **UML Sequence Diagram:**
     :ref:`UML Sequence Diagram <sequence_diagram>`


- **All skin parameter settings:**
  :ref:`All Skinparams (Skin Parameters) <skinparam>`

   A reference of *all* `skinparam` settings.  I'm working on writing up definitions and examples.


- **All named colors:**
  :ref:`Color Names and Samples <all_color_names>`

   a page that shows every color name with a small example (a small square swatch) of the color

   I created this as a handy way of seeing what each named color looks like


======================================
All Pages (detailed table of contents):
======================================

.. toctree::
   :maxdepth: 3
   :glob:

   *
   */index


.. comment
   diagrams/*
   diagrams/**/*
   this_site/*
   this_site/**/*



******************
Indices and tables
******************


* :ref:`genindex`
* :ref:`search`

