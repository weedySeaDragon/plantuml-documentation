About This Site
###############

***********
Built with:
***********

- JetBrains PyCharm (and sometimes IntelliJ using gradle)

- python 3.6.6

- `Sphinx 1.8.1 <http://www.sphinx-doc.org/en/stable/index.html>`_

  - sphinx-rtd-theme         0.4.1
  - sphinxcontrib-plantuml   0.12
  - javasphinx               0.9.15


I've written some Java code to extract information directly from PlantUML code.
The extracted info is then used as input to my sphinx files.  (I have a gradle java project that does all of that.)



=================
Pycharm settings:
=================

Setting up Sphinx:

1. Set the sphinx directory for this project:

  - Pycharm -> Preferences -> Tools -> Python Integrated Tools

    a. set the doc to Restructured Text
    b. set the Sphinx working directory to the folder in your project that has the root of your sphinx source files.  (It's the one that has the conf.py file.)


2. create a Run configuration for a Sphinx task:

  - Run -> Edit Configurations

    a. Click on the "+" to create a new run task configuration
    b. Choose a new Sphinx task:  it's under Python Docs
    c. Give it a name (like "Sphinx generate site")
    d. Set the Output Directory and ensure that they Python Interpreter is the version you want.


***********
my dev info
***********

.. toctree::

   todos
   rst_cheatsheet
   exploring-how-to

