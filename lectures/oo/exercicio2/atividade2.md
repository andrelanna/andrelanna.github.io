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


**Questão 2:** Julgue as seguintes frases como verdadeiras ou falsas e explique o motivo delas estarem certas ou erradas. Nos casos em que julgar uma sentença como errada, altere-a de modo a corrigi-la.

a) Dois objetos instanciados através do método construtor padrão terão o mesmo estado e, portanto, suas referências serão iguais. 

b) Uma classe pode ter apenas um método construtor alternativo para instanciação de seus objetos. 

c) Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.

d) Em Java, o operador . (ponto) serve para acessar somente os métodos de um objeto. 

e) Métodos destrutores são aqueles métodos que são chamados explicitamente pelo algoritmo para destruir objetos e liberar os espaços que eles ocupam em memória. Em Java métodos destrutores são implementos com o nome **finalize()** e definidos em cada classe.


**Questão 3:**  
```java
///////////////////////////////////////////////////////////////////////////////////////////////////////
/*Classe do Drone*/
package drone;

public class Drone {
    int n_de_helices;
    String marca;
    String modelo;
    String camera;
    int vel_vert;
    int vel_hor;
    int vel_vert_max;
    int vel_hor_max;
    int autonomia_bateria;
    int distancia_max;
    boolean estado_camera;
            
    public Drone(){};
    
    public void aumentar_vel_vertical(){
        if(vel_vert<vel_vert_max){
            vel_vert++;
        }
    }
    
    public void diminuir_vel_vertical(){
        if(vel_vert>0){
            vel_vert--;
        }
    }

    public void aumentar_vel_horizontal(){
        if(vel_hor<vel_hor_max){
            vel_hor++;
        }
    }

    public void diminuir_vel_horizontal(){
        if(vel_hor>0){
            vel_hor--;
        }
    }    
    
    public boolean iniciar_interromper_gravacao(){
        estado_camera = !estado_camera;
        return estado_camera;
    }
    
    public void diminuir_vel_max(){
        if(autonomia_bateria < 5){
            vel_hor_max = vel_hor_max/2;
            vel_vert_max = vel_vert_max/2;
        }
    }
        
    public void imprime_estados(){
        System.out.printf("Marca %s\n", marca);
        System.out.printf("Modelo %s\n", modelo);        
        System.out.printf("Número de hélices = %d\n", n_de_helices);
        System.out.printf("Câmera = %s\n", camera);
        System.out.printf("Vel.vertical.atual = %d m/s\n", vel_vert);
        System.out.printf("Vel.vertical.máx = %d m/s\n", vel_vert_max);
        System.out.printf("Vel.horizontal.atual = %d m/s\n", vel_hor);        
        System.out.printf("Vel.horizontal.máx = %d m/s\n", vel_hor_max);
        System.out.printf("Autonomia bateria = %d minutos\n", autonomia_bateria);
        System.out.printf("Distância máxima = %d metros\n", distancia_max);
        if(estado_camera == false){
        System.out.printf("Estado da camera = Desligada\n");            
        }
        else{
        System.out.printf("Estado da camera = Ligada\n");            
        }
        System.out.println("");
    }
    
    public Drone(String m, String model, int n_hel, String cam, int vel_vert, int vel_hor, int auton, int d){
        marca = m;
        modelo = model;
        n_de_helices = n_hel;
        camera = cam;
        vel_vert_max = vel_vert;
        vel_hor_max = vel_hor;
        autonomia_bateria = auton;
        distancia_max = d;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////
```
**Questão 4:** 
```java

///////////////////////////////////////////////////////////////////////////////////////////////////////
/*MAIN*/

package drone;

public class Main {
    public static void main(String[] args) {
        Drone drone1;
        Drone drone2, drone3, drone4;
        drone1 = new Drone("Hubsan", "X4 mini", 4, "SD", 10, 10, 7, 150); 
        drone2 = new Drone("Hubsan", "H501S X4 FPV", 4, "HD", 12, 12, 20, 1000); 
        drone3 = new Drone("DJI", "Mavic Pro", 4, "UHD", 16, 16, 27, 13000); 
        drone4 = new Drone("DJI", "Spreading Wings", 8, "SUHD", 16, 16, 15, 13000); 
      
        drone1.imprime_estados();
        drone2.imprime_estados();
        drone3.imprime_estados();
        drone4.imprime_estados();
    }
    
}


///////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////
/*Classe Drone*/

package drone;

public class Drone {
    int n_de_helices;
    String marca;
    String modelo;
    String camera;
    int vel_vert;
    int vel_hor;
    int vel_vert_max;
    int vel_hor_max;
    int autonomia_bateria;
    int distancia_max;
    boolean estado_camera;
            
    public Drone(){};
    
    public void aumentar_vel_vertical(){
        if(vel_vert<vel_vert_max){
            vel_vert++;
        }
    }
    
    public void diminuir_vel_vertical(){
        if(vel_vert>0){
            vel_vert--;
        }
    }

    public void aumentar_vel_horizontal(){
        if(vel_hor<vel_hor_max){
            vel_hor++;
        }
    }

    public void diminuir_vel_horizontal(){
        if(vel_hor>0){
            vel_hor--;
        }
    }    
    
    public boolean iniciar_interromper_gravacao(){
        estado_camera = !estado_camera;
        return estado_camera;
    }
    
    public void diminuir_vel_max(){
        if(autonomia_bateria < 5){
            vel_hor_max = vel_hor_max/2;
            vel_vert_max = vel_vert_max/2;
        }
    }
        
    public void imprime_estados(){
        System.out.printf("Marca %s\n", marca);
        System.out.printf("Modelo %s\n", modelo);        
        System.out.printf("Número de hélices = %d\n", n_de_helices);
        System.out.printf("Câmera = %s\n", camera);
        System.out.printf("Vel.vertical.atual = %d m/s\n", vel_vert);
        System.out.printf("Vel.vertical.máx = %d m/s\n", vel_vert_max);
        System.out.printf("Vel.horizontal.atual = %d m/s\n", vel_hor);        
        System.out.printf("Vel.horizontal.máx = %d m/s\n", vel_hor_max);
        System.out.printf("Autonomia bateria = %d minutos\n", autonomia_bateria);
        System.out.printf("Distância máxima = %d metros\n", distancia_max);
        if(estado_camera == false){
        System.out.printf("Estado da camera = Desligada\n");            
        }
        else{
        System.out.printf("Estado da camera = Ligada\n");            
        }
        System.out.println("");
    }
    
    public Drone(String m, String model, int n_hel, String cam, int vel_vert, int vel_hor, int auton, int d){
        marca = m;
        modelo = model;
        n_de_helices = n_hel;
        camera = cam;
        vel_vert_max = vel_vert;
        vel_hor_max = vel_hor;
        autonomia_bateria = auton;
        distancia_max = d;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////

```


