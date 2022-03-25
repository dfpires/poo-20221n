package br.edu.fatecfranca.exe0;
import java.util.Date;
public class Cartao {
    private int numero, cvv;
    private Date validade;
    private String bandeira;
    private Conta conta; // associação
    private int senha;
    
    public Cartao() {
    }
    public Cartao(int numero, int cvv, Date validade, 
            String bandeira, int senha, Conta conta) {
        this.numero = numero;
        this.cvv = cvv;
        this.validade = validade;
        this.bandeira = bandeira;
        this.senha = senha;
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

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public String mostra(){
        return ("Número " + this.numero + 
                " CVV: " + this.cvv + " Validade " + 
                this.validade + " Bandeira " + 
                this.bandeira + this.conta.mostra());
    }
    public void sacar(float x, int senha){
        if (senha == this.senha){ // verifica a senha
            Date atual = new Date(); // data atual
            if (atual.before(this.validade)){
                // altera o valor do saldo
                this.conta.setSaldo(this.conta.getSaldo() - x);
            }
            else {
                System.out.println("Cartão vencido");
            }
        }
        else {
            System.out.println("Senha inválida");
        }
    }
}
