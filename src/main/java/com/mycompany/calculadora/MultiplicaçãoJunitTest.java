package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class MultiplicaçãoJunitTest {

  // Cenário 1: dois valores
  @Test
  public void MultiplicarDoisNumeros() {
    Calculadora calc = new Calculadora();
    int mult = calc.multiplicar(9, 3);

    //Valida o resultado da multiplicação anterior
    Assert.assertEquals(27, mult);
  }

  // Cenário 2: dois valores, sendo um deles 0
  @Test
  public void MultiplicarPositivoEZero() {
    Calculadora calc = new Calculadora();
    int mult = calc.multiplicar(9, 0);

    //Valida o resultado da multiplicação anterior
    Assert.assertEquals(0, mult);
  }

  // Cenário 3: dois valores, sendo ambos 0
  @Test
  public void MultiplicarZeros() {
    Calculadora calc = new Calculadora();
    int mult = calc.multiplicar(0, 0);

    //Valida o resultado da multiplicação anterior
    Assert.assertEquals(0, mult);
  }

  // Cenário 4: dois valores, sendo um deles negativo
  @Test
  public void MultiplicarNegativoEPositivo() {
    Calculadora calc = new Calculadora();
    int mult = calc.multiplicar(9, -3);

    //Valida o resultado da multiplicação anterior
    Assert.assertEquals(27, mult);
  }

}
