package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {
    int nroConta, nroAgencia;
    String nome;
    float saldo;
    
    Cliente(){
        
    }
    Cliente(int nroConta, int nroAgencia, String nome, float saldo){
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void sacar(float x){
        this.saldo -= x;
    }
    public void depositar(float x){
        this.saldo +=x;
    }
    public void mostra(){
        JOptionPane.showMessageDialog(null, 
          "Nome: " + this.nome + "Saldo: " + this.saldo);
    }
}
