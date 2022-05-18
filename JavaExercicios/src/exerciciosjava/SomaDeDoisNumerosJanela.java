
package exerciciosjava;
import java.util.Scanner;//leitura de entrada
import javax.swing.JOptionPane;// PERMITE A UTILIZAÇÃO DE CAIXAS DE TEXTOS
/**
 *
 * @author Yuri.Conder
 */
public class SomaDeDoisNumerosJanela {
    
    public static void main (String args []){
           
        //Entrada
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NÚMERO:"));//  ARGUMENTO É INFORMAÇÃO NECESSARIA E O PARAMETRO É O DADO DA INFORMAÇÃO NECESSARIA, 
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NÚMERO:")); 
        
        //processo
        int resultado = num1 + num2;
        
        //Saída
         //LayOut de SAÍDA
        JOptionPane.showMessageDialog(null, "SOMA DE DOIS NÚMEROS\n"+
                                      "---------------------\n"+
                                      "Número 1: "+ num1+
                                      "\nNúmero 2: "+ num2+
                                      "\n----------------------\n"+ 
                                      "\nResultado:"+ num1 + "+" + num2 + "= "+ resultado 
                                            
        );
                                
    }        
}