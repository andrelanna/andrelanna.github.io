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

* Classe: 

Classes podem ser utilizadas tanto para conter variáveis estáticas quanto para descrever métodos. As classes estão para objetos da mesma forma que um número inteiro qualquer está para um int, ou seja, elas podem ser usadas para declarar variáveis que referenciam a um objeto com as mesmas características descritas pela classe.  

* Objeto:

Objetos pertencem às classes. Pode-se dizer que as classes são usadas para criar os objetos, podendo ser chamados de instâncias da classe que foi usada para criá-los.	
* Elementos de classe:

Os elementos de uma classe são seus atributos - que são suas características - e seus métodos - que especificam características dinâmicas que atuam sobre os atributos.

* Atributos:
Os atributos são as características que uma classe possui para caracterizar um objeto. E é através deles que são definidos os estados de um objeto.

* Métodos:

Também chamados de subrotinas, ou seja, são um conjunto de instruções do programa que foram agrupadas e receberam um nome específico. A execução dos métodos se dão através de mensagens, e é onde se pode interagir e se comunicarem com outros objetos.

* Método construtor padrão:
O método construtor padrão é o método construtor oferecido à todas as classes que ainda não possuem um. Suas funções são de alocar a memória para objeto e inicializa as variáveis do mesmo.

* Método construtor alternativo:

Assim como o método construtor padrão, aloca espaço na memória e inicializa as variáveis, porém recebe parâmetros que irão interagir com os atributos da classe.

* Estado de um objeto:

O estado de um objeto é o valor dado a cada um dos atributos de um objeto em um dado momento.

* Retenção de estado:

É a característica do objeto de reter o seu estado(valores de seus atributos) enquanto não está sendo usado no programa.



**Questão 2:** Julgue as seguintes frases como verdadeiras ou falsas e explique o motivo delas estarem certas ou erradas. Nos casos em que julgar uma sentença como errada, altere-a de modo a corrigi-la.

a) Dois objetos instanciados através do método construtor padrão terão o mesmo estado e, portanto, suas referências serão iguais. 

  Falso, pois são instâncias diferentes de objetos diferentes. O fato de seus estados serem iguais não faz com que tenham as mesma referências.

b) Uma classe pode ter apenas um método construtor alternativo para instanciação de seus objetos. 

  Falso. Uma classe pode ter quantos construtores alternativos quanto quem a cria quiser, inclusive com o mesmo nome(nesse caso, cada qual com parâmetros diferentes).	
  
c) Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.

  Verdadeiro. Um objeto não irá mudar o valor de seus atributos espontaneamente, pois possui a característica de retenção de estado.


d) Em Java, o operador . (ponto) serve para acessar somente os métodos de um objeto. 

  Errado. O operador “.” também pode ser usado para acessar atributos de um objeto.
  
e) Métodos destrutores são aqueles métodos que são chamados explicitamente pelo algoritmo para destruir objetos e liberar os espaços que eles ocupam em memória. Em Java métodos destrutores são implementos com o nome **finalize()** e definidos em cada classe.

  A função finalize() não é destrutora, ela somente é executada imediatamente antes de o garbage collector ser acionado.


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

Diagrama de classes:
 
 | Drone  |
|:-----------------|
| - marca: String    |
| - modelo: String           | 
| - numHelices: int  | 
| - camera: String   | 
| - velVertMax: double|
|- velHorMax: double| 
|- autoBateria: int	  |
|  - distanciaMax: double          | 
| - gravando: boolean | 
| - velVertAtual: double	 | 
|    - velHorAtual: double			         |
|  + AumentarVelVert(aumento: double): void   |
|  + DiminuirVelVert(diminuicao: double): void           | 
|+ AumentarVelHor(aumento: double): void               | 
| + DiminuirVelHort(diminuicao: double): void   | 
|+ IniciarInterromperGravacao(): void      |
| + BateriaFraca(): void| 

