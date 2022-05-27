
package exerciciousuariocomputador;

import java.util.Random;
import javax.swing.JOptionPane;

public class Computador {
    
    String numerolab;
    int codigocomputador;
    
    Random rdm = new Random();
    
    void cadastrarcomputador(){
        
        numerolab = JOptionPane.showInputDialog("INSIRA O N DO LABORATORIO");
        
        codigocomputador = rdm.nextInt(5555);
        
        JOptionPane.showMessageDialog(null, "DADOS do computador\n"+
                                            "***************\n"+
                                            "NUMERO DO LABORATORIO: "+numerolab+"\n"+
                                            "CODIGO DO COMPUTADOR: "+codigocomputador+"\n"+
                                            "***************\n");
        
        
    }
    
    
    
    
}
