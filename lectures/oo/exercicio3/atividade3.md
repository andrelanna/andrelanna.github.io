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
