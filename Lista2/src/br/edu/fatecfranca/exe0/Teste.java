/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe0;

/**
 *
 * @author Daniel.Pires
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Niver obj = new Niver();
        obj.setDia(3);
        obj.setDia(80);
        obj.setDia(-3);
        obj.setMes("Janeiro");
        obj.setMes("Outono");
        System.out.println("Dia " + obj.getDia() + " Mês " + obj.getMes());
    }
    
}
