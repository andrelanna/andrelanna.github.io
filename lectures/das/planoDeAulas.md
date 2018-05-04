---
title: Plano de ensino - 2018/1
permalink: /lectures/das/planoDeAulas.html
layout: default 
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### DAS - Desenvolvimento Avançado de Software
------

{% assign semestre = "2018/2" %}
{% assign atualizacao = "16 de março de 2018." %}
{% assign formAddress = "https://docs.google.com/forms/d/e/1FAIpQLSc2V_YiHt2U4OYIPBhs49l4llNEMU7isRdwXs2km78F_0ut9g/viewform" %}

### Plano de ensino - {{ semestre }}

<span style="background-color:red">***Cadastre [AQUI]({{ formAddress }}) seu nome, matricula e email***</span>

#### Ementa da disciplina: 
* Reuso de software
* Refatoramento de software
* Desenvolvimento orientado a testes
* Desenvolvimento baseado em componentes (DBC)
* Frameworks de desenvolvimento

#### Objetivos:
Para cobrir os elementos descritos na ementa, foram traçados os seguintes
objetivos para serem cumpridos durante esse semestre:
* Rever os conceitos de criação / execução de testes unitários do framework
  xUnit.
* Apresentar os maus cheiros de código que nos indicam oportunidades de
  refatoração em um projeto de software.
* Apresentar o conjunto de operações de refatoração, passo-a-passo. 
* Apresentar a técnica de TDD, e seus modos de execução.
* Apresentar os conceitos fundamentais de reuso de software e as técnicas
  existentes, em especial frameworks para desenvolvimento baseado em componentes
  e linhas de produto de software. 

#### Metodologias de ensino: 

Todas as aulas serão expositivas, com exercícios para fixação do conteúdo.
Eventualmente recursos como mapas mentais, oficinais e estudos dirigidos poderão
ser utilizados pelo professor como forma de avaliação do conteúdo.

#### Critérios de avaliação:
Ao longo do semestre serão realizadas 6 atividades para avaliação do conteúdo,
sendo 4 provas e 2 trabalhos em grupo. As atividades realizadas em sala de aula
também serão avaliadas e terão efeito na nota final do aluno. Para cada uma das
atividades avaliativas será atribuído um peso no cálculo da nota final, a saber:

{% assign av1 = "A_1"  %}
{% assign lblAv1 = "Avaliação 1"  %}
{% assign pAv1 = 1.0  %}

{% assign av2 = "A_2"  %}
{% assign lblAv2 = "Avaliação 2"  %}
{% assign pAv2 = 1.5  %}

{% assign av3 = "A_3"  %}
{% assign lblAv3 = "Avaliação 3"  %}
{% assign pAv3 = 1.5  %}

{% assign av4 = "A_4"  %}
{% assign lblAv4 = "Avaliação 4"  %}
{% assign pAv4 = 2.0  %}

{% assign tr1 = "T_1"  %}
{% assign lblTr1 = "Trabalho 1"  %}
{% assign pTr1 = 1.0  %}

{% assign tr2 = "T_2"  %}
{% assign lblTr2 = "Trabalho 2"  %}
{% assign pTr2 = 2.5  %}

{% assign at = "A_s"  %}
{% assign lblAt = "Atividades em sala"  %}
{% assign pAt = 0.5  %}


$${{ av1 }}$$ - {{ lblAv1 }} - peso {{ pAv1 }}    
$${{ av2 }}$$ - {{ lblAv2 }} - peso {{ pAv2 }}    
$${{ av3 }}$$ - {{ lblAv3 }} - peso {{ pAv3 }}    
$${{ av4 }}$$ - {{ lblAv4 }} - peso {{ pAv4 }}    
$${{ tr1 }}$$ - {{ lblTr1 }} - peso {{ pTr1 }}   
$${{ tr2 }}$$ - {{ lblTr2 }} - peso {{ pTr2 }}   
$${{ at  }}$$ - {{ lblAt  }} - peso {{ pAt  }}   

O cálculo da menção final será definido através dos valores obtidos pelo aluno
ao longo do semestre de acordo com a seguinte expressão: 

$$NF = \frac{ {{av1}} \times {{ pAv1 }} + {{ av2 }} \times {{ pAv2 }} + {{ av3
}} \times {{ pAv3 }} + {{ av4 }} \times {{ pAv4 }} +  {{ tr1 }} \times {{ pTr1
}} +  {{ tr2 }} \times {{ pTr2 }} +  {{ at }} \times {{ pAt }}  }{ 10 }$$



