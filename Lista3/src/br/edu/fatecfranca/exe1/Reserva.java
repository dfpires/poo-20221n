package br.edu.fatecfranca.exe1;

import java.util.Date;

// objeto-todo
public class Reserva {
    private int codigo;
    private Date data;
    // objetos-parte
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int codigo, Date data, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public String mostra() {
        return "\n Reserva{" + "codigo=" + codigo + 
                ", data=" + data + 
                ", passageiro=" + passageiro.mostra() + 
                ", voo=" + voo.mostra() + '}';
    }
    
    
}
