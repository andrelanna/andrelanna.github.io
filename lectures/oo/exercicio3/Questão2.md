Matheus Roberto Alves da Silva
13/0126721

```java

/*Main*/

package exercicio2valorfinal;

public class Exercicio2ValorFinal {
    static Janela janela;
    public static void main(String[] args) {
        janela = new Janela();
    }    
}

//-----------------------------------------------------------


/*Classe Janela, com o JFrame*/
package exercicio2valorfinal;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class Janela extends JFrame{
    JButton btnCalcular, btnLimpar;
    JLabel lblValorFinal, lblTaxaJuros, lblValorDeposito, lblNumeroMeses;
    JTextField txtValorFinal, txtTaxaJuros, txtValorDeposito, txtNumeroMeses;

    JPanel painel, painel2;


    
    public Janela(){

        setLayout(new FlowLayout(0,0,0));
        setTitle("Valor Final");
        setSize(400, 700);
        
        painel = new JPanel();
        painel.setLayout(new GridLayout(100,100));
        painel.setSize(400,200);        
       
        painel.setLocation(0, 0);
        
        painel2 = new JPanel();
        painel2.setLayout(new GridLayout(5,2));
        painel2.setSize(200, 200);

        JScrollPane scroll = new JScrollPane(painel2);
    
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para fechar o programa
        setLocationRelativeTo(null);//Coloca no meio.
        
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new CalcularListener(this));
        
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new LimparListener(this));
        
        
        lblValorFinal = new JLabel("Valor final: ");
        lblValorDeposito = new JLabel("Valor de Depósito: ");
        lblTaxaJuros = new JLabel("Taxa de Juros: ");
        lblNumeroMeses = new JLabel("Número de Meses: ");

        txtValorFinal = new JTextField("");
        txtValorDeposito = new JTextField("");
        txtTaxaJuros = new JTextField("");
        txtNumeroMeses = new JTextField("");
        
        add(painel2);
        
        painel2.add(lblValorDeposito);
        painel2.add(txtValorDeposito);
        
        painel2.add(lblTaxaJuros);
        painel2.add(txtTaxaJuros);
        
        painel2.add(lblNumeroMeses);
        painel2.add(txtNumeroMeses);
        
        painel2.add(lblValorFinal);
        painel2.add(txtValorFinal);
        
        painel2.add(btnCalcular);
        painel2.add(btnLimpar);
        
        add(painel);
        

        setVisible(true);
    }
}

/----------------------------------------------------------------------------------



/*Classe CalcularListener, com a ação do botão calcular*/
package exercicio2valorfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class CalcularListener implements ActionListener {
    
    Janela j;
    public CalcularListener(Janela janela) {
        j = janela;
    }

    CalcularListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actionPerformed(ActionEvent e) {
        if(j.txtNumeroMeses.getText().equals("") || 
                j.txtValorDeposito.getText().equals("") ||
                j.txtNumeroMeses.getText().equals("")){}

        else{
            float ju = Float.parseFloat(j.txtTaxaJuros.getText());
            float p = Float.parseFloat(j.txtValorDeposito.getText());
            float n = Float.parseFloat(j.txtNumeroMeses.getText());
            float S = (int) (((1+ju)*((Math.pow((1+ju), n) - 1)/ju)*p)*100);
            S = (float) (S/100.00);
            j.txtValorFinal.setText(Float.toString(S));

            String s = "";

            for(int i=1; i<=Float.parseFloat(j.txtNumeroMeses.getText()); i++){
                JLabel label = new JLabel();
                float total = (int) (((1+ju)*((Math.pow((1+ju), i) - 1)/ju)*p)*100);
                total = (float) (total/100.00);
                label.setVisible(true);
                label.setText("Mês: " + i + "  Valor: " 
                        + total);
                j.painel.add(label);
                label.updateUI();
            }
            
        }
    }

    
}

//---------------------------------------------------------------------------------------




/*Classe LimparListener, com a ação do botão limpar.*/

package exercicio2valorfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparListener implements ActionListener {
    Janela j;
    public LimparListener(Janela janela) {
        j = janela;
    }

    public void actionPerformed(ActionEvent e) {
        j.painel.removeAll();
        j.painel.repaint();
        j.txtNumeroMeses.setText("");
        j.txtTaxaJuros.setText("");
        j.txtValorDeposito.setText("");
        j.txtValorFinal.setText("");
    }
    
}

//-----------------------------------------------------------------------------------------

```

