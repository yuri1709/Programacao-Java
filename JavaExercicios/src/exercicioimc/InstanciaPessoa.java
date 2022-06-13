/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioimc;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Yuri.Conder
 */
public class InstanciaPessoa {
        
   
  public static void main (String[]args){
      // toda variavel criada aqui é global. Se for criada dentro de um bloco ela é local.
      Pessoa p1 = new Pessoa();        
       Acesso login = new Acesso();
       boolean flag1 = true; 
       boolean isLogin = false;
        
                   
        //menu de opções
        String resposta = JOptionPane.showInputDialog("DESEJA CALCULA O SEU IMC ?");
        while (resposta.equals("sim")){
            
                String opcao = JOptionPane.showInputDialog(    
                                                                "1 - LOGIN\n" +                                                                                                                                                                                                                                                              
                                                                "2 - CADASTRAR\n"+
                                                                "0 - Sair\n"+
                                                                "==============  \n"+
                                                                "DIGITE SUA OPÇÃO NO ESPAÇO EM BANCO ABAIXO");  
                //condição se o usuário não estiver logado.
                if (isLogin == false) { 
                    if(opcao.equals("2")){              
                            opcao = "1";                
                            flag1 = false;
                    }

                    while( !opcao.equals("1") && !opcao.equals("2")) {
                        opcao = JOptionPane.showInputDialog( "Você deve estar logado para acessar as demais opções\n"
                                + "1- LOGIN\n"+
                                  "2- CADASTRAR"); 
                        if(opcao.equals("2")){              
                            opcao = "1";                
                            flag1 = false;
                        }
                    }    
                } else { //Se o usuário estiver logado
                    
                }
                
                
                switch(opcao) {
                    case "1":             
                        if (flag1 != false || isLogin == false){
                            String primeiroAcesso = JOptionPane.showInputDialog("É o seu primeiro acesso ?");               
                            if (primeiroAcesso.equals("Sim") || primeiroAcesso.equals("sim")  || primeiroAcesso.equals("SIM") ){
                                 login.gerarLoginSenha(); 
                            }else {                       
                               login.validarAcesso();
                               isLogin = true;                    
                            }                             
                        }else {                    
                            login.validarAcesso(); 
                        }

                    break;

                    case "2":
                      p1.calcularIMC();
                    break;

                    case "3":
                       p1.exibirCálculoIMC(); 
                    break;

                     case "0":                   
                        System.exit(0); 
                    break;

                    default:
                        JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA !!");
                    break;
                }
                resposta = JOptionPane.showInputDialog("DESEJA CONTINUAR?");
            }
     JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA !!");
   }            
}
