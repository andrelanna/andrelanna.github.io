---
title: Atividade 2 - Interfaces gráficas em Java Swing
layout: default
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
------

Atividade extra-classe **individual** em substituição à aula de 19/05/2017.  
**Data de entrega:** 22/05/2017, 23:59:59.  
Entrega via GitHub.  
WindowBuilder **não** deve ser utilizado. 


**Exercício 1:** Crie uma interface gráfica para cálculo de valores presente, futuro, juros e taxa de juros de acordo com a seguinte fórmula: 
$$V_{F} = V_{A} \times (1 + i)^{n}$$, em que 
* $$V_{F}$$ representa o valor futuro de uma aplicação,
* $$V_{A}$$ representa o valor atual (no momento) da aplicação, 
* $$i$$ é a taxa de juros e 
* $$n$$ é o tempo da aplicação, em meses.

O usuário deverá entrar com 3 valores, em campos de texto. O quarto valor deverá ter seu campo de texto vazio e será calculado pela aplicação conforme a fórmula acima. Veja os exemplos na tabela abaixo, em que os valores em negrito representam a resposta da fórmula:

|$$V_{F}$$    |$$V_{A}$$    |$$i$$     |$$n$$     |
|:-----------:|:-----------:|:--------:|:--------:|
|**R$1100,34**|R$1000,00    |0.80      |12        |
|R$2000,00    |**R$1817,62**|0.80      |12        |
|R$2000,00    |  R$1000,00  |**5,95**  |12        |
|R$2000,00    |  R$1000,00  |0.80      |**87**    |

///Resposta

//Código Principal



public class Exercício3_e1 {



    public static void main(String[] args) {

        

        Janela j= new Janela();

        

    }

    

}





//Classe Janela



import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;



public class Janela extends JFrame{

    JLabel lblVF,lblVP, lblIjuros,lblNtempo;

    JTextField txtVF1, txtVP1, txtIjuros1, txtNtempo1, txtVF2, txtVP2, txtIjuros2, txtNtempo2, txtVF3, txtVP3, txtIjuros3, txtNtempo3, txtVF4, txtVP4, txtIjuros4, txtNtempo4;

    JButton btnCalcular, btnLimpar;

    

    public Janela(){

    

        setTitle("Juros Compostoo");

        setSize(500,400);

        

        setLayout (new GridLayout(6,4));

        

        ////Configurando os Lables:

        lblVF= new JLabel("Valor Futuro (R$)");

        lblVP= new JLabel("Valor Presente (R$)");

        lblIjuros= new JLabel ("Juros (%)");

        lblNtempo= new JLabel("Tempo (MÊS)");

        

        

        txtVF1= new JTextField();

        txtVP1= new JTextField();

        txtIjuros1= new JTextField();

        txtNtempo1= new JTextField();

        

        txtVF2= new JTextField();

        txtVP2= new JTextField();

        txtIjuros2= new JTextField();

        txtNtempo2= new JTextField();

        

        txtVF3= new JTextField();

        txtVP3= new JTextField();

        txtIjuros3= new JTextField();

        txtNtempo3= new JTextField();

        

        txtVF4= new JTextField();

        txtVP4= new JTextField();

        txtIjuros4= new JTextField();

        txtNtempo4= new JTextField();

        

        btnCalcular= new JButton("Calcular");

        //btnLimpar= new JButton();

        

        

        ////Adicionando as camadas na interface

        add(lblVF);

        add(lblVP);

        add(lblIjuros);

        add(lblNtempo);

        

        add(txtVF1);

        add(txtVP1);

        add(txtIjuros1);

        add(txtNtempo1);

        

        add(txtVF2);

        add(txtVP2);

        add(txtIjuros2);

        add(txtNtempo2);

        

        add(txtVF3);

        add(txtVP3);

        add(txtIjuros3);

        add(txtNtempo3);

        

        add(txtVF4);

        add(txtVP4);

        add(txtIjuros4);

        add(txtNtempo4);

        

        add(btnCalcular);

        //add(btnLimpar);

      

        

        setVisible(true);

        

        //////Adicionado ActionListener

        btnCalcular.addActionListener(new CalcularListener0(this));



    }

    

    

}





