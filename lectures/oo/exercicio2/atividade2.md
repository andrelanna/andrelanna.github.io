---
title: Exercício prático
layout: default
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
------
15/0122837 Davi Alves Bezerra
13/0156361 Ivson Alves



Atividade para realizar em dupla e entregar via GitHub. Uma entrega por dupla.
Prazo para entrega: ~~4/4/2017~~ 10/04/2017, 23:59:59.

**Questão 1:** Os termos abaixo estão relacionados ao paradigma de *Orientação por Objetos*. Defina cada um dos termos com base no livro-texto (Eck, David J. Introduction to Programming Using Java, 6th ed. 2011).
* classe
	 De um ponto de vista claro na programação, classes são usadas para criar os objetos.
	 Uma classe é um tipo de modelo para criar objetos.
	 A parte nao estatica de uma classe especifica, descreve quais variaveis ou metodos os objetos vão conter.
		
		(Eck, David J. ,Hobart and William Smith Colleges Introduction to Programming Using Java, 7th ed. 2014) 

	 Uma classe é uma estrutura que abstrai um conjunto de objetos com caracteristicas similares. Uma classe define o comportamento de seus 
	 objetos através de metodos e os estados possiveis destes objetos, através de atributos.		

* objeto
	  Objeto é um tipo de módulo contendo dados e sub-rotinas.
	  Objeto é um tipo de entidade auto-suficiente que tem um estado interno(dados) e que possa responder a mensagens(chamadas para sub-rotinas).

		(Eck, David J. ,Hobart and William Smith Colleges Introduction to Programming Using Java, 7th ed. 2014)

	  Um objeto é uma instancia de uma classe.

* elementos de classe
	 Existem dois elementos de classe, um definido como atributos e outro definido como metodo.

* atributos
	São variaveis que estarão dentro de cada um dos objetos desta classe e podem ser de qualquer tipo.
	
* métodos
	Serão as ações que a classe podera realizar.

* método construtor padrão
	Um construtor padrão é um metodo que não recebe nenhum parametro e é public, ele é inicializado automaticamente aplicando valores padrões para as variaveis usadas na classe.
	
* método construtor alternativo
	Um contrutor alternativo é um metodo que recebe parametros.
	
* estado de um objeto
	Conjunto de valores que os atributos de um objeto armazena em um instante.

* retenção de estado
	Chama-se retenção de estado a capacidade que um objeto tem de manter os valores de seus atributos até a proxima alteração.



**Questão 2:** Julgue as seguintes frases como verdadeiras ou falsas e explique o motivo delas estarem certas ou erradas. Nos casos em que julgar uma sentença como errada, altere-a de modo a corrigi-la.

a) Dois objetos instanciados através do método construtor padrão terão o mesmo estado e, portanto, suas referências serão iguais. 
(FALSO)
	Suas referencias serão diferentes, pois cada objeto tera sua referencia.
Dois objetos instanciados atraves do metodo construtor padrao terao o mesmo estado e, portanto, suas referencias serao diferentes.

b) Uma classe pode ter apenas um método construtor alternativo para instanciação de seus objetos.
(FALSO)
	É falso pois e possivel ter mais do que um contrutor alternativo, porem que sejam diferente as listas de parametros.
Uma classe pode ter mais de um  metodo construtor para instanciação de seus objetos. 

c) Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.
(VERDADEIRO)

	A retenção de estados garantem que o seu estado permança até que algum metodo o modifique.

d) Em Java, o operador . (ponto) serve para acessar somente os métodos de um objeto. 
(FALSA)
	O operador . (ponto) serve para acessar um metodo ou estado de um objeto.


e) Métodos destrutores são aqueles métodos que são chamados explicitamente pelo algoritmo para destruir objetos e liberar os espaços que eles ocupam em memória. Em Java métodos destrutores são implementos com o nome **finalize()** e definidos em cada classe.
(FALSA)
	Em Java os metodos destrutores são métodos chamados automaticamente quando um objeto é destruído, permitindo que o coletor de lixo recupere a memória conforme necessário.
	Temos o metodo finalize() onde podemos chamalo depois do lixo ser coletado e assim a memoria ser liberada, mas não é certo que o finalize sera executado.

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

package newpackage;

public class Drone {
    String marca;
    String modelo;
    int num_helices;
    String camera;
    int vel_vert_max;
    int vel_hor_max;
    int autonomia_bat;
    int distancia_max;
    
    public Drone(String m, String mod, int hel, String cam, int velv, int velh, int aut_bat, int dist_max){
        marca = m;
        modelo = mod;
        num_helices = hel;
        camera = cam;
        vel_vert_max = velv;
        vel_hor_max = velh;
        autonomia_bat = aut_bat;
        distancia_max = dist_max;
        
    }
    
    
    void Aumentar_vel_vert(){   
    }
    
    void Diminuir_vel_vert(){
    }
    
    void Aumentar_vel_hor(){
    }
    
    void Diminuir_vel_hor(){
    }
    
