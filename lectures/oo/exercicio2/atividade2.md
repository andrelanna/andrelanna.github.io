Matheus Roberto 13/0126721
<br>Pedro Kelvin 13/0129674

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
<br/><br/>
* classe

A classe é uma entidade que contém atributos e métodos, que são responsáveis por descrever objetos ou mais precisamente para criar objetos. Ela é um tipo de fábrica para a construção de objetos.
* objeto

Objetos são invocações das classes, são eles que dão vida à classe. Objeto é uma instância da classe, ou seja, a classe é uma forma para o objeto. Tratando de um bolo, a classe é a forma do bolo e o bolo é um objeto que pode ser de chocolate, laranja ou do que quer que você queira, e cada bolo que é feito é um novo objeto. 
* elementos de classe

Os elementos de uma classe são os atributos e métodos que cada classe possui.

* atributos

Atributos nada mais são do que as variáveis contidas em uma classe ou em um objeto. São as principais característica de um objeto quando eu o instancio através de uma classe. Por exemplo, a classe Aluno tem como objetos instanciados Pedro e Matheus, ambos possuem uma matrícula, nota, quantidade de faltas, etc. Cada uma dessas características são chamadas de atributos.  	
* métodos

Métodos são subrotinas que tem como estrutura o modificador, o tipo de retorno e a lista de parâmetros. Métodos são responsáveis por executar mudanças nos valores dos atributos dos objetos apenas com a chamada do mesmo, não sendo necessário que a main repita várias vezes o mesmo passo. Esses métodos estão presentes em cada classe e seus objetos herdam esses métodos, podendo ser ilimitados. 
* método construtor padrão

O construtor padrão também é uma subrotina, porém é uma subrotina especial, com o papel de alocar memória para o objeto e inicializar os atributos, retornando a referência para o objeto. Toda classe tem um construtor padrão assim que ela é criada, mesmo se o programador não declarar ela o sistema irá providenciar um método construtor padrão.
* método construtor alternativo

O método construtor alternativo, assim, como o padrão, também aloca um espaço na memória para o objeto, a diferença é que a inicialização dos atributos é feita de acordo com uma passagem de parâmetros. Diferente do método padrão, esse método pode atribuir quaisquer valores para os diversos atributos do objeto, bastanto apenas que sejam passados esses valores como parâmetro na chamado do método alternativo. 
* estado de um objeto

Ao conjunto de valores que os atributos de um objeto armazena em um instante, dá-se o nome de estado do objeto
* retenção de estado

Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.
<br/><br/>
**Questão 2:** 
<br/><br/>
a)**F**.
 "Dois objetos instanciados através do método construtor padrão terão o mesmo estado, entretanto, suas referências não serão iguais."<br/>
Os objetos serem estanciados através do mesmo método construtor apenas implica em terem o mesmo estado, mas não em referenciarem o mesmo objeto.
	
b)**F**.
 "Uma classe pode ter vários métodos construtores alternativos para instanciação de seus objetos."<br/>
Uma Classe pode ter quantos métodos construtores alternativos quiser.	
	
c)**V**.
 "Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo."
	
d)**F**.
 "Em Java, o operador .(ponto) serve para acessar os métodos e os atributos de um objeto".<br/>
Serve para acessar ambos, atributo e método.
	
e)**F**.
Em Java não existe métodos destrutores, e sim o que acontece é o desreferenciamento de um objeto, e depois o Garbage Collector passa avaliando a memória e é executado, destruindo esse objeto. O método finalize() é implementado em cada Classe e é chamado assim que o GC está quase destruindo o objeto, ai ele executa as ultimas instruções antes de destrui-lo.
<br/><br/>
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
    
}
///////////////////////////////////////////////////////////////////////////////////////////////////////
```
<br/>
Diagrama de Classe- <img src = "https://raw.githubusercontent.com/pedrokelvin/andrelanna.github.io/master/lectures/oo/exercicio2/Captura%20de%20tela%20de%202017-04-10%2015-06-07.png"/>
<br/>

**Questão 4:** 
```java

///////////////////////////////////////////////////////////////////////////////////////////////////////
/*MAIN*/

package drone;

public class Main {
    public static void main(String[] args) {
        Drone drone1, drone2, drone3, drone4;
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

**Questão 6:** 
<br/><br/>
*a)* <br>
Errado! a1 e a2 nem se quer são referências, são atributos da classe Questao6<br>
<br>
*b)* <br>
Estados de q1:<br>
a1= 0  a2 = 0.0 a3 = null a4 = false<br>
Estados de q2:<br>
a1= 0  a2 = 0.0 a3 = null a4 = false<br>
Estados de q3:<br>
a1= 1  a2 = 1.0 a3 = "null" a4 = false<br>
<br>
*c)*<br>
False<br>
True<br>
False<br>
True<br>
True<br>
False<br>
<br><br>

## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 3 de abril de 2017, 22:52.*



[eckDavid]: http://math.hws.edu/javanotes/
