package com.mycompany.calculadora;

public class TesteSubtração {

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();

    // Cenário 1: dois valores
    int sub = calc.subtrair(5, 2);
    System.out.println("Resultado de 5 - 2: " + sub);

    // Cenário 2: dois valores, sendo um deles 0
    sub = calc.subtrair(5, 0);
    System.out.println("Resultado de 5 - 0: " + sub);

    // Cenário 3: dois valores, sendo ambos 0
    sub = calc.subtrair(0, 0);
    System.out.println("Resultado de 0 - 0: " + sub);

    // Cenário 4: dois valores, sendo um deles negativo
    sub = calc.subtrair(5, -2);
    System.out.println("Resultado de 5 - (-2): " + sub);

    // Cenário 5: dois valores iguais
    sub = calc.subtrair(5, 5);
    System.out.println("Resultado de 5 - 5: " + sub);
  }
}
