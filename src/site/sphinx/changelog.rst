.. index:: release history


.. _releases:

=========
Changelog
=========

..
   format for entries in this file (required by the releases extension):

   This must be a bullet list.

   Bullet list items should use the support, feature or bug roles to mark issues, or release to mark a release.
   These special roles must be the first element in each list item.

   Ex:
      * :release:`1.1.0 <date>`
      * :release:`1.0.1 <date>`
      * :support:`4` Updated our test runner
      * :bug:`3` Another bugfix
      * :feature:`2` Implemented new feature
      * :bug:`1` Fixed a bug
      * :release:`1.0.0 <date>`


   release:
      :release:`number <date>`


   issues:
      :type:`number[ keyword]`

         number is used to generate the link to the actual issue in your issue tracker (going by the releases_issue_uri option).
          It’s used for both the link target & (part of) the link text.

         If number is given as - or 0 (as opposed to a “real” issue number),
         no issue link will be generated. You can use this for items without a related issue.

         Keywords are optional and may be one of:
            backported
            major
            (N.N+)
         (see the releases extension doc for more info)

      feature:


      bug:
         :bug:`number` <short description>

         :bug:`123` Fixed a bug, thanks `@somebody`!

      support:


..
   releases is not compatible with Sphinx 1.8 or later.  If it were, I'd replace the contents with this:
      
      * :release:`0.1.0 2018-10-12` Initial publication
      * :feature:`5` customize ReadTheDocs theme to use white backgrounds and smaller fonts
      * :feature:`4` initial index entries
      * :feature:`3` Sequence diagrams
      * :feature:`2` Use Case diagrams
      * :feature:`1` Setup and organization of the documentation with Sphinx


*  **version v0.2.01   2019-03-01:  First announced version.**

   - improve homepage
   - global substitutions for skinparams


*  **version 0.1.0   2018-10-12:  Initial publication**

   - customize ReadTheDocs theme to use white backgrounds and smaller fonts
   - initial index entries
   - Sequence diagrams
   - Use Case diagrams
   - Setup and organization of the documentation with Sphinx

