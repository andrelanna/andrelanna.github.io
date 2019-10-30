---
title: Trabalho prático - 2019/2
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

<span style="color:red">_Respostas dos itens apresentadas em vermelho._</span>


<span style="color:red"> Considerando o modo como a linguagem Java define os conceitos básicos de OO, quais sejam Encapsulamento, Herança e Polimorfismo. Em linhas gerais Java defineque:    
\* elementos _privados_ só estão acessíveis dentro da própria classe;  
\* elementos _default_ (visibilidade de pacote) são acessíveis apenas por elementos da própria classe ou de outras classes do mesmo pacote;  
\* elementos *protegidos* são acessíveis por elementos da própria classe, de classes do mesmo pacote ou por elementos de subclasses da classe que está definida, ainda que a subclasse esteja fora do pacote da superclasse. Elementos protegidos não são visualizados por classes que não estejam na hierarquia de classes definida pelas relações de herança;    
\* elementos *públicos* são acessíveis em qualquer ponto do projeto (i.e., qualquer membro de qualquer classe do projeto); 
\* elementos estáticos podem ser acessados pelo nome da classe em que estão definidos ou por algum objeto instanciado a partir dessa classe e, por fim, 
\* elementos dinâmicos estão definidos para cada um dos objetos instanciados a partir da classe em que estão definidos. Elementos dinâmicos não podem ser acessados pela Classe em que está definido.
 </span>

1. ```java
cls6.atrib11 = "casa";  //executado em Principal.main()
```
<span style="color:red"> _cls6.atrib11 não é acessível, seu modificador de acesso é privado._ </span>
2. ```java
cls6.m7(); //executado em Principal.main()
```
<span style="color:red"> _cls6.m7 não é acessível, classe **Principal** não pertence a hierarquia de classes da qual **Classe6** é parte._ </span>
3. ```java
atrib2 = "bola"; //executado em Classe5.m7()
```
<span style="color:red"> _Correto, m7() é um elemento dinâmico tentando acessando atrib5 (elemento estático) definido como público na mesma classe em que m7() está definido. Um elemento dinâmico pode acessar um elemento estático desde que seus modificadores de acesso lhe permitam tal visibilidade._ </span>
4. ```java
cls4.m8();  //executado em Classe5.m7() 
```
<span style="color:red"> _cls4.m8() é acessível_ </span>

5. ```java
cls6.m1();  //executado em Principal.main()
```
<span style="color:red"> _cls6.m1() é acessível, ele está definido como público por todas as classes que compõem a hierarquia de classes, incluindo **Classe6**. Um elemento público pode ser acessado por qualquer outra classe do projeto._ </span>

6. ```java
cls6.atrib2 = "bala";  //executado em Principal.main()
```
<span style="color:red">  </span>

7. ```java
cls6.atrib5 = 4.0;  //executado em Principal.main() 
```
<span style="color:red">  </span>

8. ```java
cls6.cls2.m4();  //executado em Principal.main 
```
<span style="color:red">  </span>

9. ```java
cls6.cls2.atrib4 = 3.14;  //executado em Principal.main
```
<span style="color:red">  </span>

10. ```java
Classe6.atrib13 = 3;  //executado em Principal.main
```
<span style="color:red">  </span>

11. ```java
Classe6.m11();  //executado em Principal.main
```
<span style="color:red">  </span>

12. ```java
m6();  //executado em Classe6.m11() 
```
<span style="color:red">  </span>

13. ```java
m6();  //executado em Classe6.m10() 
```
<span style="color:red">  </span>
