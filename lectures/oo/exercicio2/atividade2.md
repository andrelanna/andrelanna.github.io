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


**Questão 8:**


**Questão 9:**


**Questão 10:**


## Referências:
\[[OPEN ACCESS][eckDavid]\] Eck, David J. Introduction to Programming Using Java, 6th ed. 2011



---
*Última modificação: 3 de abril de 2017, 22:52.*





[eckDavid]: http://math.hws.edu/javanotes/
