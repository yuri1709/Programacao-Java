
package exerciciosjava;
import java.util.Scanner; //classe que serve para entrada
/**
 *
 * @author Yuri.Conder
 */
public class TerceiroPrograma {
    
    public static void main (String args []){
        Scanner entradados = new Scanner (System.in);//constructor

        System.out.println("DIGITE O SEU NOME");
        String nome = entradados.next();
        
        System.out.println("DIGITE O SEU SOBRENOME");
        String sobrenome = entradados.next();
        
        System.out.println("DADOS PESSOAIS");
        System.out.println("**************");
        System.out.println("NOME :" + nome);
        System.out.println("SOBRENOME:" + sobrenome);
        System.out.println("***********");
        System.out.println("NOME COMPLETO: " +nome +" "+ sobrenome);                     
    }
    
}