//Action Listener



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;





public class CalcularListener0 implements ActionListener {



    Janela J;

    

    public CalcularListener0(Janela janela) {

        J=janela;

    }



    @Override

    public void actionPerformed(ActionEvent e) {

        

        //add(txtVF1);

        //add(txtVP1);

        //add(txtIjuros1);

        //add(txtNtempo1);

        

        //add(txtVF2);

        //add(txtVP2);

        //add(txtIjuros2);

        //add(txtNtempo2);

        

        //add(txtVF3);

        //add(txtVP3);

        //add(txtIjuros3);

        //add(txtNtempo3);

        

        float VP ;//= Float.parseFloat(j.t2.getText());

        float Ijuros ;//= Float.parseFloat(j.t3.getText());

        int ntmp   ; //  =Integer.parseInt(j.t4.getText());

        float VF;

        

        if(J.txtVF1.getText().equals(""))

            {

                VP = Float.parseFloat(J.txtVP1.getText());

                Ijuros = Float.parseFloat(J.txtIjuros1.getText());

                ntmp = Integer.parseInt(J.txtNtempo1.getText());

                VF = (float)(VP*(Math.pow((1+(Ijuros/100)),ntmp)));

                J.txtVF1.setText(Float.toString(VF));

            }

        

        if(J.txtVP2.getText().equals(""))

            { 

                VF = Float.parseFloat(J.txtVF2.getText());

		Ijuros = Float.parseFloat(J.txtIjuros2.getText());

                ntmp = Integer.parseInt(J.txtNtempo2.getText());

		VP = (float)(VF/(Math.pow((1+(Ijuros/100)),ntmp)));

		J.txtVP2.setText(Float.toString(VP));

            }

        

        if(J.txtIjuros3.getText().equals(""))

            {



		VF = Float.parseFloat(J.txtVF3.getText());

		VP = Float.parseFloat(J.txtVP3.getText());

		ntmp = Integer.parseInt(J.txtNtempo3.getText());

        	Ijuros = (float)Math.pow(12,(ntmp)) ;

		J.txtIjuros3.setText(Float.toString(Ijuros));



            }

        

        if(J.txtNtempo4.getText().equals(""))

            {

		VF = Float.parseFloat(J.txtVF4.getText());

		VP = Float.parseFloat(J.txtVP4.getText());

		Ijuros = Float.parseFloat(J.txtIjuros4.getText());

		ntmp = (int)((1)*(Math.floor((Math.log(VF/VP)/Math.log(1+(Ijuros/100))))));

		J.txtNtempo4.setText(Float.toString(ntmp));



		}

        

    }

    

}







**Exercício 2:** Crie uma interface gráfica para cálculo dos valores obtidos ao final de cada mês para uma aplicação mensal de umdeterminado valoor e uma determinada taxa de juros. O cálculo do valor obtido ao final é dado pela seguinte fórmula: 

\\[S_{n}=(1+j) \times \frac{(1+j)^{n}-1}{j} \times p\\]


onde: 

* $$S_{n}$$ é o valor obtido ao final, 
* $$j$$ é a taxa de juros mensal, 
* $$p$$ é o valor de depósito regular e 
* $$n$$ é o número de meses.


Os valores finais de cada mês deverão ser informados através de objetos JLabel. 


// Resposta


//Código Principal



public class Exercício3_e2 {



    

    public static void main(String[] args) {

        

        Janela j= new Janela();

    }

    

}





//Classe Janela



import java.awt.GridLayout;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;





public class Janela extends JFrame{

    

    JLabel lblApf,lblApa, lbljuros, lbltmp;

    JLabel lblm1,lblm2,lblm3,lblm4,lblm5,lblm6,lblm7,lblm8,lblm9,lblm10,lblm11,lblm12; 

    