    void Iniciar_grav(){
        
    }
    
    void Interrromper_grav(){
    }
    
    void Diminuir_velbat_hor(){
    }
    
    void Diminuir_velbat_vert(){
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

package newpackage;
public class Questão4 {
    
    public static void main(String[] args){
        Drone drone1, drone2, drone3, drone4;
        
        drone1 = new Drone("Hubsan", "X4 mini", 4, "SD", 10, 10, 7, 150);
        drone2 = new Drone("Hubsan", "H501S X4 FPV", 4, "SD", 12, 12, 20, 1);
        drone3 = new Drone("DJI", "Mavic Pro", 4, "UHD", 16, 16, 27, 13);
        drone4 = new Drone("DJI", "Spreading Wings", 4, "SUHD", 16, 16, 15, 13);
    
    }
    
}

**Questão 5:** Ainda levando em consideração o cenário descrito nas questões 3 e 4, é necessário fazer com que os comandos realizados pelo usuário no controle remoto sejam enviados ao drone. Para isso, é necessário que o controle remoto estabeleça uma conexão com o drone. A partir desse momento é possível enviar os seguintes comandos ao drone: a) aumentar ou diminuir a velocidade vertical em passos de 1 m/s; b) aumentar ou diminuir a velocidade horizontal em passos de 1m/s e, c) ativar ou desativar a câmera. É importante ressaltar que um controle remoto só pode estar conectado a um drone apenas. Por fim, controles remotos possuem baterias com autonomia entre 60 e 90 minutos e alcance entre 20 metros e 20 kilometros.  

Desse modo, pede-se nessa questão que seja modelada e implementada em Java a classe que representa as características e o comportamento de um controle remoto, de modo que o drone possa ser comandado a partir do comandos enviados pelo controle remoto.
package newpackage;



publi8c class Controle{



	drone = new Drone();





	public void Aumentar_vel_vert(){

		drone.velv(1);

    	}
    
    

	public void Diminuir_vel_vert(){


		drone.velv(-1);

    	}


    
    public void Aumentar_vel_hor(){


		drone.velh(1);

    	}


    
    public void Diminuir_vel_hor(){

		drone.velh(-1);


    	}


    
    public void Iniciar_grav(){
 

		grava.on();

       
 }


    
    public void Interrromper_grav(){


		grava.off();

    	}


    
    public void autonomia_bat(){


		System.out.println("A autonoimia da bateria é entre 60 e 90 minutos");

    	}


    
    public void Distancia_max(){

		System.out.println("Possui um alcance entre 20 metros e 20 kilometros");
    


    
    
}

	public Grava() {

		this.grava = grava;

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

(RESPOSTA)a1 e a2 são variaveis diferentes sendo uma numero inteiro e outra de ponto flutuante, logo suas referencias não serão iguais.


b) Qual o estado de cada dos objetos de cada referência? 

(RESPOSTA)
q1 : a1 = 0
     a2 = 0.0
     a3 = null
     a4 = false

q2 : a1 = 0
     a2 = 0.0
     a3 = null
     a4 = false
		
q3 : a1 = 1 
     a2 = 1.0
     a3 = "null"
     a4 = false

c) O que será impresso pela função *main* da classe *Principal* se a linha número *11* for igual a: 
{% highlight java%}
System.out.println(q1 == q2);
System.out.println(q1.a1 == q2.a1);
System.out.println(q2.a3 == q3.a3);
System.out.println(q1.a2 == q2.a2);
System.out.println(q1.a4 == q3.a4);
System.out.println(q3 == q2);
{% endhighlight %}

Será impresso:
	(q1==q2)  = false - q1 e q2 tem endereços diferentes, são duas instancias distintas.

	(q1.a1 == q2.a1) = true - a1 de q1 e a1 de q2 são os mesmos atributos.
	(q2.a3 == q3.a3) = false - aqui null de q2 representa que este espaço e nulo, e o de q3 é uma string e não uma representação de memoria vazia.
	(q1.a2 == q2.a2) = true - a2 de q1 e a2 de q2 são os mesmos atributos.
	(q1.a4 == q3.a4) = true - o a4 de ambos será false, logo a comparação é verdadeira.
	(q3 == q2) = false - q3 e q2 não são a mesma instancia logo terão valores de memoria diferentes.


**Questão 7:**
Seja o seguinte código em Java. Apresente o que será impresso ao final da execução do método main definido na classe Principal.
{%highlight java%}
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
{% endhighlight%}

{% highlight java%}
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

{ %endhighlight%}

{ %highlight java% }
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
{ %endhighlight %}


(RESPOSTA)

Serão impressos detalhes de a1, a2 ,a3.
A1 - 
Nome: Andre
Curso: teste.Curso@6bc7c054
Data de nascimento: 23/2/1983
A2 - 
Nome: Maria
Curso: teste.Curso@232204a1
Data de nascimento: 27/5/1994
A3 -
Nome: Junior
Curso: teste.Curso@6bc7c054
Data de nascimento: 16/11/1995

