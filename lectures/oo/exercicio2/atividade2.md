---
title: Exercício prático
layout: default
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
------

Atividade para realizar em dupla e entregar via GitHub. Uma entrega por dupla.
Prazo para entrega: ~~4/4/2017~~ 10/04/2017, 23:59:59.

**Questão 1:** Os termos abaixo estão relacionados ao paradigma de *Orientação por Objetos*. Defina cada um dos termos com base no livro-texto (Eck, David J. Introduction to Programming Using Java, 6th ed. 2011).
* classe
* objeto
* elementos de classe
* atributos
* métodos
* método construtor padrão
* método construtor alternativo
* estado de um objeto
* retenção de estado
Resposta:
Definições:
1-Classe: Uma classe é um "molde" que define as caracteristicas usadas para construir objetos pertencentes a esta classe.
Caracteristicas são os atributos e metodos da classe. Define as variaveis e subrotinas que seus objetos vão ter.

2-Objeto: Objeto é a instancia de uma classe. É usar o molde (Classe) para construir um objeto com determinadas caracteristicas
presentes na classe.

3-Elementos da Classe: São Atributos e métodos, que possuem tipos de retorno, identificadores, nivel de visibilidade(encapsulamento).

4-Atributo: Atributos são os elementos que fazem parte da estrutura da classe. São dados presentes na classe.

5-Metodos: São subrotinas que podem ser usados por objetos de determinada classe. Metodos possuem uma assinatura composta do tipo de
retorno, identificador e parametros.

6-Metodo Construtor Padrão: É o metodo chamado no momento de instanciação de um objeto. Este metodo cria o objeto na memoria com valores
padrão definidos pela linguagem. Não precisa ser declarado caso nao haja outro construtor.

7-Metodo Construtor Alternativo: É um metodo construtor com assinatura diferente do padrão. Pode ser usado para instanciar um objeto
já recebendo alguns valores para os atributos ou apenas definir padroes de valor para variaveis diferentes dos padroes da linguagem.

8-Estado de um objeto: É o conjunto de determinados valores atribuidos a um objeto.

9-Retenção de estado: É o fato de um objeto permanecer "parado" ou sem uso na memoria até que ele receba um estimulo para alterar algum valor.

150023375 - Vítor Cardoso Xoteslem
150142218 - Miguel Siqueira Santos

**Questão 2:** Julgue as seguintes frases como verdadeiras ou falsas e explique o motivo delas estarem certas ou erradas. Nos casos em que julgar uma sentença como errada, altere-a de modo a corrigi-la.

a) Dois objetos instanciados através do método construtor padrão terão o mesmo estado e, portanto, suas referências serão iguais. 

b) Uma classe pode ter apenas um método construtor alternativo para instanciação de seus objetos. 

c) Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.

d) Em Java, o operador . (ponto) serve para acessar somente os métodos de um objeto. 

e) Métodos destrutores são aqueles métodos que são chamados explicitamente pelo algoritmo para destruir objetos e liberar os espaços que eles ocupam em memória. Em Java métodos destrutores são implementos com o nome **finalize()** e definidos em cada classe.


a-Verdadeiro.
b-Falso.
  Uma classe pode ter vários métodos construtores alternativos para instanciação de seus objetos.
  Podem existir metodos construtores alternativos com diferentes parametros e funções.
c-Verdadeiro.
d-Falso.
  O ponto(.) em java serve para acessar metodos e atributos de um objeto.
e-Verdadeiro.


150023375 - Vítor Cardoso Xoteslem
150142218 - Miguel Siqueira Santos

**Questão 3:**  Considere o seguinte cenário:

