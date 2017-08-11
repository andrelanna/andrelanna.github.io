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
* classe
* objeto
* elementos de classe
* atributos
* métodos
* método construtor padrão
* método construtor alternativo
* estado de um objeto
* retenção de estado

Classe é a estrutura definida pelo programador, contendo atributos e métodos (comportamento) comuns a um conjunto de objetos.

**Questão 2:** Julgue as seguintes frases como verdadeiras ou falsas e explique o motivo delas estarem certas ou erradas. Nos casos em que julgar uma sentença como errada, altere-a de modo a corrigi-la.

a) Dois objetos instanciados através do método construtor padrão terão o mesmo estado e, portanto, suas referências serão iguais. 

b) Uma classe pode ter apenas um método construtor alternativo para instanciação de seus objetos. 

c) Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.

d) Em Java, o operador . (ponto) serve para acessar somente os métodos de um objeto. 

e) Métodos destrutores são aqueles métodos que são chamados explicitamente pelo algoritmo para destruir objetos e liberar os espaços que eles ocupam em memória. Em Java métodos destrutores são implementos com o nome **finalize()** e definidos em cada classe.


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



**Questão 5:** Ainda levando em consideração o cenário descrito nas questões 3 e 4, é necessário fazer com que os comandos realizados pelo usuário no controle remoto sejam enviados ao drone. Para isso, é necessário que o controle remoto estabeleça uma conexão com o drone. A partir desse momento é possível enviar os seguintes comandos ao drone: a) aumentar ou diminuir a velocidade vertical em passos de 1 m/s; b) aumentar ou diminuir a velocidade horizontal em passos de 1m/s e, c) ativar ou desativar a câmera. É importante ressaltar que um controle remoto só pode estar conectado a um drone apenas. Por fim, controles remotos possuem baterias com autonomia entre 60 e 90 minutos e alcance entre 20 metros e 20 kilometros.  

Desse modo, pede-se nessa questão que seja modelada e implementada em Java a classe que representa as características e o comportamento de um controle remoto, de modo que o drone possa ser comandado a partir do comandos enviados pelo controle remoto.

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
 
**Resposta**

{% highlight java %}

//Main.java

public class Main {

    public static void main(String[] args) {
        Disciplina oo,das ;
        Curso c1, c2;
        Aluno a1, a2, a3;
        Turma turmaa, turmab;
        
        oo = new Disciplina(195341,"Orientação a Objetos",60,"FGA" );
        das = new Disciplina(206601,"Desenvolvimento Avançado de Software",60, "FGA" );
        
        c1 = new Curso(1, "Engenharia de Software", 240);
        c2 = new Curso(2, "Engenharia Eletrônica", 257);
        
        a1 = new Aluno("Andre", c1, 13, 23, 02, 1983);
        a2 = new Aluno("Maria", c2, 5, 27, 5, 1994);
        a3 = new Aluno("Junior", c1, 70, 16, 11, 1995);
        
        turmaa = new Turma(oo,'1',46,46,12,16,"Quartas e Sextas");
        turmab = new Turma(das,'1',30,30,16,18,"Quartas e Sextas");
        
        turmaa.curso = c1;
        turmab.curso = c1;
        
        a1.matricular(turmaa);
        a2.matricular(turmaa);
        a3.matricular(turmaa);
    }

}

{% endhighlight %}

//Aluno.java

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
  
  public void matricular(Turma turma){
      turma.matricular(this.nome);
  }
  
  protected void finalize() {
    System.out.println("Esse objeto ALUNO vai ser destruido.");
    System.out.println("Detalhes do objeto: " + '\n');
    System.out.println(obterDetalhes());
  }
}

{% highlight java %}

//Curso.java

public class Curso {
  int codigo;
  String nomeCurso; 
  int cargaHoraria;
  
  Curso(){
      
  }
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

{% endhighlight %}

{% highlight java %}

//Disciplina.java

public class Disciplina {
    int codDisciplina;
    String nome;
    int cargaHoraria;
    String departamento;
    
    Disciplina(){
        
    }
    Disciplina(int cod, String nome, int carga, String depart){
        this.codDisciplina = cod;
        this.nome = nome;
        this.cargaHoraria = carga;
        this.departamento = depart;
    }
      
    public String obterDetalhes() {
        String resposta = "";
        resposta += "Nome do curso: " + this.nome + '\n';
        resposta += "Codigo: " + this.codDisciplina + '\n';
        resposta += "Carga horaria: " + cargaHoraria;
        return resposta; 
      }
      
      protected void finalize() {
        System.out.println("Esse objeto DISCIPLINA vai ser destruido.");
        System.out.println("Detalhes do objeto: " + '\n');
        System.out.println(obterDetalhes());
     }
}


{% endhighlight %}

{% highlight java %}

//Turma.java

public class Turma {
    Curso curso;
    Disciplina disciplina;
    char codTurma;
    int vagasTotal;
    int vagasLivres;
    int vagasOcupadas;
    String horario;
    
    Turma(){
        
    }
    Turma(Disciplina d, char cod, int vagas,int livres, int horai, int horaf, String dias){
        this.disciplina = d;
        this.codTurma = cod;
        this.vagasTotal = vagas;
        this.vagasLivres = livres;
        this.vagasOcupadas = vagas - livres;
        this.horario = dias+", das "+horai+" às "+horaf+".";
    }
    public void obterDetalhes() {
        String resposta = "";
        resposta += "Disciplina: " + disciplina.nome + '\n';
        resposta += "Turma: " + this.codTurma + '\n';
        resposta += "Vagas: " + this.vagasTotal + '\n';
        resposta += "Vagas livres: " + this.vagasLivres+ '\n';
        resposta += "Vagas ocupadas: " + this.vagasOcupadas + '\n';
        resposta += "Curso: " + curso.nomeCurso + '\n';
        resposta += "Horario: " + horario;
        System.out.println(resposta);
      }
    
    public void matricular(String nome){
        if(this.vagasLivres > 0){
            this.vagasOcupadas +=1;
            this.vagasLivres = this.vagasTotal - this.vagasOcupadas;
            System.out.println(nome+" foi matrículado em "+disciplina.nome+" na turma "+this.codTurma+".");
        }else{
            System.out.println("Impossível efetuar matrícula, a turma "+this.codTurma+" não possui vagas.");
        }
    }
    
}

{% endhighlight %}

d) matricule Andre e Maria na turma de orientação por objetos, e Junior na turma de desenvolvimento avançado de software.

## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 7 de abril de 2017, 05:12.*





[eckDavid]: http://math.hws.edu/javanotes/
[github]: http://www.github.com/
[instrucoesSubmissao]: ./instrucoes.md