**Questão 5:** 

```java
///////////////////////////////////////////////////////////////////////////////////////////////////////
/*MAIN*/

package drone;
public class Main {

    public static void main(String[] args) {
        Drone drone1;
        ControleRemoto controle1;
        drone1 = new Drone("Hubsan", "X4 mini", 4, "SD", 10, 10, 7, 150, 1000);  
        drone1.imprime_estados();/*Estado incial do drone*/
        
        controle1 = new ControleRemoto();
  
        controle1.x = drone1; /*Controle está conectado ao drone1*/
        controle1.alcance = 10000; /*10km*/
        controle1.nivel_bateria = 100; /*Bateria está 100%*/
        controle1.aumentar_vel_vertical();
        controle1.aumentar_vel_vertical();
        controle1.aumentar_vel_horizontal();
        controle1.iniciar_interromper_gravacao();
        
        drone1.imprime_estados();/*Estado depois de alterar as velocidades e 
        iniciar a gravação*/
        
        drone1.distancia = 10005; /*Maior do que o alcance do controle, não 
        altera os estados*/
        controle1.aumentar_vel_horizontal();
        controle1.aumentar_vel_horizontal();
        controle1.aumentar_vel_vertical();
        controle1.aumentar_vel_vertical();
        
        drone1.imprime_estados();/*Estado depois da tentativa de alteração com a
        distancia do drone1 maior do que o alcance do controle remoto*/
    }
    
}
///////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////
/*Classe Drone*/

package drone;


public class Drone {
    int n_de_helices;
    String marca;
    String modelo;
    String camera;
    int vel_vert;
    int vel_hor;
    int vel_vert_max;
    int vel_hor_max;
    int autonomia_bateria;
    int distancia;
    int distancia_max;
    boolean estado_camera;
            
    public Drone(){};
    
    public void aumentar_vel_vertical(){
        if(vel_vert<vel_vert_max){
            vel_vert++;
        }
    }
    
    public void diminuir_vel_vertical(){
        if(vel_vert>0){
            vel_vert--;
        }
    }

    public void aumentar_vel_horizontal(){
        if(vel_hor<vel_hor_max){
            vel_hor++;
        }
    }

    public void diminuir_vel_horizontal(){
        if(vel_hor>0){
            vel_hor--;
        }
    }    
    
    public boolean iniciar_interromper_gravacao(){
        estado_camera = !estado_camera;
        return estado_camera;
    }
    
    public void diminuir_vel_max(){
        if(autonomia_bateria < 5){
            vel_hor_max = vel_hor_max/2;
            vel_vert_max = vel_vert_max/2;
        }
    }
        
    public void imprime_estados(){
        System.out.printf("Marca %s\n", marca);
        System.out.printf("Modelo %s\n", modelo);        
        System.out.printf("Número de hélices = %d\n", n_de_helices);
        System.out.printf("Câmera = %s\n", camera);
        System.out.printf("Vel.vertical.atual = %d m/s\n", vel_vert);
        System.out.printf("Vel.vertical.máx = %d m/s\n", vel_vert_max);
        System.out.printf("Vel.horizontal.atual = %d m/s\n", vel_hor);        
        System.out.printf("Vel.horizontal.máx = %d m/s\n", vel_hor_max);
        System.out.printf("Autonomia bateria = %d minutos\n", autonomia_bateria);
        System.out.printf("Distância máxima = %d metros\n", distancia_max);
        if(estado_camera == false){
        System.out.printf("Estado da camera = Desligada\n");            
        }
        else{
        System.out.printf("Estado da camera = Ligada\n");            
        }
        System.out.println("");
    }
    
    public Drone(String m, String model, int n_hel, String cam, int vel_vert, int vel_hor, int auton, int d, int dist){
        marca = m;
        modelo = model;
        n_de_helices = n_hel;
        camera = cam;
        vel_vert_max = vel_vert;
        vel_hor_max = vel_hor;
        autonomia_bateria = auton;
        distancia_max = d;
        distancia = dist;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////
/*Classe Controle*/


package drone;

public class ControleRemoto {
    Drone x;
    int autonomia_bateria;
    int nivel_bateria;
    int alcance;
    
    public void aumentar_vel_vertical(){
        if(alcance >= x.distancia && nivel_bateria>0){
            x.aumentar_vel_vertical();
        }
    }
    
    public void diminuir_vel_vertical(){
        if(alcance >= x.distancia && nivel_bateria>0){
            x.diminuir_vel_vertical();
        }
    }

    public void aumentar_vel_horizontal(){
        if(alcance >= x.distancia && nivel_bateria>0){
            x.aumentar_vel_horizontal();
        }
    }

    public void diminuir_vel_horizontal(){
        if(alcance >= x.distancia && nivel_bateria>0){
            x.diminuir_vel_horizontal();
        }
    }    
    
    public boolean iniciar_interromper_gravacao(){
        if(alcance >= x.distancia && nivel_bateria>0){
            x.iniciar_interromper_gravacao();
        }
        return x.estado_camera;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////
```

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
<p>Nome: André<p>Curso: &c1<p>Data de nascimento: 23/2/1983<p>
Nome: Maria<p>Curso: &c2<p>Data de nascimento: 27/5/1994<p>
Nome: Junior<p>Curso: &c1<p>Data de nascimento: 16/11/1995<p>
False<p>False<p>True<p>


**Questão 8:**

<p>Impressão do Garbage collector:<p>
Esse objeto ALUNO vai ser destruido.<p>
Detalhes do objeto: <p>
<p>
Nome: Maria<p>
Curso: &c2<p>
Data de nascimento: 27/5/1994<p>
Esse CURSO vai ser destruido.<p>
Detalhes do objeto:<p>
<p>
Nome do curso: Engenharia de Software<p>
Codigo: 1<p>
Carga horaria: 240<p>
Esse objeto ALUNO vai ser destruido.<p>
Detalhes do objeto: <p>
<p>
Nome: Andre<p>
Curso: &c1<p>
Data de nascimento: 23/2/1983<p>

**Questão 9:**


**Questão 10:**


## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 3 de abril de 2017, 22:52.*



[eckDavid]: http://math.hws.edu/javanotes/
