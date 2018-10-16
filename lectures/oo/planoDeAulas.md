---
title: Plano de ensino - 2018/2
permalink: /lectures/oo/planoDeAulas.html
layout: default 
---


{% assign semestre = "2018/2" %}
{% assign atualizacao = "16 de outubro de 2018." %}
{% assign formAddress = "https://docs.google.com/forms/d/e/1FAIpQLSehZ3AgsqhywgcU4-O8LCokcucqAoChhIYXnso7cwEt-66D1g/viewform" %}
{% assign notasFrequencias = "https://docs.google.com/spreadsheets/d/1YkVh3kuyJcg1eeHvop-rEIRnpmVVXmBBaN45FTMEXbE/edit?usp=sharing" %} 
### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação a objetos
------
### Plano de ensino - {{semestre}} 

<span style="background-color:red">***Cadastre [AQUI]({{ formAddress }}) seu nome, matricula e email***</span>   
<span style="background-color:green">***Notas e frequencias [AQUI]({{ notasFrequencias }})***</span>


#### Ementa da disciplina
* Conceitos básicos de orientação a objetos.
* Modelagem orientada a objeto.
* Programação orientada a objetos.

#### Objetivos
Para cobrir os tópicos descritos na ementa, foram traçados os seguintes
objetivos a serem cumpridos durante esse semestre:
* Apresentar ao aluno o paradigma de Análise / Programação Orientada a Objetos
  (A/POO);
* Apresentar os conceitos básicos de A/POO quais sejam: encapsulamento, herança
  e polimorfismo;
* Apresentar os elementos básicos da linguagem Java de modo a permitir que os
  conceitos de POO possam ser assimilados pelos alunos;
* Relacionar os elementos constituintes da linguagem Java aos conceitos básicos
  de POO;
* Apresentar o tratamento de exceções em Java,
* Apresentar a biblioteca gráfica Swing e seus componentes.

#### Metodologias de ensino: 

Todas as aulas serão expositivas, com exercícios para fixação do conteúdo.
Eventualmente recursos como mapas mentais, oficinais e estudos dirigidos
poderão ser utilizados pelo professor como forma de avaliação do conteúdo.

#### Critérios de avaliação:

Ao longo do semestre serão realizadas 5 atividades para avaliação do conteúdo,
sendo 4 provas e 1 trabalhos em trio. As atividades realizadas em sala de aula
também serão avaliadas mas não terão efeito na nota final do aluno. Para cada
uma das atividades avaliativas será atribuído um peso no cálculo da nota final,
a saber:


{% assign av1 = "A_1"  %}
{% assign lblAv1 = "Avaliação 1"  %}
{% assign pAv1 = 1.0  %}

{% assign av2 = "A_2"  %}
{% assign lblAv2 = "Avaliação 2"  %}
{% assign pAv2 = 1.5  %}

{% assign av3 = "A_3"  %}
{% assign lblAv3 = "Avaliação 3"  %}
{% assign pAv3 = 2.0  %}

{% assign av4 = "A_4"  %}
{% assign lblAv4 = "Avaliação 4"  %}
{% assign pAv4 = 2.0  %}

{% assign tr1 = "T_1"  %}
{% assign lblTr1 = "Trabalho "  %}
{% assign pTr1 = 3.5  %}

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

