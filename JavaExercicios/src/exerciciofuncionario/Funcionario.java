/*
 utilizar JOptionPane e o arraylist
 */
package exerciciofuncionario;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @authorYuri.Conder
 */
public class Funcionario {
   //ATRIBUTOS, todo atributo é global
    ArrayList<Integer>matricula = new ArrayList<>();
    ArrayList<String>nome = new ArrayList<>();
    ArrayList<String>cargo = new ArrayList<>(); 
    ArrayList<Double>salario = new ArrayList<>();    
    int i = 0, Qtde = 0;
    
    //INSTANCIA
    Random rdm = new Random();
    
    void cadastrarDadosFunc(){     
      //Entrada de dados com Array
       //isso aqui é para garantir que a variavel i seja inicializada.
       Qtde = Integer.parseInt(JOptionPane.showInputDialog("digite quantos funcionários vai inserir"));  
       
       for (i=0; i<Qtde; i++){
           
           int funcMatricula = rdm.nextInt(5555); 
           String funcNome = JOptionPane.showInputDialog("SEU NOME: /"+i);
           String funcCargo = JOptionPane.showInputDialog("QUAL É O SEU CARGO: /"+1);
           Double funcSalario = Double.parseDouble(JOptionPane.showInputDialog("INFORME O SEU SALÁRIO R$: /"+1));
           
           //Adicionando os inputs acima aos Arrays:
           matricula.add(funcMatricula);
           nome.add(funcNome);
           cargo.add(funcCargo);
           salario.add(funcSalario);
           
           //Saída de confirmação
           JOptionPane.showMessageDialog(null, 
                                           "PARABÉNS O CADASTRO FOI REALIZADO COM SUCESSO!\n"+
                                           "N DA MATRÍCULA GERADA: "+matricula
            );     
       }

    

//Entrada de dados
      //matricula = rdm.nextInt(5555)
      //nome = JOptionPane.showInputDialog("SEU NOME: ");
      //cargo = JOptionPane.showInputDialog("QUAL É O SEU CARGO: ");
      //salario = Double.parseDouble(JOptionPane.showInputDialog("INFORME O SEU SALÁRIO R$: "))
      //Saída
      
    }
    
    void exibirDadosFunc(){        
        //saida com array
        JOptionPane.showMessageDialog(null, "DADOS DO FUNCIONÁRIO\n"+
                                            "====================\n"+
                                            "Matrícula: "+matricula.toString()+"\n"+ 
                                            "Nome: "+nome.toString()+"\n"+
                                            "Cargo: "+cargo.toString()+"\n"+
                                            "Salário: "+salario.toString()+"\n"+
                                            "====================\n"+
                                            "Foram inseridos  funcionários"
                
                );                      
    }
    
    void pesquisaDadosFunc() {
         int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e "+(Qtde - 1)));

         JOptionPane.showMessageDialog(null, "O funcionário pesquisado da lista é:\n"+
                                            "====================\n"+
                                            "Matrícula: "+matricula.get(N)+"\n"+ 
                                            "Nome: "+nome.get(N)+"\n"+
                                            "Cargo: "+cargo.get(N)+"\n"+
                                            "Salário: "+salario.get(N)+"\n"+
                                            "====================\n"
                 );
    }
}
