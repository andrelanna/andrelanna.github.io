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

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Janela j = new Janela();
	}

}
---------------------------------------------------------------------------------------------------------------
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{

	JLabel lblJuros,lblDeposito,lblMeses, lblResultado, lblResultadoMensal;
	JTextField txtJuros,txtDeposito, txtMeses;
	JButton btnCalcular,btnLimpar;
	
	public Janela(){
		//definir propriedade interface
		setTitle("Exemplo Interface Swing");
		setSize(500,500);
		setLayout(new GridLayout(5,1));
		
		//criar componentes graficos
		lblDeposito = new JLabel("Deposito regular: ");
		lblJuros = new JLabel ("Taxa de Juros mensal: ");
		lblMeses = new JLabel("Numero de meses: ");
		lblResultado = new JLabel("Resultado: ");
		lblResultadoMensal = new JLabel("");
		txtDeposito= new JTextField();
		txtJuros = new JTextField();
		txtMeses = new JTextField();
		
		btnCalcular = new JButton("Calcular");
		
		
		//adicionar elementos na interface;
		add(lblDeposito);
		add(txtDeposito);
		add(lblJuros);
		add(txtJuros);
		add(lblMeses);
		add(txtMeses);
		add(lblResultado);
		add(lblResultadoMensal);
		add(btnCalcular);
		
		
		btnCalcular.addActionListener(new CalcularListener(this));
		
		//mostrar janela
		setVisible(true);
	}
}
--------------------------------------------------------------------------------------------
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularListener implements ActionListener{

	Janela j;
	
	public CalcularListener(Janela janela){
		j = janela;
	}
	
	public void actionPerformed(ActionEvent e){
		float juros = Float.parseFloat(j.txtJuros.getText());
		float deposito = Float.parseFloat(j.txtDeposito.getText());
		float meses = Float.parseFloat(j.txtJuros.getText());
		float resultado;
		String resultadoMensal = "";
				for(int j = 1;j<=meses;j++){
					resultado = (float) ((1+juros/100) * (java.lang.Math.pow(1+juros, j)-1)/juros * deposito);
					resultadoMensal += String.format("Mês %.1f: %.2f\n", meses, resultado);
				}
				j.lblResultadoMensal.setText(resultadoMensal);
		
	}
}

