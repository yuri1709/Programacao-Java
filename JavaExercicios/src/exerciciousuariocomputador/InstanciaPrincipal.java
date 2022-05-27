/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciousuariocomputador;

/**
 *
 * @author 36127512021.2
 */
public class InstanciaPrincipal {
     public static void main (String[]args){
       
        //INSTANCIA
        Usuario usu = new Usuario();//new é um constructor
        Computador cmp = new Computador();
        Acesso acs = new Acesso();
        
        
        //GERADOR DE SENHA E LOGIN      
        usu.gerarLoginSenha();
        
        //LOGIN DO USUARIO
        acs.logarSe(); 
        
        //CADASTRO DE DADOS
        usu.cadastrarDados();
        
        //CADASTRO COMPUTADOR
        cmp.cadastrarcomputador();
                    
                     
        
        //VALIDAR LOGIN DO USUARIO
        //acs.validarLoginSenha();
    }       
}
