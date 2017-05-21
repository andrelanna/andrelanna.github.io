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


* Classe JanelaPrincipal
```java

public class Exer1_JanelaPrincipal {

	static CriarJanela janela;
	
	public static void main(String[] args) {
		janela = new CriarJanela();
	}

}
```
* Classe CriarJanela
```java
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CriarJanela extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	  //Cria variaveis de referencia
		JLabel PV, FV, taxa, tempo, aviso, aviso2, resultado, exibeResultado;
		JButton btnCalcular, btnLimpar;
		JTextField txtPV, txtFV, txtTaxa, txtTempo;
		
		public CriarJanela(){
			
			//Definir propriedades
			setTitle("Calculo Monetario");
			setSize(500, 250);
			
			//Gerar organizador de layout
			setLayout(new GridLayout(7,2));
					
		
			//Cria os objetos
			aviso = new JLabel("Prencha apenas 3 valores");
			aviso2 = new JLabel("O sistema calculara o campo vazio");
			resultado = new JLabel("Resultado:");
			PV = new JLabel("Valor Presente:");
			FV = new JLabel("Valor futuro:");
			taxa = new JLabel("Taxa (%):");
			tempo = new JLabel("Tempo (meses):");
			btnCalcular = new JButton("Calcular");
			btnLimpar = new JButton("Limpar");
			txtPV = new JTextField("");
			txtFV = new JTextField("");
			txtTaxa = new JTextField("");
			txtTempo = new JTextField("");
			exibeResultado = new JLabel("");
			//Adiciona os objetos
			add(aviso);
			add(aviso2);
			add(FV);
			add(txtFV);
			add(PV);
			add(txtPV);
			add(taxa);
			add(txtTaxa);
			add(tempo);
			add(txtTempo);
			add(btnCalcular);
			add(btnLimpar);
			add(resultado);
			add(exibeResultado);
			
			
			btnCalcular.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					CalcularValores calculadora = new CalcularValores();
					String resultado = calculadora.calcular(txtPV.getText(),
															txtFV.getText(),
															txtTaxa.getText(),
															txtTempo.getText());
					
					
					exibeResultado.setText(resultado);
					pack();
					repaint();
				}
			});
			
			
			btnLimpar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					txtPV.setText("");
					txtFV.setText("");
					txtTaxa.setText("");
					txtTempo.setText("");
					
					
					
					repaint();
				}
			});
			
			
			
			//Tornar janela visível
			setVisible(true);
		
		}
}

```
* Classe CalcularValores
```java
import java.text.DecimalFormat;

public class CalcularValores {
		
	public String calcular(String txtPV, String txtFV,
						   String txtTaxa, String txtTempo){
		
		String resultado = "";
		
		// Verificar se apenas 1 está vazio
		String validacao = validaTresPreenchidos(txtPV,txtFV, txtTaxa, txtTempo);
		if (!validacao.equals("")){
			return validacao;
		}
		
		// Chama o respectivo metodo de calculo
		switch (identificaValorVazio(txtPV,txtFV, txtTaxa, txtTempo)) {
		case 1:
			resultado = calcularPV(txtFV, txtTaxa, txtTempo);
			break;
		case 2:
			resultado = calcularFV(txtPV, txtTaxa, txtTempo);
			break;
		case 3:
			resultado = calcularTaxa(txtPV,txtFV, txtTempo);
			break;
		case 4:
			resultado = calcularTempo(txtPV,txtFV, txtTaxa);
			break;
		default:
			resultado = "Nenhum campo vazio";
			break;
		}
		
		return resultado;
	}

	private String validaTresPreenchidos(String txtPV, String txtFV,
			   							 String txtTaxa, String txtTempo) {
		
		int cont = 0;
		if (txtPV != null && !txtPV.trim().equals("")) { cont++; }
		if (txtFV != null && !txtFV.trim().equals("")) { cont++; }
		if (txtTaxa != null && !txtTaxa.trim().equals("")) { cont++; }
		if (txtTempo != null && !txtTempo.trim().equals("")) { cont++; }
		
		if (cont == 3) {
			return "";
		} else {
			return "Você deve preencher 3 campos e deixar um vazio";
		}
	}
	
	private int identificaValorVazio(String txtPV, String txtFV,
			   						 String txtTaxa, String txtTempo) {
		if (txtPV == null || txtPV.trim().equals("")) { return 1; }
		if (txtFV == null || txtFV.trim().equals("")) { return 2; }
		if (txtTaxa == null || txtTaxa.trim().equals("")) { return 3; }
		if (txtTempo == null || txtTempo.trim().equals("")) { return 4; }
		
		return 0;
	}
	
	private String calcularPV(String txtFV,String txtTaxa, String txtTempo) {
		
		float FV = Float.parseFloat(txtFV);
		float taxa = Float.parseFloat(txtTaxa);
		float tempo = Float.parseFloat(txtTempo);
		
		float PV = (float)(FV / Math.pow((1 + (taxa/100)), tempo));
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		return "O Valor presente é R$" + formatador.format(PV);
	}
	
	private String calcularFV(String txtPV, String txtTaxa, String txtTempo) {
		
		float PV = Float.parseFloat(txtPV);
		float taxa = Float.parseFloat(txtTaxa);
		float tempo = Float.parseFloat(txtTempo);
		
		float FV = (float)(PV * Math.pow((1 + (taxa/100)), tempo));
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		return "O Valor futuro é R$" + formatador.format(FV);
		
	}
	
	private String calcularTaxa(String txtPV, String txtFV, String txtTempo) {
		
		float FV = Float.parseFloat(txtFV);
		float PV = Float.parseFloat(txtPV);
		float tempo = Float.parseFloat(txtTempo);
		
		float taxa = (float)(((Math.pow((FV/PV), 1/tempo))-1)*100);
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		return "A taxa é " + formatador.format(taxa) + "%";
	}
	
	private String calcularTempo(String txtPV, String txtFV, String txtTaxa) {
		
		float FV = Float.parseFloat(txtFV);
		float PV = Float.parseFloat(txtPV);
		float taxa = Float.parseFloat(txtTaxa);
		
		float tempo = (float)(Math.log(FV/PV) / Math.log((1 + (taxa/100))));
		
		return "O tempo é " + Math.round(tempo)+ " meses";
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

* Classe JanelaPrincipal
```java
public class Exer2_JanelaPrincipal {