*Um veículo aéreo não-tripulado (VANT, também conhecido como **drone** é todo e qualquer tipo de aeronave que não necessita de pilotos embarcados para ser guiada. Este tipo de aviões é controlado à distância por meios eletrônicos e computacionais, sob a supervisão de humanos, ou mesmo sem a sua intervenção, por meio de Controladores Lógicos Programáveis (CLP).* Fonte: [Wikipedia](https://pt.wikipedia.org/wiki/Ve%C3%ADculo_a%C3%A9reo_n%C3%A3o_tripulado)

Drones civis vendidos atualmente possuem, em sua maior parte, as seguintes características: 

| Característica   | Valores (intervalo)         |
|:-----------------|:----------------------------|
| N. de hélices    | 4, 6 ou 8                   |
| Câmera           | SD, HD, UHD ou s-UHD        |
| Vel. vert. max.  | de 10 a 16 m/s              |
| Vel. hor. max.   | de 10 a 16 m/s              |
| Autonomia bateria| de 5 a 30 minutos de voo    |
| Distância máxima | de 50 metros a 20 kilometros|

Além dessas características, drones possuem as seguintes funções básicas: a) aumentar/diminuir velocidade vertical, b) aumentar/diminuir velocidade horizontal, c) iniciar/interromper gravação da câmera e d) diminuir velocidades máxima (horizontal e vertical) em 50% sempre que a autonomia da bateria for menor do que 5 minutos. 

Dado esse cenário, pede-se aos alunos que representem (inicialmente) as características e comportamentos de um drone através de um diagrama de classes e, posteriormente, apresente a implementação dessa classe na linguagem Java. 

![alt text](https://github.com/vitorcx/Atividade1/blob/master/DiagramaDroneQuestao3.jpg "Diagrama da Classe Drone")

{% highlight java %}

public class Drone {
  String marca;
  String modelo;
  int numHelices;
  String camera;
  int velMaxY;
  int velMaxX;
  int autonomiaBateria;
  int distMax;
  
  void aumentarVelY(int incremento){
    velMaxY+=incremento;
  }
  
  void diminuirVelY(int decremento){
    velMaxY+=decremento;
  }
  
  void aumentarVelX(int incremento){
    velMaxX+=incremento;
  }
  
  void diminuirVelX(int decremento){
    velMaxX+=decremento;
  }
  
  void iniciarGrav(){
    System.out.println("Gravação iniciada!");
  }
  
  void interromperGrav(){
    System.out.println("Gravação interrompida!");
  }
  
  void economizaBateria(){
    if(autonomiaBateria<5){
      velMaxY*=0.5;
      velMaxX*=0.5;
    }
  }
}

{% endhighlight%}

150023375 - Vítor Cardoso Xoteslem
150142218 - Miguel Siqueira Santos

**Questão 4:** Considerando a classe definida e implementada na questão 5, pede-se que os seguintes objetos sejam criados a partir do programa principal: 

| Característica   | drone1         | drone2         | drone3            | drone4            |
|:-----------------|:---------------|:---------------|:------------------|:------------------|
| Marca            | Hubsan         | Hubsan         | DJI               | DJI               |
| Modelo           | X4 mini        | H501S X4 FPV   | Mavic Pro         | Spreading Wings   |
| N. de hélices    | 4              | 4              | 4                 | 8                 |
| Câmera           | SD             | HD             | UHD               | SUHD              |
| Vel. vert. max.  | 10 m/s         | 12 m/s         | 16 m/s            | 16 m/s            |
| Vel. hor. max.   | 10 m/s         | 12 m/s         | 16 m/s            | 16 m/s            |
| Autonomia bateria| 7 minutos      | 20 minutos     | 27 minutos        | 15 minutos        |
| Distância máxima | até 150 metros | até 1 kilometro| até 13 kilometros | até 13 kilometros |

{% highlight java %}
public class Trabalho1 {

  public static void main(String[] args) {
    Drone drone1, drone2, drone3, drone4;
    drone1 = new Drone("Hubsan", "X4 mini", 4, "SD", 10, 10, 7, 150);
    drone2 = new Drone("Hubsan", "H501S X4 FPV", 4, "HD", 12, 12, 20, 1000);
    drone3 = new Drone("DJI", "Mavic Pro", 4, "UHD", 16, 16, 27, 13000);
    drone4 = new Drone("DJI", "Spreading Wings", 8, "SUHD", 16, 16, 15, 13000);
    
    /*
    drone1.mostraDados();
    drone2.mostraDados();
    drone3.mostraDados();
    drone4.mostraDados();
    */
  }
}
{% endhighlight%}

150023375 - Vítor Cardoso Xoteslem
150142218 - Miguel Siqueira Santos

**Questão 5:** Ainda levando em consideração o cenário descrito nas questões 3 e 4, é necessário fazer com que os comandos realizados pelo usuário no controle remoto sejam enviados ao drone. Para isso, é necessário que o controle remoto estabeleça uma conexão com o drone. A partir desse momento é possível enviar os seguintes comandos ao drone: a) aumentar ou diminuir a velocidade vertical em passos de 1 m/s; b) aumentar ou diminuir a velocidade horizontal em passos de 1m/s e, c) ativar ou desativar a câmera. É importante ressaltar que um controle remoto só pode estar conectado a um drone apenas. Por fim, controles remotos possuem baterias com autonomia entre 60 e 90 minutos e alcance entre 20 metros e 20 kilometros.  

