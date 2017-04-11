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
Classe: descreve o comportamento do objeto. É composto por nome (tipo), atributos (propriedades, dados) e comportamento (operações e métodos).

Objeto: Operação resultante de uma classe.

Elementos de classe: nome, atributos e métodos.

Atributos: São as características de um objeto, um conjunto de dados que representará a classe.

Métodos: define o comportamento do objeto.

Método construtor padrão: responsável por alocar memória e inicializar os dados, sendo chamados automaticamente na declaração de um novo objeto.

Método construtor alternativo: também é responsável por inicializar os dados relacionados ao objeto, porém não de modo automático, pois o programador deve passar o conjunto de dados para o construtor padrão.

Estado de um objeto: define o objeto de acordo com os atributos instanceados na classe.

Retenção de estado: após sua criação, o objeto fica armazenado na memória com as caristicas definidas na classe a espera de alguma ação.


**Questão 2:** Julgue as seguintes frases como verdadeiras ou falsas e explique o motivo delas estarem certas ou erradas. Nos casos em que julgar uma sentença como errada, altere-a de modo a corrigi-la.

a) Dois objetos instanciados através do método construtor padrão terão o mesmo estado e, portanto, suas referências serão iguais. 

b) Uma classe pode ter apenas um método construtor alternativo para instanciação de seus objetos. 

c) Retenção de estados é uma propriedade do paradigma OO que permite aos objetos manterem os valores de seus atributos até o momento em que um estímulo externo ao objeto solicite uma alteração no valor de algum atributo.

d) Em Java, o operador . (ponto) serve para acessar somente os métodos de um objeto. 

e) Métodos destrutores são aqueles métodos que são chamados explicitamente pelo algoritmo para destruir objetos e liberar os espaços que eles ocupam em memória. Em Java métodos destrutores são implementos com o nome **finalize()** e definidos em cada classe.

Resposta

a) (F) Não terão o mesmo estado, pois serão instanceados objetos diferentes, com referências diferentes.
Dois objetos instanciados através do método construtor padrão terão o mesmo estado se e somente se tiverem as referências iguais.

b) (F) Uma classe pode possui tanto o método construtor padrão e o alternativo.
Uma classe pode ter o método construtor padrão ou o alternativo para instanciação de seus objetos.
 
c) (V)

d) (F) Pode também ser usado para acessar atributos.
Em Java, o operador . (ponto) serve para acessar os métodos ou atributos de um objeto.

e) (V)


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

A implementação dessa classe em java pode ser vista no código descrito abaixo:

public class Questão3_oo {

    
    public static void main(String[] args) {
        
        Drone d;
        d= new Drone();
     
 
        //////////////
        //Configuração Drone :
        System.out.print("Drone:");
        d.n_deHelice=4;
        d.camera="SD";
        d.vel_vert_max=10;
        d.vel_hor_max=10;
        d.autonomia=7;
        d.dist_max= 150;
        System.out.println();
        
        
                
        System.out.println("Marca: "+d.marca + "\nModelo: "+d.modelo +"\nNum. de helice: "+d.n_deHelice+ "\nCamera: "+d.camera+ 
                "Velocidade vertical maxima: "+d.vel_vert_max+ "\nVelocidade Horizontal maxima: "+d.vel_hor_max+ "\nAutonomia: "+d.autonomia + "\nDistância maxima: "+d.dist_max);

        System.out.println();
        
      
        
    }
    
}


////////////////////////////////////////////////////////////////////////////////////
////Classe Drone

public class Drone {
    String marca;
    String modelo;
    
    int n_deHelice;
    String camera;
    int vel_vert;
    int vel_hor;
    int vel_vert_max;
    int vel_hor_max;
    int autonomia;
    int dist_max;

    
    
    public Drone(){
    }
    
    public void up_vel_vertical(){
        
        if ((vel_vert<vel_vert_max) && (vel_vert>=0) && (autonomia >=5) )
            vel_vert= vel_vert+1;
        else if((autonomia<5) && (vel_vert>= vel_vert_max))
            vel_vert= vel_vert_max;
        else if((autonomia<5) && (vel_vert < vel_vert_max))
            vel_vert= vel_vert+1;
   
    }
    
