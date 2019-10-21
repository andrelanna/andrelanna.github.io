---
title: Trabalho prático - 2019/2
permalink: /lectures/oo/exerciciosRevisao2/
layout: default 
---
[diagClasses]: ExercicioRevisao_Encap_Her_Polimor.jpg

**Lista de exercicios de revisão**  
**Avaliação 2 - Encapsulamento, herança e Polimorfismo**

---

**Exercício 1 - Definições:** Para cada um dos itens abaixo, faça o que se pede:

* Diferencie sobrecarga de métodos de sobrescrita de métodos. Ilustre ambos os casos através de um diagrama de classes UML.
* Defina o que é polimorfismo por coerção apresentando, através de um trecho de código, como ele ocorre durante a execução de um programa.
* Defina o que é polimorfismo por subtipagem ilustrando-o através de um Diagrama de Classes UML. Apresente ainda, através de um trecho de código considerando as classes apresentadas no diagrama UML, como os subtipos podem ser referenciados por supertipos. 
* Defina o que é polimorfismo paramétrico. Apresente uma classe e método paramétrico, e pelo menos dois trechos de código que utilizam a classe e método paramétrico. 


**Exercício 2 - Subtipagem** Considere o Diagrama de Classes UML apresentado abaixo. 

![][diagClasses]

Com base no diagrama apresentado, avalie cada uma das instruções a seguir como *correta* ou *incorreta* considerando seus modificadores de visibilidade e de escopo. Para as instruções avaliadas como incorretas, justifique o motivo do erro. A localização da instrução está apresentada na forma de comentário logo após a instrução.

* ```java
cls6.atrib11 = "casa";  //executado em Principal.main()
```
* ```java
cls6.m7(); //executado em Principal.main()
```
