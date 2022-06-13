/*
 Essa instância faz a mesma coisa que a instanciaPessoa, porém a estrutura de repetição
 utilizada aqui será a Do While 
*/
package exercicioimc;

import javax.swing.JOptionPane;

/**
 *
 * @author 36127512021.2
 */
public class InstanciaPessoa2 {
    public static void main(String[] args) {
            
         Acesso acs = new Acesso ();
	 Pessoa pes = new Pessoa ();

        String Resp = JOptionPane.showInputDialog("OLÁ !! BEM VINDO À ABC CÁLCULO DE IMC ! !\n"+
						  "DESEJA UTILIZAR NOSSO PROGRAMA?");

	do {           
           
           
            String primAcesso = JOptionPane.showInputDialog( "É SEU 1o ACESSO?");
            
            if ((primAcesso.equals("SIM")) || (primAcesso.equals("Sim")) || (primAcesso.equals("sim"))) {
                
                     acs.gerarLoginSenha();
            
                    }
            else {
                       acs.validarAcesso();
            
            
            String Op = JOptionPane.showInputDialog( "OLÁ !! BEM VINDO AO NOSSO MENU PRINCIPAL ! !\n"+
                                                    "------------------------------------------------------------\n"+
                                                    "VOCÊ ESTÁ ACESSANDO NOSSO PROGRAMA PARA REALIZAR\n"+
                                                    "O CÁLCULO DO IMC EM PESSOAS ! ! \n"+
                                                    "ESCOLHA UMA DAS OPÇÕES ABAIXO PARA REALIZAR SEU CÁLCULO DE IMC\n"+
                                                    "------------------------------------------------------------\n"+
                                                    "-------------------------------------------------------------\n"+
                                                    "1 - CADASTRAR DADOS PESSOAIS\n"+
                                                    "2 - EXIBIR DADOS PESSOAIS\n"+
                                                    "3 - CALCULAR  E EXIBIR IMC\n"+
                                                    "4 - SAIR\n"+
                                                    "--------------------------------------------");
           
        
            switch (Op) {
                
                case "1":

		   //pes.cadastrarDadosPessoais();
                    pes.cadastrarPessoa();

		break;
                
                case "2":
                    
                   //pes.exibirDadosPessoais();
                   pes.calcularIMC();
                break;

                case "3":

                   //pes.calculareExibirIMC();
                   pes.exibirCálculoIMC();
                break;
                
                case "4":

		      JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO SAIR!!");

		break;

		default:

		      JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!!"); 

              }
            
            }
            
            Resp = JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?");

        } 

	while ( (Resp.equals("SIM")) || (Resp.equals("Sim")) || (Resp.equals("sim"))  );
        
        JOptionPane.showMessageDialog(null, "OBRIGADO POR UTILIZAR NOSSO PROGRAMA ! !");
    }
}
