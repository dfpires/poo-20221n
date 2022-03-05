/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe3;

/**
 *
 * @author daniel.pires
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto obj1 = new Produto(123, "Máscara", 50, 5);
        obj1.comprar(30);
        obj1.subir(1);
        obj1.vender(8);
        obj1.descer(1.5f);
        obj1.mostra();
        
    }
    
}
