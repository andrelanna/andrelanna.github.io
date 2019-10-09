---
title: Plano de ensino - 2019/2
permalink: /lectures/oo/planoDeAulas.html
layout: default 
---


{% assign semestre = "2019/2" %}
{% assign atualizacao = "30 de agosto de 2019." %}
{% assign formAddress = "https://docs.google.com/forms/d/e/1FAIpQLSehZ3AgsqhywgcU4-O8LCokcucqAoChhIYXnso7cwEt-66D1g/viewform" %}
### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação a objet
------
### Plano de ensino - {{semestre}} 

<span style="background-color:red">***Cadastre [AQUI]({{ formAddress }}) seu
nome, matricula e email***</span>   


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
* Apresentar o uso de _threads_ em Java, 
* Apresentar a biblioteca gráfica_ Swing_ e seus componentes.

#### Metodologias de ensino: 

Todas as aulas serão expositivas, com exercícios para fixação do conteúdo.
Eventualmente recursos como mapas mentais, oficinas e estudos dirigidos
poderão ser utilizados pelo professor como forma de avaliação do conteúdo.

#### Critérios de avaliação:

Ao longo do semestre serão realizadas35 atividades para avaliação
conteúdo, sendo 2 provas e 1 trabalhos em grupos de 4 componentes. A
atividades realizadas em sala de aula também serão avaliadas mas não te
efeito na nota final do aluno. Para cada uma das atividades avaliativas será
atribuído um peso no cálculo da nota final, a saber:


{% assign av1 = "A_1"  %}
{% assign lblAv1 = "Avaliação 1"  %}
{% assign pAv1 = 2.0  %}

{% assign av2 = "A_2"  %}
{% assign lblAv2 = "Avaliação 2"  %}
{% assign pAv2 = 3.0  %}

{% assign tr1 = "T_1"  %}
{% assign lblTr1 = "Trabalho "  %}
{% assign pTr1 = 5.0  %}


$${{ av1 }}$$ - {{ lblAv1 }} - peso {{ pAv1 }}    
$${{ av2 }}$$ - {{ lblAv2 }} - peso {{ pAv2 }}    
$${{ tr1 }}$$ - {{ lblTr1 }} - peso {{ pTr1 }}   

[//]:<> $${{ at  }}$$ - {{ lblAt  }} - peso {{ pAt  }}   
[//]:<> $${{ tr2 }}$$ - {{ lblTr2 }} - peso {{ pTr2 }}



O cálculo da menção final será definido através dos valores obtidos pelo aluno
ao longo do semestre de acordo com a seguinte expressão: 

$$NF = \frac{ {{av1}} \times {{ pAv1 }} + {{ av2 }} \times {{ pAv2 }} + {{ tr1 }}
 \times {{ pTr1 }}  }{ 10 }$$

---
#### Trabalho

O trabalho deverá ser realizado em grupos de **5 alunos no máximo**. A
participação de **todos** os elementos do grupo é imprescindível e será
avaliada pelo professor durante a entrega. 

A avaliação do trabalho será feita de dois modos. Todos os artefatos produzidos
pela equipe serão entregues via repositório de versionamento de arquivos (a ser
definido ainda). Através desse repositório serão avaliadas as participações de
cada um dos membros do grupo na elaboração do trabalho. Na data de entrega
estabelecida pelo cronograma da disciplina os grupos serão avaliados oralmente
pelo professor. A distribuição dos pesos das avaliações de artefatos e oral
está estabelecida no enunciado do trabalho. 

[Enunciado do trabalho](enunciadoTrabalho)

[//]:<> [Enunciado do trabalho](https://docs.google.com/document/d/1WoSHGsw5WO_0hByLk5sry4I12ZiGmkx-SDOSanO7PB0/edit?usp=sharing)
 
 --- 





#### Cronograma da disciplina

 {% for au in site.data.plano_oo_2019_2 %}
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
  - 2as feiras, das 11:00 às 12:00 horas. 
  - 4as feiras, das 13:00 às 14:00 horas.
* Salvo em casos excepcionais as provas serão entregues aos alunos na aula
  seguinte à sua aplicação. Nessa aula as questões serão discutidas em sala.
  Revisões de avaliação somente poderão ser realizadas nessa aula. 
* Entregas de trabalhos serão sempre através de meio eletrônico salvo
  quando outra maneira for definida explicitamente pelo professor. 
* As atividades avaliativas que forem consideradas cópias receberão nota zero
  sem a possibilidade de revisão. 
* Na última semana do semestre, os alunos poderão revisar suas notas finais com
  o professor.   

[//]:<> Não haverá prova ou atividade de recuperação.

---

<sup>Ultima atualização: _{{ atualizacao }}_</sup>



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
