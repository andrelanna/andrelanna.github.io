---
title: Atividade 3
layout: default
---

### UnB - Universidade de Brasilia
### FGA - Faculdade do Gama
### OO - Orientação por objetos
------

----
Exercicio 1

------

{% highlight java %}

//Main.java


public class Main {

	static ValorFuturo janela;
	
	public static void main(String[] args) {
		
		janela = new ValorFuturo();
	

	}

}

{% endhighlight %}

{% highlight java %}

//ValorFuturo.java

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ValorFuturo extends JFrame{
	
	JLabel lblVfuturo,
		   lblVpresente,
		   lblJuros,
		   lblPrazo;
	
	JTextField txtVfuturo,
			   txtVpresente,
			   txtJuros,
			   txtPrazo;
	
	JButton btnCalcular,
			btnLimpar;
	
	public ValorFuturo() {
		
		this.setTitle("Calcular o Valor Futuro");
		this.setSize(400, 300);
		this.getContentPane().setBackground(Color.black);
		setLayout(new GridLayout(5,2));
		
		
		lblVfuturo = new JLabel ("Valor Futuro: ");
		lblVpresente = new JLabel ("Valor Presente: ");
		lblJuros = new JLabel ("Juros(% a.m): ");
		lblPrazo = new JLabel ("Prazo(a.m): ");
		txtVfuturo = new JTextField ("0");
		txtVpresente = new JTextField ("0");
		txtJuros = new JTextField ("0");
		txtPrazo = new JTextField ("0");
		btnCalcular = new JButton ("Calcular");
		btnLimpar = new JButton ("Limpar");
		
		lblVfuturo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblVpresente.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblJuros.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPrazo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtVfuturo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtVpresente.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtJuros.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtPrazo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCalcular.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLimpar.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		lblVfuturo.setForeground(Color.GRAY);
		lblVpresente.setForeground(Color.GRAY);
		lblJuros.setForeground(Color.GRAY);
		lblPrazo.setForeground(Color.GRAY);
		txtVfuturo.setForeground(Color.GRAY);
		txtVpresente.setForeground(Color.GRAY);
		txtJuros.setForeground(Color.GRAY);
		txtPrazo.setForeground(Color.GRAY);
		btnCalcular.setForeground(Color.GRAY);
		btnLimpar.setForeground(Color.GRAY);
		
		add(lblVfuturo);
		add(txtVfuturo);
		add(lblVpresente);
		add(txtVpresente);
		add(lblJuros);
		add(txtJuros);
		add(lblPrazo);
		add(txtPrazo);
		add(btnCalcular);
		add(btnLimpar);
		
		btnCalcular.addActionListener(new CalcularListener(this));
		btnLimpar.addActionListener(new LimparListener(this));
		
		
		
		setVisible(true);
			
	}
	
	public class LimparListener implements ActionListener {
		ValorFuturo i;
		
		public LimparListener(ValorFuturo valorfuturo2) {
			i = valorfuturo2;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			i.txtVfuturo.setText("0");
			i.txtVpresente.setText("0");
			i.txtJuros.setText("0");
			i.txtPrazo.setText("0");

		}

	}
}



{% endhighlight %}




{% highlight java %}

//CalcularListener.java


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CalcularListener implements ActionListener {
	
	ValorFuturo v;
	
	public CalcularListener(ValorFuturo valorfuturo1) {
		v = valorfuturo1;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		float vfuturo = Float.parseFloat(v.txtVfuturo.getText());
		float vpresente = Float.parseFloat(v.txtVpresente.getText());
		float juros = Float.parseFloat(v.txtJuros.getText());
		float prazo = Float.parseFloat(v.txtPrazo.getText());
		
		if(vfuturo == 0) {
			   
			float resultado = (float) (vpresente *(Math.pow((1+juros/100), prazo)));
			v.txtVfuturo.setText(Float.toString(resultado));
		}
		if(vpresente == 0) {
			
			float resultado = (float) (vfuturo/(Math.pow((1+juros/100), prazo)));
			v.txtVpresente.setText(Float.toString(resultado));
			
		}
		if(juros == 0) {
			
			float resultado = (float) (((Math.pow((vfuturo/vpresente), 1.0/prazo))-1)*100);
			v.txtJuros.setText(Float.toString(resultado));
			
		}
		if(prazo == 0) {
			float resultado = (float) (Math.log(vfuturo/vpresente)/(Math.log(1+juros/100)));
			v.txtPrazo.setText(Float.toString(resultado));
			
		}
	}
}
	
	
{% endhighlight %}