    public void down_vel_vertical(){
        if((vel_vert<=vel_vert_max) && (vel_vert>= 1) && (autonomia >=5))
        vel_vert= vel_vert- 1;
        else if((autonomia<5) && (vel_vert>= vel_vert_max))
            vel_vert= vel_vert_max;
        else if((autonomia<5) && (vel_vert< vel_vert_max))
            vel_vert= vel_vert-1;
    }
    
    public void up_vel_horizontal(){
        if ((vel_hor<vel_hor_max) && (vel_hor>=0) && (autonomia >=5))
            vel_hor= vel_hor+1;
        else if((autonomia<5) && (vel_hor>= vel_hor_max))
            vel_hor= vel_hor_max;
        else if((autonomia<5) && (vel_hor< vel_hor_max))
            vel_hor= vel_hor+1;
    
    }
    
    public void down_vel_horizontal(){
        if((vel_hor<=vel_hor_max) && (vel_hor>= 1) && (autonomia >=5))
        vel_hor= vel_hor- 1;
        else if((autonomia<5) && (vel_hor>= vel_hor_max))
            vel_hor= vel_hor_max;
        else if((autonomia<5) && (vel_hor< vel_hor_max))
            vel_hor= vel_hor-1;
    
    }
    
    public void start_rec(){
        System.out.println(" A Gravação iniciou.");
        
    }
    
    public void stop_rec(){
        System.out.println(" A Gravação parou.");
        
    }
      
