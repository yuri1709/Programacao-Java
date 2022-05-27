/*
 * classe do usuario
 */
package exerciciousuariocomputador;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuri.Conder
 */
public class Usuario {
    //variaveis globais
    String cpf, 
           telefoneContato,
           nome,
           login;
    
    int senha = 0;
    Random rdm = new Random();
    void cadastrarDados(){
        //se criar uma nova varivel dentro do metodo ela é local 
        cpf = JOptionPane.showInputDialog("INSIRA O N DO SEU CPF");
         telefoneContato = JOptionPane.showInputDialog("INSIRA O N DO SEU TELEFONE:");
         nome = JOptionPane.showInputDialog("INSIRA O SEU NOME:");                           
    }
    
    void gerarLoginSenha(){ 
          JOptionPane.showMessageDialog(null,"NAS CAIXAS SEGUINTES, VOCÊ IRÁ GERAR O SEU LOGIN E SENHA");
        
        login = JOptionPane.showInputDialog("INSIRA O SEU LOGIN:");
        //senha = rdm.nextInt(5555);
        senha = Integer.parseInt(JOptionPane.showInputDialog("INSIRA A SUA SENHA"));
        
        //Saída
        JOptionPane.showMessageDialog(null,"Seu login gerado é: "+login +
                                           "\nSua senha gerada é: "+senha
                                      );                            
    }   
}