	static CriarJanela janela;
	
	public static void main(String[] args) {
		
		janela = new CriarJanela();

	}

}
```

* Classe CriarJanela
```java
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CriarJanela extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JLabel taxa, depositoRegular, tempo, resultado, exibeResultado;
	JButton btnCalcular, btnLimpar;
	JTextField txtDeposito, txtTaxa, txtTempo;
	
	public CriarJanela(){
		
		//Definir propriedades
		setTitle("Calculo Monetario");
		setSize(500, 250);
		
		//Gerar organizador de layout
		setLayout(new GridLayout(4,2));
				
	
		//Cria os objetos
		depositoRegular = new JLabel("Valor do deposito:");
		taxa = new JLabel("Taxa (%):");
		tempo = new JLabel("Tempo (meses):");
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		txtDeposito = new JTextField("");
		txtTaxa = new JTextField("");
		txtTempo = new JTextField("");
		
		
		//Adiciona os objetos
		add(taxa);
		add(txtTaxa);
		add(depositoRegular);
		add(txtDeposito);
		add(tempo);
		add(txtTempo);
		add(btnCalcular);
		add(btnLimpar);
			
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JanelaResultado(txtDeposito.getText(),txtTaxa.getText(), txtTempo.getText());
			}
		});
		
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtDeposito.setText("");
				txtTaxa.setText("");
				txtTempo.setText("");
								
				repaint();
			}
		});
		

		//Tornar janela visível
		setVisible(true);
	}

}
```

* Classe CalcularValores
```java
import java.util.ArrayList;
import java.util.List;

public class CalcularValores {

	private static final float UM = 1F;
	
	public List<ResultadoAplicacao> calcular(String txtDeposito,
											 String txtTaxa, String txtTempo){
		
		//Transforma as strings em float para o calculo
		float deposito = Float.parseFloat(txtDeposito);
		float taxa = Float.parseFloat(txtTaxa) / 100;
		float tempo = Float.parseFloat(txtTempo);

		List<ResultadoAplicacao> listaResultado = new ArrayList<ResultadoAplicacao>();
		
		for (int i=1;i<=tempo;i++) { 
			float resultado = (float)((UM + taxa) * ((Math.pow(UM + taxa, i) - UM) / taxa) * deposito);
			
			listaResultado.add(new ResultadoAplicacao(i, resultado));
			
		}
				
		return listaResultado;
	}

}

```

* Classe JanelaResultado
```java
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JanelaResultado extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JLabel mes, valor;
	JButton btnFechar;
	
	public JanelaResultado(String txtDeposito, String txtTaxa, String txtTempo){
		
		//Definir propriedades
		setTitle("Calculo Monetario");
		setSize(500, 250);
		
		//Gerar organizador de layout
		int meses = Integer.parseInt(txtTempo);
		setLayout(new GridLayout(meses+2,2));
				 
		
		CalcularValores calculadora = new CalcularValores();
		List<ResultadoAplicacao> listaResultado = calculadora.calcular(txtDeposito,
																	   txtTaxa,txtTempo);
		//Cria o botão
		btnFechar = new JButton("Fechar");	
		
		
		//Adiciona os objetos
		add(new JLabel("Mes"));
		add(new JLabel("Valor"));
		
		DecimalFormat formatador = new DecimalFormat("0.00");
				
		for (ResultadoAplicacao res: listaResultado) {
			
			add(new JLabel(String.valueOf(res.getMes())));
			add(new JLabel(formatador.format(res.getValor())));
			
		}
		
		add(btnFechar);		
		
			btnFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		

		//Tornar janela visível
		setVisible(true);
	}

}

```

* Classe ResultadoAplicacao
```java
public class ResultadoAplicacao {
	
	private int mes;
	private float valor;
	
	public ResultadoAplicacao(int mes, float valor){
		this.mes = mes;
		this.valor = valor;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}

```
