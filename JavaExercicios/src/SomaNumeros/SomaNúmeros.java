package SomaNumeros;
import java.util.Scanner; //

/*Author = Yuri.Conder*/

public class SomaNúmeros {
  
    public static void main (String args[]){
        
       Scanner entrada = new Scanner (System.in);
       int Num1, Num2, Soma;
       
       //Entrada de dados
       
       System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
       Num1 = entrada.nextInt();
       
       System.out.print("DIGITE O SEGUNDO NÚMERO: ");
       Num2 = entrada.nextInt(); 
       
       //Processamento

       Soma = Num1 + Num2;

       //Saída

       System.out.println("A SOMA DOS NÚMEROS É : "+Soma);
            
    }
       
}