Resposta:   

	public class Drone{
	    String marca;
	    String modelo;
	    int numHelices;
	    String camera;
	    double velVertMax;
	    double velHorMax;
	    int autoBateria;
	    double distanciaMax;
	    boolean gravando;
	    double velVertAtual;
	    double velHorAtual;

	    public Drone(){

	    }

	    public Drone(int numH, String cam, double velVMax, double velHMax, int bat, float distMax){
		numHelices = numH;
		camera = cam;
		velVertMax = velVMax;
		velHorMax = velHMax;
		autoBateria = bat;
		distanciaMax = distMax;
	    }

	    public void AumentarVelVert(double aumento){
		if((velVertAtual + aumento) >= velVertMax){
		    velVertAtual += aumento;
		}else{
		    System.out.println("Limite de velocidade Excedido");
		}
	    }

	    public void DiminuirVelVert(double diminuicao){
		if((velVertAtual - diminuicao) >= 0){
		    velVertAtual -= diminuicao;
		}else{
		    System.out.println("Velocidade abaixo de zero não é permitida");
		}

	    }

	    public void AumentarVelHor(double aumento){
		if((velHorAtual + aumento) >= velHorMax){
		    velHorAtual += aumento;
		}else{
		    System.out.println("Limite de velocidade Excedido");
		}
	    }

	    public void DiminuirVelHor(double diminuicao){
		if((velHorAtual - diminuicao) >= 0){
		    velHorAtual -= diminuicao;
		}else{
		    System.out.println("Velocidade abaixo de zero não é permitida");
		}

	    }

	    public void IniciarInterromperGravacao(){
		gravando = !gravando;
	    }

	    public void BateriaFraca(){
		if(autoBateria < 5){
		    velVertMax -= velVertMax/2;
		    velHorMax -= velHorMax/2;
		}
	    }
	}

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

Resposta: 

	public class atividade {
	    public static void main(String[] args) {
		Drone drone1, drone2, drone3, drone4;

		drone1 = new Drone();
		drone1.marca = "Hubsan";
		drone1.modelo = "X4 mini";
		drone1.numHelices = 4;
		drone1.camera = "SD";
		drone1.velVertMax = 10;
		drone1.velHorMax = 10;
		drone1.autoBateria = 7;
		drone1.distanciaMax = 150;

		drone2 = new Drone();
		drone2.marca = "Hubsan";
		drone2.modelo = "H501S X4 FPV";
		drone2.numHelices = 4;
		drone2.camera = "HD";
		drone2.velVertMax = 12;
		drone2.velHorMax = 12;
		drone2.autoBateria = 20;
		drone2.distanciaMax = 1000;

		drone3 = new Drone();
		drone3.marca = "DjI";
		drone3.modelo = "Mavic Pro";
		drone3.numHelices = 4;
		drone3.camera = "UHD";
		drone3.velVertMax = 16;
		drone3.velHorMax = 16;
		drone3.autoBateria = 27;
		drone3.distanciaMax = 13000;

		drone4 = new Drone();
		drone1.marca = "DjI";
		drone1.modelo = "Spreading Wings";
		drone1.numHelices = 8;
		drone1.camera = "SUHD";
		drone1.velVertMax = 16;
		drone1.velHorMax = 16;
		drone1.autoBateria = 15;
		drone1.distanciaMax = 13000;
	    } 
	}

**Questão 5:** Ainda levando em consideração o cenário descrito nas questões 3 e 4, é necessário fazer com que os comandos realizados pelo usuário no controle remoto sejam enviados ao drone. Para isso, é necessário que o controle remoto estabeleça uma conexão com o drone. A partir desse momento é possível enviar os seguintes comandos ao drone: a) aumentar ou diminuir a velocidade vertical em passos de 1 m/s; b) aumentar ou diminuir a velocidade horizontal em passos de 1m/s e, c) ativar ou desativar a câmera. É importante ressaltar que um controle remoto só pode estar conectado a um drone apenas. Por fim, controles remotos possuem baterias com autonomia entre 60 e 90 minutos e alcance entre 20 metros e 20 kilometros.  

Desse modo, pede-se nessa questão que seja modelada e implementada em Java a classe que representa as características e o comportamento de um controle remoto, de modo que o drone possa ser comandado a partir do comandos enviados pelo controle remoto.

Resposta:

	public class ControleRemoto{
	    Drone drone;
	    double distancia;
	    int autonomia;

	    public ControleRemoto(){

	    }

	    public ControleRemoto(Drone d, double dist, int a){
		drone = d ;
		distancia = dist;
		autonomia = a;
	    }
	    void AumentarVelVert(){
		drone.AumentarVelVert(1);
	    }

	    void DiminuirVelVert(){
		drone.DiminuirVelVert(1);
	    }

	    void AumentarVelHor(){
		drone.AumentarVelHor(1);
	    }

	    void DiminuirVelHor(){
		drone.DiminuirVelHor(1);
	    }

	    void IniciarInterromperGravacao(){
		drone.IniciarInterromperGravacao();
	    }
	}


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

