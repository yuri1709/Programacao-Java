/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioautomoveis;

import javax.swing.JOptionPane;

/**
 *
 * @author 36127512021.2
 */
public class Caminhao extends Automoveis {
     String marca;
    String modelo;
    double preço;
    
    public void emitirNotaFiscal(){
        
        marca  = JOptionPane.showInputDialog("DIGITE MARCA");
        
        modelo = JOptionPane.showInputDialog("DIGITE MODELO");
        
        preço  = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PREÇO"));
            
        String nomeComprador = JOptionPane.showInputDialog("DIGITE NOME DO COMPRADOR");
        
        String cpfComprador = JOptionPane.showInputDialog("DIGITE CPF DO COMPRADOR");
        
        JOptionPane.showMessageDialog(null, "NOTA FISCAL DE VENDA DE CAMINHÃO\n"+
                                            "=============================\n"+
                                            "MARCA          : "+marca+"\n"+
                                            "MODELO         : "+modelo+"\n"+
                                            "COR            : "+cor+"\n"+
                                            "CHASSI         : "+chassi+"\n"+
                                            "ANO FABRICAÇÃO : "+anoFab+"\n"+
                                            "PREÇO          : R$ "+preço+"\n"+
                                            "=============================\n"+
                                            "NOME COMPRADOR : "+nomeComprador+"\n"+
                                            "CPF COMPRADOR  : "+cpfComprador);
    }
    
    public void exibirCadastro(){
        
        JOptionPane.showMessageDialog(null, "CADASTRO AUTOMÓVEL\n"+
                                            "COR            : "+cor+"\n"+
                                            "CHASSI         : "+chassi+"\n"+
                                            "ANO FABRICAÇÃO : "+anoFab);
    }
}
