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




**Exercício 2:** Crie uma interface gráfica para cálculo dos valores obtidos ao final de cada mês para uma aplicação mensal de umdeterminado valoor e uma determinada taxa de juros. O cálculo do valor obtido ao final é dado pela seguinte fórmula: 

\\[S_{n}=(1+j) \times \frac{(1+j)^{n}-1}{j} \times p\\]


onde: 

* $$S_{n}$$ é o valor obtido ao final, 
* $$j$$ é a taxa de juros mensal, 
* $$p$$ é o valor de depósito regular e 
* $$n$$ é o número de meses.


Os valores finais de cada mês deverão ser informados através de objetos JLabel. 

* Criar uma classe Principal:

```java
public class Principal2{

	public static void main(String[] args) {
		Janela2 j = new Janela2();
	}

}
```

* Criar a janela:

```java
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Janela2 extends JFrame{
	JLabel lbP, lbJ, lbN, lbSn;
	JTextField txtP, txtJ, txtN;
	JButton btnCalcular, btnLimpar;
	JScrollPane scroll = new JScrollPane(lbSn, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	public Janela2(){
		this.setTitle("Calculadora Financeira");
		this.setSize(300, 500);
		setLayout(new GridLayout(9, 1));

		lbP = new JLabel("Depósito: ");
		lbJ = new JLabel("Juros: ");
		lbN = new JLabel("Tempo: ");
		lbSn = new JLabel("");
				
		txtP = new JTextField("");
		txtJ = new JTextField("");
		txtN = new JTextField("");
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		lbSn.setAutoscrolls(true);
		
		add(lbP);
		add(txtP);
		add(lbJ);
		add(txtJ);
		add(lbN);
		add(txtN);
		scroll.setViewportView(lbSn);
		add(scroll);
		add(btnCalcular);
		add(btnLimpar);
		
		btnCalcular.addActionListener(new CalcularListener(this));
		btnLimpar.addActionListener(new LimparListener(this));
		
		setVisible(true);
	}
}

```


* Criar a classe que irá realizar os cálculos:

```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularListener implements ActionListener{
	
	Janela2 j2;
	
	double p, j, sn;
	
	int n;
	
	String fSn;
	
	public CalcularListener(Janela2 ja) {
		j2 = ja;
		fSn = "<html><body>"; //html incorporado somente para realizar a quebra de linha
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		p = Double.parseDouble(j2.txtP.getText());
		j = Double.parseDouble(j2.txtJ.getText())/100;
		n = Integer.parseInt(j2.txtN.getText());
		fSn = "<html><body>";
		for(int i = 1; i<=n; i++){
			sn = ((1+j) * ((Math.pow((1+j), i)-1))/j)*p;
			fSn += String.format("Mês: %d - R$ %.2f <br>", i, sn);
			j2.lbSn.setText(fSn);
		}
		
	}

}

```

* Criar a classe que irá limpar os dados:

```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparListener implements ActionListener{
	
	Janela2 j;
	
	public LimparListener(Janela2 ja){
		j = ja;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		j.lbSn.setText("");
		j.txtP.setText("");
		j.txtN.setText("");
		j.txtJ.setText("");
		
	}

}

```