#### Material didático
##### Refatoração
[Slides de introducao a refatoracao][sl1]  
[Principios em refatoracao][sl2]  
[Oportunidades de refatoração][sl3]  
[Grupo 1 - Composição de métodos][cat1]  
[Grupo 2 - Movendo caracteristicas entre classes / objetos][cat2]  


#### Cronograma da disciplina
{% for class in site.data.plano_das_2018_1 %}
{{ class.aula}} -- {{ class.data }}  
**Tópico:** {{ class.topico}}  
**Material:**{% for material in class.material %} [[slides]({{ material }})] {% endfor %}  
**Código:**{% for codigo in class.codigo %} [[codigo]({{ codigo }})] {% endfor %}  
**Atividade:**{% for atividade in class.atividade %} [[atividade]({{ atividade }})] {% endfor %}
{% endfor %}



### Bibliografia Básica : 

Beck, K., TDD: Desenvolvimento Guiado por Testes, 1ª. ed. Bookman, 2010.

[EBRARY] Wang, A. K., Component-Oriented Programming, Wiley, 2005.

[\[OPEN ACESS\]][cruise] Almeida, E., Álvaro, A., Cardoso, V., Mascena, J., Burégio, V., Nascimento, Lucrédio, D., Meira, S., C.R.U.I.S.E. Component Reuse in Software Engineering, Cesar e-Books, 2007.

### Bibliografia Complementar :

[EBRARY] DelBono, E. B., James F., McWherter, J., Professional Test Driven Development with C : Developing Real World Applications with TDD, Wrox, 2011.

Larman, C., Utilizando UML e Padrões: Uma Introdução a Análise e ao Projeto Orientado a Objetos, 3ª. ed. Bookman, 2007.

Sommerville, I., Engenharia de Software, 8a. ed. Pearson Addison Wesley, 2007.

[EBRARY] Gao, J. Z., Tsao H.S.J., Wu, Y., Testing and Quality Assurance for Component-Based Software, Artech House, 2003.

Meszaros, G., xUnit Test Patterns: Refactoring Test Code, Addison-Wesley,

[cruise]: http://www.academia.edu/179616/C.R.U.I.S.E_-_Component_Reuse_in_Software_Engineering


#### Sobre as aulas / atividades:

* Chamadas serão realizadas em cada aula. 
* **Faltas não serão abonadas**. 
* O professor disponilbiliza horário de atendimento exclusivo para essa turma.
  Esse horário é reservado para vocês, portanto utilizem-no sempre que
  precisarem. 
* Horário de atendimento DAS:
  - 4as feiras, das 13:00 às 14:00 horas.
  - 6as feiras, das 13:00 às 14:00 horas.
* Salvo em casos excepcionais as provas serão entregues aos alunos na aula
  seguinte à sua aplicação. Nessa aula as questões serão discutidas em sala.
  Revisões de avaliação somente poderão ser realizadas nessa aula. 
* Entregas de trabalhos serão sempre entregues através de meio eletrônico, salvo
  quando outra maneira for definida explicitamente pelo professor. 
* As Atividades que forem consideradas cópias receberão nota zero, sem a
  possibilidade de revisão. 
* Na última semana do semestre, os alunos poderão revisar suas notas finais com
  o professor.   

[//]:<> Não haverá prova ou atividade de recuperação.





[sl1]: /lectures/das/sl1.pdf
[sl2]: /lectures/das/sl2.pdf
[sl3]: /lectures/das/sl3-oportRefatoracao.pdf
[cat1]: /lectures/das/Catalogo_Refatoracao_Compondo_metodos.pdf
[cat2]: /lectures/das/Catalogo_Refatoracao_movendo_caracteristicas.pdf 
[cat3]: /lectures/das/Catalogo_Refatoracao_Organizando_Dados.pdf
[cat4]: /lectures/das/Catalogo_Refatoracao_Simplificando_Expressoes_Condicionais.pdf
[trabalho1]: trabalho1.md
[trabalho3]: trabalho3.md
[trabalho4]: ./lectures/das/trabalhoFrameworks.pdf
[notas]: notas.md
[cadFormTesDireto]: Caderno_de_Formulas_Selic.pdf
[exemploTDD]: exercicioTDD.tar.gz
[enunciadoTDD]: enunciadoTDD.md
[introducaoReuso]: https://docs.google.com/presentation/d/1nGUzHAqzIYuOUfLx4cQnNsQrq4QZ1krXiXmsoIw67rQ/edit?usp=sharing
[introducaoFramework]: https://docs.google.com/presentation/d/18kqTFM0ulaIgasISnxN9IfzpML5d4SUahTCBAsS4UK8/edit?usp=sharing
----
*Última atualização: {{ atualizacao }}*
