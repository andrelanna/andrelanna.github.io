---
title: Atividade 1
permalink: /lectures/oo/exercicio3.html
layout: default
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
------

Atividade para realizar em sala de aula. 
(Não é necessário entregar)

Escreva aplicações em Java para os seguintes exercícios. Lembre-se: utilize classes e objetos sempre! 
Para auxiliar o entendimento do exercício, sugiro que vocês representem (no papel) a classe com todos seus atributos e métodos.

**Exercício 1:**
Faça uma aplicação que leia o nome, a idade e o sexo de uma _pessoa_.  
Lembre-se: a leitura de dados da entrada padrão (teclado) em Java é feita da seguinte maneira: 

{% highlight java %}
//Cria um objeto de leitura (Scanner) e o associa
//à entrada padrão (System.in)
Scanner in = new Scanner(System.in);

//Ler uma string
String str = in.nextLine();
//Ler um inteiro
int a = in.nextInt();
{% endhighlight %}


**Exercício 2:**
Evolua o exercício anterior de modo que a aplicação leia o nome, a idade e o sexo de tres _pessoas_.


**Exercício 3:** 
Crie uma classe chamada _Comparador_ cujos objetos sejam capazes de comparar dois objetos do tipo _Pessoa_ com relação a: 
- Nome
- Idade

**Exercício 4:**
Crie uma classe que seja capaz de armazenar uma matriz $$m \times n$$ de inteiros, sendo $$m$$ o número de linhas e $$n$$ o número de colunas. Os objetos dessa matriz deverão ser capazes de: 
- imprimir a própria matriz de um modo legível ao usuário, 
- contar a quantidade de números positivos,
- contar a quantidade de números negativos,
- contar a quantidade de zeros,
- multiplicar a matriz por uma constante $$c$$,
- calcular a matriz inversa, 
- calcula a matriz transposta.

Dica: para preencher a matriz com valores, utilize o método random para gerar números aleatórios. Vide exemplo abaixo.

{% highlight java %}
//Cria um objeto capaz de gerar números aleatórios
Random gerador = new Random();
//gera um valor inteito aleatoriamente
int a = gerador.nextInt();
//gera aleatoriamente um valor inteiro entre 0 e 10 
int b = gerador.nextInt(10);
{% endhighlight %}
