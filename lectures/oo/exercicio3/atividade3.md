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

RESPOSTA 


public class Main {

	public static void main(String[] args) {
		Janela j = new Janela();
		
	}

}

public class Janela extends JFrame {

		JLabel lblVF,		    
			   lblI,
			   lblPMT,
			   lblN,
			   lblResultado,
			   lblResposta;
		
		JTextField txtVF,
				   txtI,
				   txtPMT,
				   txtN;
		
		JButton btnCalcular,
				btnLimpar;
		
		List<JLabel> listaVF = new LinkedList<JLabel>(),
					 listaResultado = new LinkedList<JLabel>();
	
	public Janela(){
		
		setTitle("Exercício 2");
		setSize(300,400);
		setLayout(new GridLayout(6,2));
		
		lblVF = new JLabel();
		lblI = new JLabel("Taxa de juros: ");
		lblPMT = new JLabel("Depósito Regular: ");
		lblN = new JLabel("Tempo: ");
		lblResultado = new JLabel();
		lblResposta = new JLabel();
		
		txtVF = new JTextField();
		txtI = new JTextField();
		txtPMT = new JTextField();
		txtN = new JTextField();
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");

		add(lblI);
		add(txtI);
		add(lblPMT);
		add(txtPMT);
		add(lblN);
		add(txtN);
		add(btnCalcular);
		add(btnLimpar);	
		
		btnCalcular.addActionListener(new CalcularListener(this));	
		btnLimpar.addActionListener(new LimparListener(this));
		
		
		setVisible(true);
	}
}

public class CalcularListener implements ActionListener {

	Janela j;
	
	public CalcularListener(Janela janela){
		 j = janela;
	}
	
	public void actionPerformed(ActionEvent e) {
		float i = Float.parseFloat(j.txtI.getText());
		float PMT = Float.parseFloat(j.txtPMT.getText());
		float tempo = Float.parseFloat(j.txtN.getText());
		String mes;
		
		for (int n=1; n <= tempo; n++){
		Float VF = (float) ((1+(i/100)) *(((Math.pow((1+(i/100)),n))-1)/(i/100)) * PMT);
		mes = "Mês " + n ;
		JLabel lblmes = new JLabel(mes);
		JLabel lblresultado = new JLabel(Float.toString(VF));
		
		j.setLayout(new GridLayout (5+n,2));
		j.listaVF.add(lblmes);
		j.listaResultado.add(lblresultado);
		j.add(j.listaVF.get(n));
		j.add(j.listaResultado.get(n));
		
		Dimension tamanho = j.getSize();
		tamanho.height +=10;
		j.setSize(tamanho.width,tamanho.height);
		
		}
		
		j.add(j.btnCalcular);
		j.add(j.btnLimpar);
	}

}


public class LimparListener implements ActionListener {

		Janela j;
		
		public LimparListener(Janela janela){
			j = janela;
		}
		
	public void actionPerformed(ActionEvent e) {
		j.txtPMT.setText("");
		j.txtN.setText("");
		j.txtI.setText("");

	}

}
