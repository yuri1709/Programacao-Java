package exercicioempregados;
import javax.swing.JOptionPane;
/**
 * @author Yuri Conder
 */
public class InstanciaEmpregado {
    
    public static void main(String[]args){
        //Instancia
        Empregados EMPR = new Empregados();
        AcessoEmpregado ACS = new AcessoEmpregado();
        
        //Var globais
        boolean isLogin = false;
        String res;
      
        //Inicio do programa
        do{
            if(isLogin == false)
            {
              String op = JOptionPane.showInputDialog("MENU-PRINCPIAL\n"
                                                    + ("-------------------------\n")
                                                    + "1-LOGIN\n"
                                                    + "2-CADASTRAR\n"+
                                                      "0-Sair");
              switch(op){
                  case "1":
                      ACS.validarAcesso();
                      isLogin = true;
                  break;
                  
                  case"2":
                      ACS.gerarLoginSenha();
                  break;
                  
                  case"0":
                       System.exit(0);
                       JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO COM SUCESSO!");
                  break;
                  
                  default:
                       JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
              }
            } else{
               String op2 = JOptionPane.showInputDialog("MENU-FUNCIONARIO\n"
                                                      + "Bem vindo(a) "+ACS.login+" !\n"
                                                      +  "---------------------------\n"
                                                      + "1-CADASTRAR\n"+
                                                        "2-EXIBIR CADASTRO\n"+
                                                        "3-Deslogar");
               
               switch(op2){
                   case "1":
                       EMPR.cadastrarDadosEmpregado();
                       JOptionPane.showMessageDialog(null, "Informe o seu tempo de serviço");
                     int ano = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você serviu ?"));
                      int mes = Integer.parseInt(JOptionPane.showInputDialog("Quantos os meses ?"));
                       int dia = Integer.parseInt(JOptionPane.showInputDialog("E quantos dias ?"));
                       EMPR.calcularTempoSvc(ano, mes, dia);
                   break;
                   
                   case "2":
                       //EMPR.nome = JOptionPane.showInputDialog("nome"); //encapsulamento, você como que dá erro.
                       EMPR.exibirDadosEmpregado();
                   break; 
                   
                    case "3":
                      JOptionPane.showMessageDialog(null, "Deslogado com sucesso!"); 
                      isLogin = false;
                   break; 
                        
                    default:
                       JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
               }
            }
           
        
            res = JOptionPane.showInputDialog("Deseja voltar ao menu principal ?");       
        }while(res.equals("Sim") || res.equals("sim") || res.equals("SIM"));
        
        JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO COM SUCESSO!");        
    } //FINAL DO PROGRAMA
}