Logo após serão impressos se os endereços de a1, a2 ou a3 estão na mesma referencia

a1 == a2 - 
false
a1 == a3 - 
false
a2 == a3 - unico que retorna vedadeiro
true

**Questão 8:**
Considerando as classes Aluno e Curso definidas na questão 7, o que será impresso quando o garbagge collector de Java executar momentos antes do método main() da classe abaixo terminar sua execução?
{%highlight java%}
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

{%endhighlight%}

(RESPOSTA)
c1 c2 a3, nao serão destruidos 

c1 -> c2
c2 -> c1

a3 -> a1

a2 é finalizado
conteudo anterior de a3 é finalizado
 
a1 e a3 nao serao finalizados 




**Questão 9:**
as cinco instruções listadas abaixo estão definidas no método main() da classe Principal e apresentam erros em suas sintaxes. Apresente quais são os erros, justifique-os e altere as instruções de modo a consertá-los. Considere os códigos das classes Aluno e Turma como sendo os códigos apresentados na questão 7.

{%highlight java%}
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

(RESPOSTA)
Questao 9:


package questao9;
public class Principal {
	public static void main(String[] args) {
		Curso c1, c2;
		Aluno a1, a2, a3;
		
		c2 = new Curso(2, "Engenharia Eletrônica", 257);
		
		a1 = new Aluno("Andre", c1, 13, 23, 02, 1983);
		a2 = new Aluno("Maria", c2, 5, 27, 5, 1994);
		
		Curso.obterDetalhes(); //1º erro (A forma com que o metodo está sendo chamado está errada por usar a classe Curso e não o objeto c2 que foi criado)

		c2.matricula = 20; //2º erro (Não existe o campo "matricula em c2", logo ele não vai ser acessado) 
		Curso.nome = "Ciência da computação";//3º erro(Aqui temos 2 erros, está sendo usada a classe Classe para tentar acessar o atribbuto, e tambem esse atributo não existe em Curso, ele é de aluno)
		c1.codigo = 21; //4º erro (o objeto c1 ainda não foi alocado ou instanciado, impossivel acessar a aréa codigo)
		Aluno.obterDetalhes(); //5º erro(Novamente está usando uma classe e não o objeto para acessar o metodo)
		a3.cargaHoraria() = 220; //6ª erro (a3 não foi instanciado, carga horaria não faz parte de Aluno e carga horaria não é um metodo, então não poderia ter parenteses)
	}
}

CORREÇÕES

package questao9;
public class Principal {
	public static void main(String[] args) {
		Curso c1, c2;
		Aluno a1, a2, a3;
		
		c1 = new Curso(1, "Engenharia de Software", 240);	
		c2 = new Curso(2, "Engenharia Eletrônica", 257);
		
		a1 = new Aluno("Andre", c1, 13, 23, 02, 1983);
		a2 = new Aluno("Maria", c2, 5, 27, 5, 1994);
		a3 = new Aluno("Junior", c1, 70, 16, 11, 1995);
		
		(c1 ou c2).obterDetalhes();
		a2.matricula = 20; 
		(c1 ou c2).nomeCurso = "Ciência da computação";
		c1.codigo = 21;
		(a1, a2 ou a3).obterDetalhes();
		(c1 ou c2).cargaHoraria = 220;
	}
}

**Questão 10:**
sabe-se que um curso em é formado por um conjunto de disciplinas, para as quais são definidas as seguintes características:

    um código da disciplina;
    um nome;
    uma carga horária, e
    um departamento responsável por lecionar tal disciplina.

Sabe-se ainda que para cada disciplina são criadas diversas turmas. Cada turma é descrita através das seguintes características:

    um código da turma;
    um número total de vagas;
    um número de vagas livres;
    um número de vagas ocupadas, e
    dias/horarios em que ela ocorre.

Além disso, é necessário que os alunos se matriculem nessas turmas. Tal procedimento consiste em associar os alunos em uma turma específica (caso haja vagas) e aumentar o número de vagas ocupadas.

Considerando o contexto formado pelas classes Aluno e Curso (vide implementação na questão 7) e a descrição acima, pede-se:

a) em Java, crie uma classe que seja capaz de representar as características e o comportamento de uma turma.

b) Crie as seguintes turmas:

    turma 1 de Orientação por objetos, com 46 vagas livres, que ocorre todas as 4as e 6as feiras, das 12:00 às 16:00 horas;
    turma 1 de Desenvolvimento Avançado de software, com 30 vagas livres, que ocorre todas as 4as. e 6as. feiras, das 16:00 às 18:00 horas.

c) associe ambas turmas recem-criadas ao curso de Engenharia de Software,

d) matricule Andre e Maria na turma de orientação por objetos, e Junior na turma de desenvolvimento avançado de software.


## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 3 de abril de 2017, 22:52.*





[eckDavid]: http://math.hws.edu/javanotes/
