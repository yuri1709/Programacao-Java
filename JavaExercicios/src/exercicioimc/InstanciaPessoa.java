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
  static boolean flag = true;        
   
  public static void main (String[]args){
       Pessoa p1 = new Pessoa();        
       Acesso login = new Acesso();        
        
                   
        //menu de opções
        String resposta = JOptionPane.showInputDialog("DESEJA CALCULA O SEU IMC ?");
        while (resposta.equals("sim")){
            
                String opcao = JOptionPane.showInputDialog(    
                                                                "1 - LOGIN\n" +                                                                                                                                                                                                                                                              
                                                                "2 - CADASTRAR\n"+
                                                                "0 - Sair\n"+
                                                                "==============  \n"+
                                                                "DIGITE SUA OPÇÃO NO ESPAÇO EM BANCO ABAIXO");  
       
        if(opcao.equals("2")){              
                opcao = "1";                
                flag = false;
        }
        
        while( !opcao.equals("1") && !opcao.equals("2")) {
            opcao = JOptionPane.showInputDialog( "Você deve estar logado para acessar as demais opções\n"
                    + "1- LOGIN\n"+
                      "2- CADASTRAR"); 
            if(opcao.equals("2")){              
                opcao = "1";                
                flag = false;
            }
        }    
                
        switch(opcao) {
            case "1":             
                if (flag != false){
                    String primeiroAcesso = JOptionPane.showInputDialog("É o seu primeiro acesso ?");               
                    if (primeiroAcesso.equals("Sim") || primeiroAcesso.equals("sim")  || primeiroAcesso.equals("SIM") ){
                         login.gerarLoginSenha(); 
                    }else {                       
                       login.validarAcesso(); 
                    }                             
                }else {                    
                    login.gerarLoginSenha(); 
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
