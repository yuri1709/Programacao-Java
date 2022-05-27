/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciomedia;

import javax.swing.JOptionPane;

/**
 *
 * @author 36127512021.2
 */
public class InstanciaCalculoMedia {
    
    public static void main(String[]args){
        CalculoMedia media = new CalculoMedia();
     
        
        String resposta = JOptionPane.showInputDialog("DESEJA CALCULAR MÉDIA");
      
        while (resposta.equals("sim")) {
        
        
            String opcao = JOptionPane.showInputDialog("MENU DE OPÇÕES: \n"+
                                                       "==============  \n"+
                                                       "1 - CALCULAR MÉDIA\n"+
                                                       "2 - EXIBIR MÉDIA\n"+
                                                       "==============  \n"+
                                                       "DIGITE SUA OPÇÃO NO ESPAÇO EM BANCO ABAIXO");

            switch(opcao) {

                case "1":
                    media.calcularMedia();
                break; // se essa opção for escolhida ela vai sair da estrutura

                case "2":
                    media.exibirCalculoMedia();
                break;

                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA !!");
                break;
            }
            resposta = JOptionPane.showInputDialog("DESEJA CONTINUAR");
           }//FIM DO WHILE
            JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA !!");
        }
   
}
