/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioautomoveis;

import javax.swing.JOptionPane;

/**
 *
 * @author Yuri.Conder
 */
public class InstanciaAutomoveis {
     public static void main(String[] args) {
       

    Carro CAR = new Carro();
    Caminhao CAM = new Caminhao();
    Moto MOT = new Moto();  
        
     String resposta = JOptionPane.showInputDialog ("Deseja executar programa Veículos?");
        
     while ( (resposta.equals("sim")) || (resposta.equals("Sim")) || (resposta.equals("sim")) ) {
                           
          String opveículos = JOptionPane.showInputDialog( "Escolha uma das opções do programa Veículos:\n"+
                                                           "---------------------------------------------\n"+
                                                           "A - Cadastrar\n"+
                                                           "B - Exibir Cadastro\n"+
                                                           "C - Emitir Nota-Fiscal de Venda\n"+                                                           
                                                           "D - Sair\n"+
                                                           "------------------------------------------");
          switch (opveículos) {
                           
           case "A":
                               
              String resp1 = JOptionPane.showInputDialog("CARRO OU CAMINHÃO OU MOTO?");
                               
              if ( (resp1.equals("CARRO")) || (resp1.equals("Carro")) || (resp1.equals("carro")) ) 
	      {
                                   
                  CAR.cadastrar();
                               
	      }
                               
              else
                                   
                 if ( (resp1.equals("CAMINHÃO")) || (resp1.equals("Caminhão")) || (resp1.equals("caminhão"))  )
                 {
                  
                   CAM.cadastrar();

                 }                 
                 else
                    
                    if ( (resp1.equals("MOTO")) || (resp1.equals("Moto")) || (resp1.equals("moto"))  ) {
                        
                       MOT.cadastrar();
                        
                    }
                    else {
                        
                        JOptionPane.showMessageDialog(null,  "Veículo inexistente!"); 
                    
                    }                                                                                         
           break;
           
           case "B":
                String resp2 = JOptionPane.showInputDialog("CARRO OU CAMINHÃO OU MOTO?");
                 if ( (resp2.equals("CARRO")) || (resp2.equals("Carro")) || (resp2.equals("carro")) ) 
	      {
                                   
                  CAR.exibirCadastro();
                               
	      }
                               
              else
                                   
                 if ( (resp2.equals("CAMINHÃO")) || (resp2.equals("Caminhão")) || (resp2.equals("caminhão"))  )
                 {
                  
                   CAM.exibirCadastro();

                 }                 
                 else
                    
                    if ( (resp2.equals("MOTO")) || (resp2.equals("Moto")) || (resp2.equals("moto"))  ){
                        
                        MOT.exibirCadastro();
                        
                    }
                    
                    else
                        JOptionPane.showMessageDialog(null,  "Veículo inexistente!"); 
                               
           break;
               
           case "C":
                               
              String resp3 = JOptionPane.showInputDialog("CARRO OU CAMINHÃO OU MOTO?");
                               
              if ( (resp3.equals("CARRO")) || (resp3.equals("Carro")) || (resp3.equals("carro")) ) {
                                   
                   CAR.emitirNotaFiscal();
                               
              }
                               
              else
                  
                 if ( (resp3.equals("CAMINHÃO")) || (resp3.equals("Caminhão")) || (resp3.equals("caminhão"))  )
                 {
                 
                    CAM.emitirNotaFiscal();

		 }
                                    
                 else
                    if  ( (resp3.equals("MOTO")) || (resp3.equals("Moto")) || (resp3.equals("moto"))  ){
                        
                        MOT.emitirNotaFiscal();
                        
                    }  
                    else                   
                    
                        JOptionPane.showMessageDialog(null,  "Veículo inexistente!");  
                               
          break;
                           
          case "D":
                     
              JOptionPane.showMessageDialog(null,  "Opção Sair escolhida!");
                     
          break;
                           
          default:

               JOptionPane.showMessageDialog(null,  "Opção inválida!");                         
                       
          }       
           
        
       resposta = JOptionPane.showInputDialog ("Deseja retornar ao menu de opções do programa?");
     }
        
     JOptionPane.showMessageDialog(null,  "Programa vai encerrar!");
  }
    
}
