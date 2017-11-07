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

--Lucas Hiroshi Horinouchi/160034591
```

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class main {
	static CalculadoraBasica janela;
	  public static void main(String[] args) {
		    JFrame f = new JFrame("Calculadora Basica");
		    f.setSize(250, 300);
		    f.setLocation(200, 200);
		    CalculadoraBasica flow = new CalculadoraBasica(  );
		    f.setContentPane(flow);
		    f.setVisible(true);
		    
		    f.addWindowListener(
		         new WindowAdapter() {
		            public void windowClosing( WindowEvent e )
		            {
		               System.exit( 0 );
		            }
		         }
		      );
		  }
		  
}



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculadoraBasica extends JPanel {

    private JLabel VF,VA,i,n,l4,l5,l6; 
	private JTextField text1,text2,text3,text4;
	private JButton b1,b2,b3,b4;
	
  public CalculadoraBasica(  ) {
	
	VF = new JLabel( "VF:" );
	VA = new JLabel( "VA:" );
	i = new JLabel( "i:" );
	n = new JLabel( "n:" );
	l4 = new JLabel( "Eventos do Mouse");
	l5 = new JLabel( "Eventos do Mouse");

	text1 = new JTextField(10);
	text2 = new JTextField(10);
	text3 = new JTextField(10);
	text4 = new JTextField(10);
	b1 = new JButton("VF");
    b2 = new JButton("VA");
    b3 = new JButton("i");
    b4 = new JButton("n");
    add(VF);
	add(text1);
	add(VA);
    add(text2);
    add(i);
    add(text3);
    add(n);
    add(text4);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(l4);
    add(l5);
    
    Tratador tratador = new Tratador();
    b1.addMouseListener( tratador );
    b2.addMouseListener( tratador );
    b3.addMouseListener( tratador );
    b4.addMouseListener( tratador );
  }


  
    private class Tratador implements MouseListener {
    	      
      public void mouseClicked( MouseEvent e )
      {
       String s = "";
       String bt = "";
       
       if ( e.getSource() == b1 ){
       	    bt = "Conteudo: " + b1.getText();
       	    double a1 = Double.parseDouble(text3.getText());
       	    a1 = a1 + 1;
       		double n = (Double.parseDouble(text2.getText())*(Math.pow( a1 ,Double.parseDouble(text4.getText()))));
       		s = Double.toString(n);
       		text1.setText(s);
            }
            
         else if ( e.getSource() == b2 ){
        	bt = "Conteudo: " + b2.getText();
     	    double a1 = Double.parseDouble(text3.getText());
     	    a1 = a1 + 1;
     		double n = (Double.parseDouble(text1.getText())/(Math.pow( a1 ,Double.parseDouble(text4.getText()))));
     		s = Double.toString(n);
       		text2.setText(s);
            }
            
         else if ( e.getSource() == b3 ){       	    
            bt = "Conteudo: " + b3.getText();
            double a1 = Double.parseDouble(text3.getText());
     		double n = Math.pow(Double.parseDouble(text1.getText()) /(Double.parseDouble(text2.getText())), 1/a1) -1;
     		s = Double.toString(n);
       		text3.setText(s);
            }
            
         else if ( e.getSource() == b4 ){
            bt = "Conteudo: " + b4.getText();
            double a1 = Double.parseDouble(text3.getText());
     	    a1 = a1 + 1;
     		double n = (((Double.parseDouble(text1.getText())/(Double.parseDouble(text2.getText())*Math.log(a1)))));
     		s = Double.toString(n);
       		text4.setText(s);
            }
      JOptionPane.showMessageDialog( null, bt );      

      };
      
      public void mouseEntered( MouseEvent e )
      {
      	 if ( e.getSource() == b1 )	
       		l4.setText("Entrou                  B1");
            
         else if ( e.getSource() == b2 )
      		l4.setText("Entrou                  B2");
            
         else if ( e.getSource() == b3 )
         	l4.setText("Entrou                  B3");
            
         else if ( e.getSource() == b4 )
         	l4.setText("Entrou                  B4");
      };
      
      public void mouseExited( MouseEvent e )
      {
      	 if ( e.getSource() == b1 )	
       		l4.setText("Saiu                  B1");
            
         else if ( e.getSource() == b2 )
      		l4.setText("Saiu                  B2");
            
         else if ( e.getSource() == b3 )
         	l4.setText("Saiu                  B3");
            
         else if ( e.getSource() == b4 )
         	l4.setText("Saiu                  B4");
      };
      
      public void mousePressed( MouseEvent e )
      {
      	 if ( e.getSource() == b1 )	
       		l5.setText("Pressionou      B1");
            
         else if ( e.getSource() == b2 )
      		l5.setText("Pressionou      B2");
            
         else if ( e.getSource() == b3 )
         	l5.setText("Pressionou      B3");
            
         else if ( e.getSource() == b4 )
         	l5.setText("Pressionou      B4");
     };
      
      public void mouseReleased( MouseEvent e )
      {
      	 if ( e.getSource() == b1 )	
       		l5.setText("Largou                  B1");
            
         else if ( e.getSource() == b2 )
      		l5.setText("Largou                  B2");
            
         else if ( e.getSource() == b3 )
         	l5.setText("Largou                  B3");
            
         else if ( e.getSource() == b4 )
         	l5.setText("Largou                  B4");
      };
   }
}



```


**Exercício 2:** Crie uma interface gráfica para cálculo dos valores obtidos ao final de cada mês para uma aplicação mensal de umdeterminado valoor e uma determinada taxa de juros. O cálculo do valor obtido ao final é dado pela seguinte fórmula: 

\\[S_{n}=(1+j) \times \frac{(1+j)^{n}-1}{j} \times p\\]


onde: 

* $$S_{n}$$ é o valor obtido ao final, 
* $$j$$ é a taxa de juros mensal, 
* $$p$$ é o valor de depósito regular e 
* $$n$$ é o número de meses.


Os valores finais de cada mês deverão ser informados através de objetos JLabel. 