    public void autonomia(){
        
        double  velocidadeH, velocidadeV;
        if (autonomia<=5){
        velocidadeH=vel_hor_max/2;
        velocidadeV=vel_vert_max/2;
        vel_vert_max= (int) velocidadeV;
        vel_hor_max= (int) velocidadeH;}
               
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

O código para a criação dos 4 objetos acima está mostrado abaixo:
public class Questão4_oo {

    
    public static void main(String[] args) {
        
        Drone d1,d2,d3,d4;
        d1= new Drone();
        d2= new Drone();
        d3= new Drone();
        d4= new Drone();
        
        
        //////////////
        //Configuração Drone 1:
        System.out.print("Drone1:");
        d1.marca="Hubsan";
        d1.modelo= "X4 MINI";
        d1.n_deHelice=4;
        d1.camera="SD";
        d1.vel_vert_max=10;
        d1.vel_hor_max=10;
        d1.autonomia=7;
        d1.dist_max= 150;
        System.out.println();
        
        
                
        System.out.println("Marca: "+d1.marca + "\nModelo: "+d1.modelo +"\nNum. de helice: "+d1.n_deHelice+ "\nCamera: "+d1.camera+ 
                "Velocidade vertical maxima: "+d1.vel_vert_max+ "\nVelocidade Horizontal maxima: "+d1.vel_hor_max+ "\nAutonomia: "+d1.autonomia + "\nDistância maxima: "+d1.dist_max);

        System.out.println();
        
        /////////////////////////////////////////////////
        //Configuração Drone 2:
        System.out.print("Drone2:");
        d2.marca="Hubsan";
        d2.modelo= "H501S X4 FPV";
        d2.n_deHelice=4;
        d2.camera="HD";
        d2.vel_vert_max=12;
        d2.vel_hor_max=12;
        d2.autonomia=20;
        d2.dist_max= 1000;
        System.out.println();
                
        System.out.println("Marca: "+d2.marca + "\nModelo: "+d2.modelo +"\nNum. de helice: "+d2.n_deHelice+ "\nCamera: "+d2.camera+ 
                "Velocidade vertical maxima: "+d2.vel_vert_max+ "\nVelocidade Horizontal maxima: "+d2.vel_hor_max+ "\nAutonomia: "+d2.autonomia + "\nDistância maxima: "+d2.dist_max);
        
        System.out.println();
        
        ///////////////////////////////////////////////////////
        //Configuração Drone 3:
        System.out.print("Drone3:");
        d3.marca="DJJ";
        d3.modelo= "Mavic Pro";
        d3.n_deHelice=8;
        d3.camera="UHD";
        d3.vel_vert_max=16;
        d3.vel_hor_max=16;
        d3.autonomia=27;
        d3.dist_max= 13000;
        System.out.println();
                
        System.out.println("Marca: "+d3.marca + "\nModelo: "+d3.modelo +"\nNum. de helice: "+d3.n_deHelice+ "\nCamera: "+d3.camera+ 
                "Velocidade vertical maxima: "+d3.vel_vert_max+ "\nVelocidade Horizontal maxima: "+d3.vel_hor_max+ "\nAutonomia: "+d3.autonomia + "\nDistância maxima: "+d3.dist_max);
        System.out.println();
        
 ///////////////////////////////////////////////////////
        //Configuração Drone 4:
        System.out.print("Drone4:");
        d4.marca="DJJ";
        d4.modelo= "Spreading Wings";
        d4.n_deHelice=8;
        d4.camera="SUHD";
        d4.vel_vert_max=16;
        d4.vel_hor_max=16;
        d4.autonomia=15;
        d4.dist_max= 13000;
        System.out.println();
                
        System.out.println("Marca: "+d4.marca + "\nModelo: "+d4.modelo +"\nNum. de helice: "+d4.n_deHelice+ "\nCamera: "+d4.camera+ 
                "Velocidade vertical maxima: "+d4.vel_vert_max+ "\nVelocidade Horizontal maxima: "+d4.vel_hor_max+ "\nAutonomia: "+d4.autonomia + "\nDistância maxima: "+d4.dist_max);
        
        
        
    }
    
}


////////////////////////////////////////////////////////////////////////////////////
////Classe Drone

public class Drone {
    String marca;
    String modelo;
    
    int n_deHelice;
    String camera;
    int vel_vert;
    int vel_hor;
    int vel_vert_max;
    int vel_hor_max;
    int autonomia;
    int dist_max;

    
    
    public Drone(){
    }
    
    public void up_vel_vertical(){
        
        if ((vel_vert<vel_vert_max) && (vel_vert>=0) && (autonomia >=5) )
            vel_vert= vel_vert+1;
        else if((autonomia<5) && (vel_vert>= vel_vert_max))
            vel_vert= vel_vert_max;
        else if((autonomia<5) && (vel_vert < vel_vert_max))
            vel_vert= vel_vert+1;
   
    }
    
    public void down_vel_vertical(){
        if((vel_vert<=vel_vert_max) && (vel_vert>= 1) && (autonomia >=5))
        vel_vert= vel_vert- 1;
        else if((autonomia<5) && (vel_vert>= vel_vert_max))
            vel_vert= vel_vert_max;
        else if((autonomia<5) && (vel_vert< vel_vert_max))
            vel_vert= vel_vert-1;
    }
    
    public void up_vel_horizontal(){
        if ((vel_hor<vel_hor_max) && (vel_hor>=0) && (autonomia >=5))
            vel_hor= vel_hor+1;
        else if((autonomia<5) && (vel_hor>= vel_hor_max))
            vel_hor= vel_hor_max;
        else if((autonomia<5) && (vel_hor< vel_hor_max))
            vel_hor= vel_hor+1;
    
    }
    
    public void down_vel_horizontal(){
        if((vel_hor<=vel_hor_max) && (vel_hor>= 1) && (autonomia >=5))
        vel_hor= vel_hor- 1;
        else if((autonomia<5) && (vel_hor>= vel_hor_max))
            vel_hor= vel_hor_max;
        else if((autonomia<5) && (vel_hor< vel_hor_max))
            vel_hor= vel_hor-1;
    
    }
    
    public void start_rec(){
        System.out.println(" A Gravação iniciou.");
        
    }
    
    public void stop_rec(){
        System.out.println(" A Gravação parou.");
        
    }
      
    public void autonomia(){
        
        double  velocidadeH, velocidadeV;
        if (autonomia<=5){
        velocidadeH=vel_hor_max/2;
        velocidadeV=vel_vert_max/2;
        vel_vert_max= (int) velocidadeV;
        vel_hor_max= (int) velocidadeH;}
               
    }
    
}


**Questão 5:** Ainda levando em consideração o cenário descrito nas questões 3 e 4, é necessário fazer com que os comandos realizados pelo usuário no controle remoto sejam enviados ao drone. Para isso, é necessário que o controle remoto estabeleça uma conexão com o drone. A partir desse momento é possível enviar os seguintes comandos ao drone: a) aumentar ou diminuir a velocidade vertical em passos de 1 m/s; b) aumentar ou diminuir a velocidade horizontal em passos de 1m/s e, c) ativar ou desativar a câmera. É importante ressaltar que um controle remoto só pode estar conectado a um drone apenas. Por fim, controles remotos possuem baterias com autonomia entre 60 e 90 minutos e alcance entre 20 metros e 20 kilometros.  