Desse modo, pede-se nessa questão que seja modelada e implementada em Java a classe que representa as características e o comportamento de um controle remoto, de modo que o drone possa ser comandado a partir do comandos enviados pelo controle remoto.

{% highlight java %}
public class ControleRemoto {
  int autonomiaBateria;
  int alcance;
  Drone drone;
  
  ControleRemoto(){}
  
  ControleRemoto(int aut, int alc, Drone d){
    autonomiaBateria = aut;
    alcance = alc;
    drone = d;
  }
  
  void aumentaVelY(){
    drone.aumentarVelY(1);
  }
  
  void aumentaVelX(){
    drone.aumentarVelX(1);
  }
  
  void diminuiVelY(){
    drone.diminuirVelY(1);
  }
  
  void diminuiVelX(){
    drone.diminuirVelX(1);
  }
  
  void ativaCamera(){
    drone.iniciarGrav();
  }
  
  void desativaCamera(){
    drone.interromperGrav();
  }
}
{% endhighlight%}

150023375 - Vítor Cardoso Xoteslem
150142218 - Miguel Siqueira Santos

**Questão 6:** Sejam os seguintes códigos da *ClasseA* e da aplicação principal escritas em JAVA. 

Questao6.java
{% highlight java %}
public class Questao6 {
  int   a1; 
  float   a2; 
  String  a3;
  boolean a4;
  
  public Questao6() {}
  
  public Questao6(int a, float b, String c, boolean d){
    a1 = a;
    a2 = b;
    a3 = c;
    a4 = d;
  }
}
{% endhighlight%}

Principal.java
{% highlight java%}
public class Principal {
  public static void main (String[] args) {
    Questao6 q1, 
             q2,
             q3;
    
    q1 = new Questao6();
    q2 = new Questao6(0, 0.0f, null, false);
    q3 = new Questao6(1, 1.0f, "null", false);
    
    //---> local onde a instrução do item c) será inserida.
  }
}
{% endhighlight %}
Responda as seguintes questões com base nos códigos acima: 

a) As referências a1 e a2 para objetos de *ClasseA* são iguais?

b) Qual o estado de cada dos objetos de cada referência? 

c) O que será impresso pela função *main* da classe *Principal* se a linha número *11* for igual a: 
{% highlight java%}
System.out.println(q1 == q2);
System.out.println(q1.a1 == q2.a1);
System.out.println(q2.a3 == q3.a3);
System.out.println(q1.a2 == q2.a2);
System.out.println(q1.a4 == q3.a4);
System.out.println(q3 == q2);
{% endhighlight %}

Respostas:

a-Não

b- Estado do Objeto referenciado por q1:
  a1=0
  a2=0.0
  a3=null
  a4=false
  Estado do Objeto referenciado por q2:
  a1=0
  a2=0.0
  a3=null
  a4=false
  Estado do Objeto referenciado por q3:
  a1=1
  a2=1.0
  a3=null
  a4=false

c-
  System.out.println(q1 == q2); -> imprime : false, pois q1 e q2 referenciam objetos diferentes.
  System.out.println(q1.a1 == q2.a1); -> imprime : true, pois os atributos a1 dos objetos q1 e q2 são iguais
  System.out.println(q2.a3 == q3.a3); -> imprime : false, pois em q1 o atributo a3 é nulo, ja em q2, a3 é uma string "null"
  System.out.println(q1.a2 == q2.a2); -> imprime : true, pois os atributos a2 dos dois objetos acabam sendo iguais, 0.0.
  System.out.println(q1.a4 == q3.a4); -> imprime : true, pois o padrão do java define q1.a4 como false, igualando ao q3.a4.
  System.out.println(q3 == q2);       -> imprime : false, pois q2 e q3 referenciam objetos diferentes, logo, tem endereços diferentes.



