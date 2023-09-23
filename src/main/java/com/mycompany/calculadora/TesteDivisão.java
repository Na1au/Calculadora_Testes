package com.mycompany.calculadora;

public class TesteDivisão {

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();

    // Cenário 1: dois valores
    int div = calc.dividir(8, 4);
    System.out.println("Resultado de 8 / 4: " + div);

    // Cenário 2: dois valores, sendo o dividendo 0
    div = calc.dividir(0,4);
    System.out.println("Resultado de 0 / 4: " + div);

    // Cenário 3: dois valores iguais
    div = calc.dividir(8, 8);
    System.out.println("Resultado de 8 / 8: " + div);

    // Cenário 4: dois valores, sendo um deles negativo
    div = calc.dividir(8, -4);
    System.out.println("Resultado de 8 / (-4): " + div);

    // Cenário 5: dois valores, sendo o divisor maior que o dividendo
    div = calc.dividir(4, 8);
    System.out.println("Resultado de 4 / 8: " + div);
  }
}
