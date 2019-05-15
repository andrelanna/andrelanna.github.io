---
title: Plano de ensino - 2018/2
permalink: /lectures/ersw/planoDeAulas
layout: default 
---


{% assign semestre = "2019/1" %}
{% assign atualizacao = "15 de maio de 2019." %}
{% assign formAddress = "https://docs.google.com/forms/d/e/1FAIpQLSehZ3AgsqhywgcU4-O8LCokcucqAoChhIYXnso7cwEt-66D1g/viewform" %}
{% assign notasFrequencias = "https://docs.google.com/spreadsheets/d/1Tk7rRK-I3CpOqCZbKNIP8g1GhPI3JRNLc2EjMI79Oj4/edit?usp=sharing" %} 
### UnB - Universidade de Brasilia
### CIC - Departamento de Ciência da Computação
### PPCA - Programa de Pós-Graduação em Computação Aplicada
### RSw - Requisitos de Software
------
### Plano de ensino - {{semestre}} 

[//]:<> <span style="background-color:red">***Cadastre [AQUI]({{ formAddress }}) seu nome, matricula e email***</span>   
[//]:<> <span style="background-color:green">***Notas e frequencias [AQUI]({{ notasFrequencias }})***</span>

#### Identificação
Disciplina: Engenharia de Requisitos   
Professor Dr. André Luiz Peron Martins Lanna  
Semestre: 2019/1  
Horário: Sexta-feira, 14:00 -- 18:00 hs.  

#### Ementa da disciplina
*  Fundamentos da engenharia de requisitos;
*  restrições de desenvolvimento, requisitos funcionais e não funcionais;
*  processos de engenharia de requisitos (definição de escopo, identificação,
elicitação, especificação, avaliação e rastreabilidade de requisitos);
*  notações para especificação de requisitos (casos de uso e estórias dos usuários),
*  técnicas formais para especificação de requisitos.

#### Objetivos
Capacitar o aluno a compreender os conceitos, técnicas, procedimentos e
ferramentas que ajudam a estabelecer os requisitos de um software nos diversos
níveis de abstração.


#### Metodologias de ensino: 

Todas as aulas serão expositivas, com exercícios para fixação do conteúdo.
Eventualmente recursos como mapas mentais, oficinais e estudos dirigidos
poderão ser utilizados pelo professor como forma de avaliação do conteúdo.

#### Critérios de avaliação:
A disciplina é de 2 (dois) créditos, sendo 4 horas-aula abrangendo aulas
teóricas e práticas. Nas aulas teóricas haverá exposição de conteúdos e
discussão das bases teóricas da ementa proposta. Nas aulas práticas envolverá o
estudo de soluções para problemas reais e a resolução de exercícios,
individualmente ou em grupo e atividades em laboratório. A fim de fortalecer a
aprendizagem da disciplina, as aulas poderão ser complementadas com atividades
de exercícios feitos durante as aulas em laboratório e demandas extraclasse,
disponibilizadas por meio da página da disciplina, e as atividades solicitadas
também devem ser entregues conforme instruções presentes no enunciado. A
comunicação entre professor, alunos e monitores se dará através de mensagens de
email e, se for o caso, por grupo em aplicativo de mensagens (a definir). Plano
de Ensino e Cronograma de Atividades da disciplina são disponibilizados aos
alunos para consulta na página da disciplina.


{% assign atv1 = "Atv_1"  %}
{% assign lblAtv1 = "Escrita de artigo científico em grupo de 3 alunos."  %}
{% assign pAtv1 = 5.0  %}

{% assign atv2 = "Atv_2"  %}
{% assign lblAtv2 = "Apresentação do artigo em grupo de 3 alunos."  %}
{% assign pAtv2 = 3.0  %}

{% assign atv3 = "Atv_3"  %}
{% assign lblAtv3 = "Avaliação individual da apresentação do artigo científico."  %}
{% assign pAtv3 = 2.0  %}



$${{ atv1 }}$$ - {{ lblAtv1 }} - peso {{ pAtv1 }}    
$${{ atv2 }}$$ - {{ lblAtv2 }} - peso {{ pAtv2 }}    
$${{ atv3 }}$$ - {{ lblAtv3 }} - peso {{ pAtv3 }}    


Todas as atividades serão avaliadas em uma escala de 0 a 10. O cálculo da
menção final será definido através da média ponderada dos valores obtidos pelo
aluno ao longo do semestre de acordo com a seguinte expressão: 

$$NF = \frac{ {{atv1}} \times {{ pAtv1 }} + {{ atv2 }} \times {{ pAtv2 }} + {{ atv3
}} \times {{ pAtv3 }} }{ {{pAtv1}} + {{pAtv2}} + {{pAtv3}} }$$

Para ser aprovado na disciplina o aluno deverá ter:

* Média Final $$ \geq $$ 5 
* Frequência $$ \geq $$ 75 % 

---





#### Cronograma da disciplina

 {% for au in site.data.plano_ersw_2019_1 %}
 {% assign a = au %}
 **{{ a.aula }} -- {{ a.data }}**  
 **Tópico:** {{ a.topico }}   
 **Atividade:**[{{ a.atividade.label }}]({{ a.atividade.link }})     
 **Material:** {% if a.material != "" %}[ {{ a.material.label }} ]({{
a.material.link }}){% else %} -- {% endif %}   
 **Codigo:** {% if a.codigo != "" %}[ {{ a.codigo.label }}]({{ a.codigo.link }}){% else %} -- {% endif %}   
 {% endfor %}


#### Bibliografia Básica : 

* Leffingwell, 2011, Agile Software Requirements, http://www.scaledagileframework.com/
* Withall, S., Software Requirement Patterns, 1ª. Edição, Microsoft Press, 2007.
* Pfleeger, S., Engenharia de Software: Teoria e Prática, 2a. Edição, Prentice Hall, 2004.
* Chrissis, M., Konrad, M., Shrum, S., CMMI: Guidelines for Process Integration and Product Improvement, 2th ed, Addison-Wesley, 2006.
* Ian Sommerville, Engenharia de Software. 8ª Edição PrenNce Hall, 2007. 
* Shari L. Pfleeger, Engenharia de Software – Teoria e Prática 2ª Edição. Prentice Hall, 2007.
* Suzanne Robertson e James Robertson. Mastering the Requirements Process, 2ª Edição, Addison-Wesley, 2006. 
* Dean Leffingwell e Don Widrig. Managing Software Requirements – A Unified Approach. Addison-Wesley, 2000. 
* Ian Sommerville e Peter Sawer. Requirements Engineering: A Good Practice Guide. John Wiley & Sons, 2000. 
* Elizabeth Hull, Ken Jackson e Jeremy Dick. Requirements Engineering, 2ª Edição, Springer, 2005.


[//]:<> #### Sobre as aulas / atividades:
[//]:<> 
[//]:<> * Chamadas serão realizadas em cada aula. 
[//]:<> * **Faltas não serão abonadas.** 
[//]:<> * O professor disponilbiliza **horário de atendimento exclusivo** para essa turma.
[//]:<>   Esse horário é reservado para vocês portanto utilizem-no sempre que
[//]:<> precisarem. 
[//]:<> * Horário de atendimento POO:
[//]:<>   - 4as feiras, das 13:00 às 14:00 horas. 
[//]:<>   - 6as feiras, das 13:00 às 14:00 horas.
[//]:<> * Salvo em casos excepcionais as provas serão entregues aos alunos na aula
[//]:<>   seguinte à sua aplicação. Nessa aula as questões serão discutidas em sala.
[//]:<>   Revisões de avaliação somente poderão ser realizadas nessa aula. 
[//]:<> * Entregas de trabalhos serão sempre entregues através de meio eletrônico salvo
[//]:<>   quando outra maneira for definida explicitamente pelo professor. 
[//]:<> * As atividades que forem consideradas cópias receberão nota zero sem a
[//]:<>   possibilidade de revisão. 
[//]:<> * Na última semana do semestre, os alunos poderão revisar suas notas finais com
[//]:<>   o professor.   

[//]:<> Não haverá prova ou atividade de recuperação.

---

<sup>Última atualização: _{{ atualizacao }}_</sup>



