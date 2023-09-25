package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class DivisãoJunitTest {
  
  // Cenário 1: dois valores
  @Test
  public void DividirDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    int div = calc.dividir(8, 4);

    Assert.assertEquals(2, div);
  }

  // Cenário 2: dois valores, sendo o dividendo 0
  @Test
  public void DividirPositivoEZero() {
    Calculadora calc = new Calculadora();
    int div = calc.dividir(4, 0);

    Assert.assertEquals(4, div);
  }

  // Cenário 3: dois valores iguais
  @Test
  public void DividirZeros() {
    Calculadora calc = new Calculadora();
    int div = calc.dividir(8, 8);

    Assert.assertEquals(1, div);
  }

  // Cenário 4: dois valores, sendo um deles negativo
  @Test
  public void DividirPositivoENegativo() {
    Calculadora calc = new Calculadora();
    int div = calc.dividir(8, -4);

    Assert.assertEquals(-2, div);
  }

  // Cenário 5: dois valores, sendo o divisor maior que o dividendo
  @Test
  public void dividirPositivoENegativo() {
    Calculadora calc = new Calculadora();
    int div = calc.dividir(4, 8);

    Assert.assertEquals(2, div);
  }
}
