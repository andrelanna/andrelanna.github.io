---
title: Notas e frequencia, OO, turma A
permalink: /lectures/oo/notasFrequenciasTurmaC.html
layout: default 
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação a objetos
### Turma C
------

<table>
<tr><td><b> Matricula </b></td><td><b> Av.1 </b></td><td><b> Av.2 </b></td><td><b> Av.3 </b></td><td><b> Av.4 </b></td><td><b> Tr.1 </b></td><td><b> Tr.2 </b></td><td><b> Freq. </b></td></tr>  
{% for al in site.data.turmaA %}
{% assign a = al %}
<tr><td> {{ a.matricula }} </td><td>  {{ a.avaliacoes[0].nota }} </td><td>  {{ a.avaliacoes[1].nota }} </td><td>  {{ a.avaliacoes[2].nota }} </td><td> {{ a.avaliacoes[3].nota }} </td><td>  {{ a.trabalhos[0].nota }} </td><td>  {{ a.trabalhos[1].nota }} </td><td>  {{ a.frequencia }} </td></tr>
{% endfor %}
</table>
