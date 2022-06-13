/*
 * yuri.conder
 */
package exercicioautomoveis;

import javax.swing.JOptionPane;


public class Automoveis {
     
    String cor;
    String chassi;
    String anoFab;
    
    public void cadastrar(){
        
       cor = JOptionPane.showInputDialog("DIGITE COR");
       
       chassi = JOptionPane.showInputDialog("DIGITE CHASSI");
       
       anoFab = JOptionPane.showInputDialog("DIGITE ANO DE FABRICAÇÃO");
        
    } 
}
