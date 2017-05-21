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

Resposta:

principal.java
```java
public class pricipal {
	static menu janela;
	
	public static void main(String[] args) {
		janela = new menu();

	}

}
```

menu.java
```java
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
	
public class menu extends JFrame{
	
	JLabel lblVFuturo; 
	JLabel lblVAtual;
	JLabel lblTaxa;
	JLabel lblTempo;
	JTextField txtVFuturo;
	JTextField txtVAtual;
	JTextField txtTaxa;
	JTextField txtTempo;
	JButton bntCalcular;
	JButton bntLimpar;
	
	public menu(){
		setTitle("Cálculo Valor Futuro");
		setSize(400,200);
		
		setLayout(new GridLayout(5, 2));
		
		lblVFuturo = new JLabel("Valor Futuro:");
		lblVAtual = new JLabel("Valor Atual:");
		lblTaxa = new JLabel("Taxa: (%)");
		lblTempo = new JLabel("Tempo: (em meses)");
		
		txtVFuturo = new JTextField();
		txtVAtual = new JTextField();
		txtTaxa = new JTextField();
		txtTempo = new JTextField();
		
		bntCalcular = new JButton("Calcular");
		bntLimpar = new JButton("Limpar");
		
		bntCalcular.addActionListener(new CalcularListener(this));
		bntLimpar.addActionListener(new LimparListener(this));
		
		add(lblVFuturo);
		add(txtVFuturo);
		add(lblVAtual);
		add(txtVAtual);
		add(lblTaxa);
		add(txtTaxa);
		add(lblTempo);
		add(txtTempo);		
		add(bntCalcular);
		add(bntLimpar);
		
		setVisible(true);
	}
}
```
CalcularListener.java
```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularListener implements ActionListener {

	menu m;
	
	public CalcularListener(menu menu) {
		m = menu;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (m.txtVFuturo.getText().isEmpty()) {
			float VAtual = Float.parseFloat(m.txtVAtual.getText());
			float Taxa = Float.parseFloat(m.txtTaxa.getText());
			float Tempo = Float.parseFloat(m.txtTempo.getText());
			float Resultado;
      
			Resultado = (float) (VAtual * Math.pow(1+Taxa/100, Tempo));
			m.txtVFuturo.setText(String.format("%.2f", Resultado));
		}
		else if (m.txtVAtual.getText().isEmpty()) {
			float VFuturo = Float.parseFloat(m.txtVFuturo.getText());
			float Taxa = Float.parseFloat(m.txtTaxa.getText());
			float Tempo = Float.parseFloat(m.txtTempo.getText());
			float Resultado;
      
			Resultado = (float) (VFuturo/(Math.pow(1+Taxa/100, Tempo)));
			m.txtVAtual.setText(String.format("%.2f", Resultado));
		}
		else if (m.txtTaxa.getText().isEmpty()) {
			float VFuturo = Float.parseFloat(m.txtVFuturo.getText());
			float VAtual = Float.parseFloat(m.txtVAtual.getText());
			float Tempo = Float.parseFloat(m.txtTempo.getText());
			float Resultado;
      
			Resultado = (float) ((Math.pow((VFuturo/VAtual), 1/Tempo)- 1) * 100);
			m.txtTaxa.setText(String.format("%.2f", Resultado));
		}
		else if (m.txtTempo.getText().isEmpty()) {
			float VFuturo = Float.parseFloat(m.txtVFuturo.getText());
			float VAtual = Float.parseFloat(m.txtVAtual.getText());
			float Taxa = Float.parseFloat(m.txtTaxa.getText());
			float Resultado;
      
			Resultado = (float) ((Math.log(VFuturo/VAtual))/(Math.log(1 + Taxa/100)));
			m.txtTempo.setText(String.format("%.0f", Resultado));
		}
	}
}
```
LimparListener.java
```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparListener implements ActionListener {
	
	menu m;
	
	public LimparListener(menu menu) {
		m = menu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		m.txtVFuturo.setText("");
		m.txtVAtual.setText("");
		m.txtTaxa.setText("");
		m.txtTempo.setText("");
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

Resposta:

Principal.java
```java
public class Principal {
	static menu janela;
	
