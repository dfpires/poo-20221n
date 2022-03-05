package br.edu.fatecfranca.exe3;

import javax.swing.JOptionPane;

public class Produto {
    int id, qtde;
    String descricao;
    float preco;
    Produto(){
    }
    Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    public void comprar(int x){
        this.qtde += x;
    }
    public void vender(int x){
        this.qtde -= x;
    }
    public void subir(float x){
        this.preco += x;
    }
    public void descer(float x){
        this.preco -= x;
    }
    public void mostra(){
        JOptionPane.showMessageDialog(null, 
          " Descrição: " + this.descricao + 
          " Qtde: " + this.qtde + 
          " Preço " + this.preco);
 
    }
}
