/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciousuariocomputador;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Yuri.Conder
 */
public class Acesso {                                      
    String login,
           senhaDoUsuario;
    int senha;
        
     //criando uma instancia de Usuario para fazer a comparação entre as senhas
    Usuario userValidacao = new Usuario();
    //senhaDoUsuario = userValidacao.senha;
    
    //Este método vai receber o login e a senha do usuário
    void logarSe(){     
        JOptionPane.showMessageDialog(null,"NAS CAIXAS SEGUINTES, VOCÊ IRÁ EFETUAR O SEU LOGIN");
        login = JOptionPane.showInputDialog("Login: ");
        senha = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua senha:")); 
        
      /*   if (senha == userValidacao.senha){
             JOptionPane.showMessageDialog(null,"LOGIN EFETUADO COM SUCESSO");
        }else{
            JOptionPane.showMessageDialog(null,"SENHA OU USUÁRIO INVÁLIDOS");
        }
        System.out.print("SENHA DIGITADA="+senha);
        System.out.print("/nSENHA DO USUARIO:"+ userValidacao.senha);
        */
        if( (login.equals("yuri")) & (senha ==  123) ){    //comparação de números é o == e para comparação de string é equals.
           JOptionPane.showMessageDialog(null,"LOGIN EFETUADO COM SUCESSO");
        } else {
             JOptionPane.showMessageDialog(null,"ACESSO NEGADO");
             System.exit(0);
        }
    }
   
    
//TRANSFERIR ESSE METODO PARA OUTRA CLASSE
    void validarLoginSenha(){
     //mudei para o método logarSe  
    }
}
