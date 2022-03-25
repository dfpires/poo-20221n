package br.edu.fatecfranca.exe1;

public class Passageiro {
    private String cpf, nome;

    public Passageiro() {
    }

    public Passageiro(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String mostra() {
        return "\n Passageiro{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }
    
    
}
