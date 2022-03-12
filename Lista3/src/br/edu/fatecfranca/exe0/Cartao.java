package br.edu.fatecfranca.exe0;
import java.util.Date;
public class Cartao {
    private int numero, cvv;
    private Date validade;
    private String bandeira;
    private Conta conta; // associação
    
    public Cartao() {
    }
    public Cartao(int numero, int cvv, Date validade, String bandeira, Conta conta) {
        this.numero = numero;
        this.cvv = cvv;
        this.validade = validade;
        this.bandeira = bandeira;
        this.conta = conta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public void mostra(){
        System.out.println("Número " + this.numero + 
                " CVV: " + this.cvv + " Validade " + 
                this.validade + " Bandeira " + this.bandeira); 
        this.conta.mostra();
    }
    public void sacar(float x, String senha){
        // efetive o saque, o saldo não pode ficar negativo
        // adicionar a variável senha no cartão
    }
}
