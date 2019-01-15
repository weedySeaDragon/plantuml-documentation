Running LOG

2019-01-15

This is an IntelliJ project:  **github/ae/plantuml-documentation**


+ document the processes for generating the documentation
  Some documentation is in /src/site/sphinx/this_site
     - index.rst
     - todos.rst
     
  - doc the gradle files and projects
     - main build file = `<project root>/build.gradle`
     
        - settings = `<project root>/settings.gradle`
        - This build file sets project information and includes `sphinx`
        - It includes the subproject **generateDocInfo**
           - builds the java classes in `<project root>/generateDocInfo/src/main/resources/plantuml-generated`
             and creates a `.jar` that can be run to generate .... **WHAT??**
             `generateDocInfo/build/libs/generateDocInfo-<version>.jar` is the generated .jar file
           - includes plantuml.jar  
           - the java classes take text files as input (found in `<project root>/generateDocInfo/src/main/resources/plantuml-generated`)
           and creates the .rst output (e.g. the color sample page, which uses the `puml-color-file-template.txt`)
           **WHERE DOES THE OUTPUT GO??**
           
        
        
### How to run sphinx to generate the site
- the `sphinx` entry in the `build.gradle` file adds the _sphinx_ task to the `Tasks:other` gradle task list.
   This is a gradle plugin.  see `https://plugins.gradle.org/plugin/kr.motd.sphinx`
   
- the `site` task will run sphinx and build the site
  - uses files in `<project roo>/src/site/sphinx`  as the templates/source files for sphinx
 
For some reason today, after I updated the sphinx gradle task (updated/increased the version number in build.gradle),
the task would fail if I just ran it.  But when I _debbuged_ it (ran it in debug mode), it worked!  
 
  
#### output
  The HTML pages are in ../../../../Users/ashleyengelund/github/ae/plantuml-documentation/build/site.
  
### How to get info from plantuml code

 - python code that creates RST file for all skinparam datat ->  (where does this go?)
   `src/main/com/ashleycaroline/sphinxutils  create_all_skinparams_entries.py`
  
  - java Intellij code to generate color info: 
     ``     
     

+ doc the code that I've written or modded
  - my theme mods (based on the ReadTheDocs (RTD) theme)
