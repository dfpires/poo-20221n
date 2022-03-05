package br.edu.fatecfranca.ex2;
public class Teste {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(123, 456, "Fulano", 0);
        
        obj1.depositar(1000);
        obj1.depositar(5000);
        obj1.sacar(2000);
        obj1.mostra();
        
        Cliente obj2 = new Cliente();
        obj2.saldo = 0;
        obj2.nome = "Beltrano";
    }
    
}