----
Exercicio 2

------



{% highlight java %}

//Main.java

public class Main {

	static Interface janela;
	
	public static void main(String[] args) {
		
		janela = new Interface();

	}

}

{% endhighlight %}



{% highlight java %}

//Interface.java


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Interface extends JFrame {
	
	JLabel lblValor,
		   lblJuros,
		   lblMes,
		   lblVazio,
		   lblVazio2,
		   lblVazio3,
		   lblVazio4,
		   lbl1,
		   lbl2,
		   lbl3,
		   lbl4,
		   lbl5,
		   lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12;
	
	
	JTextField txtValor,
			   txtJuros,
			   txtMes;
	
	JButton btnCalcular,
			btnLimpar;
	
	
	
	public Interface () {
		
		this.setTitle("Calcular o deposito regular");
		this.setSize(1100, 400);
		this.getContentPane().setBackground(Color.ORANGE);
		setLayout(new GridLayout(4,6));
		
		 lblValor = new JLabel ("Valor a depositar: ");
		   lblJuros = new JLabel ("Taxa de Juros: ");		
		   lblMes = new JLabel ("Quantidade de meses: ");
		   lblVazio = new JLabel("");
		   lblVazio2 = new JLabel("");
		   lblVazio3 = new JLabel("");
		   lblVazio4 = new JLabel("");
		   lbl1 = new JLabel("Janeiro");
		   lbl2 = new JLabel ("Fevereiro");
		   lbl3 = new JLabel ("Março");
		   lbl4 = new JLabel ("Abril");
		   lbl5 = new JLabel ("Maio");
		   lbl6 = new JLabel ("Junho");
		   lbl7 = new JLabel ("Julho");
		   lbl8 = new JLabel ("Agosto");
		   lbl9 = new JLabel ("Setembro");
		   lbl10 = new JLabel ("Outubro");
		   lbl11 = new JLabel("Novembro");
		   lbl12 = new JLabel ("Dezembro");
		   txtValor = new JTextField ("");
		   txtJuros = new JTextField ("");
		   txtMes = new JTextField (""); 
		   btnCalcular = new JButton ("Calcular");
		   btnLimpar = new JButton ("Limpar");
		   
		   txtValor.setFont(new Font("Times New Roman", Font.BOLD, 18));
		   txtMes.setFont(new Font("Times New Roman", Font.BOLD, 18));
		   txtJuros.setFont(new Font("Times New Roman", Font.BOLD, 18));
		   
		   btnCalcular.setBackground(Color.green);
		   btnLimpar.setBackground(Color.red);
		   
		   add(lblValor);
		   add(txtValor);
		   add(lblJuros);
		   add(txtJuros);
		   add(lblMes);
		   add(txtMes);
		   add(lblVazio);
		   add(lblVazio2);
		   add(btnCalcular);
		   add(btnLimpar);
		   add(lblVazio3);
		   add(lblVazio4);
		   add(lbl1);
		   add(lbl2);
		   add(lbl3);
		   add(lbl4);
		   add(lbl5);
		   add(lbl6);
		   add(lbl7);
		   add(lbl8);
		   add(lbl9);
		   add(lbl10);
		   add(lbl11);
		   add(lbl12);
		   
		   btnCalcular.addActionListener(new CalcularListener(this));	
		   btnLimpar.addActionListener(new LimparListener(this));
		
		setVisible(true);
		
	}
	
	public class LimparListener implements ActionListener {
		Interface j;
		
		public LimparListener(Interface interface2) {
			j = interface2;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			j.txtValor.setText("");
			j.txtMes.setText("");
			j.txtJuros.setText("");
			j.lbl1.setText("Janeiro");
			j.lbl2.setText("Fevereiro");
			j.lbl3.setText("Março");
			j.lbl4.setText("Abril");
			j.lbl5.setText("Maio");
			j.lbl6.setText("Junho");
			j.lbl7.setText("Julho");
			j.lbl8.setText("Agosto");
			j.lbl9.setText("Setembro");
			j.lbl10.setText("Outubro");
			j.lbl11.setText("Novembro");
			j.lbl12.setText("Dezembro");

		}

	}

}


