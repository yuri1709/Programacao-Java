/*
 Array vai ser comparada  com a estrtutura ArrayList
 */
package exercicioarraypaises;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuri.Conder
 */
public class ArrayListPaises {
    public static void main (String args[]){
		
		ArrayList<String> paises  = new ArrayList<>(); //vai inicar com o valor padrao, paises é uma lista de strings
		ArrayList<String> capital = new ArrayList<>();

		String resp1 = JOptionPane.showInputDialog("deseja executar Lista-de-países?");
		
		
		while ((resp1.equals("sim")) || (resp1.equals("Sim")) || (resp1.equals("SIM")))
		{
		
                   int i = 0; //isso aqui é para garantir que a variavel i seja inicializada.
		   int Qtde = Integer.parseInt(JOptionPane.showInputDialog("digite quantos países vai inserir"));
			
		   for ( i=0; i<Qtde; i++)
		   {
			
		    String nomepais  = JOptionPane.showInputDialog("digite o nome do país "+i);
		    paises.add(nomepais);
                    
		    String capitalpais = JOptionPane.showInputDialog("digite o nome da capital do país "+i);
		    capital.add(capitalpais);
                    
		   }
                   		
		   JOptionPane.showMessageDialog(null,"Veja como ficou o conjunto de paises e suas\n"+
						     "respectivas capitais\n"+
						     "-------------------------------------------\n"+
						     "Países  : "+paises.toString()+"\n"+
						     "Capitais: "+capital.toString()+"\n"+
						     "-------------------------------------------\n"+
						     "Foram inseridos "+i+" países");

		   
		   String R = JOptionPane.showInputDialog("deseja realizar pesquisa na Lista-de-países?");

		   if ( (resp1.equals("sim")) || (resp1.equals("Sim")) || (resp1.equals("SIM")) ) {

		   int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e "+(Qtde - 1)));

		   JOptionPane.showMessageDialog(null,"País pesquisado da lista é "+paises.get(N)+"\n"+
                                                      " e sua capital é "+capital.get(N));

		   }
				
		   resp1 = JOptionPane.showInputDialog("deseja executar Lista-de-países?");

		}
		
		JOptionPane.showMessageDialog(null,"Obrigado por utilizar o Lista-de-países");
		
	   }
}
