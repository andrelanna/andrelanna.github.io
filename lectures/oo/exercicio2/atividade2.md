---
title: Exercício prático
layout: default
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
------

Atividade para realizar em dupla e entregar via [GitHub][github]. Uma entrega por dupla. As entregas deverão ser feitas através de *pull-requests* no repositório principal, sendo um pull para cada questão. Instruções de como realizar a entrega estão disponíveis **[aqui][instrucoesSubmissao]**.

Prazo para entrega: ~~4/4/2017~~ 10/04/2017, 23:59:59.

**Questão 1:** Os termos abaixo estão relacionados ao paradigma de *Orientação por Objetos*. Defina cada um dos termos com base no livro-texto (Eck, David J. Introduction to Programming Using Java, 6th ed. 2011).

15/0007182 - Byron Kamal Barreto Correa

15/0016131 - Luciana Ribeiro Lins de Albuquerque

*Classes: segundo David J. Eck, são nas classes que os objetos são construídos. Nelas são instanciados os objetos e criados os métodos.

*Objeto: Objeto é a instância de uma classe. Os objetos são criados e destruídos ao longo do programa. Se forem instanciados na mesma classe, vários objetos podem ter a mesma estrutura, mas com atributos diferentes.

*Elementos de Classe: é o que compõe uma classe: atributos e comportamento (operações e métodos). 

*Atributos: os atributos são características que definem o objeto.

*Métodos: os métodos definem o comportamento da instancia de uma classe.

*Método Construtor Padrão: o método construtor padrão serve para instanciar uma classe. Ele separa um espaço na memória para que um objeto da classe seja criado.

*Método Construtor Alternativo: o método construtor alternativo é por passagem de parâmetros. Além de criar o objeto, esse método também define os atributos do objeto.

*Estado de um Objeto: ao criar um objeto, seus atributos são definidos. Os valores dados aos atributos definem seu estado.

*Retenção de Estado: retenção de estado é quando um objeto fica inerte na memória até que uma nova ação é realizada e haja uma alteração no valor de algum atributo.


*Classe é a estrutura definida pelo programador, contendo atributos e métodos (comportamento) comuns a um conjunto de objetos.

**Questão 2:** Julgue as seguintes frases como verdadeiras ou falsas e explique o motivo delas estarem certas ou erradas. Nos casos em que julgar uma sentença como errada, altere-a de modo a corrigi-la.

15/0007182 - Byron Kamal Barreto Correa

15/0016131 - Luciana Ribeiro Lins de Albuquerque

a)	A sentença está incorreta. Quando as referências (apontar pra um objeto na memoria) são iguais, trata-se do mesmo objeto. Eles podem ter o mesmo estado, mas não a mesma referência.

Forma correta: Dois objetos instanciados através do método construtor padrão terão o mesmo estado, porém suas referências podem não ser iguais.

b)	A sentença está incorreta. Uma classe pode ter mais de um método construtor alternativo. 

Forma Correta: Uma classe pode ter mais de um método construtor alternativo para instanciação de seus objetos.

c) A sentença está correta, pois é necessário um novo estímulo externo ao objeto para que haja alteração no valor de um atributo. 

c)	A sentença está incorreta. Em Java, o operador . (ponto) serve para acessar os métodos e atributos de um objeto.

Forma correta: Em Java, o operador . (ponto) serve para acessar os métodos e atributos de um objeto.

e) A sentença está incorreta. O método finalize() não trata-se de um método destrutor.


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

15/0007182 - Byron Kamal Barreto Correa

15/0016131 - Luciana Ribeiro Lins de Albuquerque

{% highlight java %}

public class Drone {
	String marca;
	String modelo;
	int numHelices;
	String camera;
	float velVertical;
	float velHorizontal;
	int autonomiaBateria;
	int distMax;
	
	Drone () {}
	
	Drone (String m, String mo, int nh, String c, float vv, float vh, int bat, int d) {
		marca = m;
		modelo = mo;
		numHelices = nh;
		camera = c;
		velVertical = vv;
		velHorizontal = vh;
		autonomiaBateria = bat;
		distMax = d;
	
	}
	
	
	public float aumentarVelVertical () {
		return velVertical = velVertical+1; }
	
	public float diminuirVelVertical () {
		return velVertical = velVertical-1  ; }
	
	public float aumentarVelHorizontal () {
		return velHorizontal = velHorizontal+1; }
	
	public float diminuirVelHorizontal () {
		return velHorizontal = velHorizontal-1; }
	
	public float metadeVelHorizontal () {
		if (autonomiaBateria <= 5) 
		{ velHorizontal = (float) (velHorizontal*0.5); }
		return  velHorizontal;
	}
	
	public float metadeVelVertical () {
		if (autonomiaBateria <= 5) 
		{ velVertical = (float) (velVertical*0.5); }
		return  velVertical;
	}
	
	
}
{% endhighlight %}

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

15/0007182 - Byron Kamal Barreto Correa

15/0016131 - Luciana Ribeiro Lins de Albuquerque

{% highlight java %}

