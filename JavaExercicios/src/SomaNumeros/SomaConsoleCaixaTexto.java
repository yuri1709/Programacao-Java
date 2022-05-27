
package SomaNumeros;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuri.Conder
 */
public class SomaConsoleCaixaTexto {
    public static void main (String args []){
         
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE 1o NÚMERO:"));
        
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE 2o NÚMERO:"));
        
        int soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "SOMA DE DOIS NÚMEROS\n"+
                                            "====================\n"+
                                            "1o NÚMERO      : "+numero1+"\n"+
                                            "1o NÚMERO      : "+numero2+"\n"+
                                            "==============\n"+
                                            "SOMA DOs NÚMEROS É: "+numero1+" + "+numero2+" = "+soma);
         
     }
}
