
package exerciciosjava;
import javax.swing.JOptionPane;// PERMITE A UTILIZAÇÃO DE CAIXAS DE TEXTOS
/**
 *
 * @author Yuri.Conder
 */
public class LerNome {
   
    public static void main (String args []){
        //Entrada de dados
        String nome = JOptionPane.showInputDialog("DIGITE SEU NOME:");     
        String sobrenome = JOptionPane.showInputDialog("DIGITE SEU SOBRENOME:");
        
        
        //LayOut de SAÍDA
        JOptionPane.showMessageDialog(null, "DADOS PESSOAIS\n"+
                                      "---------------------\n"+
                                      "NOME: "+ nome+
                                      "\nSOBRENOME: "+ sobrenome+
                                      "\n----------------------\n"+ 
                                      "\nNOME COMPLETO: "+ nome+" "+sobrenome
                                            
        );
        
    }
}
