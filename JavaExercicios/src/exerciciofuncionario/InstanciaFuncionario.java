 //utilizar JOptionPane e o arraylist
package exerciciofuncionario;
import javax.swing.JOptionPane;
/**
 *
 * @author Yuri.Conder
 */
public class InstanciaFuncionario {
    
    public static void main(String[]args){
       //INSTANCIAS
        Acesso asc = new Acesso();
        Funcionario fnc = new Funcionario();
        Automoveis car = new Automoveis();
       //VAR GLOBAIS
       Boolean isLogin = false;
       String op ="";
       //CADASTRO FUNCIONARIO 
       String Resp = JOptionPane.showInputDialog("BEM VINDO AO SISTEMA DE CADASTRAR FUNCIONÁRIO\n"+
                                                 "Deseja cadastrar funcionário ?");
       
       while(Resp.equals("Sim")|| Resp.equals("sim") || Resp.equals("SIM")) {
            //VALIDAR LOGIN
           if (isLogin == false) {
                op = JOptionPane.showInputDialog("Muito bem! primeiro precisamos que o login com usuário e senha sejam efetuados\n"
                    + "Caso não possua cadastro, pressione a tecla 2");
           }else{
            
            if(op.equals("2") && isLogin == false) {
                 asc.gerarLoginSenha();               
                 asc.validarAcesso();  
                 isLogin = true;
                 op = JOptionPane.showInputDialog("MENU-PRINCIPAL\n"+
                                                  "================\n"+
                                                  "1-CADASTRO\n"+
                                                  "2-EXIBIR CADASTRO\n"+
                                                  "Insira a opção abaixo:");
             } else {
                 op = JOptionPane.showInputDialog("MENU-PRINCIPAL\n"+
                                                  "================\n"+
                                                  "1-CADASTRO\n"+
                                                  "2-EXIBIR CADASTRO\n"+                                                 "Insira a opção abaixo:");
             }

             //MENU-OPÇÕES
             switch (op) {
                 //MENU-CADASTRO
                 case "1":
                    String op1 = JOptionPane.showInputDialog("MENU-CADASTRO\n"+
                                                             "==============\n"+
                                                             "1-CADASTRAR FUNCIONARIO\n"+ //EU POSSO BOTAR UM ACESSO QUANDO FOR CADASTRAR O FUNCIONARIO E DETERMINAR QUAL USUARIO ELE É
                                                             "2-CADASTRAR AUTOMOVEL\n"+
                                                             "Insira a opção abaixo:");
                    //SUB-MENU
                    switch(op1) {
                        case "1":
                            JOptionPane.showMessageDialog(null, "Você selecionou a opção CADASTRAR FUNCIONÁRIO\n"+
                                                                 "Primeiro você irá criar uma conta ou fazer login para o cadastro");
                            //vamos supor que ele nao tem login e vamos jogar direto para cadastrar conta
                            asc.gerarLoginSenha();
                            fnc.cadastrarDadosFunc();
                        break;

                        case "2":
                            JOptionPane.showMessageDialog(null, "Você selecionou a opção CADASTRAR AUTOMÓVEL");
                            car.cadastrarAutomoveis();
                        break;

                        default:
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }                      
                 break;
                 // MENU-EXIBIR-CADASTRO
                 case "2":
                     String op2 = JOptionPane.showInputDialog("MENU-EXIBIR-CADASTRO\n"+
                                                              "====================\n"+
                                                              "1-EXIBIR CADASTRO DO FUNCIONÁRIO\n"+
                                                              "2-EXIBIR CADASTRO DO AUTOMÓVEL\n"+
                                                              "3-PESQUISAR FUNCIONÁRIO\n"+
                                                              "4-PESQUISAR AUTOMÓVEL"+
                                                              "Insira a opção abaixo:");
                     // SUB-MENU
                     switch(op2) {
                         case "1":
                             JOptionPane.showMessageDialog(null, "Você selecionou a opção EXIBIR CADASTRO DO FUNCIONÁRIO");
                             fnc.exibirDadosFunc();
                         break;    

                         case "2":
                             JOptionPane.showMessageDialog(null, "Você selecionou a opção EXIBIR CADASTRO DO AUTOMÓVEL");
                             car.exibirAutomoveis();
                         break;

                         case "3":
                             JOptionPane.showMessageDialog(null, "Você selecionou a opção PESQUISAR FUNCIONÁRIO");
                             fnc.pesquisaDadosFunc();
                         break;

                         case "4":
                         break;

                         default:
                             JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                     }
                 break;

                 default:
                     JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!!");
             }
         Resp = JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?");
       } 
        JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO COM SUCESSO!");
    }
}
} 