	public static void main(String[] args) {
		janela = new menu();
	}
}
```

menu.java
```java
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class menu extends JFrame {
	JLabel lblValorObtido,
		   lblResultado,
		   lblJuros,
		   lblDeposito,
		   lblTempo;
		   
	JTextField txtJuros,
			   txtDeposito,
			   txtTempo;
	
	JButton bntCalcular,
			bntLimpar;
	
	List<JLabel> listaLabel = new LinkedList<JLabel>(),
			 listaResultado = new LinkedList<JLabel>();
	
	public menu(){
		
		setTitle("menu");
		setSize(400, 180);
		setLayout(new GridLayout(5, 2));
		
		lblJuros = new JLabel("Taxa de Juros (%):");
		lblJuros.setSize(0, 0);
		lblTempo = new JLabel("Tempo (em meses):");
		lblDeposito = new JLabel("Valor do depósito regular:");
		lblValorObtido = new JLabel("Valor obtido em cada mês:");
		lblResultado = new JLabel();
		
		txtJuros = new JTextField();
		txtTempo = new JTextField();
		txtDeposito = new JTextField();
		
		bntCalcular = new JButton("Calcular");
		bntLimpar = new JButton("Limpar");
		
		bntCalcular.addActionListener(new CalcularListener(this));
		bntLimpar.addActionListener(new LimparListener(this));
		
		add(lblJuros);
		add(txtJuros);
		add(lblTempo);
		add(txtTempo);
		add(lblDeposito);
		add(txtDeposito);
		add(lblValorObtido);
		add(lblResultado);
		add(bntCalcular);
		add(bntLimpar);
		
		setVisible(true);
	}
}
```

CalcularListener.java
```java
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class CalcularListener implements ActionListener {

	menu m;
	
	public CalcularListener(menu menu) {
		m = menu;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int i;
		
		float Juros = Float.parseFloat(m.txtJuros.getText()),
			  Tempo = Float.parseFloat(m.txtTempo.getText()),
			  Deposito = Float.parseFloat(m.txtDeposito.getText()),
			  ResultadoConta;
		
		String Label1;
		Dimension size;
		
		/*Caso clique no botão de calcular novamente, temos que retirar todos os labels criados definir
		 a interface com os valores iniciais*/
		if (m.listaLabel.isEmpty() != true || m.listaResultado.isEmpty() != true) { 
			for (JLabel label : m.listaLabel) {
				m.remove(label);
			}
			for (JLabel result : m.listaResultado) {
				m.remove(result);
			}
			
			m.listaLabel.clear();
			m.listaResultado.clear();
			
			m.setLayout(new GridLayout(5, 2));
			m.setSize(400,180);
		}
	
		for (i = 1; i <= Tempo; i++) {
			ResultadoConta = (float) ((1 + Juros/100) * ((Math.pow(1+Juros/100, i)-1)/(Juros/100)) * Deposito);
			Label1 = "Mês " + i + ": ";
			JLabel newlabel = new JLabel(Label1); //Cria a cada iteração um JLabel com o texto acima
			JLabel labelResult = new JLabel(String.format("%.2f", ResultadoConta));//Cria a cada iteração um JLabel com o resultado
			
			//Atualiza o numero de linhas do layout a cada iteração
			m.setLayout(new GridLayout(5 + i,2)); 
			
			//Adiciona os labels nas listas
			m.listaLabel.add(newlabel);
			m.listaResultado.add(labelResult);
			
			//Adiciona os labels na interface
			m.add(m.listaLabel.get(i-1));
			m.add(m.listaResultado.get(i-1));
			
			//Redimenciona a altura da interface a cada iteração
			size = m.getSize();
			size.height += 15; 
			m.setSize(size.width, size.height);
		}
		//Recoloca os butões no final da interface
		m.add(m.bntCalcular);
		m.add(m.bntLimpar);	
	}
}
```
LimparListener.java
```java
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class LimparListener implements ActionListener {

	menu m;
	
	public LimparListener(menu menu) {
		m = menu;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	m.txtJuros.setText("");
	m.txtTempo.setText("");
	m.txtDeposito.setText("");
	
	if (m.listaLabel.isEmpty() != true || m.listaResultado.isEmpty() != true) { 
		for (JLabel label : m.listaLabel) {
			m.remove(label);
		}
		for (JLabel result : m.listaResultado) {
			m.remove(result);
		}
		
		m.listaLabel.clear();
		m.listaResultado.clear();
		
		m.setLayout(new GridLayout(5, 2));
		m.setSize(400,180);
	}
	}
}
```
