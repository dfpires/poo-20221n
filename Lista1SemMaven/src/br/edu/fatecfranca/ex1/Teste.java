package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        int auxNroAluno = Integer.parseInt(JOptionPane.showInputDialog("Nro"));
        int auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        String auxNome = JOptionPane.showInputDialog("Nome");
        float auxP1 = Float.parseFloat(JOptionPane.showInputDialog("P1"));
        float auxP2 = Float.parseFloat(JOptionPane.showInputDialog("P2"));
        Aluno obj1 = new Aluno(auxNroAluno, auxIdade, auxNome, auxP1, auxP2);
        
        obj1.dadosAluno();
    }
    
}
