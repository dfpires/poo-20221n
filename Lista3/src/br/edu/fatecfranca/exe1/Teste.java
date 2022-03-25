/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe1;

import java.util.Date;

/**
 *
 * @author Daniel.Pires
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Passageiro pa1 = new Passageiro("123-4", "Fulano");
        Voo vo1 = new Voo(111, "Guarulhos", "Bahamas");
        Reserva re1 = new Reserva(222, new Date(), pa1, vo1);
        System.out.println(re1.mostra());
    }
    
}
