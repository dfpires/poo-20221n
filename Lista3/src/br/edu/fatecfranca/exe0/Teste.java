package br.edu.fatecfranca.exe0;
import java.util.Date;
import java.util.Calendar;
public class Teste {
    public static void main(String[] args) {
        Conta c1 = new Conta("0102341-1", "3259", "Fulano", 1000);
        // criando uma data
        Calendar val = Calendar.getInstance();
        val.set(Calendar.YEAR, 2023); // define o ano
        val.set(Calendar.MONTH, 2); // define o mês
        val.set(Calendar.DAY_OF_MONTH, 18); // define o dia
        // val é um Calendar, devemos transform-alo para Date
        // val.getTime() transforma val em Date
        Cartao ca1 = new Cartao(1234, 186, val.getTime(), 
                "Visa", 9876, c1);
        
        System.out.println(ca1.mostra());
        
        ca1.sacar(600, 9876);
        
        System.out.println(ca1.mostra());
    }
    
}