**Questão 7:**
Seja o seguinte código em Java. Apresente o que será impresso ao final da execução do método **main** definido na classe **Principal**.

{% highlight java %}
package questao7;
public class Principal {
  public static void main(String[] args) {
    Curso c1, c2;
    Aluno a1, a2, a3;
    c1 = new Curso(1, "Engenharia de Software", 240);
    c2 = new Curso(2, "Engenharia Eletrônica", 257);
    
    a1 = new Aluno("Andre", c1, 13, 23, 02, 1983);
    a2 = new Aluno("Maria", c2, 5, 27, 5, 1994);
    a3 = new Aluno("Junior", c1, 70, 16, 11, 1995);
    
    System.out.println(a1.obterDetalhes());
    System.out.println(a2.obterDetalhes());
    System.out.println(a3.obterDetalhes());
    a3 = a2;
    System.out.println(a1 == a2);
    System.out.println(a1 == a3);
    System.out.println(a2 == a3);
  }
}
{% endhighlight %}


{% highlight java %}
package questao7;
public class Aluno {
  String nome; 
  Curso curso;
  int matricula;
  int diaNascimento, 
      mesNascimento, 
      anoNascimento;
  
  public Aluno(String nom, Curso cur, int mat, int dNasc, int mNasc, int aNasc) {
    nome = nom;
    curso = cur;
    matricula = mat;
    diaNascimento = dNasc; 
    mesNascimento = mNasc;
    anoNascimento = aNasc;
  }
  
  public String obterDetalhes() {
    String resposta = "";
    resposta += "Nome: " + nome + '\n';
    resposta += "Curso: " + curso + '\n';
    resposta += "Data de nascimento: " + diaNascimento + '/' + 
                                     mesNascimento + '/' + 
                                     anoNascimento;
    return resposta; 
  }
  
  protected void finalize() {
    System.out.println("Esse objeto ALUNO vai ser destruido.");
    System.out.println("Detalhes do objeto: " + '\n');
    System.out.println(obterDetalhes());
  }
}
{% endhighlight  %}

{% highlight java %}
package questao7;
public class Curso {
  int codigo;
  String nomeCurso; 
  int cargaHoraria;
  
  Curso (int cod, String nome, int ch) {
    codigo = cod;
    nomeCurso = nome; 
    cargaHoraria = ch;
  }
  
  public String obterDetalhes() {
    String resposta = "";
    resposta += "Nome do curso: " + nomeCurso + '\n';
    resposta += "Codigo: " + codigo + '\n';
    resposta += "Carga horaria: " + cargaHoraria;
    return resposta; 
  }
  
  protected void finalize() {
    System.out.println("Esse objeto CURSO vai ser destruido.");
    System.out.println("Detalhes do objeto: " + '\n');
    System.out.println(obterDetalhes());
  }
}
{% endhighlight  %}

Resposta:
Nome:Andre
Curso:endereço de c1
Data de nascimento:23/02/1983
Nome:Maria
Curso:endereço de c2
Data de nascimento:27/5/1994
Nome:Junior
Curso:endereço de c1
Data de nascimento:16/11/1995
false
false
true


**Questão 8:** Considerando as classes **Aluno** e **Curso** definidas na questão 7, o que será impresso quando o *garbagge collector* de Java executar momentos antes do método **main()** da classe abaixo terminar sua execução?

{% highlight java %}
package questao8;
public class Principal {
  public static void main(String[] args) {
    Curso c1, c2;
    Aluno a1, a2, a3;
    
    c1 = new Curso(1, "Engenharia de Software", 240);
    c2 = new Curso(2, "Engenharia Eletrônica", 257);
    
    a1 = new Aluno("Andre", c1, 13, 23, 02, 1983);
    a2 = new Aluno("Maria", c2, 5, 27, 5, 1994);
    a3 = new Aluno("Junior", c1, 70, 16, 11, 1995);
    
    a3 = a2; 
    a2 = null;
    c2 = c1; 
    c1 = null;
    c1 = a3.curso;
    a3 = a1;
    a1 = nul;
    
    //---> GARBAGGE COLLECTOR executa nesse instante
  }
}
{% endhighlight %}

