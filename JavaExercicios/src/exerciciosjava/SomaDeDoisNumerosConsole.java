
package exerciciosjava;

import java.util.Scanner;//leitura de entrada

/**
 *
 * @author Yuri.Conder
 */
public class SomaDeDoisNumerosConsole {
    
    public static void main (String args []){
        
        Scanner entradadados = new Scanner (System.in);
        //Entrada
        System.out.println("DIGITE UM NÚMERO:");
        int num1 = entradadados.nextInt();
        
        System.out.println("DIGITE OUTRO NUMERO:");
        int num2 = entradadados.nextInt();
        
        //processo
        int resultado = num1 + num2;
        
        //Saída
        System.out.println("RESULTADO:");
        System.out.println(num1 + "+" + num2 + "= "+ resultado);
                                
    }        
}
