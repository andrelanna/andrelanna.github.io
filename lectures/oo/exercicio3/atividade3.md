```java
package Exercício2;

public class Janela {

	static NovaJanela janela;
	
	public static void main(String[] args){
		
			janela = new NovaJanela();
	}
	
}
```

```java
package Exercício2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NovaJanela extends JFrame{

	private static final long serialVersionUID = 1L;
	
	JLabel taxa, depositoRegular, tempo, resultado, mostrarResultado;
	JButton btnCalcular, btnLimpar;
	JTextField txtDeposito, txtTaxa, txtTempo;
	
	public NovaJanela(){
		
		setTitle ("Calculo");
		setSize (500, 250);
		
		setLayout(new GridLayout(4,2));
		
		depositoRegular = new JLabel ("Valor do deposito: ");
		taxa = new JLabel ("Taxa %: ");
		tempo = new JLabel ("Tempo (meses): ");
		btnCalcular = new JButton ("Calcular");
		btnLimpar = new JButton ("Limpar");
		txtDeposito = new JTextField ("");
		txtTaxa = new JTextField ("");
		txtTempo = new JTextField ("");
		
		
		add(taxa);
		add(txtTaxa);
		add(depositoRegular);
		add(txtDeposito);
		add(tempo);
		add(txtTempo);
		add(btnCalcular);
		add(btnLimpar);
		
		btnCalcular.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				new JanelaResultado(txtDeposito.getText(), txtTaxa.getText(), txtTempo.getText());
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
		
		setVisible(true);
		
	}
	
}
```
```java
package Exercício2;

import java.util.ArrayList;
import java.util.List;

public class CalcularValores {

	private static final float UM = 1F;
	
	public List<ResultadoAplicacao> calcular(String txtDeposito, String txtTaxa, String txtTempo){
		
		float deposito = Float.parseFloat(txtDeposito);
		float taxa = Float.parseFloat(txtTaxa) / 100;
		float tempo = Float.parseFloat(txtTempo);
		
		List<ResultadoAplicacao> listaResultado = new ArrayList<ResultadoAplicacao>();
		
		for (int i=1; i <= tempo; i++){
		
			float resultado = (float)((UM + taxa) * ((Math.pow(UM + taxa, i) - UM) / taxa) * deposito);
		
			listaResultado.add(new ResultadoAplicacao(i, resultado));
		}
		
		return listaResultado;
		
	}
	
}
```


```java
package Exercício2;

public class ResultadoAplicacao {
	
	private int mes;
	private float valor;
	
	public ResultadoAplicacao(int mes, float valor){
		
		this.mes = mes;
		this.valor = valor;
		
	}
	
	public int getMes(){
			return mes;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public float getValor(){
		return valor;
	}
	
	public void getValor(float valor){
		this.valor = valor;
	}

}
```

```java
package Exercício2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class JanelaResultado extends JFrame {

	private static final long serialVersionUID = 1L;//Novamente peguei de um código e não entendi muito bem para o que serve.
	
	JLabel mes, valor;
	JButton btnFechar;
	
	public JanelaResultado(String txtDeposito, String txtTaxa, String txtTempo){
		
		setTitle ("Calculo");
		setSize (500, 250);
		
		CalcularValores calculadora = new CalcularValores();
		List<ResultadoAplicacao> listaResultado = calculadora.calcular(txtDeposito,txtTaxa,txtTempo);
		setLayout(new GridLayout(listaResultado.size()+2,2));
		
		
		btnFechar = new JButton("Fechar");
		
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
		
			setVisible(true);
			
	}
	
}
```
