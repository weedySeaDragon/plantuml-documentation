Using Skinparams to Format and Style Diagrams
*********************************************

You can control how your diagrams look -- the _style_ -- with skin parameters, or "skin_param" settings.

("skin" comes from... and param = parameter)

you can put in individual settings in your diagram:#(example)

or you can create a separate file with all of the skin_param settings that you like#and then tell your diagrams to "include" your skin_param settings file:#(example)

This will apply _all_ of the settings in your skin_param settings file to your diagram.


* can be used in a single line in a diagram

  - no matter where the skinparam line is in a diagram, it will be applied to the *whole* diagram.
    In other words, you can put the skinparam as the last line in a diagram and it will be applied to the whole diagram, even the lines before it.

* can be used in an included file

* those that start with common words can be nested.  Ex:....

.. todo::

   example of how to  / what it means to "nest" skinparams.  Ex:  XFontSize, XFontStyle ....  SequenceZZZ, SequenceYYYYY


* if there is more than 1 use of the same skinparam, the *last* skinparam is the one that is used.  Ex:....

.. todo::

   example of more than 1 use of the same skinparam, the last one is used.

* upper or lowercase is fine.  Case is ignored.

Example of using :code:`DEFAULTs` with :code:`!define` preprocessing directive


========
Examples
========



