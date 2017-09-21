// Eduardo Lima Ribeiro             Matricula:16/0049458

public class Principal {
	static JanelaPrincipal janela;
	public static void main(String[] args) {
		janela = new JanelaPrincipal();
	}
}

// =======================================================


import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame {
	JLabel lbSn,
		   lbj,
		   lbp,
		   lbn,
		   lbSnF;
	
	JTextField txtj,
			   txtp,
			   txtn;
	
	JButton btCalc,
			btLimp;
	
	public JanelaPrincipal(){
		setTitle("Juros compostos");
		setSize(500, 500);
		setLocation(100,100);
		setLayout(new GridLayout(5,1));
		
		lbSn = new JLabel("Valor Obtido Final: ");
		lbp = new JLabel("Valor de depósito: ");
		lbj = new JLabel("Juros mensais: ");
		lbn = new JLabel("Tempo: ");
		lbSnF = new JLabel("");
		
		txtp = new JTextField("");
		txtj = new JTextField("");
		txtn = new JTextField("");
		
		btCalc = new JButton("Calcular");
		btLimp = new JButton("Limpar");
		
		add(lbp);
		add(txtp);
		add(lbj);
		add(txtj);
		add(lbn);;
		add(txtn);
		add(lbSn);
		add(lbSnF);
		add(btCalc);
		add(btLimp);
		
		btCalc.addActionListener(new CalcListener(this));
		
		btLimp.addActionListener(new LimpListener(this));
		
		setVisible(true);
				
	}
}


// =======================================================


import java.awt.event.*;

public class CalcListener implements ActionListener {
	JanelaPrincipal j;
	public CalcListener(JanelaPrincipal janela){
		j = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		float dep = Float.parseFloat(j.txtp.getText());
		float jur = Float.parseFloat(j.txtj.getText());
		float n = Float.parseFloat(j.txtn.getText());
		float Resultado;
		String SnF = "";
		for(int k = 1; k<=n;k++){
			Resultado = (float) ((1+jur/100) * (java.lang.Math.pow(1+jur, k)-1)/jur * dep);
			SnF += String.format("Mês %.1f: %.2f\n", n, Resultado);
		}
		j.lbSnF.setText(SnF);
	}
}


// =======================================================

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimpListener implements ActionListener {
	JanelaPrincipal j;
	public LimpListener(JanelaPrincipal janela){
		j = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		j.txtp.setText("");
		j.txtj.setText("");
		j.txtn.setText("");
		j.lbSnF.setText("");
	}
}
