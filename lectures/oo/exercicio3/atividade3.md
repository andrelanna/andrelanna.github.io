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

	static JanelaPrincipal janela;

	public static void main(String[] args) {
		janela = new JanelaPrincipal();
	}
}


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class JanelaPrincipal extends JFrame implements ActionListener{
	JLabel	lValorFuturo,
			lValorAtual,
			lJuros,
			lTempo;
	JTextField	tfValorFuturo,
				tfValorAtual,
				tfJuros,
				tfTempo;
	JButton bCalcular;

	public double 	valorFuturo,
					valorAtual,
					juros;
	public int 	tempo,
				cont;

	DecimalFormat 	df,
					intf;

	public JanelaPrincipal() {
		this.setTitle("Calculadora financeira");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		lValorFuturo = new JLabel("Valor Futuro");
		lValorAtual = new JLabel("Valor Atual");
		lJuros = new JLabel("Juros (em %)");
		lTempo = new JLabel("Tempo (meses)");

		tfValorFuturo = new JTextField("0", 15);
		tfValorAtual = new JTextField("0", 15);
		tfJuros = new JTextField("0", 15);
		tfTempo = new JTextField("0", 15);

		bCalcular = new JButton("Calcular");

		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

		getContentPane().add(lValorFuturo);
		getContentPane().add(tfValorFuturo);

		getContentPane().add(lValorAtual);
		getContentPane().add(tfValorAtual);

		getContentPane().add(lJuros);
		getContentPane().add(tfJuros);

		getContentPane().add(lTempo);
		getContentPane().add(tfTempo);

		getContentPane().add(bCalcular);
		bCalcular.addActionListener(this);

		JOptionPane.showMessageDialog(null, "Preencha três campos!");

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			valorFuturo = Double.parseDouble(tfValorFuturo.getText());
			valorAtual = Double.parseDouble(tfValorAtual.getText());
			juros = Double.parseDouble(tfJuros.getText())/100;
			tempo = Integer.parseInt(tfTempo.getText());
			df = new DecimalFormat("#,##0.00");
			intf = new DecimalFormat("#");
			cont = 0;

			if (valorFuturo == 0)
				cont++;
			if (valorAtual == 0)
				cont++;
			if (juros == 0)
				cont++;
			if (tempo == 0)
				cont++;

			if (e.getSource() == bCalcular) {
				tfValorFuturo.setText("0");
				tfValorAtual.setText("0");
				tfJuros.setText("0");
				tfTempo.setText("0");

				if (valorFuturo == 0 && cont == 1) {
					JOptionPane.showMessageDialog(null, "Valor Futuro: " + df.format(valorAtual * Math.pow((1 + juros), tempo))
						+ "\nValor Atual: " + df.format(valorAtual)
						+ "\nJuros: " + df.format(juros*100)
						+ "\nTempo: " + intf.format(tempo));
				} else if (valorAtual == 0 && cont == 1) {
					JOptionPane.showMessageDialog(null, "Valor Futuro: " + df.format(valorFuturo)
						+ "\nValor Atual: " + df.format(valorFuturo / Math.pow(1 + juros, tempo))
						+ "\nJuros: " + df.format(juros*100)
						+ "\nTempo: " + intf.format(tempo));
				} else if (juros == 0 && cont == 1) {
					JOptionPane.showMessageDialog(null, "Valor Futuro: " + df.format(valorFuturo)
						+ "\nValor Atual: " + df.format(valorAtual)
						+ "\nJuros: " + df.format((Math.pow((valorFuturo / valorAtual), (1.0 / tempo)) - 1) * 100)
						+ "\nTempo: " + intf.format(tempo));
				} else if (tempo == 0 && cont == 1) {
					JOptionPane.showMessageDialog(null, "Valor Futuro: " + df.format(valorFuturo)
						+ "\nValor Atual: " + df.format(valorAtual)
						+ "\nJuros: " + df.format(juros*100)
						+ "\nTempo: " + intf.format(Math.round(Math.log(valorFuturo / valorAtual) / Math.log(1 + juros))));
				} else {
					tfValorFuturo.setText("0");
					tfValorAtual.setText("0");
					tfJuros.setText("0");
					tfTempo.setText("0");
				}

				JOptionPane.showMessageDialog(null, "Preencha três campos!");
			}

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Preencha três campos com valores válidos!");
			tfValorFuturo.setText("0");
			tfValorAtual.setText("0");
			tfJuros.setText("0");
			tfTempo.setText("0");
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