Desse modo, pede-se nessa questão que seja modelada e implementada em Java a classe que representa as características e o comportamento de um controle remoto, de modo que o drone possa ser comandado a partir do comandos enviados pelo controle remoto.


//////////////////////////////////////////////////////////////////////////////////////
////Código Principal

public class Atividade2_questao5_OO {

 
    public static void main(String[] args) {
       
        ////////////////////////////////////////////////////////////////////////
        ///Criando os objetos Drones
        Drone d1,d2,d3,d4,dcr;
        d1= new Drone();
        d2= new Drone();
        d3= new Drone();
        d4= new Drone();
        //////////////////////
        //Objeto criado para referência na Classe ControleRemoto
        //dcr= new Drone();
        
        ////////////////////////////////////////////////////////////////////////
        ////Criando os controles remotos para os drones
        ControleRemoto cr1,cr2,cr3,cr4,c;
        cr1= new ControleRemoto();
        cr2= new ControleRemoto();
        cr3= new ControleRemoto();
        cr4= new ControleRemoto();
        c= new ControleRemoto();
        
        /////////////////////////
        ////Relacinado as duas classes para controlar o drone:
        //c.d=dcr;
        
        ////////////////////////////////////////////////////////////////////////
        //Configuração Drone 1:
        System.out.print("Drone1:");
        d1.marca="Hubsan";
        d1.modelo= "X4 MINI";
        d1.n_deHelice=4;
        d1.camera="SD";
        d1.vel_hor=8;
        d1.vel_vert=8;
        d1.vel_vert_max=10;
        d1.vel_hor_max=10;
        d1.autonomia=7;
        d1.dist_max= 150;
        System.out.println();
        
        ////////////////////////////////////////////////////////////////////////
        ////Controle do Drone 1
        cr1.d=d1;
        cr1.autonomiaControle=90;
        cr1.distancia=20000;
        System.out.println();
        
        //////////////////////
        ////Configurando o controle
        d1.autonomia();
        cr1.AumentarVH();
        cr1.Srec();
      
        //System.out.println(d1.vel_vert_max);
        System.out.println();
   
        
        System.out.println("Marca: "+d1.marca + "\nModelo: "+d1.modelo +
                "\nNum. de helice: "+d1.n_deHelice+ "\nCamera: "+d1.camera+ 
                "\nVelocidade vertical: "+d1.vel_vert+ "\nVelocidade Horizontal: "+d1.vel_hor+
                "\nVelocidade vertical maxima: "+d1.vel_vert_max+ "\nVelocidade Horizontal maxima: "
                +d1.vel_hor_max+ "\nAutonomia: "+d1.autonomia + "\nDistância maxima: "+d1.dist_max);

        System.out.println();
        
        /////////////////////////////////////////////////
        //Configuração Drone 2:
        System.out.print("Drone2:");
        d2.marca="Hubsan";
        d2.modelo= "H501S X4 FPV";
        d2.n_deHelice=4;
        d2.camera="HD";
        d2.vel_hor=4;
        d2.vel_vert=4;
        d2.vel_vert_max=12;
        d2.vel_hor_max=12;
        d2.autonomia=20;
        d2.dist_max= 1000;
        System.out.println();
        
        
        ////////////////////////////////////////////////////////////////////////
        ////Controle do Drone 2
        cr2.d=d2;
        cr1.autonomiaControle=90;
        cr1.distancia=20000;
        System.out.println();
        
        //////////////////////
        ////Configurando o controle
        d2.autonomia();
        cr2.DiminuirVH();
        cr2.Srec();
      
        
        
                
        System.out.println("Marca: "+d2.marca + "\nModelo: "+d2.modelo +
                "\nNum. de helice: "+d2.n_deHelice+ "\nCamera: "+d2.camera+
                "\nVelocidade vertical: "+d2.vel_vert+ "\nVelocidade Horizontal: "+d2.vel_hor+
                "\nVelocidade vertical maxima: "+d2.vel_vert_max+ "\nVelocidade Horizontal maxima: "
                +d2.vel_hor_max+ "\nAutonomia: "+d2.autonomia + "\nDistância maxima: "+d2.dist_max);
        
        System.out.println();
        
        ///////////////////////////////////////////////////////
        //Configuração Drone 3:
        System.out.print("Drone3:");
        d3.marca="DJJ";
        d3.modelo= "Mavic Pro";
        d3.n_deHelice=8;
        d3.camera="UHD";
        d3.vel_hor=7;
        d3.vel_vert=7;
        d3.vel_vert_max=16;
        d3.vel_hor_max=16;
        d3.autonomia=27;
        d3.dist_max= 13000;
        System.out.println();
        
        
        ////////////////////////////////////////////////////////////////////////
        ////Controle do Drone 3
        cr3.d=d3;
        cr3.autonomiaControle=90;
        cr3.distancia=20000;
        System.out.println();
        
        //////////////////////
        ////Configurando o controle
        d3.autonomia();
        cr3.DiminuirVH();
        cr3.Srec();
        
        
        
                
        System.out.println("Marca: "+d3.marca + "\nModelo: "+d3.modelo +
                "\nNum. de helice: "+d3.n_deHelice+ "\nCamera: "+d3.camera+ 
                "\nVelocidade vertical: "+d3.vel_vert+ "\nVelocidade Horizontal: "+d3.vel_hor+
                "\nVelocidade vertical maxima: "+d3.vel_vert_max+ "\nVelocidade Horizontal maxima: "
                +d3.vel_hor_max+ "\nAutonomia: "+d3.autonomia + "\nDistância maxima: "+d3.dist_max);
        System.out.println();
        
        
        
 ///////////////////////////////////////////////////////
        //Configuração Drone 4:
        System.out.print("Drone4:");
        d4.marca="DJJ";
        d4.modelo= "Spreading Wings";
        d4.n_deHelice=8;
        d4.camera="SUHD";
        d4.vel_hor=9;
        d4.vel_vert=9;
        d4.vel_vert_max=16;
        d4.vel_hor_max=16;
        d4.autonomia=15;
        d4.dist_max= 13000;
        System.out.println();
        
        
        ////////////////////////////////////////////////////////////////////////
        ////Controle do Drone 3
        cr4.d=d4;
        cr4.autonomiaControle=90;
        cr4.distancia=20000;
        System.out.println();
        
        //////////////////////
        ////Configurando o controle
        d4.autonomia();
        cr4.DiminuirVH();
        cr4.DiminuirVV();
        cr4.Srec();
        
        
                
        System.out.println("Marca: "+d4.marca + "\nModelo: "+d4.modelo +
                "\nNum. de helice: "+d4.n_deHelice+ "\nCamera: "+d4.camera+ 
                "\nVelocidade vertical: "+d4.vel_vert+ "\nVelocidade Horizontal: "+d4.vel_hor+
                "\nVelocidade vertical maxima: "+d4.vel_vert_max+ "\nVelocidade Horizontal maxima: "+d4.vel_hor_max+
                 "\nAutonomia: "+d4.autonomia + "\nDistância maxima: "+d4.dist_max);
        
        
      
      
     
    }
    
}




