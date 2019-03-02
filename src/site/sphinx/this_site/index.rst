About This Site
###############


**********************************
Built in IntelliJ (JetBrains IDE):
**********************************


- python 3.6.6

  - using virtualenv (see `Installing packages using pip and virtualenv <https://packaging.python.org/guides/installing-using-pip-and-virtualenv/>`_

- gradle:

  - this uses the gradle plugin :code:`sphinx-gradle-plugin ( id "kr.motd.sphinx" version "2.3.1")`  https://github.com/trustin/sphinx-gradle-plugin
    Unfortunately, this plugin hard-codes the sphinx binary to use https://github.com/trustin/sphinx-binary  .  So the sphinx version is pinned to whatever that version is.



- `Sphinx 1.8.1 <http://www.sphinx-doc.org/en/stable/index.html>`_

  - `sphinx-rtd-theme <https://sphinx-rtd-theme.readthedocs.io/en/latest/>`_
      I've modified the theme for this site.

  - `sphinxcontrib-plantuml <https://github.com/sphinx-contrib/plantuml>`_
      This super helpful Sphinx plugin takes all of the :code:`.puml` files and calls PlantUML_ to generate the :code:`.png` files for the HTML pages.

  - javasphinx


I've written some Java code to extract information directly from PlantUML_ code.
The extracted info is then used as input to my sphinx files.  (I have a gradle java project that does all of that.)
I also have some python code that creates some of the .puml files and initial rST code.



- Python plugin



**to generate sphinx documentation locally:**


- run task 'sphinx'  (runs the gradle task from the  sphinx-gradle-plugin)



=========================
Examples and inspiration:
=========================

* nicely done : shows small images of how each thing will look when formatted: https://ogom.github.io/draw_uml/plantuml/



.. todo::

   Fix genindex columns: doesn't deal with 2nd level entries when computing column splits
   see :code:`def write_genindex(self):` in /Users/ashleyengelund/.pyenv/versions/3.6.6/lib/python3.6/site-packages/sphinx/builders/html.py


:ref:`To Dos <todos>`



