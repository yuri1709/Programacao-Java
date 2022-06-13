package exercicioarraypaises;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArrayPaises {

	
	public static void main (String args[]){
		
		
		String [] paises  = new String [5];
		String [] capital = new String [5];
		int i, posicao;

		String resp1 = JOptionPane.showInputDialog("deseja executar programa-países?");
		
		
		while ((resp1.equals("sim")) || (resp1.equals("Sim")) || (resp1.equals("SIM")))
		{

		
		   int Qtde = Integer.parseInt(JOptionPane.showInputDialog("digite quantos países vai inserir"));
			
		   for (i=0; i<Qtde; i++)
		   {
			
			paises[i]  = JOptionPane.showInputDialog("digite o nome do país "+i);

			capital[i] = JOptionPane.showInputDialog("digite o nome da capital do país "+i);
		    }
		
		   JOptionPane.showMessageDialog(null,"Veja como ficou o conjunto de paises e suas\n"+
						     "respectivas capitais\n"+
						     "-------------------------------------------\n"+
						     "Países  : "+Arrays.toString(paises)+"\n"+
						     "Capitais: "+Arrays.toString(capital));
				
				
		resp1 = JOptionPane.showInputDialog("deseja executar programa-países?");

		}
		
		JOptionPane.showMessageDialog(null,"Obrigado por utilizar o programa-países");
		
	   }
        }