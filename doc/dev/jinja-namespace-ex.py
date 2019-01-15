# You can use the following in a python console/workspace to see examples of:
#  - jinja namespace() (reference a variable in the outer scope (loop))
#  - passing a value into a template (use a dictionary with each entry = "variable_name": variable_value
#  - slice() jinja filter (can be used to split a list into columns
#
# You can also just run this .py file.
#
# @since 2018-10-23
# @author Ashley Engelund ashley.engelund@gmail.com < weedySeaDragon @ github >

import jinja2
from jinja2 import Template

entries = ['a', 'b', 'c', 'd', 'e', 'f', 'g']

templ_content = ("""{% for column in entries | slice(2) %}
  ----------------
  column # = loop.index: {{ loop.index }}
  num cols = loop.length = {{ loop.length }}
    {% set entries = namespace(size = 0 ) %}  
    {% set entries = namespace(test = 0) %}  
    {% set colsIndex = namespace(loopindex = loop.index) %}
  column {{ loop.index }}:
  
  
    {%- for entry in column -%}
      {% set entries.size = loop.length %}
      {% set entries.test = entries.test + 2 %} {# just to show that you can use the same namespace with a different attribute (variable) #}
    {%- endfor -%}
    
    entries.size = {{ entries.size }}
    
    
    {%- for entry in column -%}
        loop.index = {{ loop.index }} for entry: {{ entry }}
           outer loop.index = {{ colsIndex.loopindex }}
    {%- endfor -%}
{% endfor %}""")

print(Template(templ_content).render({"entries": entries}).strip())