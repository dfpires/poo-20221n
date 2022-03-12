/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe1;

/**
 *
 * @author Daniel.Pires
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("123456-7", "123-59", "Fulano", 0);
        obj1.depositar(2000);
        obj1.sacar(400);
        obj1.sacar(500);
        obj1.mostra();
    }
    
}
