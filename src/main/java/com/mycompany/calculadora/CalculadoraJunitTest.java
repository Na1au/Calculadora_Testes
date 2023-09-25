package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class CalculadoraJunitTest {

  // Cenário 1:  soma dois números inteiros
  @Test
  public void SomarDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(3, 7);

    Assert.assertEquals(10, soma);
  }

  // Cenário 2: soma dois números, sendo um deles 0
  @Test
  public void SomarPositivoEZero() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(3, 0);

    Assert.assertEquals(3, soma);
  }

  // Cenário 3: soma dois números, sendo ambos 0
  @Test
  public void SomarZeros() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(0, 0);

    Assert.assertEquals(0, soma);
  }

  // Cenário 4: Soma dois valores, sendo um deles negativo
  @Test
  public void SomarPositivoENegativo() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(3, -1);

    Assert.assertEquals(2, soma);
  }
}