//////////////////////////////////////////////////////////////////////////////////////
////Classe Drone


public class Drone {
    String marca;
    String modelo;
    
    int n_deHelice;
    String camera;
    int vel_vert;
    int vel_hor;
    int vel_vert_max;
    int vel_hor_max;
    int autonomia;
    int dist_max;

    
    
    public Drone(){
    }
    
    public void up_vel_vertical(){
        
        if ((vel_vert<vel_vert_max) && (vel_vert>=0) && (autonomia >=5) )
            vel_vert= vel_vert+1;
        else if((autonomia<5) && (vel_vert>= vel_vert_max))
            vel_vert= vel_vert_max;
        else if((autonomia<5) && (vel_vert < vel_vert_max))
            vel_vert= vel_vert+1;
   
    }
    
    public void down_vel_vertical(){
        if((vel_vert<=vel_vert_max) && (vel_vert>= 1) && (autonomia >=5))
        vel_vert= vel_vert- 1;
        else if((autonomia<5) && (vel_vert>= vel_vert_max))
            vel_vert= vel_vert_max;
        else if((autonomia<5) && (vel_vert< vel_vert_max))
            vel_vert= vel_vert-1;
    }
    
    public void up_vel_horizontal(){
        if ((vel_hor<vel_hor_max) && (vel_hor>=0) && (autonomia >=5))
            vel_hor= vel_hor+1;
        else if((autonomia<5) && (vel_hor>= vel_hor_max))
            vel_hor= vel_hor_max;
        else if((autonomia<5) && (vel_hor< vel_hor_max))
            vel_hor= vel_hor+1;
    
    }
    
