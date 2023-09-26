package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class SubtraçãoJunitTest {

  // Cenário 1: dois valores
  @Test
  public void SubtrairDoisValores() {
    Calculadora calc = new Calculadora();
    int sub = calc.subtrair(5, 2);

    //Valida o resultado da subtração anterior
    Assert.assertEquals(3, sub);
  }

  // Cenário 2: dois valores, sendo um deles 0
  @Test
  public void SubtrairPositivoEZero() {
    Calculadora calc = new Calculadora();
    int sub = calc.subtrair(5, 0);

    //Valida o resultado da multiplicação anterior
    Assert.assertEquals(5, sub);
  }

  // Cenário 3: dois valores, sendo ambos 0
  @Test
  public void SubtrairZeros() {
    Calculadora calc = new Calculadora();
    int sub = calc.subtrair(0, 0);

    //Valida o resultado da multiplicação anterior
    Assert.assertEquals(0, sub);
  }

  // Cenário 4: dois valores, sendo um deles negativo
  @Test
  public void SubtrairPositivoENegativo() {
    Calculadora calc = new Calculadora();
    int sub = calc.subtrair(5, -2);

    //Valida o resultado da multiplicação anterior
    Assert.assertEquals(7, sub);
  }

  // Cenário 5: dois valores iguais
  @Test
  public void SubtrairPositivosIguais() {
    Calculadora calc = new Calculadora();
    int sub = calc.subtrair(5, 5);

    //Valida o resultado da multiplicação anterior
    Assert.assertEquals(0, sub);
  }

}