{% endhighlight %}

{% highlight java %}

//CalcularListener.java


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class CalcularListener implements ActionListener {

	Interface i;
	
	public CalcularListener(Interface interface1) {
		i = interface1;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		float valor = Float.parseFloat(i.txtValor.getText());
		float juros = Float.parseFloat(i.txtJuros.getText());
		int mes = Integer.parseInt(i.txtMes.getText());
		
		juros /= 100;
		
		switch(mes){
			
			case 1:
				float soma =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma));
			break;
			
			case 2:
				float soma1 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma1));
				float soma2 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma2));
			break;

			case 3:
				float soma3 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma3));
				float soma4 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma4));
				float soma5 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma5));
			break;
			
			case 4:
				float soma6 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma6));
				float soma7 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma7));
				float soma8 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma8));
				float soma9 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma9));
			break;
			
			case 5:
				float soma10 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma10));
				float soma11 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma11));
				float soma12 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma12));
				float soma13 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 4))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma13));
				float soma14 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl5.setText("Maio: R$ " + Float.toString(soma14));
			break;
			
			case 6:
				float soma15 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma15));
				float soma16 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma16));
				float soma17 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma17));
				float soma18 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 4))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma18));
				float soma19 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 5))-1))/juros)*valor);
				i.lbl5.setText("Maio: R$ " + Float.toString(soma19));
				float soma20 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl6.setText("Junho: R$ " + Float.toString(soma20));
			break;
				
			case 7:
				float soma21 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma21));
				float soma22 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma22));
				float soma23 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma23));
				float soma24 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 4))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma24));
				float soma25 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 5))-1))/juros)*valor);
				i.lbl5.setText("Maio: R$ " + Float.toString(soma25));
				float soma26 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 6))-1))/juros)*valor);
				i.lbl6.setText("Junho: R$ " + Float.toString(soma26));
				float soma27 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl7.setText("Julho: R$ " + Float.toString(soma27));
			break;
			
			case 8:
				float soma28 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma28));
				float soma29 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma29));
				float soma30 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma30));
				float soma31 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 4))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma31));
				float soma32 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 5))-1))/juros)*valor);
				i.lbl5.setText("Maio: R$ " + Float.toString(soma32));
				float soma33 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 6))-1))/juros)*valor);
				i.lbl6.setText("Junho: R$ " + Float.toString(soma33));
				float soma34 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 7))-1))/juros)*valor);
				i.lbl7.setText("Julho: R$ " + Float.toString(soma34));
				float soma35 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl8.setText("Agosto: R$ " + Float.toString(soma35));
			break;

			case 9:
				float soma36 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma36));
				float soma37 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma37));
				float soma38 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma38));
				float soma39 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 4))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma39));
				float soma40 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 5))-1))/juros)*valor);
				i.lbl5.setText("Maio: R$ " + Float.toString(soma40));
				float soma41 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 6))-1))/juros)*valor);
				i.lbl6.setText("Junho: R$ " + Float.toString(soma41));
				float soma42 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 7))-1))/juros)*valor);
				i.lbl7.setText("Julho: R$ " + Float.toString(soma42));
				float soma43 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 8))-1))/juros)*valor);
				i.lbl8.setText("Agosto: R$ " + Float.toString(soma43));
				float soma44 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl9.setText("Setembro: R$ " + Float.toString(soma44));
			break;
			
			case 10:
				float soma45 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma45));
				float soma46 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma46));
				float soma47 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma47));
				float soma48 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 4))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma48));
				float soma49 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 5))-1))/juros)*valor);
				i.lbl5.setText("Maio: R$ " + Float.toString(soma49));
				float soma50 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 6))-1))/juros)*valor);
				i.lbl6.setText("Junho: R$ " + Float.toString(soma50));
				float soma51 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 7))-1))/juros)*valor);
				i.lbl7.setText("Julho: R$ " + Float.toString(soma51));
				float soma52 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 8))-1))/juros)*valor);
				i.lbl8.setText("Agosto: R$ " + Float.toString(soma52));
				float soma53 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 9))-1))/juros)*valor);
				i.lbl9.setText("Setembro: R$ " + Float.toString(soma53));
				float soma54 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl10.setText("Outubro: R$ " + Float.toString(soma54));
			break;
			
			case 11:
				float soma55 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma55));
				float soma56 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma56));
				float soma57 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma57));
				float soma58 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 4))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma58));
				float soma59 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 5))-1))/juros)*valor);
				i.lbl5.setText("Maio: R$ " + Float.toString(soma59));
				float soma60 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 6))-1))/juros)*valor);
				i.lbl6.setText("Junho: R$ " + Float.toString(soma60));
				float soma61 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 7))-1))/juros)*valor);
				i.lbl7.setText("Julho: R$ " + Float.toString(soma61));
				float soma62 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 8))-1))/juros)*valor);
				i.lbl8.setText("Agosto: R$ " + Float.toString(soma62));
				float soma63 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 9))-1))/juros)*valor);
				i.lbl9.setText("Setembro: R$ " + Float.toString(soma63));
				float soma64 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 10))-1))/juros)*valor);
				i.lbl10.setText("Outubro: R$ " + Float.toString(soma64));
				float soma65 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl11.setText("Novembro: R$ " + Float.toString(soma65));
			break;
			
			case 12:
				float soma66 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 1))-1))/juros)*valor);
				i.lbl1.setText("Janeiro: R$ " + Float.toString(soma66));
				float soma67 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 2))-1))/juros)*valor);
				i.lbl2.setText("Fevereiro: R$ " + Float.toString(soma67));
				float soma68 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 3))-1))/juros)*valor);
				i.lbl3.setText("Março: R$ " + Float.toString(soma68));
				float soma69 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 4))-1))/juros)*valor);
				i.lbl4.setText("Abril: R$ " + Float.toString(soma69));
				float soma70 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 5))-1))/juros)*valor);
				i.lbl5.setText("Maio: R$ " + Float.toString(soma70));
				float soma71 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 6))-1))/juros)*valor);
				i.lbl6.setText("Junho: R$ " + Float.toString(soma71));
				float soma72 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 7))-1))/juros)*valor);
				i.lbl7.setText("Julho: R$ " + Float.toString(soma72));
				float soma73 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 8))-1))/juros)*valor);
				i.lbl8.setText("Agosto: R$ " + Float.toString(soma73));
				float soma74 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 9))-1))/juros)*valor);
				i.lbl9.setText("Setembro: R$ " + Float.toString(soma74));
				float soma75 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 10))-1))/juros)*valor);
				i.lbl10.setText("Outubro: R$ " + Float.toString(soma75));
				float soma76 =  (float) ((1 + juros)*((((Math.pow((1 + juros), 11))-1))/juros)*valor);
				i.lbl11.setText("Novembro: R$ " + Float.toString(soma76));
				float soma77 =  (float) ((1 + juros)*((((Math.pow((1 + juros), mes))-1))/juros)*valor);
				i.lbl12.setText("Dezembro: R$ " + Float.toString(soma77));
			break;
	
			default:
				JOptionPane.showMessageDialog(null, "Valor inválido! Entre com um valor de 1 até 12, Por Favor!");
			break;
		
		}
		
		
	}

}


{% endhighlight %}