// Eduardo Lima Ribeiro       Matricula:16/0049458


public class Principal {
	static JanelaPrincipal janela;
	public static void main(String[] args) {
		janela = new JanelaPrincipal();
	}
}


//==========================================================

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame {
	JLabel lbVF,
		   lbVA,
		   lbi,
		   lbn;
	
	JTextField txtVF,
			   txtVA,
			   txti,
			   txtn;
	
	JButton btCalc,
			btLimp;
	
	public JanelaPrincipal(){
		setTitle("Juros compostos");
		setSize(300, 400);
		setLocation(100,100);
		setLayout(new GridLayout(10,1));
		
		lbVF = new JLabel("Valor Futuro (VF): ");
		lbVA = new JLabel("Valor Presente (VA): ");
		lbi = new JLabel("Taxa (i): ");
		lbn = new JLabel("Tempo (n): ");
		
		txtVF = new JTextField("");
		txtVA = new JTextField("");
		txti = new JTextField("");
		txtn = new JTextField("");
		
		btCalc = new JButton("Calcular");
		btLimp = new JButton("Limpar");
		
		add(lbVF);
		add(txtVF);
		add(lbVA);
		add(txtVA);
		add(lbi);
		add(txti);
		add(lbn);;
		add(txtn);
		add(btCalc);
		add(btLimp);
		
		btCalc.addActionListener(new CalcListener(this));
		
		btLimp.addActionListener(new LimpListener(this));
		
		setVisible(true);
				
	}
}

//==========================================================

import java.awt.event.*;

public class LimpListener implements ActionListener {
	JanelaPrincipal j;
	public LimpListener(JanelaPrincipal janela){
		j = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		j.txtVF.setText("");
		j.txtVA.setText("");
		j.txti.setText("");
		j.txtn.setText("");
	}
}

//==========================================================

import java.awt.event.*;
import javax.swing.*;
public class CalcListener implements ActionListener {
	JanelaPrincipal j;
	public CalcListener(JanelaPrincipal janela){
		j = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(j.txtVF.getText().isEmpty()){
			float VA = Float.parseFloat(j.txtVA.getText());
			float i = Float.parseFloat(j.txti.getText())/100;
			float n = Float.parseFloat(j.txtn.getText());
			float VF;
			VF = (float) (VA * java.lang.Math.pow(1+i, n));
			j.txtVF.setText(String.format("%.2f", VF));
		}
		else if(j.txtVA.getText().isEmpty()){
			float VF = Float.parseFloat(j.txtVF.getText());
			float i = Float.parseFloat(j.txti.getText())/100;
			float n = Float.parseFloat(j.txtn.getText());
			float VA;
			VA = (float) (VF/(java.lang.Math.pow(1+i, n)));
			j.txtVA.setText(String.format("%.2f", VA));
		}
		else if(j.txti.getText().isEmpty()){
			float VF = Float.parseFloat(j.txtVF.getText());
			float VA = Float.parseFloat(j.txtVA.getText());
			float n = Float.parseFloat(j.txtn.getText());
			float i;
			i = (float) ((java.lang.Math.pow(VF/VA, 1/n) - 1)*100);
			j.txti.setText(String.format("%.2f", i));
		}
		else if (j.txtn.getText().isEmpty()){
			float VF = Float.parseFloat(j.txtVF.getText());
			float VA = Float.parseFloat(j.txtVA.getText());
			float i = Float.parseFloat(j.txti.getText())/100;
			float n;
			n = (float) ((java.lang.Math.log(VF) - java.lang.Math.log(VA))/java.lang.Math.log(i+1));
			j.txtn.setText(String.format("%.2f", n));
		}
		else{
			JOptionPane.showMessageDialog(null, "Por favor insira somente 3 dos 4 campos!");
		}
	}
}
