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

**Resposta 1**
Principal.java
{% highlight java %}
public class Pricipal {

	public static void main(String[] args) {
		Janela j = new Janela();
	}

}

{% endhighlight%}

Janela.java
{% highlight java %}
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Janela extends JFrame{
	JLabel lblVf;
	JLabel lblVa;
	JLabel lblI;
	JLabel lblN;
	JTextField txtVf;
	JTextField txtVa;
	JTextField txtI;
	JTextField txtN;
	JButton btnCalcular;
	JButton btnLimpar;
	
	public Janela(){
		JFrame janela = new JFrame();
		setTitle("Calculadora Financeira");
		setSize(400, 300);
		setLayout(new GridLayout(5,2));
		
		
		lblVf = new JLabel("Valor Futuro(R$): ");
		lblVa = new JLabel("Valor Aplicado(R$): ");
		lblI = new JLabel("Taxa de Juros(%): ");
		lblN = new JLabel("Tempo: ");
		
		txtVf = new JTextField();
		txtVa = new JTextField();
		txtI = new JTextField();
		txtN = new JTextField();
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		btnCalcular.addActionListener(new CalcularListener(this));
		btnLimpar.addActionListener(new LimparListener(this));

		
		add(lblVa);
		add(txtVa);
		add(lblI);
		add(txtI);
		add(lblVf);
		add(txtVf);
		add(lblN);
		add(txtN);
		add(btnCalcular);
		add(btnLimpar);
		setVisible(true);
	}
}

{% endhighlight%}

CalcularListener.java
{% highlight java %}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;


public class CalcularListener implements ActionListener {

	Janela j;
	public CalcularListener(Janela janela) {
		j = janela;
	}
	public void actionPerformed(ActionEvent arg0) {
		
		String sVf = j.txtVf.getText();
		String sVa = j.txtVa.getText();
		String sI = j.txtI.getText();
		String sN = j.txtN.getText();

		if(sVf.equals("") ){
			float Va = Float.parseFloat(sVa);
			float I = Float.parseFloat(sI)/100;
			float N = Float.parseFloat(sN);
			float Vf;
			
			Vf = (float) (Va*(Math.pow((1+I), N)));
			
			j.txtVf.setText(Float.toString(Vf));
			System.out.println(Float.toString(Vf));
			System.out.println(Float.toString(Va));
			System.out.println(Float.toString(N));
			System.out.println(Float.toString(I));
			System.out.println(Float.toString((float) Math.pow((1+I),N)));
			
		}else if(sVa.equals("")){
			float Vf = Float.parseFloat(sVf);
			float I = Float.parseFloat(sI)/100;
			float N = Float.parseFloat(sN);
			float Va;
			
			Va = (float) (Vf/(Math.pow((1+I), N)));
			
			j.txtVa.setText(Float.toString(Va));
			
			
		}else if(sI.equals("")){
			float Va = Float.parseFloat(sVa);
			float Vf = Float.parseFloat(sVf);
			float N = Float.parseFloat(sN);
			float I;
			
			 
			I = (float)(Math.pow(Vf/Va, 1/N))-1;
			
			j.txtI.setText(Float.toString(I*100));
			
			
		}else if(sN.equals("")){
			float Va = Float.parseFloat(sVa);
			float Vf = Float.parseFloat(sVf);
			float I = Float.parseFloat(sI)/100;
			float N;
			
			 
			N = (float)(((Math.log10(Vf/Va)))/(Math.log10(1+I)));
			
			j.txtN.setText(Float.toString(N));
			
			
		}

	}

}
{% endhighlight%}

LimparListener.java
{% highlight java %}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LimparListener implements ActionListener {
	Janela j;
	public LimparListener(Janela janela) {
		j = janela;
	}

	public void actionPerformed(ActionEvent arg0) {
		
		j.txtVa.setText("");
		j.txtVf.setText("");
		j.txtI.setText("");
		j.txtN.setText("");
	}

}
{% endhighlight%}

**Exercício 2:** Crie uma interface gráfica para cálculo dos valores obtidos ao final de cada mês para uma aplicação mensal de umdeterminado valoor e uma determinada taxa de juros. O cálculo do valor obtido ao final é dado pela seguinte fórmula: 

\\[S_{n}=(1+j) \times \frac{(1+j)^{n}-1}{j} \times p\\]


onde: 

* $$S_{n}$$ é o valor obtido ao final, 
* $$j$$ é a taxa de juros mensal, 
* $$p$$ é o valor de depósito regular e 
* $$n$$ é o número de meses.


Os valores finais de cada mês deverão ser informados através de objetos JLabel. 

**Resposta 2**
Principal.java
{% highlight java %}
public class Pricipal {

	public static void main(String[] args) {
		Janela j = new Janela();
	}

}

{% endhighlight%}

Janela.java
{% highlight java %}
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Janela extends JFrame{
	JLabel lblSn;
	JLabel lblJ;
	JLabel lblP;
	JLabel lblN;
	JLabel lblTotSn;
	JLabel lblresults;
	JTextField txtJ;
	JTextField txtP;
	JTextField txtN;
	JButton btnCalcular;
	JButton btnLimpar;
	GridLayout layout;
	
	public Janela(){
		JFrame janela = new JFrame();
		setTitle("Calculadora Financeira");
		setSize(400, 300);
		layout = new GridLayout(5,0,10,10);
		setLayout(layout);
		
		
		
		lblSn = new JLabel("Total Final(R$): ");
		lblJ = new JLabel("Taxa de Juros(%): ");
		lblP = new JLabel("Valor de Deposito(R$): ");
		lblN = new JLabel("Nº de meses: ");
		lblTotSn = new JLabel();
		
		txtJ = new JTextField();
		txtP = new JTextField();
		txtN = new JTextField();

		
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		btnCalcular.addActionListener(new CalcularListener(this));
		btnLimpar.addActionListener(new LimparListener(this));

		
		add(lblP);
		add(txtP);
		add(lblJ);
		add(txtJ);
		add(lblN);
		add(txtN);
		add(lblSn);
		add(lblTotSn);
		add(btnCalcular);
		add(btnLimpar);
		
		setVisible(true);
	}
}
{% endhighlight%}

CalcularListener.java
{% highlight java %}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;


public class CalcularListener implements ActionListener {
	Janela j;
	public CalcularListener(Janela janela) {
		j = janela;
	}

	public void actionPerformed(ActionEvent arg0) {
		float taxa = Float.parseFloat(j.txtJ.getText())/100;
		float mensal = Float.parseFloat(j.txtP.getText());
		int n = Integer.parseInt(j.txtN.getText());
		float sn=0;

		
		for(int i=0;i<=n;i++){
			sn = (float) ((1+taxa)*(((Math.pow(1+taxa, i))-1)/taxa)*mensal);
			j.add(new JLabel(Integer.toString(i)+" : R$"+Float.toString(sn)+" \n"));
			j.add(new JLabel());
			j.layout.setRows(j.layout.getRows()+1);
			j.setSize(j.getWidth(), j.getHeight()+20);
		}
		j.lblTotSn.setText("R$ "+Float.toString(sn));
		
	}

}

{% endhighlight%}

LimparListener.java
{% highlight java %}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LimparListener implements ActionListener {
	Janela j,J;
	public LimparListener(Janela janela) {
		j = janela;
	}

	public void actionPerformed(ActionEvent arg0) {
		J = j;
		J.dispose();
		j = new Janela();
	}

}
{% endhighlight%}

