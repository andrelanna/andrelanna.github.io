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

---------------------------------------------------------------------
---------------------------------------------------------------------

{% highlight java %}

public class Principal {
	
	public static void main(String[] args){
		
		Janela j = new Janela();
	}
}

{% endhighlight%}

----------------------------------------------------------------------

{% highlight java %}

import java.awt.*;
import javax.swing.*;
public class Janela extends JFrame {
	
	JLabel lblValorFuturo,
		   lblValorAtual,
		   lblJuros,
		   lblTempo,
		   lblVF,
		   lblVA,
		   lblResultadoTaxa,
		   lblResultadoTemp,
		   lblErro;
	
	JTextField txtValorFuturo,
			   txtValorAtual,
			   txtJuros,
			   txtTempo;
	JButton btnCalcular,
		    btnLimpar;
	
	public Janela(){
		
		setTitle("Valor Futuro");
		setSize(200,400);
		setLayout(new GridLayout(5, 3));
		
		lblValorFuturo = new JLabel("Valor Futuro: ");
		lblValorAtual = new JLabel("Valor Atual: ");
		lblJuros = new JLabel("Juros: ");
		lblTempo = new JLabel("Tempo aplicações: ");
		
		lblVF = new JLabel("");
		lblVA = new JLabel("");
		lblResultadoTaxa = new JLabel("");
		lblResultadoTemp = new JLabel("");
		lblErro = new JLabel("");
		
		txtValorFuturo = new JTextField();
		txtValorAtual = new JTextField();
		txtJuros = new JTextField();
		txtTempo = new JTextField();
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar"); 
		
		
		add(lblValorFuturo);
		add(txtValorFuturo);
		add(lblVF);
		add(lblValorAtual);
		add(txtValorAtual);
		add(lblVA);
		add(lblJuros);
		add(txtJuros);
		add(lblResultadoTaxa);
		add(lblTempo);
		add(txtTempo);
		add(lblResultadoTemp);
		add(btnCalcular);
		add(btnLimpar);
		add(lblErro);
		
		btnCalcular.addActionListener(new Calculos(this));
		btnLimpar.addActionListener(new LimparBotoes(this));

		setVisible(true);
		
		}	
}

{% endhighlight%}
----------------------------------------------------------------
{% highlight java %}
import java.awt.event.*;

public class Calculos implements ActionListener {

		Janela j;
		
		public Calculos(Janela janela) {
			j = janela; }
		
	public void actionPerformed(ActionEvent e) {
			
		if(j.txtValorFuturo.getText().trim().isEmpty()){
				
				float VA = Float.parseFloat(j.txtValorAtual.getText());
				float i = Float.parseFloat(j.txtJuros.getText());
				float n = Float.parseFloat(j.txtTempo.getText());
				float VF = (float) (VA * (Math.pow((1+(i/100)), n)));
			
				j.lblVF.setText(Float.toString(VF)); }   
			
	else if(j.txtValorAtual.getText().trim().isEmpty()){
				
				float VF = Float.parseFloat(j.txtValorFuturo.getText());
				float i = Float.parseFloat(j.txtJuros.getText());
				float n = Float.parseFloat(j.txtTempo.getText());
				float VA = (float) (VF/(Math.pow((1+(i/100)), n)));
				
				j.lblVF.setText(Float.toString(VA)); }
			
	else if(j.txtJuros.getText().trim().isEmpty()){
				
				float VF = Float.parseFloat(j.txtValorFuturo.getText());
				float VA = Float.parseFloat(j.txtValorAtual.getText());
				float n = Float.parseFloat(j.txtTempo.getText());
				float i = (float) (100*((Math.pow((VF/VA),1.0/n)) - 1));
			
				j.lblResultadoTaxa.setText(Float.toString(i)); }
			
	else if(j.txtTempo.getText().trim().isEmpty()){
				float VF = Float.parseFloat(j.txtValorFuturo.getText());
				float VA = Float.parseFloat(j.txtValorAtual.getText());
				float i = Float.parseFloat(j.txtJuros.getText());
				float n = (float) ((Math.log10(VF/VA))/(Math.log10(1+(i/100))));
				
				j.lblResultadoTemp.setText((Float.toString(n))); }
		
	else{
			
				j.lblErro.setText("  " + "Erro");
			}
	}
		
}
{% endhighlight%}
--------------------------------------------------------------------

{% highlight java %}

import java.awt.event.*;

public class LimparBotoes implements ActionListener {
		
		Janela j;
		
	public LimparBotoes (Janela janela) {
			j = janela; }
		
