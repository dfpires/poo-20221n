package br.edu.fatecfranca.exe1;
public final class Cliente {
    // declaração das variáveis
    private String nroConta, nroAgencia, nome;
    private float saldo;
    // construtores
    public Cliente(){}
    public Cliente(String nroConta, String nroAgencia, 
            String nome, float saldo){
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    public void setNroConta(String nroConta){
        if ((nroConta.length() == 8) && 
                (nroConta.charAt(6) == '-')){
            this.nroConta = nroConta;
        }
        else {
            System.out.println("Nro de conta inválido");
            this.nroConta = "inválido";
        }
    }
    public void setNroAgencia(String nroAgencia){
        if ((nroAgencia.length() == 6) && 
                (nroAgencia.charAt(4) == '-')){
            this.nroAgencia = nroAgencia;
        }
        else {
            System.out.println("Nro de agência inválido");
            this.nroAgencia = "inválido";
        }
    }
    public void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome inválido");
            this.nome = "inválido";  
        }
    }
    public void setSaldo(float saldo){
        if (saldo >=0){
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo inválido");
        }
    }
    public void sacar(float x){
        this.setSaldo(this.saldo - x);
    }
    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }
    // getters
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getsaldo(){
        return this.saldo;
    }
    public void mostra(){
        System.out.println("Conta: " + this.nroConta +
                " Agência " + this.nroAgencia + " Nome " +
                this.nome + " Saldo " + this.saldo);
    }
}