[//]:<> $${{ at  }}$$ - {{ lblAt  }} - peso {{ pAt  }}   
[//]:<> $${{ tr2 }}$$ - {{ lblTr2 }} - peso {{ pTr2 }}



O cálculo da menção final será definido através dos valores obtidos pelo aluno
ao longo do semestre de acordo com a seguinte expressão: 

$$NF = \frac{ {{av1}} \times {{ pAv1 }} + {{ av2 }} \times {{ pAv2 }} + {{ av3
}} \times {{ pAv3 }} + {{ av4 }} \times {{ pAv4 }} +  {{ tr1 }} \times {{ pTr1
}}  }{ 10 }$$

---
[//]:<> #### Trabalho
[//]:<> 
[//]:<> [Enunciado do trabalho](https://docs.google.com/document/d/1WoSHGsw5WO_0hByLk5sry4I12ZiGmkx-SDOSanO7PB0/edit?usp=sharing)
[//]:<> 
[//]:<> --- 





#### Cronograma da disciplina

 {% for au in site.data.plano_oo_2018_2 %}
 {% assign a = au %}
 **{{ a.aula }} -- {{ a.data }}**  
 **Tópico:** {{ a.topico }}   
 **Atividade:**[{{ a.atividade.label }}]({{ a.atividade.link }})     
 **Material:** {% if a.material != "" %}[ {{ a.material.label }} ]({{
a.material.link }}){% else %} -- {% endif %}   
 **Codigo:** {% if a.codigo != "" %}[ {{ a.codigo.label }}]({{ a.codigo.link }}){% else %} -- {% endif %}   
 {% endfor %}

[//]: <> [//]: # [BorderLAyout.tar.gz][BorderLAyout.tar.gz]|
[//]: <> [//]: # [BoxLayout.tar.gz][BoxLayout.tar.gz]|
[//]: <> [//]: # [JButton.tar.gz][JButton.tar.gz]|
[//]: <> [//]: # [JCheckBox.tar.gz][JCheckBox.tar.gz]|
[//]: <> [//]: # [JComboBox.tar.gz][JComboBox.tar.gz]|
[//]: <> [//]: # [JFrame.tar.gz][JFrame.tar.gz]|
[//]: <> [//]: # [JLabel.tar.gz][JLabel.tar.gz]|
[//]: <> [//]: # [JTextField.tar.gz][JTextField.tar.gz]
#### Bibliografia Básica : 

Eckel, Bruce. Thinking in Java, 4th ed. Prentice Hall, 2006.

Deitel, Harvey M.; Deitel, Paul J. Java: Como Programar, 8a ed. Pearson do
Brasil, 2010.

\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using
Java, 6th ed. 2011



#### Bibliografia Complementar :

McLaughlin, Brett; Pollice, Gary; West, David. Head First Object-Oriented
Analysis and Design, 1st ed. O'Reilly Media, 2007.

[EBRARY] Kurniawan, Budi. Java 7 : A Comprehensive Tutorial. Montreal, CAN:
Brainy Software, 2014. ProQuest ebrary. Web. 22 May 2015.

Horstmann, Cay S.; Cornell, Gary. Core Java, Volume I-Fundamentals, 8th ed.
Prentice Hall, 2008.

Booch , Grady; Maksimchuk, Robert A.; Engel, Michael W.; Young, Bobbi J. ;
Conallen, Jim; Houston, Kelli A. Object Oriented Analisys and Design with
Applications, 3th ed. Addison-Wesley, 2007.

\[[OPEN ACCESS][oracle]\] Oracle and/or its affiliates. Java Language and
Virtual Machine Specification, 2012.



#### Sobre as aulas / atividades:

* Chamadas serão realizadas em cada aula. 
* **Faltas não serão abonadas.** 
* O professor disponilbiliza **horário de atendimento exclusivo** para essa turma.
  Esse horário é reservado para vocês portanto utilizem-no sempre que
precisarem. 
* Horário de atendimento POO:
  - 4as feiras, das 13:00 às 14:00 horas. 
  - 6as feiras, das 13:00 às 14:00 horas.
* Salvo em casos excepcionais as provas serão entregues aos alunos na aula
  seguinte à sua aplicação. Nessa aula as questões serão discutidas em sala.
  Revisões de avaliação somente poderão ser realizadas nessa aula. 
* Entregas de trabalhos serão sempre entregues através de meio eletrônico salvo
  quando outra maneira for definida explicitamente pelo professor. 
* As atividades que forem consideradas cópias receberão nota zero sem a
  possibilidade de revisão. 
* Na última semana do semestre, os alunos poderão revisar suas notas finais com
  o professor.   

[//]:<> Não haverá prova ou atividade de recuperação.

---

<sup>Última atualização: _{{ atualizacao }}_</sup>



[eckDavid]: http://math.hws.edu/javanotes/
[oracle]: http://docs.oracle.com/javase/specs/

[notasFrequenciasTurmaA]: notasFrequenciasTurmaA.html
[notasFrequenciasTurmaC]: notasFrequenciasTurmaC.html
[Atividade 1]: atividade1.md
[Atividade 2]: /exercicio2/atividade2.md
[Atividade 3]: /exercicio3/atividade3.md
[sl7]: /lectures/oo/Aula7.pdf
[codeLec7]: /lectures/oo/aula7/aula7.tar.gz
[sl8]: https://docs.google.com/presentation/d/17OrSiEvlAuT6vnaU9SOnj2C5ppnjhGuBafyg4WGdGBM/edit?usp=sharing
[list1]: list1.tar.gz
[list2]: list2.tar.gz
[list3]: list3.tar.gz
[JLabel]: exemploJButton.tar.gz
[JTextField]: exemploJLabel.tar.gz
[JButton]: exemploJTextField.tar.gz
[slidesExcecoes]: https://docs.google.com/presentation/d/1SvxRwiBouUP0-yD14-cMv-qQzig3QKUNlpJQC8QQhXE/edit?usp=sharing
[codigoExcecoes]: /lectures/oo/exemplosExcecoes.tar.gz
[excecoes2]: lectures/oo/Excecoes2.tar.gz
[conceitosOO]: https://docs.google.com/presentation/d/1kuqmt4v7mU4oolXbVYufaiYbPUUqQWoBoMQFwqo0pSg/edit?usp=sharing



[BorderLAyout.tar.gz]:/lectures/oo/BorderLAyout.tar.gz
[BoxLayout.tar.gz]:/lectures/oo/BoxLayout.tar.gz
[JButton.tar.gz]:/lectures/oo/JButton.tar.gz
[JCheckBox.tar.gz]:/lectures/oo/JCheckBox.tar.gz
[JComboBox.tar.gz]:/lectures/oo/JComboBox.tar.gz
[JFrame.tar.gz]:/lectures/oo/JFrame.tar.gz
[JLabel.tar.gz]:/lectures/oo/JLabel.tar.gz
[JTextField.tar.gz]:/lectures/oo/JTextField.tar.gz
[Trabalho Final]:/lectures/oo/trabalhoFinal/trabalhoFinal.pdf