    public void down_vel_horizontal(){
        if((vel_hor<=vel_hor_max) && (vel_hor>= 1) && (autonomia >=5))
        vel_hor= vel_hor- 1;
        else if((autonomia<5) && (vel_hor>= vel_hor_max))
            vel_hor= vel_hor_max;
        else if((autonomia<5) && (vel_hor< vel_hor_max))
            vel_hor= vel_hor-1;
    
    }
    
    public void start_rec(){
        System.out.println(" A Gravação iniciou.");
        
    }
    
    public void stop_rec(){
        System.out.println(" A Gravação parou.");
        
    }
      
    public void autonomia(){
        
        double  velocidadeH, velocidadeV;
        if (autonomia<=5){
        velocidadeH=vel_hor_max/2;
        velocidadeV=vel_vert_max/2;
        vel_vert_max= (int) velocidadeV;
        vel_hor_max= (int) velocidadeH;}
               
    }
    
}



///////////////////////////////////////////////////////////////////////////////////////
////Clase Controle Remoto

public class ControleRemoto {
    
    int autonomiaControle;
    int distancia;
    
    Drone d;
    public ControleRemoto(){
        
    }
    
    
    public void AumentarVH(){

        d.up_vel_horizontal();

    }
    
    public void DiminuirVH(){

        d.down_vel_horizontal();
    
    }
    
    public void AumentarVV(){
    
        d.up_vel_vertical();
    }
    
    public void DiminuirVV(){
  
     
        d.down_vel_vertical();
    }
    
    public void Srec(){
        
        d.start_rec();
        
    }
    
    public void stopRec(){
        
        d.stop_rec();
        
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


a)



b)Os valores em q1 são os valores do construtor padrão, já os valores em q2 e q3 são os valores que foram definidos através do construtor alternativo.
 
c)Será impressa a seguinte mensagem:


FALSE
TRUE 
FALSE 
TRUE
TRUE

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

Resposta: Será printada a seguinte mensagem:

Nome : Andre 
Curso : Endereço de memoria de c1 que referencia o objeto do tipo curso 
Data de Nascimento : 23/02/1983

Nome : Maria
Curso : Endereço de memoria de c2 que referencia o objeto do tipo curso 
Data de Nascimento : 27/05/1994

Nome : Junior
Curso : Endereço de memoria de c1 que referencia o objeto do tipo curso 
Data de Nascimento : 16/11/1995

FALSE
FALSE
TRUE




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

Resposta: O algoritmo irá imprimir a seguinte mensagem na tela antes de se executar o Garbage Collector (no caso dois objetos do tipo Aluno perderam suas referências):

Este Objeto ALUNO vai ser destruido
Detalhes do Objeto:
Nome : Andre 
Curso : Endereço de memoria de c1 que referencia um objeto do tipo curso 
Data de Nascimento : 23/02/1983



Este Objeto ALUNO vai ser destruido
Detalhes do Objeto:
Nome : Maria 
Curso : Endereço de memoria de c2 que referencia um objeto do tipo curso 
Data de Nascimento : 23/02/1983





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

O primeiro erro é encontrado no comando Curso.obterDetalhes(), nessa linha chama-se o método de uma classe, sendo que só se pode chamar atributos e métodos de objetos.

Na linha seguinte (c2.matricula) temos o segundo erro, pois não tem-se o atributo matrícula no objeto referenciado por c2.

Na Terceira linha (Curso.nome = "Ciência da computação")novamente atribui-se valor a classe Curso

Duas linhas depois (Aluno.obterDetalhes()), chama-se um método da classe Aluno, sendo que só se chama métodos de objetos.

Na ultima linha (a3.cargaHoraria() = 220) é chamado um atributo não existente no objeto referenciado por a3.



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


/////Classe Principal 

public class Principal{
		

