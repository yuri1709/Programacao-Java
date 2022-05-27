package exercicioimovel;
import javax.swing.JOptionPane;
/**
 * @author Yuri.Conder
 */
public class InstanciaImovel {
    
    public static void main (String args[]){
        
        imóvel IMV = new imóvel();//esse new Imóvel constructor inicializa as variaves com valores padrões
        Acesso ASC = new Acesso();
        
       
       
        //MENU OPÇÕES
        String resposta = JOptionPane.showInputDialog("DESEJA CADASTRAR UM IMOVEL:");
            
        while(resposta.equals("sim")){
            
             String opcao = JOptionPane.showInputDialog("MENU DE OPÇÕES: \n"+
                                                       "==============  \n"+
                                                       "1 - CADASTRAR IMÓVEL\n"+
                                                       "2 - EXIBIR CADASTRO DO IMÓVEL\n"+
                                                       "3 - LOGIN \n"+
                                                       "==============  \n"+
                                                       "DIGITE SUA OPÇÃO NO ESPAÇO EM BANCO ABAIXO");
             
             switch(opcao){
                 
                 case "1":
                    IMV.cadastrarImovel();
                 break;
                 
                 case "2":
                    IMV.exibirCadastroImovel();    
                 break;
                 
                 case "3":
                    ASC.logarSe();    
                 break;
                 
                 default:
                     JOptionPane.showInputDialog(null,"OPÇÃO INVÁLIDA !");
                 break;
             }
             resposta = JOptionPane.showInputDialog(null,"DESEJA CONTINUAR ?");
        }
        JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA !!");
    }
}
