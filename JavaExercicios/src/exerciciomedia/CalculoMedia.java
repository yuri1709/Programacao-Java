
package exerciciomedia;
import java.util.Random;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author Yuri.Conder
 */
public class CalculoMedia {
    
    String nome, situacao;
    int matricula;
    double nota1,nota2,media;
    
   void calcularMedia(){
       
       nome = JOptionPane.showInputDialog("INSIRA O SEU NOME");
       matricula = Integer.parseInt(JOptionPane.showInputDialog("INSIRA A SUA MATRICULA"));
       nota1 = Integer.parseInt(JOptionPane.showInputDialog("INSTA A SUA NOTA 1"));
       nota2 = Integer.parseInt(JOptionPane.showInputDialog("INSIRA A SUA NOTA 2"));
       
       //media
       media = (nota1 + nota2)/2;
       
       if (media <= 5.0){
           situacao = "REPROVADO";
       }else if ((media > 5.0)&&(media <= 6.5)){
                situacao = "RECUPERAÇÃO";
             } else {
                   situacao = "APROVADO";
        }
    }

   void exibirCalculoMedia(){
       JOptionPane.showMessageDialog(null,
                "NOME:"+nome+"\n"+
                "MATRICULA:"+matricula+"\n"+
                "SUA MÉDIA É:"+media+"\n"+        
                "VOCÊ FOI:" +situacao
                
       );
    }
}
    
   