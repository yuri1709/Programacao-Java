/*
Classe de carros
 */
package exerciciofuncionario;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author Yuri.Conder
 */
public class Automoveis {
    //ATRIBUTOS
    ArrayList<String>cor = new ArrayList<>();
    ArrayList<String>anoFab = new ArrayList<>();
    ArrayList<String>chassi = new ArrayList<>(); 
    ArrayList<Double>preco = new ArrayList<>();
          
    //MÉTODOS
    void cadastrarAutomoveis(){
        //Entrada de dados com Array
       int i = 0; //isso aqui é para garantir que a variavel i seja inicializada.
       int Qtde = Integer.parseInt(JOptionPane.showInputDialog("digite quantos carros serão cadastrados:"));  
       
       for (i=0; i<Qtde; i++){
          
           String carCor = JOptionPane.showInputDialog("COR: /"+i);
           String carAnoFab = JOptionPane.showInputDialog("ANO DE FABRICAÇÃO: /"+i);
           String carChassi = JOptionPane.showInputDialog("N DO CHASSI: /"+i);
           Double carPreco = Double.parseDouble(JOptionPane.showInputDialog("PREÇO R$: /"+i));
           
           //Adicionando os inputs acima aos Arrays:
           cor.add(carCor);
           anoFab.add(carAnoFab);
           chassi.add(carChassi);
           preco.add(carPreco);           
        }
    }
    
    void exibirAutomoveis(){
        JOptionPane.showMessageDialog(null, "VEICULOS CADASTRADOS\n"+
                                            "====================\n"+
                                            "N DO CHASSI: "+chassi.toString()+
                                            "COR: "+cor.toString()+
                                            "ANO DE FABRICAÇÃO:"+anoFab.toString()+
                                            "PREÇO R$: "+preco.toString()
                );
    }
    
    
}