Resposta:
Esse objeto ALUNO vai ser destruido.
Detalhes do objeto: 
Nome:Junior
Curso:endereço de c1
Data de nascimento:16/11/1995
Esse objeto ALUNO vai ser destruido.
Detalhes do objeto: 
Nome:Maria
Curso:endereço de c2
Data de nascimento:27/5/1994


**Questão 9:** as cinco instruções listadas abaixo estão definidas no método **main()** da classe **Principal** e apresentam erros em suas sintaxes. Apresente quais são os erros, justifique-os e altere as instruções de modo a consertá-los. Considere os códigos das classes **Aluno** e **Turma** como sendo os códigos apresentados na questão 7. 

{% highlight java %}
package questao9;
public class Principal {
  public static void main(String[] args) {
    Curso c1, c2;
    Aluno a1, a2, a3;
    
    c2 = new Curso(2, "Engenharia Eletrônica", 257);
    
    a1 = new Aluno("Andre", c1, 13, 23, 02, 1983);
    a2 = new Aluno("Maria", c2, 5, 27, 5, 1994);
    
    Curso.obterDetalhes();
    c2.matricula = 20; 
    Curso.nome = "Ciência da computação";
    c1.codigo = 21;
    Aluno.obterDetalhes();
    a3.cargaHoraria() = 220;
  }
}
{% endhighlight %}

Resposta:

Erro: Curso.obterDetalhes() 
Motivo: Um metodo de uma classe deve ser chamado por uma referencia de um objeto da classe, não pela classe em si.
Possível Correção: c2.obterDetalhes()

Erro: c2.matricula = 20;
Motivo: c2 é uma referencia de um objeto da classe Curso, que nao possui o atributo matrícula.
Possível Correção: a2.matricula = 20;

Erro: Curso.nome = "Ciência da computação";
Motivo: novamente um atributo está tentando ser acessado pela classe e não por uma referencia de um objeto da classe. E a classe curso nao possui atributo "nome".
Possível Correção: c2.nomeCurso = "Ciência da computação";

Erro: c1.codigo = 21;
Motivo: c1 foi declarado mas não foi instanciado, por isso não há memória alocada para armazenar o codigo 21.
Possível Correção: c1 = new Curso();

Erro: Aluno.obterDetalhes();
Motivo: novamente um metodo da está sendo acessado pela classe, não por um objeto dela.
Possível Correção: a1.obterDetalhes();

Erro: a3.cargaHoraria() = 220;
Motivo: cargaHoraria é um atributo, não um metodo, logo não tem parenteses. a3 tambem não foi instanciado, e a classe Aluno não possui atributo chamado cargaHoraria.
Possível Correção: a3.cargaHoraria = 220;


**Questão 10:** sabe-se que um curso em é formado por um conjunto de disciplinas, para as quais são definidas as seguintes características: 

* um código da disciplina;
* um nome;
* uma carga horária, e
* um departamento responsável por lecionar tal disciplina.

Sabe-se ainda que para cada disciplina são criadas diversas turmas. Cada turma é descrita através das seguintes características:

* um código da turma; 
* um número total de vagas; 
* um número de vagas livres; 
* um número de vagas ocupadas, e
* dias/horarios em que ela ocorre.

Além disso, é necessário que os alunos se matriculem nessas turmas. Tal procedimento consiste em associar os alunos em uma turma específica (caso haja vagas) e aumentar o número de vagas ocupadas. 

Considerando o contexto formado pelas classes **Aluno** e **Curso** (vide implementação na questão 7) e a descrição acima, pede-se: 

a) em Java, crie uma classe que seja capaz de representar as características e o comportamento de uma turma.

b) Crie as seguintes turmas: 
   * turma 1 de Orientação por objetos, com 46 vagas livres, que ocorre todas as 4as e 6as feiras, das 12:00 às 16:00 horas;
   * turma 1 de Desenvolvimento Avançado de software, com 30 vagas livres, que ocorre todas as 4as. e 6as. feiras, das 16:00 às 18:00 horas.

c) associe ambas turmas recem-criadas ao curso de Engenharia de Software,

d) matricule Andre e Maria na turma de orientação por objetos, e Junior na turma de desenvolvimento avançado de software.



## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 3 de abril de 2017, 22:52.*





[eckDavid]: http://math.hws.edu/javanotes/