		public void actionPerformed(ActionEvent e){
			
			j.lblResultadoTaxa.setText(null);
			j.lblResultadoTemp.setText(null);
			j.lblVA.setText(null);
			j.lblVF.setText(null);
			j.txtJuros.setText(null);
			j.txtTempo.setText(null);
			j.txtValorAtual.setText(null);
			j.txtValorFuturo.setText(null);
			j.lblErro.setText(null); }
}

{% endhighlight%}

--------------------------------------------------------------
--------------------------------------------------------------


**Exercício 2:** Crie uma interface gráfica para cálculo dos valores obtidos ao final de cada mês para uma aplicação mensal de umdeterminado valoor e uma determinada taxa de juros. O cálculo do valor obtido ao final é dado pela seguinte fórmula: 

\\[S_{n}=(1+j) \times \frac{(1+j)^{n}-1}{j} \times p\\]


onde: 

* $$S_{n}$$ é o valor obtido ao final, 
* $$j$$ é a taxa de juros mensal, 
* $$p$$ é o valor de depósito regular e 
* $$n$$ é o número de meses.


Os valores finais de cada mês deverão ser informados através de objetos JLabel. 

-------------------------------------------------------------------
-------------------------------------------------------------------

{% highlight java %}

public class Principal {

	public static void main(String[] args) {
		Janela j = new Janela();

	}
}

{% endhighlight%}

--------------------------------------------------------------------

{% highlight java %}

import java.awt.*;
import javax.swing.*;

public class Janela extends JFrame {
	
	JLabel lbDepositoRegular,
		   lbTempo,
		   lbTxJuros;
	
	JTextField txtDepositoRegular,
			   txtTempo,
			   txtTxJuros;
	
	JButton btnCalcular,
			btnLimpar;
	
	JPanel painel,
		   painelLbl,
		   painelTxt;
	
	GridBagLayout gbLayout;
	
	public Janela(){
		this.setTitle("Valor mensal");
		this.setSize(600, 200);
		
		painel = new JPanel();
		gbLayout = new GridBagLayout();
		painel.setLayout(gbLayout);
		
		lbDepositoRegular = new JLabel("Valor do deposito regular:");
		
		txtDepositoRegular = new JTextField("");
		txtDepositoRegular.setToolTipText("Deposito regular");
		
		lbTempo = new JLabel("Tempo (em meses):");
		
		txtTempo = new JTextField("");
		txtTempo.setToolTipText("Quantidade de meses:");
		
		lbTxJuros = new JLabel("Taxa de Juros:");
		
		txtTxJuros = new JTextField("");
		txtTxJuros.setToolTipText("Taxa de juros mensal");
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new Listener(this));
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new Listener(this));
		
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		c.weightx=0.1;
		c.weighty=0.1;
		painel.add(lbDepositoRegular, c);
		c.gridx=1;
		c.ipadx=100;
		painel.add(txtDepositoRegular, c);
		c.gridx=0;
		c.gridy=1;
		painel.add(lbTempo, c);
		c.gridx=1;
		painel.add(txtTempo, c);
		c.gridx=0;
		c.gridy=2;
		painel.add(lbTxJuros, c);
		c.gridx=1;
		painel.add(txtTxJuros, c);
		c.gridx=0;
		c.gridy=3;
		painel.add(btnCalcular, c);
		c.gridx=1;
		painel.add(btnLimpar, c);
		
		this.add(painel);
		this.setVisible(true);
	}
}

{% endhighlight%}

-----------------------------------------------------

{% highlight java %}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import javax.swing.*;

public class Listener implements ActionListener {

	Janela j;
	
	public Listener(Janela janela){
		j=janela;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		int numMeses = Integer.parseInt(j.txtTempo.getText());
		double txJuros = Double.parseDouble(j.txtTxJuros.getText());
		txJuros/=100;
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		JPanel resultado = new JPanel();
		resultado.setName("Resultado");
		resultado.setLayout(new GridLayout(numMeses, 2));
		
		JLabel resultadoMes;
		
		double valorFinal = 0;
		double depositoRegular = Double.parseDouble(j.txtDepositoRegular.getText());
		
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		
		DecimalFormat nf = new DecimalFormat("#0.00");
		
		for(int i=1; i<=numMeses; i++){
			valorFinal=(valorFinal+depositoRegular)*(txJuros+1);
			resultadoMes = new JLabel("Valor final do "+i+"º mes = "+nf.format(valorFinal));
			resultado.add(resultadoMes);
			j.setSize(j.getWidth(), j.getHeight()+15);
		}
		j.painel.add(resultado, gbc);
	}
}

{% endhighlight%}

-----------------------------------------------------
-----------------------------------------------------
