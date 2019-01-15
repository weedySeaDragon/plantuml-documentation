About This Site
###############


***********
Built with:
***********

- JetBrains PyCharm (and sometimes IntelliJ using gradle)

- python 3.6.6

- `Sphinx 1.8.1 <http://www.sphinx-doc.org/en/stable/index.html>`_

  - `sphinx-rtd-theme <https://sphinx-rtd-theme.readthedocs.io/en/latest/>`_
      I've modified the theme for this site.
  - `sphinxcontrib-plantuml <https://github.com/sphinx-contrib/plantuml>`_
      This super helpful Sphinx plugin takes all of the :code:`.puml` files and calls PlantUML to generate the :code:`.png` files for the HTML pages.
  - javasphinx


I've written some Java code to extract information directly from PlantUML code.
The extracted info is then used as input to my sphinx files.  (I have a gradle java project that does all of that.)
I also have some python code that creates some of the .puml files and initial rST code.


=================
Pycharm settings:
=================

Here's how I have PyCharm set up:

1. Set the sphinx directory for this project:

  - Pycharm -> Preferences -> Tools -> Python Integrated Tools

    a. set the doc to Restructured Text
    b. set the Sphinx working directory to the folder in your project that has the root of your Sphinx source files.  (It's the one that has the conf.py file.)


2. create a Run configuration for a Sphinx task:

  - Run -> Edit Configurations

    a. Click on the "+" to create a new run task configuration
    b. Choose a new Sphinx task:  it's under Python Docs
    c. Give it a name (like "Sphinx generate site")
    d. Set the Output Directory and ensure that they Python Interpreter is the version you want.



=========================
Examples and inspiration:
=========================

* nicely done : shows small images of how each thing will look when formatted: https://ogom.github.io/draw_uml/plantuml/



.. todo::

   Fix genindex columns: doesn't deal with 2nd level entries when computing column splits
   see :code:`def write_genindex(self):` in /Users/ashleyengelund/.pyenv/versions/3.6.6/lib/python3.6/site-packages/sphinx/builders/html.py


:ref:`To Dos <todos>`