public class Principal {
	public static void main (String args[]) {
		
		Drone drone1, drone2, drone3, drone4;
		
		drone1 = new Drone ("Hubsan", "X4 mini", 4, "SD", 10, 10, 15, 150);
		drone2 = new Drone ("Hubsan","H501S X4 FPV", 4, "HD", 12, 12, 20, 1000);
		drone3 = new Drone ("DJI", "Mavic Pro", 4, "UHD", 16, 16, 27, 13000);
		drone4 = new Drone ("DJI", "Spreading Wings", 8, "SUHD", 16, 16, 15, 130000);
	}
}	

{% endhighlight %}

**Questão 5:** Ainda levando em consideração o cenário descrito nas questões 3 e 4, é necessário fazer com que os comandos realizados pelo usuário no controle remoto sejam enviados ao drone. Para isso, é necessário que o controle remoto estabeleça uma conexão com o drone. A partir desse momento é possível enviar os seguintes comandos ao drone: a) aumentar ou diminuir a velocidade vertical em passos de 1 m/s; b) aumentar ou diminuir a velocidade horizontal em passos de 1m/s e, c) ativar ou desativar a câmera. É importante ressaltar que um controle remoto só pode estar conectado a um drone apenas. Por fim, controles remotos possuem baterias com autonomia entre 60 e 90 minutos e alcance entre 20 metros e 20 kilometros.  

Desse modo, pede-se nessa questão que seja modelada e implementada em Java a classe que representa as características e o comportamento de um controle remoto, de modo que o drone possa ser comandado a partir do comandos enviados pelo controle remoto.

15/0007182 - Byron Kamal Barreto Correa

15/0016131 - Luciana Ribeiro Lins de Albuquerque

{% highlight java %}
public class Controle {

	int controleAutonomiaBateria;
	int alcance;

	Drone d;
	
	Controle() {}
	
	public float aumentarVelVertical () {
		return d.aumentarVelVertical(); }
	
	public float aumentarVelHorizontal() {
		return d.aumentarVelHorizontal();
	}
	
	public float diminuirVelVertical () {
		return d.diminuirVelVertical();
	}
	
	public float diminuirVelHorizontal () {
		return d.diminuirVelHorizontal();
	}
	
	public void iniciarCamera () {
		System.out.println("\nCamera Ativada\n"); }
	
	public void interromperCamera () {
		System.out.println("\nCamera desligada\n"); }

}

{% endhighlight %}

{% highlight java %}
import java.util.Scanner;

public class Ler {

	float num, aux;
	String comando;
	private Scanner s; 

	Drone dr;
	Ler() {}
	
	public float lerVelVertical() {
		System.out.println ("\nDigite velocidade vertical inical: ");
		s = new Scanner(System.in);
		num = s.nextInt();
		aux = num;
	if (aux > 10) {
			System.out.println("Velocidade Vertical Maxima Excedida\n"
					+ "Valor maximo permitido é 10 m/s\n");
			return lerVelVertical(); }
			
			else { 
				dr.velVertical = aux;}
			return 0;
	}

	public float lerVelHorizontal () {
		System.out.println ("\nDigite velocidade vertical inical: ");
		s = new Scanner(System.in);
		num = s.nextInt();
		aux = num;
	if(num > 10) {
		System.out.println("\nValocidade Horizontal Max Excedida\n" +
				"Valor maximo permitido é 10 m/s\n");
		return lerVelHorizontal(); }
	else {
		 dr.velHorizontal = aux;}
	return 0;
	}
	
}
{% endhighlight %}


{% highlight java %}
import java.util.Scanner;

