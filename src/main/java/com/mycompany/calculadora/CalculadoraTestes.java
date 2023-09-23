/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author anala
 */
public class CalculadoraTestes {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //Cenário 1: dois valores
        int soma = calc.somar(3,7);
        System.out.println("Soma de 3 + 7: " + soma);

        //Cenário 2: dois valores, sendo um deles 0
        soma = calc.somar(3,0);
        System.out.println("Soma de 3 + 0: " + soma);

        //Cenário 3: dois valores, sendo ambos 0
        soma = calc.somar(0,0);
        System.out.println("Soma de 0 + 0: " + soma);

        //Cenário 4: dois valores, sendo um deles negativo
        soma = calc.somar(3,-1);
        System.out.println("Soma de 3 + (-1): " + soma);
    }
    
}
