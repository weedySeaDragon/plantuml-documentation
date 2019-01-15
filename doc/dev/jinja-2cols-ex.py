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

subentries_every_nth = 3

# create some entries, some having subentries:
entries = []
for i in range(1,22):
    entry = []
    entry.append(str(i))
    subentry = []
    if i % subentries_every_nth == 0:
        for x in range(0,3):
            subentry.append(str(x))

    entry.append(subentry)

    entries.append(entry)

# display the entries
print("\nentries: " + str(entries))

# calculated the total number of all entries (entries and subentries) and display that
total_len = len(entries) + ( (len(entries)//subentries_every_nth) *3)
print("\ntotal_len = " + str(total_len)+ "\n")
print("- - - - - - - - - ")

templ_content = ("""
{%- set genindexcounts_entry = total_len %}
{%- set columns = namespace(num = 3) %}  {# change this value if you want a different number of columns.#}
{% set columnWidthPercent = namespace(size = ( 100 // (columns.num + 1) ) ) %}

{%- set column_len = namespace( max = 0 ) %}
{%- set current_column = namespace( num = 1 ) %}

{% set entry_col_td_end = namespace(str = "        </ul>
            </td>") %}
{% set subentry_list_end = namespace(str = '                                    </ul>
                            </li>') %}


{% macro  entry_col_td_start(colWidthPercent)%}
            <td style="width: {{ colWidthPercent }}%; vertical-align: top;">
                <ul>
{% endmacro %}

{% macro entry_list_continued(entry_name) %}
                          <li class="entry"><span class="entry-continued">{{ entry_name }} continued</span>
{% endmacro %}


{# <table> #}
    {%- set column_len.max = ( genindexcount // columns.num ) %}
    {%- set current_column.num = 1 %}
{#    <tr> #}
columns.num: {{ columns.num }}
column_len.max: {{ column_len.max }}
{{ entry_col_td_start(columnWidthPercent.size) }}

    {%- set totalLoop = namespace( count = 0) %}
    {# {%- set indexentryLoop = namespace( count = loop.index) %} #}
    {%- set indexentryLoop = namespace( count = 1) %}
    {%- set subentryLoop = namespace( count = 0 ) %}

    {%- for entry in entries %}
        {% set indexentryLoop.count = loop.index %}
        {% set totalLoop.count = totalLoop.count + 1 %}
        (totalLoop.count % column_len.max ) = {{ (totalLoop.count % column_len.max ) }}

          <li>{{ entry[0] }}</li>
            [{{totalLoop.count }}]
                   
          {%- if (entry[1]|length) > 0 %}
             {%- if ( (totalLoop.count % column_len.max ) == 0 ) and (current_column.num < columns.num)  %}
                       in first if for subentry...
                        {%- if not loop.last %} {# don't want to start a new column for just 1 subentry #}
                            {%- set current_column.num = current_column.num + 1 %}
                            {{ entry_col_td_end.str }}
                            {{ entry_col_td_start(columnWidthPercent.size) }}
                            {{ entry_list_continued(entry) }}
                        {%- endif  %}  
            {%- endif %} {# if not loop.last and  (totalLoop.count > ... #}              
            <ul>
              {%- for subentry in entry[1] %}              
                {% set totalLoop.count = totalLoop.count + 1 %}

                <li>sub {{ subentry }}</li>
                 [{{totalLoop.count }}] (totalLoop.count % column_len.max ) = {{ (totalLoop.count % column_len.max ) }}
                 
                {%- if ( (totalLoop.count % column_len.max ) == 0 ) and (current_column.num < columns.num)  %}
                    {%- if not loop.last %} {# don't want to start a new column for just 1 subentry #}
                        {%- set current_column.num = current_column.num + 1 %}
                        </ul>  end subentry list 
                        {{ entry_col_td_end.str }}
                        {{ entry_col_td_start(columnWidthPercent.size) }}
                        {{ entry_list_continued(entry) }}
                        <ul>  (restart subentry list)
                    {%- endif  %}  
                {%- endif %} {# if not loop.last and  (totalLoop.count > ... #}
              {%- endfor %} {# subentries #}

            </ul>
          {%- endif %}

          {%- if ((totalLoop.count % column_len.max ) == 0  ) and (current_column.num < columns.num) %}

               {%- if not loop.last %}
                    {%- set current_column.num = current_column.num + 1 %}
                    {{ entry_col_td_end.str }}
                    {{ entry_col_td_start(columnWidthPercent.size) }}
               {%- endif %}
          {%- endif  %}

    {%- endfor %}
{{ entry_col_td_end.str }}
{#    </tr> #}
{#</table> #}
""")

print( Template( templ_content ).render({'entries': entries, 'genindexcount': total_len}).strip() )
