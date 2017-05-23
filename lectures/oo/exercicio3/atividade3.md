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


REPOSTA:

public class Principal {
	
	public static void main (String[] args) {
		JanelaEx1 j = new JanelaEx1();
	}

}


import javax.swing.*;
import java.awt.*;

public class JanelaEx1 extends JFrame {
	JLabel 	lblVF,
			lblVA,
			lbli,
			lbln;
	
	JTextField 	txtVF,
				txtVA,
				txti,
				txtn;
	
	JButton btnCalcular,
			btnLimpar;
	
	
	public JanelaEx1() {
		this.setTitle("Janela Principal - Exercício 1");
		this.setSize(450,150);
		setLayout(new GridLayout(3, 4));
		
		lblVF = new JLabel("VF");
		lblVA = new JLabel("VA");
		lbli = new JLabel("i");
		lbln = new JLabel("n");
		
		txtVF = new JTextField();
		txtVA = new JTextField();
		txti = new JTextField();
		txtn = new JTextField();
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		add(lblVF);
		add(lblVA);
		add(lbli);
		add(lbln);
		add(txtVF);
		add(txtVA);
		add(txti);
		add(txtn);
		add(btnCalcular);
		add(btnLimpar);
		
		btnCalcular.addActionListener(new CalcularListener(this));
		btnLimpar.addActionListener(new LimparListener(this));
		
		
		setVisible(true);
	}


}


import java.awt.event.*;

public class CalcularListener implements ActionListener {
	
	JanelaEx1 j;
	
	public CalcularListener(JanelaEx1 janela) {
		j = janela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		float vf, va, i;
		int n;
		
		if(j.txtVF.getText() == null || j.txtVF.getText().trim().equals("")) {
			
			va = Float.parseFloat(j.txtVA.getText());
			i = Float.parseFloat(j.txti.getText());
			n = Integer.parseInt(j.txtn.getText());
			
			i = (float)((i/100.0) + 1.0);
			
			vf = (float) (va * (Math.pow(i, n)));
			
			j.txtVF.setText(Float.toString(vf));
			
		}
		
		else if(j.txtVA.getText() == null || j.txtVA.getText().trim().equals("")) {
			
			vf = Float.parseFloat(j.txtVF.getText());
			i = Float.parseFloat(j.txti.getText());
			n = Integer.parseInt(j.txtn.getText());
			
			i = (float)((i/100.0) + 1.0);
			
			va = (float) (vf / (Math.pow(i, n)));
			
			j.txtVA.setText(Float.toString(va));
		}
		
		
		else if(j.txti.getText() == null || j.txti.getText().trim().equals("")) {
			
			vf = Float.parseFloat(j.txtVF.getText());
			va = Float.parseFloat(j.txtVA.getText());
			n = Integer.parseInt(j.txtn.getText());
			
			float a = (float) ((1.0) / (n));
			float b = vf/va;
			
			i = (float) (((Math.pow(b, a)) - 1) * 100);
			
			j.txti.setText(Float.toString(i));
			
		}
		
		else if(j.txtn.getText() == null || j.txtn.getText().trim().equals("")) {
			vf = Float.parseFloat(j.txtVF.getText());
			va = Float.parseFloat(j.txtVA.getText());
			i = Float.parseFloat(j.txti.getText());
			
			i = (float)((i/100.0) + 1.0);
			
			n = (int) ((Math.log10(vf/va))/(Math.log10(i)));
			
			j.txtn.setText(Integer.toString(n));
		
		}

		
	}

}


import java.awt.event.*;

public class LimparListener implements ActionListener{
	
	JanelaEx1 j;
	
	public LimparListener(JanelaEx1 janela) {
		j = janela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		j.txtVF.setText(null);
		j.txtVA.setText(null);
		j.txti.setText(null);
		j.txtn.setText(null);
	
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
