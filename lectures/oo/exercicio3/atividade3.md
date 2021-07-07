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

RESPOSTA (Maria Luiza Ferreira - 160014433)

public class Principal {

	public static void main(String[] args) {
		Janela j = new Janela();

	}

}

public class Janela extends JFrame {
			
		JLabel lblI,
			   lblN,
			   lblFV,
			   lblPV,
			   lblResultado,
			   lblResposta;
		
		JTextField txtI,
				   txtN,
				   txtFV,
				   txtPV;
		
		JButton btnCalcular,
				btnLimpar;		
		
		
	public Janela(){
		
		setTitle("Exercício 1");
		setSize(300,400);
		setLayout(new GridLayout(6,2));
		
		lblI = new JLabel("Taxa de juros: ");
		lblN = new JLabel("Tempo da aplicação: ");
		lblFV = new JLabel("Valor futuro: ");
		lblPV = new JLabel("Valor presente: ");
		lblResultado = new JLabel ();
		lblResposta = new JLabel ();
		
		txtI = new JTextField();
		txtN = new JTextField();
		txtFV = new JTextField();
		txtPV = new JTextField();
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		add(lblFV);
		add(txtFV);
		add(lblPV);
		add(txtPV);
		add(lblI);
		add(txtI);
		add(lblN);
		add(txtN);
		add(lblResultado);
		add(lblResposta);
		add(btnCalcular);
		add(btnLimpar);
		
		btnCalcular.addActionListener(new CalcularListener(this));
		btnLimpar.addActionListener(new LimparListener(this));
		
		setVisible (true);
	}
}


public class CalcularListener implements ActionListener  {

	Janela j;
	
	public CalcularListener (Janela janela){
			j= janela;
	}
	
	public void actionPerformed(ActionEvent e){
		
			if (j.txtFV.getText().isEmpty()){
				float PV = Float.parseFloat(j.txtPV.getText());
				float i = Float.parseFloat(j.txtI.getText());
				float n= Float.parseFloat(j.txtN.getText());
				float FV = (float) (PV*(Math.pow((1+(i*0.001)),n)));
				
				j.lblResultado.setText("Valor Futuro");
				j.lblResposta.setText(Float.toString(FV));
				
			}
			
			if (j.txtPV.getText().isEmpty()){
				float FV = Float.parseFloat(j.txtFV.getText());
				float i = Float.parseFloat(j.txtI.getText());
				float n= Float.parseFloat(j.txtN.getText());
				float PV = (float) (FV/(Math.pow((1+(i*0.001)),n)));
				
				j.lblResultado.setText("Valor Presente");
				j.lblResposta.setText(Float.toString(PV));
				
			}
			
			if (j.txtI.getText().isEmpty()){
				float PV = Float.parseFloat(j.txtPV.getText());
				float FV = Float.parseFloat(j.txtFV.getText());
				float n= Float.parseFloat(j.txtN.getText());
				float i = (float) ((Math.pow((FV/PV),(1/n)) - 1) *100);
				
				j.lblResultado.setText("Taxa de Juros");
				j.lblResposta.setText(Float.toString(i));
				
			}
			
			if (j.txtN.getText().isEmpty()){
				float PV = Float.parseFloat(j.txtPV.getText());
				float FV = Float.parseFloat(j.txtFV.getText());
				float i= Float.parseFloat(j.txtI.getText());
				float n = (float) Math.abs(((Math.log(PV/FV))/ (Math.log(1+(i/100)))));
				
				j.lblResultado.setText("Tempo da aplicação");
				j.lblResposta.setText(Float.toString(n));
				
			}
		
			
		
			
	}
}


public class LimparListener implements ActionListener {
		Janela j;
		
		public LimparListener(Janela janela){
			j = janela;
			}
	public void actionPerformed(ActionEvent e) {
		
		j.txtFV.setText("");
		j.txtPV.setText("");
		j.txtI.setText("");
		j.txtN.setText("");
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
