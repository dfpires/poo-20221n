/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe4;

/**
 *
 * @author daniel.pires
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rio obj1 = new Rio("Tietê", 2, true);
        obj1.chover(1);
        obj1.limpar();
        obj1.ensolarar(0.5f);
        obj1.mostra();
    }
    
}
