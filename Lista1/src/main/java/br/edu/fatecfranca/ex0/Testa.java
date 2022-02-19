
package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;


public class Testa {


    public static void main(String[] args) {
        
        System.out.println("Hoje é sexta-feira");
        
        // cria um objeto da classe Carro
        Carro obj1 = new Carro();
        obj1.modelo = JOptionPane.showInputDialog("Informe modelo");
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe ano"));
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe vel"));
        int resp = JOptionPane.showConfirmDialog(null, "Criar o carro com motor ligado?");
        obj1.motor = (resp == JOptionPane.OK_OPTION);
       
        obj1.mostrar();
        obj1.ligar();
        obj1.mostrar();
        obj1.acelerar(80);
        obj1.mostrar();
        obj1.frear(20);
        obj1.mostrar();
        obj1.desligar();
        obj1.mostrar();
        
        Carro obj2 = new Carro("Palio", 2012, 0, false);
       
        
    }
    
}
