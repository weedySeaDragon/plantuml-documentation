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


templ_content = ("""
{%- set str1 = "str1" %}
{%- set str2 = "<p>" + str1 +"</p>" %}

str1 = {{ str1 }}

str2 = {{ str2 }}
""")

print( Template( templ_content ).render().strip() )