Não, pois são diferentes atributos de uma mesma classe, inclusive com tipos diferentes (int e float).


b) Qual o estado de cada dos objetos de cada referência? 

O estado de q1é:
   
        a1 = 0;
        a2  = 0.0;
        a3 = null;
        a4 = false;
        
q2:
  
	a1 = 0;
        a2  = 0.0;
        a3 = null;
        a4 = false;
	
q3:
	a1 = 1;
	a2  = 1.0;
	a3 = “null”;
	a4 = false;


c) O que será impresso pela função *main* da classe *Principal* se a linha número *11* for igual a: 
{% highlight java%}
System.out.println(q1 == q2);
System.out.println(q1.a1 == q2.a1);
System.out.println(q2.a3 == q3.a3);
System.out.println(q1.a2 == q2.a2);
System.out.println(q1.a4 == q3.a4);
System.out.println(q3 == q2);
{% endhighlight %}

Resposta:

	   False;
	   True;
	   False;
	   True;
	   True;
	   False.


**Questão 7:**
Seja o seguinte código em Java. Apresente o que será impresso ao final da execução do método **main** definido na classe **Principal**.

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

Resposta:

	Nome: Andre
	Curso: c1@endereço
	Data de nascimento: 23/02/1983
	Nome: Maria
	Curso: c2@endereço
	Data de nascimento: 27/5/1994
	Nome: Junior
	Curso: c1@endereço
	Data de nascimento: 16/11/1995
	Esse objeto ALUNO vai ser destruido.
	False
	False
	True
	Esse objeto ALUNO vai ser destruido.
	Detalhes do objeto:
	 
	Nome: Junior
	Curso:
	Data de nascimento: 16/11/1995


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
    
	Nome: Junior
	Curso: c1@endereço
	Data de nascimento: 16/11/1995
	Esse objeto ALUNO vai ser destruido.
	Detalhes do objeto:
    
	Nome: Maria
	Curso: null
	Data de nascimento: 27/5/1994


**Questão 9:** as cinco instruções listadas abaixo estão definidas no método **main()** da classe **Principal** e apresentam erros em suas sintaxes. Apresente quais são os erros, justifique-os e altere as instruções de modo a consertá-los. Considere os códigos das classes **Aluno** e **Turma** como sendo os códigos apresentados na questão 7. 

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

Resposta:

	public class Turma {
	    int codTurma;
	    int totalVagas;
	    int vagasLivres;
	    int vagasOcupadas;
	    String dias;
	    String horarios;
	    Curso curso;

	    public Turma(){

	    }

	    public Turma(int cod, int totalV, String dia, String h){
		codTurma = cod;
		totalVagas = totalV;
		vagasLivres = totalV;
		vagasOcupadas = 0;
		dias = dia;
		horarios = h;
	    }

	    public void MatriculaAluno(){
		vagasOcupadas++;
		vagasLivres--;
	    }
	}


b) Crie as seguintes turmas: 
   * turma 1 de Orientação por objetos, com 46 vagas livres, que ocorre todas as 4as e 6as feiras, das 12:00 às 16:00 horas;
   * turma 1 de Desenvolvimento Avançado de software, com 30 vagas livres, que ocorre todas as 4as. e 6as. feiras, das 16:00 às 18:00 horas.

Resposta:


	Turma turma1oo, turma1das;
	
	turma1oo = new Turma(1, 46, "Quartas e Sextas", "12:00 às 16:00 horas");
	turma1das = new Turma(1, 30, "Quartas e Sextas", "16:00 às 18:00 horas");
	

c) associe ambas turmas recem-criadas ao curso de Engenharia de Software,

Resposta:



	turma1oo.curso = c1;
	turma1das.curso = c1;
	


d) matricule Andre e Maria na turma de orientação por objetos, e Junior na turma de desenvolvimento avançado de software.

Resposta:


	turma1oo.MatriculaAluno();
	turma1oo.MatriculaAluno();
	turma1das.MatriculaAluno();
	


## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 7 de abril de 2017, 05:12.*





[eckDavid]: http://math.hws.edu/javanotes/
[github]: http://www.github.com/
[instrucoesSubmissao]: ./instrucoes.md
