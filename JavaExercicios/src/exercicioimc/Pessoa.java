
package exercicioimc;

import java.util.Random;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Pessoa {

	String cpf, nome, endereco, telefone ,grau;
	double peso, altura, imc;

	DecimalFormat DF = new DecimalFormat("0.00");//é uma classe de arquivos textos que mostra 

	void calcularIMC() {
            
	   peso = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU PESO"));

	   altura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA ALTURA"));

	   imc = peso / (altura * altura);
           
           //estrutura de decisão da tabela IMC
           if (imc >= 40){
               //JOptionPane.showMessageDialog(null, "Obesidade grave");
               grau = "Obesidade grave";
           } else if(imc > 30){
                    //JOptionPane.showMessageDialog(null, "Obesidade");
                    grau = "Obesidade";                
                  } else if (imc > 25) {
                            grau = "Sobrepeso";
                        } else if (imc > 18.5) {
                                    grau = "Normal";
                                } else {
                                    grau = "Você é um bebê ?";
                                  }
           }


	void exibirCálculoIMC() {


	JOptionPane.showMessageDialog(null,  "DADOS DO IMC DE : "+nome+"\n"+
					     "===========================\n"+
					     "PESO          : "+DF.format(peso)+"\n"+
					     "ALTURA        : "+DF.format(altura)+"\n"+
					     "===========================\n"+
					     "IMC           : "+DF.format(imc)+"\n"+
                                             "GRAU OBESIDADE: "+grau);
		
	}
        
        void cadastrarPessoa(){
           
            cpf = JOptionPane.showInputDialog("DIGITE SEU CPF");
	    nome = JOptionPane.showInputDialog("DIGITE SEU NOME");
            telefone = JOptionPane.showInputDialog("DIGITE O N DO SEU TELEFONE");
            endereco = JOptionPane.showInputDialog("DIGITE SEU ENDEREÇO");
            
        }
}
