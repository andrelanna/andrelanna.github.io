Matheus Roberto Alves da Silva
13/0126721

```java

/*Main*/
package exercicio1valorfinal;

public class Exercicio1ValorFinal {
    
    static Janela janela;
    
    public static void main(String[] args) {
        janela = new Janela();

    }
    
}

//-----------------------------------------------------------


/*Classe Janela, com o JFrame*/
package exercicio1valorfinal;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
    JLabel lblValorFuturo, lblValorAtual, lblTaxaJuros, lblTempoAplicacao;
    JTextField txtValorFuturo, txtValorAtual, txtTaxaJuros, txtTempoAplicacao;
    JButton btnCalcular, btnLimpar;
    
    public Janela(){
        setLayout(new FlowLayout());
        setTitle("Valor Final");
        setSize(400, 400);
        
        GridLayout grdlyt = new GridLayout(5,2);
        setLayout(grdlyt);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para fechar o programa
        setLocationRelativeTo(null);//Coloca no meio.

        
        lblValorFuturo = new JLabel("Valor futuro: ");
        lblValorAtual = new JLabel("Valor Atual: ");
        lblTaxaJuros = new JLabel("Taxa de Juros: ");
        lblTempoAplicacao = new JLabel("Tempo de Aplicação: ");
        
        txtValorFuturo = new JTextField("");
        txtValorAtual = new JTextField("");
        txtTaxaJuros = new JTextField("");
        txtTempoAplicacao = new JTextField("");
        
        btnCalcular = new JButton("Calcular");
        btnLimpar = new JButton("Limpar");
        
        btnCalcular.addActionListener(new CalcularListener(this));
        btnLimpar.addActionListener(new LimparListener(this));
        
        
        add(lblValorAtual);
        add(txtValorAtual);
        add(lblTaxaJuros);
        add(txtTaxaJuros);
        add(lblTempoAplicacao);
        add(txtTempoAplicacao);        
        
        add(lblValorFuturo);
        add(txtValorFuturo);
        
        add(btnCalcular);
        add(btnLimpar);
        
        setVisible(true);

    }
    
}

/----------------------------------------------------------------------------------



/*Classe CalcularListener, com a ação do botão calcular*/
package exercicio1valorfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularListener implements ActionListener {
    
    Janela j;
    
    public CalcularListener(Janela janela) {
        j = janela;
    }

    public void actionPerformed(ActionEvent e) {
        
        
        if(j.txtValorFuturo.getText().toString().trim().equals("")){
            float Va = Float.parseFloat(j.txtValorAtual.getText());
            float i = Float.parseFloat(j.txtTaxaJuros.getText());
            float n = Float.parseFloat(j.txtTempoAplicacao.getText());

            i = i+1;
            float total = (float) (Va*(Math.pow(i, n)));
            j.txtValorFuturo.setText(Float.toString(total));            
        }
        
        else if(j.txtValorAtual.getText().toString().trim().equals("")){
            float i = Float.parseFloat(j.txtTaxaJuros.getText());
            float n = Float.parseFloat(j.txtTempoAplicacao.getText());
            float Vf = Float.parseFloat(j.txtValorFuturo.getText());
            i = i+1;
            float total = (float) (Vf/(Math.pow(i, n)));
            j.txtValorAtual.setText(Float.toString(total));                        
        }
        else if(j.txtTaxaJuros.getText().toString().trim().equals("")){
            float Va = Float.parseFloat(j.txtValorAtual.getText());
            float n = Float.parseFloat(j.txtTempoAplicacao.getText());
            float Vf = Float.parseFloat(j.txtValorFuturo.getText());
            float total = (float) (((Math.pow((Vf/Va),(1.0/n)))-1));
            j.txtTaxaJuros.setText(Float.toString(total));                                    
        }
        else if(j.txtTempoAplicacao.getText().toString().trim().equals("")){
            float Va = Float.parseFloat(j.txtValorAtual.getText());
            float i = Float.parseFloat(j.txtTaxaJuros.getText());
            float Vf = Float.parseFloat(j.txtValorFuturo.getText());
            float total = (float) (Math.log(Vf/Va)/Math.log(1+i));
            j.txtTempoAplicacao.setText(Float.toString(total));                                                
        }
    }
    
}
//---------------------------------------------------------------------------------------




/*Classe LimparListener, com a ação do botão limpar.*/

package exercicio1valorfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparListener implements ActionListener {
   
    Janela j;
    
    public LimparListener(Janela janela) {
        j = janela;
    }

    public void actionPerformed(ActionEvent e) {
      j.txtValorFuturo.setText("");
      j.txtValorAtual.setText("");
      j.txtTaxaJuros.setText("");
      j.txtTempoAplicacao.setText("");
      
    }
    
}

//-----------------------------------------------------------------------------------------

```

