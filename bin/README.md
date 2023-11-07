# Testes de calculadora

## Descrição
O projeto se trata de uma calculadora de números inteiros com testes utilizando JUnit para tarefa realizada na matéria de Testes e Qualidade e Software.

## Funcionalidade
Para utilizar a classe calculadora, basta importar o package calculadora, instanciar uma nova Calculadora e utilizar seu métodos (somar, subtrair, dividir e multiplicar) junto a dois número inteiros, como o exemplo: 
```
Calculadora cal = new Calculadora();    
int divisão = cal.dividir(10, 2);
```
Para testar o código utilizando o JUnit, basta importar o package de testes e utilizá-lo como desejar conforme o exemplo: 
```
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

 Calculadora calc = new Calculadora();
    int sub = calc.subtrair(5, 2);
    Assert.assertEquals(3, sub);
```
