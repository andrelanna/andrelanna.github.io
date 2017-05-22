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

* Criar a classe principal:
```java

public class Principal {
	public static void main(String[] args) {
		Janela j = new Janela();
	}
}

```

* Criar a Janela:
```java
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Janela extends JFrame{
	JLabel lbVf, lbVa, lbI, lbN;
	JTextField txtVf, txtVa, txtI, txtN;
	JButton btnCalcular, btnLimpar;
	
	public Janela(){
		this.setTitle("Calculadora Financeira");
		this.setSize(300, 400);
		setLayout(new GridLayout(5,2));
	
		lbVf = new JLabel("Valor Futuro: ");
		
		lbVa = new JLabel("Valor Atual: ");
		lbI = new JLabel("Juros: ");
		lbN = new JLabel("Tempo: ");
		
		txtVf = new JTextField("");
		txtVa = new JTextField("");
		txtI = new JTextField("");
		txtN = new JTextField("");
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		add(lbVf);
		add(txtVf);
		add(lbVa);
		add(txtVa);
		add(lbI);
		add(txtI);
		add(lbN);
		add(txtN);
		add(btnCalcular);
		add(btnLimpar);
		
		btnCalcular.addActionListener(new CalcularListener(this));
		btnLimpar.addActionListener(new LimparListener(this));
		
		setVisible(true);
	}
	
}
```

* Criar uma classe para realizar os cálculos
```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CalcularListener implements ActionListener{

	Janela j;
	double vf, va, i, n;
	String sVf, sVa, si, sn;
	
	
	public CalcularListener(Janela ja){
		j = ja;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(j.txtVf.getText().equals("") 
				&& !j.txtVa.getText().equals("") && !j.txtN.getText().equals("") && !j.txtI.getText().equals("")){
			
			va = Double.parseDouble(j.txtVa.getText());
			i = Double.parseDouble(j.txtI.getText())/100;
			n = Double.parseDouble(j.txtN.getText());
			vf = (va * Math.pow((1+i),n));
			String Svf = String.format("%.2f", vf);
			Svf = Svf.replaceAll(",", ".");
			j.txtVf.setText(Svf);
			
		}else if(j.txtVa.getText().equals("") 
					&& !j.txtVf.getText().equals("") && !j.txtN.getText().equals("") && !j.txtI.getText().equals("")){

			vf = Double.parseDouble(j.txtVf.getText());
			i = Double.parseDouble(j.txtI.getText())/100;
			n = Double.parseDouble(j.txtN.getText());
			va = (vf / Math.pow((1+i),n));
			String Sva = String.format("%.2f", va);
			Sva = Sva.replaceAll(",", ".");
			j.txtVa.setText(Sva);
			
		}else if(j.txtN.getText().equals("")
					&& !j.txtVa.getText().equals("") && !j.txtVf.getText().equals("") && !j.txtI.getText().equals("")){

			vf = Double.parseDouble(j.txtVf.getText());
			i = Double.parseDouble(j.txtI.getText())/100;
			va = Double.parseDouble(j.txtVa.getText());
			n = (Math.log(vf/va)/ Math.log(1+i));
			String Sn = String.format("%.0f", n);
			Sn = Sn.replaceAll(",", ".");
			j.txtN.setText(Sn);
			
		}else if(j.txtI.getText().equals("")
					&& !j.txtVa.getText().equals("") && !j.txtN.getText().equals("") && !j.txtVf.getText().equals("")){
			
			vf = Double.parseDouble(j.txtVf.getText());
			n = Double.parseDouble(j.txtN.getText());
			va = Double.parseDouble(j.txtVa.getText());
			i = (Math.pow(vf/va, 1/n)-1)*100;
			String Si = String.format("%.1f", i);
			Si = Si.replaceAll(",", ".");
			j.txtI.setText(Si);
			
		}else{
			JOptionPane.showMessageDialog(null, "Você deve preencher três dentre os campos");
		}
	}

}

```

* Criar um limpador de tela
```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LimparListener implements ActionListener{
	Janela j;
	public LimparListener(Janela ja){
		j = ja;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		j.txtVf.setText("");
		j.txtVa.setText("");
		j.txtN.setText("");
		j.txtI.setText("");
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
