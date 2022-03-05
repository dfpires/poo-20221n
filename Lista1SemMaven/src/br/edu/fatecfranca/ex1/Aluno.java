
package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Aluno {
    // declaração das variáveis
    int nroAluno, idade;
    String nome;
    float p1, p2;
    //métodas construtores
    Aluno(){
    }
    Aluno(int nroAluno, int idade, String nome, float p1, 
            float p2) {
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    // esse método calcula e retorna a nota final como float
    float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    // retorna um String com aprovado ou reprovado
    String passou(){
        return (this.notaFinal() >= 6) ? "Aprovado": "Reprovado";
    }
    
    void dadosAluno(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
                " Situação: " + this.passou());
    }
}
