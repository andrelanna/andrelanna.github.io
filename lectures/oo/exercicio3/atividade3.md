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

Resolução:
Classe Principal:
{% highlight java %}

public class Principal {

	public static void main(String[] args) {
		Janela j = new Janela();
	}
}

{% endhighlight %}

Classe Janela:
{% highlight java %}

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	JLabel lbValorPresente,
		   lbValorFuturo,
		   lbTxJuros,
		   lbTempo,
		   lbResultado,
		   txtResultado;
	
	JButton btnCalcular,
			btnLimpar;
	
	JTextField txtValorPresente,
			   txtValorFuturo,
			   txtTxJuros,
			   txtTempo;
	
	GridLayout layout = new GridLayout(6,2);
	
	JPanel painel;
	
	public Janela(){	
		this.setTitle("Calculo de Valor Presente");
		this.setSize(500, 150);
		
		painel = new JPanel();
		painel.setLayout(layout);
		
		lbValorPresente = new JLabel("Valor Presente:");
		
		txtValorPresente = new JTextField("");
		txtValorPresente.setToolTipText("Valor atual da aplicação");
		
		lbValorFuturo = new JLabel("Valor Futuro:");
		
		txtValorFuturo = new JTextField("");
		txtValorFuturo.setToolTipText("Valor futuro da aplicação");
		
		lbTxJuros = new JLabel("Taxa de Juros:");
		
		txtTxJuros = new JTextField("");
		txtTxJuros.setToolTipText("Valor da taxa de juros");
		
		lbTempo = new JLabel("Tempo em Meses:");
		
		txtTempo = new JTextField("");
		txtTempo.setToolTipText("Tempo da aplicação em meses");
		
		lbResultado = new JLabel("Resultado:");
		
		txtResultado = new JLabel("");
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new CalcularListener(this));
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new LimparListener(this));
		
		painel.add(lbValorPresente);
		painel.add(txtValorPresente);
		painel.add(lbValorFuturo);
		painel.add(txtValorFuturo);
		painel.add(lbTxJuros);
		painel.add(txtTxJuros);
		painel.add(lbTempo);
		painel.add(txtTempo);
		painel.add(lbResultado);
		painel.add(txtResultado);
		painel.add(btnCalcular);
		painel.add(btnLimpar);
		
		
		
		this.add(painel);
		this.setVisible(true);
		
	}
		   

}

{% endhighlight %}

Classe CalcularListener:
{% highlight java %}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalcularListener implements ActionListener {

	Janela janela;
	
	public CalcularListener(Janela j){
		janela = j;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String strVazia;
		strVazia = "";
		String vf,
			   vp,
			   tj,
			   t;
		double nvf,
			   nvp,
			   ntj,
			   nt;
		
		vf = janela.txtValorFuturo.getText();
		vp = janela.txtValorPresente.getText();
		tj = janela.txtTxJuros.getText();
		t = janela.txtTempo.getText();
		
		nvf = vf.equals(strVazia)? 0.0: Double.parseDouble(vf);
		nvp = vp.equals(strVazia)? 0.0: Double.parseDouble(vp);
		ntj = tj.equals(strVazia)? 0.0: Double.parseDouble(tj);
		nt = t.equals(strVazia)? 0.0: Integer.parseInt(t);
		ntj/=100;
		
		DecimalFormat nf = new DecimalFormat("#0.00");
		DecimalFormat nf2 = new DecimalFormat("#0");
		
		if(nvf==0.0){
			nvf=nvp*(Math.pow((1+ntj), nt));
			janela.lbResultado.setText("Valor Futuro:");
			janela.txtResultado.setText("R$"+(nf.format(nvf)));
		}else if(nvp==0.0){
			nvp=nvf/(Math.pow((1+ntj), nt));
			janela.lbResultado.setText("Valor Presente:");
			janela.txtResultado.setText("R$"+(nf.format(nvp)));
		}else if(nt==0.0){
			nt=-(Math.log(nvp/nvf)/Math.log(1+ntj));
			janela.lbResultado.setText("Tempo em Meses:");
			janela.txtResultado.setText(nf2.format(nt)+" Meses");
		}else if(ntj==0.0){
			ntj=Math.pow(nvf/nvp, 1/nt)-1;
			janela.lbResultado.setText("Taxa de Juros:");
			janela.txtResultado.setText(nf.format(ntj*100)+"%");
		}
	}
}

{% endhighlight %}

Classe LimparListener:
{% highlight java %}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparListener implements ActionListener {

	Janela janela;
	
	public LimparListener(Janela j){
		janela=j;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		janela.lbResultado.setText("Resultado:");
		janela.txtResultado.setText("");
		janela.txtValorPresente.setText("");
		janela.txtValorFuturo.setText("");
		janela.txtTempo.setText("");
		janela.txtTxJuros.setText("");

	}

}

