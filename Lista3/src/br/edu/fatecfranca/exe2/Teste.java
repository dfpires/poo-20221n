package br.edu.fatecfranca.exe2;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Carrinho car1 = new Carrinho(100, new Date());
        ItemCarrinho item1 = new ItemCarrinho(9, "Chocolate", 12, 2);
        ItemCarrinho item2 = new ItemCarrinho(8, "Bolacha", 3, 3);
        ItemCarrinho item3 = new ItemCarrinho(8, "Cerveja", 9, 24);
        car1.addItem(item1);
        car1.addItem(item2);
        car1.addItem(item3);
        System.out.println(car1.toString());
        car1.removeItem(item2);
        System.out.println(car1.toString());
        
    }
    
}
