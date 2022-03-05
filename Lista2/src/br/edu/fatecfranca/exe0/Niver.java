/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe0;

import java.util.ArrayList;

/**
 *
 * @author Daniel.Pires
 */
public class Niver {
   private int dia;
   private String mes;
   
   
   public void setDia(int dia){
       if ((dia >= 1) && (dia <= 31)){
           this.dia = dia;
       }
       else {
           this.dia = 0;
           System.out.println("Dia inválido");
       }
   }
   
   public void setMes(String mes){
       ArrayList<String> vetor = new ArrayList(); 
       vetor.add("Janeiro");
       vetor.add("Fevereiro");
       vetor.add("Março");
       vetor.add("Abril");
       vetor.add("Maio");
       vetor.add("Junho");
       vetor.add("Julho");
       vetor.add("Agosto");
       vetor.add("Setembro");
       vetor.add("Outubro");
       vetor.add("Novembro");
       vetor.add("Dezembro");
       if (vetor.contains(mes)){
           this.mes = mes;
       }
       else {
           this.mes = "Inválido";
            System.out.println("Mês inválido");
       }
   }
   public int getDia(){
       return this.dia;
   }
   public String getMes(){
       return this.mes;
   }
}