    JTextField txtApf,txtApa, txtjuros, txttmp;

    JTextField txtm1,txtm2,txtm3,txtm4,txtm5,txtm6,txtm7,txtm8,txtm9,txtm10,txtm11,txtm12; 

    

    public Janela(){

        

        setTitle("Juros Compostoo");

        setSize(550,200);

        

        setLayout (new GridLayout(8,4));

        

         ////Configurando os Lables:

        lblApf= new JLabel("Aplicação final (R$)");

        lblApa= new JLabel("Aplicação Regular (R$)");

        lbljuros= new JLabel ("Juros mensal");

        lbltmp= new JLabel("Tempo (MÊS)");

        

        lblm1= new JLabel("Mes 1=");

        lblm2= new JLabel("Mes 2=");

        lblm3= new JLabel("Mes 3=");

        lblm4= new JLabel("Mes 4=");

        lblm5= new JLabel("Mes 5=");

        lblm6= new JLabel("Mes 6=");

        lblm7= new JLabel("Mes 7=");

        lblm8= new JLabel("Mes 8=");

        lblm9= new JLabel("Mes 9=");

        lblm10= new JLabel("Mes 10=");

        lblm11= new JLabel("Mes 11=");

        lblm12= new JLabel("Mes 12=");

        

        

        txtApf= new JTextField();

        txtApa= new JTextField();

        txtjuros= new JTextField();

        txttmp= new JTextField();

        

        txtm1= new JTextField();

        txtm2= new JTextField();

        txtm3= new JTextField();

        txtm4= new JTextField();

        txtm5= new JTextField();

        txtm6= new JTextField();

        txtm7= new JTextField();

        txtm8= new JTextField();

        txtm9= new JTextField();

        txtm10= new JTextField();

        txtm11= new JTextField();

        txtm12= new JTextField();

        

        

        

        ////Adicionando as camadas na interface

        add(lblApf);

        add(lblApa);

        add(lbljuros);

        add(lbltmp);

        

        add(txtApf);

        add(txtApa);

        add(txtjuros);

        add(txttmp);

        

        add(lblm1);

        add(txtm1);

        add(lblm2);

        add(txtm2);

        

        add(lblm3);

        add(txtm3);

        add(lblm4);

        add(txtm4);

        

        add(lblm5);

        add(txtm5);

        add(lblm6);

        add(txtm6);

        

        add(lblm7);

        add(txtm7);

        add(lblm8);

        add(txtm8);

        

        add(lblm9);

        add(txtm9);

        add(lblm10);

        add(txtm10);

        

        add(lblm11);

        add(txtm11);

        add(lblm12);

        add(txtm12);

        

        setVisible(true);

        

        

        txttmp.addActionListener(new CalcularListener(this));

        

    }



    

}





