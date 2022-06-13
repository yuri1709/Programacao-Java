/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregados1;

import javax.swing.JOptionPane;

/**
 *Dados de entrada com encapsulamento e acesso indireto aos valores desses dados com os métodos 'get e 'set
 * em razão do uso de modificadores de acesso
 * @author 36127512021.2
 */
public class InstanciaEmpregados1 {
        
    public static void main(String[]args){
        Empregados1 EMPR1 = new Empregados1();
        
        //PARA ACESSARMOS OS ATRIBUTOS PRIVADOS TEMOS QUE UTILIZAR O GET E O SET
        
        //Criamos uma variavel local para jogar dentro da classe Empregados1
        String N = JOptionPane.showInputDialog("Digite o seu nome");
        EMPR1.setNome(N);
        
        
        int MAT = Integer.parseInt(JOptionPane.showInputDialog("Digite sua MATRÍCULA"));
        EMPR1.setMatricula(MAT);
        
        String CG = JOptionPane.showInputDialog("Digite o seu cargo");
        EMPR1.setCargo(CG);
        
        String DP = JOptionPane.showInputDialog("Digite o seu departamento:");
        EMPR1.setDepto(DP);
        
        
        double SL = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu salário"));
        EMPR1.setSalario(SL);
        
        int TSVC = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu tempo de serviço"));
        EMPR1.setTempoServico(TSVC);
    
        JOptionPane.showMessageDialog(null, "DADOS DO EMPREGADO\n"
                + "''''''''''''''''''''''''\n"
                + "NOME: "+EMPR1.getNome()+ "\n"
                + "MATRICULA: "+ EMPR1.getMatricula() + "\n"
                + "CARGO: "+EMPR1.getCargo()+ "\n"
                + "DEPARTAMENTO: "+EMPR1.getDepto() +"\n"
                + "SALÁRIO: "+EMPR1.getSalario() +"\n"
                + "TEMPO DE SERVIÇO: "+EMPR1.getTempoServico()+"\n");
    }
    
    
    
    
}