public class Principal {
	public static void main (String args[]) {
		
		Drone drone1, drone2, drone3, drone4;
		
		drone1 = new Drone ("Hubsan", "X4 mini", 4, "SD", 10, 10, 15, 150);
		drone2 = new Drone ("Hubsan","H501S X4 FPV", 4, "HD", 12, 12, 20, 1000);
		drone3 = new Drone ("DJI", "Mavic Pro", 4, "UHD", 16, 16, 27, 13000);
		drone4 = new Drone ("DJI", "Spreading Wings", 8, "SUHD", 16, 16, 15, 130000);
		
		System.out.println("\n>>>INFORMÇÕES SOBRE OS DRONES<<<\n");
		System.out.println("\nINFORMAÇÕES DRONE 1 " +
				"\nMarca: " +drone1.marca +
				"\nModelo: " +drone1.modelo +
				"\nNumero de Helices: " +drone1.numHelices +
				"\nTipo de camera: " +drone1.camera +
				"\nVelocidade Vertical Maxima: " +drone1.velVertical + " m/s" +
				"\nVelocidade Horizontal Maxima: " +drone1.velHorizontal + " m/s" +
				"\nDuração de Bateria: " +drone1.autonomiaBateria + " minutos" + 
				"\nDistancia máxima: " +drone1.distMax + " metros");
		
		System.out.println("\nINFORMAÇÕES DRONE 2 " +
				"\nMarca: " +drone1.marca +
				"\nModelo: " +drone2.modelo +
				"\nNumero de Helices: " +drone2.numHelices +
				"\nTipo de camera: " +drone2.camera +
				"\nVelocidade Vertical Maxima: " +drone2.velVertical + " m/s" +
				"\nVelocidade Horizontal Maxima: " +drone2.velHorizontal + " m/s" +
				"\nDuração de Bateria: " +drone2.autonomiaBateria + " minutos" + 
				"\nDistancia máxima: " +drone2.distMax + " metros");
		
		System.out.println("\nINFORMAÇÕES DRONE 3 " +
				"\nMarca: " +drone3.marca +
				"\nModelo: " +drone3.modelo +
				"\nNumero de Helices: " +drone3.numHelices +
				"\nTipo de camera: " +drone3.camera +
				"\nVelocidade Vertical Maxima: " +drone3.velVertical + " m/s" +
				"\nVelocidade Horizontal Maxima: " +drone3.velHorizontal + " m/s" +
				"\nDuração de Bateria: " +drone3.autonomiaBateria + " minutos" + 
				"\nDistancia máxima: " +drone3.distMax + " metros");
		
		System.out.println("\nINFORMAÇÕES DRONE 4 " +
				"\nMarca: " +drone4.marca +
				"\nModelo: " +drone4.modelo +
				"\nNumero de Helices: " +drone4.numHelices +
				"\nTipo de camera: " +drone4.camera +
				"\nVelocidade Vertical Maxima: " +drone4.velVertical + " m/s" +
				"\nVelocidade Horizontal Maxima: " +drone4.velHorizontal + " m/s" +
				"\nDuração de Bateria: " +drone4.autonomiaBateria + " minutos" + 
				"\nDistancia máxima: " +drone4.distMax + " metros");
	
		System.out.println("\n >>>Controle 1 funciona com Drone 1<<< \n");
		Controle c1 = new Controle();
		
		c1.controleAutonomiaBateria = 60;
		c1.alcance = 200;
		c1.d = drone1;
		
		System.out.println("Autonomia bateria controle: " + c1.controleAutonomiaBateria + " minutos"+
				"\nAlcance do Controle: " +c1.alcance + " metros");
		
		Ler ler = new Ler();
		ler.dr = drone1;
		
		ler.lerVelVertical();
		System.out.println("Velocidade Inicial Vertical: " + drone1.velVertical + " m/s");
	
		ler.lerVelHorizontal();
		System.out.println("\nVelocidade Horizontal inicial: " + drone1.velHorizontal + " m/s");
	
		System.out.println("\nVelocidade Vertical:\nAumentar - digite 1\nDiminuir - digite 2");
		Scanner s = new Scanner(System.in);
		int opcao = s.nextInt();
		if (opcao == 1) {
			
		if (drone1.velVertical == 10) {
		System.out.println("Velocidade vertical Maxima Excecida!");}
		
		else {c1.aumentarVelVertical();
			System.out.println("Velocidade Vertical atual: " + drone1.velVertical + "m/s");}
		}	
	
		if(opcao == 2) {
			if (drone1.velVertical <= 0) {
				System.out.println("\n 0 ()zero é o valor minimo para velocidade!");}
			else  {c1.diminuirVelVertical(); 
				System.out.println("\nVelocidade Vertical atual: " + drone1.velVertical + " m/s");}
			} 
		
		
		System.out.println("\nVelocidade Horizontal:\nAumentar - digite 1\nDiminuir - digite 2");
		Scanner s2 = new Scanner(System.in);
		int opcao2 = s2.nextInt();
		
		if (opcao2 == 1) {
		if (drone1.velHorizontal == 10) {
		System.out.println("\nVelocidade Horizontal Maxima Excecida!");}
		
		else {c1.aumentarVelHorizontal();
			System.out.println("\nVelocidade Horizontal atual: " + drone1.velHorizontal + "m/s");}
		}	
	
		if(opcao2 == 2) {
		if (drone1.velHorizontal <= 0) {
			System.out.println("\n 0 (zero) é o valor minimo para velocidade!");}
		
		else  {c1.diminuirVelHorizontal(); 
				System.out.println("\nVelocidade Horizontal atual: " + drone1.velHorizontal + " m/s");}
			} 
	
		System.out.println("\nCamera:\nLigar - digite 1\nDesligar - digite 2");
		Scanner s3 = new Scanner(System.in);
		int opcao3 = s3.nextInt();
		
		if(opcao3 == 1) {c1.iniciarCamera();}
		
		else if (opcao3 == 2) {c1.interromperCamera();}
	}
}

{% endhighlight %}

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

15/0007182 - Byron Kamal Barreto Correa

15/0016131 - Luciana Ribeiro Lins de Albuquerque

a) As referências a1 e a2 para objetos de *ClasseA* são iguais?
Não.

b) Qual o estado de cada dos objetos de cada referência? 
Resposta:
q1 (0, 0.0f, null, false)
q2 (0, 0.0f, null, false)
q3 (1, 1.0f, “null”, false)

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
False
True
False
True
True
False    



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
*Última modificação: 7 de abril de 2017, 05:12.*





[eckDavid]: http://math.hws.edu/javanotes/
[github]: http://www.github.com/
[instrucoesSubmissao]: ./instrucoes.md