//ActionListener



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class CalcularListener implements ActionListener {



    Janela J;

    

    public CalcularListener(Janela janela) {

        J=janela;

    }



    @Override

    public void actionPerformed(ActionEvent e) {

        

        float VP= Float.parseFloat(J.txtApa.getText());

        float i= (Float.parseFloat(J.txtjuros.getText()))/100;

        int n= Integer.parseInt(J.txttmp.getText());

        //float resultado= (float)(Math.pow((1+(i)), n)-1);

        //J.txtApf.setText( Float.toString(VP*(1+(i))/resultado));

        //float res= VP*(1+(i))/resultado;

        

        

        

        //int j=1;

        

        

       

        

        if(n<=1){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

            //j=2;

        }

        else if(n<=2){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            //j+=1;

        }

        else if(n<=3){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            //j+=1;

        }

        else if(n<=4){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4+1)-1)/i -1;

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            //j+=1;

        }

        else if(n<=5){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4+1)-1)/i -1;

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            

            float resultado5= (float)(Math.pow((1+(i)), 5+1)-1)/i -1;

            float res5= VP*resultado5;

            

            J.txtm5.setText(Float.toString (res5));

            //j+=1;

        }

        else if(n<=6){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4+1)-1)/i -1;

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            

            float resultado5= (float)(Math.pow((1+(i)), 5+1)-1)/i -1;

            float res5= VP*resultado5;

            

            J.txtm5.setText(Float.toString (res5));

        

            float resultado6= (float)(Math.pow((1+(i)), 6+1)-1)/i -1;

            float res6= VP*resultado6;

            

            J.txtm6.setText(Float.toString (res6));

            //j+=1;

        }

        else if(n<=7){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4+1)-1)/i -1;

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            

            float resultado5= (float)(Math.pow((1+(i)), 5+1)-1)/i -1;

            float res5= VP*resultado5;

            

            J.txtm5.setText(Float.toString (res5));

        

            float resultado6= (float)(Math.pow((1+(i)), 6+1)-1)/i -1;

            float res6= VP*resultado6;

            

            J.txtm6.setText(Float.toString (res6));

        

            float resultado7= (float)(Math.pow((1+(i)), 7+1)-1)/i -1;

            float res7= VP*resultado7;

            

            J.txtm7.setText(Float.toString(res7));

            //j+=1;

        }

        else if(n<=8){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4+1)-1)/i -1;

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            

            float resultado5= (float)(Math.pow((1+(i)), 5+1)-1)/i -1;

            float res5= VP*resultado5;

            

            J.txtm5.setText(Float.toString (res5));

        

            float resultado6= (float)(Math.pow((1+(i)), 6+1)-1)/i -1;

            float res6= VP*resultado6;

            

            J.txtm6.setText(Float.toString (res6));

        

            float resultado7= (float)(Math.pow((1+(i)), 7+1)-1)/i -1;

            float res7= VP*resultado7;

            

            J.txtm7.setText(Float.toString(res7));

        

            float resultado8= (float)(Math.pow((1+(i)), 8+1)-1)/i -1;

            float res8= VP*resultado8;

            

            J.txtm8.setText(Float.toString (res8));

            //j+=1;

        }

        else if(n<=9){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4+1)-1)/i -1;

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            

            float resultado5= (float)(Math.pow((1+(i)), 5+1)-1)/i -1;

            float res5= VP*resultado5;

            

            J.txtm5.setText(Float.toString (res5));

        

            float resultado6= (float)(Math.pow((1+(i)), 6+1)-1)/i -1;

            float res6= VP*resultado6;

            

            J.txtm6.setText(Float.toString (res6));

        

            float resultado7= (float)(Math.pow((1+(i)), 7+1)-1)/i -1;

            float res7= VP*resultado7;

            

            J.txtm7.setText(Float.toString(res7));

        

            float resultado8= (float)(Math.pow((1+(i)), 8+1)-1)/i -1;

            float res8= VP*resultado8;

            

            J.txtm8.setText(Float.toString (res8));

        

            float resultado9= (float)(Math.pow((1+(i)), 9+1)-1)/i -1;

            float res9= VP*resultado9;

            

            J.txtm9.setText(Float.toString (res9));

            //j+=1;

        }

        else if(n<=10){

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4+1)-1)/i -1;

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            

            float resultado5= (float)(Math.pow((1+(i)), 5+1)-1)/i -1;

            float res5= VP*resultado5;

            

            J.txtm5.setText(Float.toString (res5));

        

            float resultado6= (float)(Math.pow((1+(i)), 6+1)-1)/i -1;

            float res6= VP*resultado6;

            

            J.txtm6.setText(Float.toString (res6));

        

            float resultado7= (float)(Math.pow((1+(i)), 7+1)-1)/i -1;

            float res7= VP*resultado7;

            

            J.txtm7.setText(Float.toString(res7));

        

            float resultado8= (float)(Math.pow((1+(i)), 8+1)-1)/i -1;

            float res8= VP*resultado8;

            

            J.txtm8.setText(Float.toString (res8));

        

            float resultado9= (float)(Math.pow((1+(i)), 9+1)-1)/i -1;

            float res9= VP*resultado9;

            

            J.txtm9.setText(Float.toString (res9));

        

            float resultado10= (float)(Math.pow((1+(i)), 10+1)-1)/i -1;

            float res10= VP*resultado10;

            

            J.txtm10.setText(Float.toString (res10));

            //j+=1;

        }

        else if (n<=11) {

            float resultado1= (float)(Math.pow((1+(i)), 1+1)-1)/i -1;

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2+1)-1)/i -1;

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3+1)-1)/i -1;

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4+1)-1)/i -1;

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            

            float resultado5= (float)(Math.pow((1+(i)), 5+1)-1)/i -1;

            float res5= VP*resultado5;

            

            J.txtm5.setText(Float.toString (res5));

        

            float resultado6= (float)(Math.pow((1+(i)), 6+1)-1)/i -1;

            float res6= VP*resultado6;

            

            J.txtm6.setText(Float.toString (res6));

        

            float resultado7= (float)(Math.pow((1+(i)), 7+1)-1)/i -1;

            float res7= VP*resultado7;

            

            J.txtm7.setText(Float.toString(res7));

        

            float resultado8= (float)(Math.pow((1+(i)), 8+1)-1)/i -1;

            float res8= VP*resultado8;

            

            J.txtm8.setText(Float.toString (res8));

        

            float resultado9= (float)(Math.pow((1+(i)), 9+1)-1)/i -1;

            float res9= VP*resultado9;

            

            J.txtm9.setText(Float.toString (res9));

        

            float resultado10= (float)(Math.pow((1+(i)), 10+1)-1)/i -1;

            float res10= VP*resultado10;

            

            J.txtm10.setText(Float.toString (res10));

        

            float resultado11= (float)(Math.pow((1+(i)), 11+1)-1)/i -1;

            float res11= VP*resultado11;

            

            J.txtm11.setText(Float.toString (res11));

            //j+=1;

        }

        else{

             float resultado1= (float)(Math.pow((1+(i)), 1)-1);

            float res1= VP*resultado1;

            

            J.txtm1.setText(Float.toString (res1));

        

            float resultado2= (float)(Math.pow((1+(i)), 2)-1);

            float res2= VP*resultado2;

            

            J.txtm2.setText(Float.toString(res2));

            

            float resultado3= (float)(Math.pow((1+(i)), 3)-1);

            float res3= VP*resultado3;

            

            J.txtm3.setText(Float.toString(res3));

            

            float resultado4= (float)(Math.pow((1+(i)), 4)-1);

            float res4= VP*resultado4;

            

            J.txtm4.setText(Float.toString(res4));

            

            float resultado5= (float)(Math.pow((1+(i)), 5)-1);

            float res5= VP*resultado5;

            

            J.txtm5.setText(Float.toString (res5));

        

            float resultado6= (float)(Math.pow((1+(i)), 6)-1);

            float res6= VP*resultado6;

            

            J.txtm6.setText(Float.toString (res6));

        

            float resultado7= (float)(Math.pow((1+(i)), 7)-1);

            float res7= VP*resultado7;

            

            J.txtm7.setText(Float.toString(res7));

        

            float resultado8= (float)(Math.pow((1+(i)), 8)-1);

            float res8= VP*resultado8;

            

            J.txtm8.setText(Float.toString (res8));

        

            float resultado9= (float)(Math.pow((1+(i)), 9)-1);

            float res9= VP*resultado9;

            

            J.txtm9.setText(Float.toString (res9));

        

            float resultado10= (float)(Math.pow((1+(i)), 10)-1);

            float res10= VP*resultado10;

            

            J.txtm10.setText(Float.toString (res10));

        

            float resultado11= (float)(Math.pow((1+(i)), 11)-1);

            float res11= VP*resultado11;

            

            J.txtm11.setText(Float.toString (res11));

        

            float resultado12= (float)(Math.pow((1+(i)), 12)-1);

            float res12= VP*resultado12;

            

            J.txtm12.setText(Float.toString(res12));

            

        }

    

    }

    

}
