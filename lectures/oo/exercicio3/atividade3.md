```java
package Exercício1;


public class Janela {

	static NovaJanela janela;
	
	public static void main(String[] args) {
			
		janela = new NovaJanela();
		
	}
	
}
```

```java
package Exercício1;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NovaJanela extends JFrame implements ActionListener{

private static final long serialVersionUID = 1L;//Nao entendi muito bem para o que ele serve.
	
	JLabel valorPresente, valorFuturo, tempo, taxa, resultado, mostrarResultado;
	JButton btnCalcular, btnLimpar;
	JTextField txtValorPresente, txtValorFuturo, txtTaxa, txtTempo;
	
	public NovaJanela (){
		
		setTitle ("Calculo");
		setSize (500, 250);
		
		setLayout (new GridLayout (7,2));
		
		resultado = new JLabel ("Resultado: ");
		valorFuturo = new JLabel ("Valor Futuro: ");
		valorPresente = new JLabel ("Valor Atual: ");
		taxa = new JLabel ("Juros %: ");
		tempo = new JLabel ("Tempo (meses): ");
		mostrarResultado = new JLabel ("");
		
		txtValorFuturo = new JTextField("");
		txtValorPresente = new JTextField("");
		txtTaxa = new JTextField("");
		txtTempo = new JTextField("");
		
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		
		
		add(valorFuturo);
		add(txtValorFuturo);
		add(valorPresente);
		add(txtValorPresente);
		add(taxa);
		add(txtTaxa);
		add(tempo);
		add(txtTempo);
		add(btnCalcular);
		add(btnLimpar);

		
		
		btnCalcular.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(txtValorFuturo.getText().equals("")){
					
					double dvalorPresente = Double.parseDouble(txtValorPresente.getText());
					double dtaxa = Double.parseDouble(txtTaxa.getText())/100;
					double dtempo = Double.parseDouble(txtTempo.getText());
					double dvalorFuturo = (dvalorPresente * Math.pow((1+dtaxa),dtempo));
					String Svf = String.format("%.2f", dvalorFuturo);
					txtValorFuturo.setText(Svf);
					
				}else if(txtValorPresente.getText().equals("") ){

					double dvalorFuturo = Double.parseDouble(txtValorFuturo.getText());
					double dtaxa = Double.parseDouble(txtTaxa.getText())/100;
					double dtempo = Double.parseDouble(txtTempo.getText());
					double dvalorPresente = (dvalorFuturo / Math.pow((1+dtaxa),dtempo));
					String Sva = String.format("%.2f", dvalorPresente);
					txtValorPresente.setText(Sva);
					
				}else if(txtTempo.getText().equals("")){

					double dvalorFuturo = Double.parseDouble(txtValorFuturo.getText());
					double dtaxa = Double.parseDouble(txtTaxa.getText())/100;
					double dvalorPresente = Double.parseDouble(txtValorPresente.getText());
					double dtempo = (Math.log(dvalorFuturo/dvalorPresente)/ Math.log(1+dtaxa));
					String Sn = String.format("%.0f", dtempo);
					txtTempo.setText(Sn);
					
				}else {
					
					double dvalorFuturo = Double.parseDouble(txtValorFuturo.getText());
					double dtempo = Double.parseDouble(txtTempo.getText());
					double dvalorPresente = Double.parseDouble(txtValorPresente.getText());
					double dtaxa = (Math.pow(dvalorFuturo/dvalorPresente, 1/dtempo)-1)*100;
					String Si = String.format("%.1f", dtaxa);
					txtTaxa.setText(Si);
					
				}
			}
			
		});
		
				
		setVisible(true);
		
		
	
	
		btnLimpar.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			txtValorFuturo.setText("");
			txtValorPresente.setText("");
			txtTempo.setText("");
			txtTaxa.setText("");
			
		}
	});
	
}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}
	}
  ```
