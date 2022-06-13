package exercicioempregados;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Yuri.Conder
 */
public class Empregados {
    
   private String nome,
            cargo,
           depto;  
   private int matricula;
    double salario;
    int tempoServico;
    
     //INSTANCIA
    Random rdm = new Random();
    
    void cadastrarDadosEmpregado(){
        
        //Entrada
        //nome = JOptionPane.showInputDialog("Insirir o seu nome:");
        cargo = JOptionPane.showInputDialog("Muito bem, "+nome+"\nQual é o seu cargo ? ");
        depto = JOptionPane.showInputDialog("Qual é o seu departamento:");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Quanto é o seu salário R$: "));        
        //Gerando a matricula
        matricula = rdm.nextInt(5555);                 
    }
    
    void exibirDadosEmpregado(){
        //Saída                             
        JOptionPane.showMessageDialog(null,"DADOS DO FUNCIONÁRIO\n"+
                                             "---------------------\n"+
                                             "Nome: "+ nome + "\n"+
                                             "Cargo: "+ cargo + "\n"+
                                             "Departamento "+ depto + "\n"+
                                             "Salário "+ salario + "\n" +                                            
                                             "Matricula:" + matricula
          );
    }
    
    void calcularTempoSvc(int ano, int meses, int dias){      
        
        int tempoTotal = (ano*365)+(meses*30)+ dias;                        
        tempoServico = tempoTotal;
     
        JOptionPane.showMessageDialog(null, "O total do seu tempo de serviço em dias é "+ tempoServico);
    }
        
     
}
