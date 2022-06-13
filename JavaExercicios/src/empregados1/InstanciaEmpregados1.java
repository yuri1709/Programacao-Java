/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregados1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *Dados de entrada com encapsulamento e acesso indireto aos valores desses dados com os métodos 'get e 'set
 * em razão do uso de modificadores de acesso
 * @author 36127512021.2
 */
public class InstanciaEmpregados1 {
        
    public static void main(String[]args){
        //Essa vai sera a classe pai = Empregados1 EMPR1 = new Empregados1();
        Horista HOR = new Horista();
        Contratado CONTR = new Contratado(); 
        
        
        Random rd = new Random();
        //PARA ACESSARMOS OS ATRIBUTOS PRIVADOS TEMOS QUE UTILIZAR O GET E O SET
                              
        
        String resposta = JOptionPane.showInputDialog("Deseja usar o programa calcula valor para empregado?");        
        while (resposta.equals("sim")){            
           
           String opcao = JOptionPane.showInputDialog("Seleciona a opção para o tipo de empregado:"
                   + "--------------------"
                   + "1 - Horista\n"
                   + "2 - Contratado\n"
                   + "3 - Sair\n"
                   + "--------------------");
           
           switch (opcao) {
               case "1":
                   String resp = JOptionPane.showInputDialog("Deseja usar esta opção - Horista?");
                   while (resp.equals("sim")) {
                       
                       String nome = JOptionPane.showInputDialog("Digite o nome do empregado:");
                       HOR.setNome(nome);
                       
                         String CG = JOptionPane.showInputDialog("Digite o seu cargo");
                       HOR.setCargo(CG);
                       
                        String DP = JOptionPane.showInputDialog("Digite o seu departamento:");
                       HOR.setDepto(DP);
                                             
                       int mat = rd.nextInt(5555);
                       HOR.setMatricula(mat);
                       
                       HOR.horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a QTDE de horas trabalhadas do empregado:"));
                               
                       HOR.valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora trabalhada pelo empregado:"));
                        
                       HOR.valorSerPago = HOR.valorHora * HOR.horasTrabalhadas;
                       
                       JOptionPane.showMessageDialog(null,"Comprovante de Pagamento\n"+
					   		   "------------------------\n"+
					   		   "Tipo Empregado: "+HOR.tipoEmpregado+"\n"+
					   		   "------------------------\n"+
					   		   "Nome          : "+HOR.getNome()+"\n"+
					   		   "Cargo         : "+HOR.getCargo()+"\n"+
					   		   "Depto         : "+HOR.getDepto()+"\n"+
					   		   "Matrícula     : "+HOR.getMatricula()+"\n"+
					   		   "------------------------\n"+
					   		   "Valor do Pagamento: R$ "+HOR.valorSerPago);
                      resp = JOptionPane.showInputDialog("Deseja utilizar esta opção  - Horista noavemente");
                   }
               break;
               case "2":
                    String resp1 = JOptionPane.showInputDialog("Deseja usar esta opção - Contratado?");
                    while (resp1.equals("sim")) {
                        
                        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
                        CONTR.setNome(nome);
                        
                          String CG = JOptionPane.showInputDialog("Digite o seu cargo");
                       CONTR.setCargo(CG);
                       
                        String DP = JOptionPane.showInputDialog("Digite o seu departamento:");
                       CONTR.setDepto(DP);
                                             
                       int mat = rd.nextInt(5555);
                       CONTR.setMatricula(mat);
                       
                       CONTR.diasTrabalhados = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de horas trabalhadas pelo empregado:"));
                       
                       CONTR.valorporDia = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada pelo empregado: "));
                               
                       CONTR.valorSerPago = CONTR.valorporDia * CONTR.diasTrabalhados;
                       
                       JOptionPane.showMessageDialog(null,"Comprovante de Pagamento\n"+
					   		   "------------------------\n"+
					   		   "Tipo Empregado: "+ CONTR.tipoEmpregado+"\n"+
					   		   "------------------------\n"+
					   		   "Nome          : "+ CONTR.getNome()+"\n"+
					   		   "Cargo         : "+ CONTR.getCargo()+"\n"+
					   		   "Depto         : "+ CONTR.getDepto()+"\n"+
					   		   "Matrícula     : "+ CONTR.getMatricula()+"\n"+
					   		   "------------------------\n"+
							   "Valor do Pagamento: R$ "+CONTR.valorSerPago);
                       resp1 = JOptionPane.showInputDialog("Deseja usar esta opção - contratado ?");                      
                    }
               break;
               case "3":
                   JOptionPane.showMessageDialog(null, "Você saiu do programa com sucesso!");
                   System.exit(0);
               break;
               default:
                   JOptionPane.showMessageDialog(null,"Opção inválida");
               break;                                                            
           }  //Fim Switch(opcao)
           
           resposta = JOptionPane.showInputDialog("Deseja voltar ao menu de opções do programa calcula valor para empregado?"); 
        } //Fim While
        JOptionPane.showMessageDialog(null,"Programa vai encerrar");  
    }
                  
    
}
