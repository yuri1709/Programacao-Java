package SomaNumeros;
import java.util.Scanner;
/**
 *
 * @author Yuri.Conder
 */
public class ProdutoNúmeros {
    
    public static void main (String args[]){
        
       Scanner entrada = new Scanner (System.in);
       int Num1, Num2, produto;
       
       //Entrada de dados
       
       System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
       Num1 = entrada.nextInt();
       
       System.out.print("DIGITE O SEGUNDO NÚMERO: ");
       Num2 = entrada.nextInt(); 
       
       //Processamento

       produto = Num1 * Num2;

       //Saída          
        System.out.println("PRODUTO DE DOIS NÚMEROS");
        System.out.println("********************");
        System.out.println("1o NÚMERO     : "+Num1);
        System.out.println("2o NÚMERO     : "+Num2);
        System.out.println("********************");
        System.out.println("SOMA DOS NÚMEROS É : "+Num1+" x "+Num2+" = "+produto);
                
    }
}
