package com.mycompany.calculadora;

public class TesteMultiplicação {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();

    //Cenário 1: dois valores
    int mult = calc.multiplicar(9,3);
    System.out.println("Resultado de 9 * 3: " + mult);

    //Cenário 2: dois valores, sendo um deles 0
    mult = calc.multiplicar(9,0);
    System.out.println("Resultado de 9 * 0: " + mult);

    //Cenário 3: dois valores, sendo ambos 0
    mult = calc.multiplicar(0,0);
    System.out.println("Resultado de 0 * 0: " + mult);

    //Cenário 4: dois valores, sendo um deles negativo
    mult = calc.multiplicar(9,-3);
    System.out.println("Resultado de 9 * (-3): " + mult);
}
}
