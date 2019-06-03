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


public class Principal {
	
	static Janela janela;
	
	public static void main(String[] args) {
		janela = new Janela();

	}

}


import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	JLabel lblValorAtual, lblJuros, lblTempo, lblValorFuturo;
	JTextField txtValorAtual, txtJuros, txtTempo, txtValorFuturo;
	JButton btnCalcular, btnLimpar;
	
	public Janela() {
		setTitle("Calculo de Valor Futuro");
		setSize(800, 600);
		
		GridLayout grdLyt = new GridLayout(5,2);
		setLayout(grdLyt);
		
		lblValorAtual = new JLabel("Valor Atual: ");
		lblJuros = new JLabel("Juros: ");
		lblTempo = new JLabel("Tempo: ");
		lblValorFuturo = new JLabel ("Valor Futuro: ");
		txtValorFuturo = new JTextField ();
		txtValorAtual = new JTextField();
		txtJuros = new JTextField();
		txtTempo = new JTextField();
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		btnCalcular.addActionListener(new Calcular(this));
		btnLimpar.addActionListener(new Limpar(this));
		
		add(lblValorAtual);
		add(txtValorAtual);
		add(lblJuros);
		add(txtJuros);
		add(lblTempo);
		add(txtTempo);
		add(lblValorFuturo);
		add(txtValorFuturo);
		add(btnCalcular);
		add(btnLimpar);
		
		setVisible(true);
		
	}


}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcular implements ActionListener {
	
	Janela j;

	public Calcular(Janela janela) {
		j = janela;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		float ValorAtual = Float.parseFloat(j.txtValorAtual.getText());
		float Juros = Float.parseFloat(j.txtJuros.getText());
		float Tempo = Float.parseFloat(j.txtTempo.getText());
		float ValorFuturo = (float)(ValorAtual*Math.pow((1+Juros),Tempo));
		j.txtValorFuturo.setText(Float.toString(ValorFuturo));

	}

}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Limpar implements ActionListener {
	
	Janela j;

	public Limpar(Janela janela) {
		j = janela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		j.txtValorAtual.setText("");
		j.txtJuros.setText("");
		j.txtTempo.setText("");
		j.txtValorFuturo.setText("");
		

	}

}

Lucas de Castro Bezerra - 13/0121801


**Exercício 2:** Crie uma interface gráfica para cálculo dos valores obtidos ao final de cada mês para uma aplicação mensal de umdeterminado valoor e uma determinada taxa de juros. O cálculo do valor obtido ao final é dado pela seguinte fórmula: 

\\[S_{n}=(1+j) \times \frac{(1+j)^{n}-1}{j} \times p\\]


onde: 

* $$S_{n}$$ é o valor obtido ao final, 
* $$j$$ é a taxa de juros mensal, 
* $$p$$ é o valor de depósito regular e 
* $$n$$ é o número de meses.


Os valores finais de cada mês deverão ser informados através de objetos JLabel. 



public class Principal {
	
	static Janela janela;
	
	public static void main(String[] args) {
		janela = new Janela();

	}

}


import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	JLabel lblSn, lblj, lblp, lbln, lblResposta;
	JTextField txtj, txtp, txtn;
	JButton btnCalcular, btnLimpar;
	
	public Janela() {
		setTitle("Aplicacao");
		setSize(800, 600);
		
		GridLayout grdLyt = new GridLayout(5,2);
		setLayout(grdLyt);
		
		lblSn = new JLabel("Valor Final");
		lblj = new JLabel("Juros");
		lblp = new JLabel("Deposito Regular");
		lbln = new JLabel("Meses");
		lblResposta = new JLabel();
		txtj = new JTextField();
		txtp = new JTextField();
		txtn = new JTextField();
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		btnCalcular.addActionListener(new Calcular(this));
		btnLimpar.addActionListener(new Limpar(this));
		
		add(lblj);
		add(txtj);
		add(lblp);
		add(txtp);
		add(lbln);
		add(txtn);
		add(lblSn);
		add(lblResposta);
		add(btnCalcular);
		add(btnLimpar);
		
		setVisible(true);
	}

}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcular implements ActionListener {
	
	Janela j;

	public Calcular(Janela janela) {
		j = janela;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		float juros = Float.parseFloat(j.txtj.getText());
		float p = Float.parseFloat(j.txtp.getText());
		float n = Float.parseFloat(j.txtn.getText());
		double Sn;
		for (int aux=0; aux<=n; aux++) {
			Sn = (1+juros)*((Math.pow((1+juros),n)-1)/juros)*p;
			j.lblResposta.setText(Double.toString(Sn));
		}
		

	}

}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Limpar implements ActionListener {
	
	Janela j;

	public Limpar(Janela janela) {
		j = janela;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		j.txtj.setText("");
		j.txtn.setText("");
		j.txtp.setText("");
		j.lblResposta.setText("");

	}

}

Lucas de Castro Bezerra - 13/0121801