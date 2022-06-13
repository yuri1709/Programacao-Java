
package contador;
import javax.swing.JOptionPane;
/**
 *
 * @author Gamer
 */
public class Contador {
    //Atributos
   String hello;
    
    //Métodos
    void repeticaoNoInicio(){
      int N1 = 0;    
      for(N1=0; N1<=10;N1++) {
        JOptionPane.showMessageDialog(null, N1);
      }      
    }
    
    void repeticaoNoFinal(){
        int N1 = 0;
        do{
            JOptionPane.showMessageDialog(null,N1);
            N1 = N1 + 1;                        
        }while(N1<=10);
        
    }
}