{% endhighlight %}




**Exercício 2:** Crie uma interface gráfica para cálculo dos valores obtidos ao final de cada mês para uma aplicação mensal de umdeterminado valoor e uma determinada taxa de juros. O cálculo do valor obtido ao final é dado pela seguinte fórmula: 

\\[S_{n}=(1+j) \times \frac{(1+j)^{n}-1}{j} \times p\\]


onde: 

* $$S_{n}$$ é o valor obtido ao final, 
* $$j$$ é a taxa de juros mensal, 
* $$p$$ é o valor de depósito regular e 
* $$n$$ é o número de meses.


Os valores finais de cada mês deverão ser informados através de objetos JLabel. 

Resolução:
Classe Principal:
{% highlight java %}

public class Principal {

	public static void main(String[] args) {
		Janela j = new Janela();

	}

}

{% endhighlight %}

Classe Janela:
{% highlight java %}

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	
	JLabel lbDepRegular,
		   lbTempo,
		   lbTxJuros;
	
	JTextField txtDepRegular,
			   txtTempo,
			   txtTxJuros;
	
	JButton btnCalcular,
			btnLimpar;
	
	JPanel painel,
		   painelLbl,
		   painelTxt;
	
	GridBagLayout gbLayout;
	
	public Janela(){
		this.setTitle("Calculo de valor mensal");
		this.setSize(500, 95);
		
		//definição do layout
		painel = new JPanel();
		gbLayout = new GridBagLayout();
		painel.setLayout(gbLayout);
		
		//instancia dos componentes label, button e textField
		lbDepRegular = new JLabel("Valor do deposito regular:");
		
		txtDepRegular = new JTextField("");
		txtDepRegular.setToolTipText("Valor do deposito regular");
		
		lbTempo = new JLabel("Tempo em Meses:");
		
		txtTempo = new JTextField("");
		txtTempo.setToolTipText("Quantidade de meses");
		
		lbTxJuros = new JLabel("Taxa de Juros:");
		
		txtTxJuros = new JTextField("");
		txtTxJuros.setToolTipText("Valor da taxa de juros mensal");
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new CalcularListener(this));
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new LimparListener(this));
		
		//Organização do layout e add dos componentes
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		c.weightx=0.1;
		c.weighty=0.1;
		painel.add(lbDepRegular, c);
		c.gridx=1;
		c.ipadx=100;
		painel.add(txtDepRegular, c);
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

{% endhighlight %}

Classe CalcularListener:
{% highlight java %}

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalcularListener implements ActionListener {

	Janela j;
	
	public CalcularListener(Janela janela){
		j=janela;
	}
	public void actionPerformed(ActionEvent arg0) {
		int numMeses = Integer.parseInt(j.txtTempo.getText());
		double txJuros = Double.parseDouble(j.txtTxJuros.getText());
		txJuros/=100;
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		//painel de resultados
		JPanel resultPanel = new JPanel();
		resultPanel.setName("ResultPanel");
		resultPanel.setLayout(new GridLayout(numMeses, 2));
		
		//labels de resultados
		JLabel resultMes;
		
		
		double valFinal = 0;
		double depRegular = Double.parseDouble(j.txtDepRegular.getText());
		
		//posição na qual sera colocado o painel de resultados
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		
		//formatação do numero do resultado
		DecimalFormat nf = new DecimalFormat("#0.00");
		
		
		for(int i=1; i<=numMeses; i++){
			valFinal=(valFinal+depRegular)*(txJuros+1);
			resultMes = new JLabel("Valor final do "+i+"º mes = "+nf.format(valFinal));
			resultPanel.add(resultMes);
			j.setSize(j.getWidth(), j.getHeight()+15);
		}
		j.painel.add(resultPanel, gbc);
	}
}

{% endhighlight %}

Classe LimparListener:
{% highlight java %}

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparListener implements ActionListener {

	Janela j;
	
	public LimparListener(Janela janela){
		j=janela;
	}
	public void actionPerformed(ActionEvent e) {
		
		GridBagConstraints c = new GridBagConstraints();
		Component[] component = j.painel.getComponents();
		
		component[component.length-1].setVisible(false);
		j.painel.remove(component[component.length-1]);
		
		int t=Integer.parseInt(j.txtTempo.getText());
		j.setSize(j.getWidth(), j.getHeight()-(15*t));
		
		j.txtDepRegular.setText("");
		j.txtTempo.setText("");
		j.txtTxJuros.setText("");

	}

}

{% endhighlight %}