	public static void main(String[]args){
		Curso c1;
		Turma t1,t2;
		Disciplinas d1,d2;
		Aluno a1,a2,a3;
	
		c1 = new Curso(1,"Engenharia de Software",240);

		d1 = new Disciplinas(1,"Orientação a Objetos",4,"FGA");//Letra b
		d2 = new Disciplinas(2,"Desenvolvimento Avançado de Software",4,"FGA");

		t1 = new Turma(1,d1,46,46,0,"Quartas e Sextas das 14:00 as 16:00",null);
		t2 = new Turma(1,d2,30,30,0,"Quartas e Sextas das 16:00 as 18:00",null);
	
		t1.curso = c1;//Letra c
		t2.curso = c1;
	
		a1 = new Aluno("Andre",c1,t1, 13, 23, 02, 1983);//Letra d
		a2 = new Aluno("Maria",c1,t1, 5, 27, 5, 1994);
		a3 = new Aluno("Junior",c1,t2, 70, 16, 11, 1995);
	
	}


}

//Classe Turma

public class Turma{

	int codigo;
	Disciplinas d;
	int total;
	int livres;
	int ocupadas;
	String dias_horarios;
	Curso curso;
		
	public Turma(int cod,Disciplinas di,int tot, int liv, int ocu,String dh,Curso cur ) { 
		codigo = cod; 
		d = di;
		total = tot; 
		livres = liv;
		ocupadas = ocu;
		dias_horarios = dh;
		curso = cur;
	}
	
	
	public void matricular(){
		
		if (livres > 0){
			livres = livres - 1;
			ocupadas += 1;
		}
		else
			System.out.println("Não há vagas");
	}

	public String obterDetalhes() { 
		String resposta = ""; 
		resposta += "Codigo da disciplina: " + codigo + '\n'; 
		resposta += "Disciplina: " + d + '\n'; 
		resposta += "Total de Vagas " + total; 
		resposta += "Vagas Ocupadas: " + ocupadas; 
		resposta += "Vagas Livres: " + livres; 
		resposta += "Dias e Horário: " + dias_horarios; 
		resposta += "Curso: " + curso; 
		return resposta;
	}

	protected void finalize() { 
		System.out.println("Esse objeto TURMA vai ser destruido."); 
		System.out.println("Detalhes do objeto: " + '\n'); 
		System.out.println(obterDetalhes()); 
	} 
}

//Classe Disciplina


public class Disciplinas { 
	int codigo; 
	String nomeDisciplina; 
	int cargaHoraria;
	String departamento; 
	
	public Disciplinas (int cod, String nome, int ch, String dep) { 
		codigo = cod; 
		nomeDisciplina = nome; 
		cargaHoraria = ch;
		departamento = dep; 
	}

	public String obterDetalhes() { 
		String resposta = ""; 
		resposta += "Nome da disciplina: " + nomeDisciplina + '\n'; 
		resposta += "Codigo: " + codigo + '\n'; 
		resposta += "Carga horaria: " + cargaHoraria; 
		resposta += "Departamento: " + departamento; 
		return resposta; 
	}

	protected void finalize() { 
		System.out.println("Esse objeto DISCIPLINA vai ser destruido."); 
		System.out.println("Detalhes do objeto: " + '\n'); 
		System.out.println(obterDetalhes()); 
	} 

}

//Classe Curso



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

//Classe Aluno

public class Aluno { 
	String nome;
	Curso curso; 
	Turma turma; 
	int matricula; 
	int diaNascimento, mesNascimento, anoNascimento;

	public Aluno(String nom, Curso cur,Turma tur, int mat, int dNasc, int mNasc, int aNasc) { 
		nome = nom; 
		curso = cur; 
		turma = tur;
		matricula = mat; 
		diaNascimento = dNasc; 
		mesNascimento = mNasc; 
		anoNascimento = aNasc; 
	}

	public String obterDetalhes() { 
		String resposta = ""; resposta += "Nome: " + nome + '\n'; 
		resposta += "Curso: " + curso + '\n'; 
		resposta += "Data de nascimento: " + diaNascimento + '/' + mesNascimento + '/' + anoNascimento; 
		return resposta; 
	}

	public void matricula(){
		turma.matricular ();
	}
	
	
	protected void finalize() { 
		System.out.println("Esse objeto ALUNO vai ser destruido."); 
		System.out.println("Detalhes do objeto: " + '\n'); 
		System.out.println(obterDetalhes()); 
	} 


} 

## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 7 de abril de 2017, 05:12.*





[eckDavid]: http://math.hws.edu/javanotes/
[github]: http://www.github.com/
[instrucoesSubmissao]: ./instrucoes.md
