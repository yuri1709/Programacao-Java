package exercicioimovel;

import java.util.Random;
import javax.swing.JOptionPane;// a classe JOption só lê arquivos em string

/**
 *
 * @author Yuri.
 */
public class imóvel {
    // atribuir valor não é obrigatório mas é uma boa prática de programação
    int codigoImovel = 0;
    String bairro, 
           localizacao,
           numeroQuartos; 

    double preco = 0.0;
    
    String login;
    int senha = 0;
    //os métodos que não há necessidade de retorno eu coloco void
    Random rdm = new Random();
    
    void cadastrarImovel(){
        
        codigoImovel = rdm.nextInt(5555); //nextInt serve para 
        bairro = JOptionPane.showInputDialog("DIGITE BAIRRO DO IMÓVEL");
        localizacao = JOptionPane.showInputDialog("DIGITE LOCALIZACAO DO IMÓVEL");
        numeroQuartos = JOptionPane.showInputDialog("DIGITE O N DO QUARTO DO IMÓVEL");
        
        preco = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PREÇO DO IMÓVEL"));        
    }                       

    
    void exibirCadastroImovel() {
        
        JOptionPane.showMessageDialog(null, "DADOS DO IMÓVEL\n"+
                                            "=================\n"+
                                            "CÓDIGO DO IMÓVEL           :"+codigoImovel+"\n:"+
                                            "BAIRRO DO IMÓVEL           :"+bairro+"\n:"+
                                            "LOCALIZAÇÃO DO IMÓVEL      :"+localizacao+"\n:"+
                                            "QTDE DE QUARTOS DO IMÓVEL  :"+numeroQuartos+"\n:"+
                                            "PREÇO                      :R$ "+preco+" reais\n"+
                                            "========================"    
                
                );
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


