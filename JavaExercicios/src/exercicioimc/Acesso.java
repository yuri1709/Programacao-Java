package exercicioimc;

import javax.swing.JOptionPane;

public class Acesso {

    String login;
    int senha;
    
    public void gerarLoginSenha() {
        
        JOptionPane.showMessageDialog(null, "OLÁ !! É A PRIMEIRA VEZ QUE SE LOGA!!\n"+
                                            "SIGA AS INSTRUÇÕES A SEGUIR PARA ACESSAR o SISTEMA");

	login = JOptionPane.showInputDialog("DIGITE UM LOGIN");
	
        senha = Integer.parseInt (JOptionPane.showInputDialog("DIGITE UMA SENHA"));

	JOptionPane.showMessageDialog(null, "LOGIN E SENHA INDIVIDUAIS PARA O(A) CORRETOR(A)\n"+
					    "GUARDE ESSAS INFORMAÇÕES, POIS ELAS SERÃO SOLICITADAS\n"+
					    "POSTERIOMENTE\n"+
                                            "===============================================\n"+
					    "LOGIN : "+login+"\n"+
                                            "SENHA : "+senha+"\n"+
					    "===============================================");
    }


    public void validarAcesso() {

                JOptionPane.showMessageDialog(null, "PARA LOGAR-SE, DIGITE SEU LOGIN E SENHA GRADOS");
        
		String Login = JOptionPane.showInputDialog("DIGITE SEU LOGIN");

		int Senha = Integer.parseInt (JOptionPane.showInputDialog("DIGITE SUA SENHA"));
	
		
		if (Login.equals(this.login) && (Senha == this.senha)) {
			
		     JOptionPane.showMessageDialog(null,"Acesso Permitido !!");
                    
                }
		
		else {
			
		     JOptionPane.showMessageDialog(null,"Acesso Negado !! Programa será encerrado !!\n"+
                                                        "Logue-se novamente\n"+
                                                        "Caso seja seu 1o acesso, crie um login e senha\n"+
						        "Por favor, entre com login e senha corretos!!!");
                     System.exit(0);
                     
		     }
    }
    
}
