/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

/**
 * Classe que simula uma calculadora simples, realiza operações de soma, subtração, divisão e multiplicação
 * @author anala
 * @version 2.0 (06/11/2023)
 */
public class Calculadora {

	/**
	 * operação de soma
	 * @param a int
	 * @param b int
	 * @return resultado de a + b
	 */
    // calcula a soma de dois números
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * operação de subtração
     * @param a int
     * @param b int
     * @return resultado de a - b
     */
    // calcula a subtração de dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * operação de divisão
     * @param a int
     * @param b int
     * @return resultado de a / b
     */
    // calcula a divisão entre dois números
    public int dividir(int a, int b) {
        return a / b;
    }

    /**
     * operação de multiplicação
     * @param a int
     * @param b int
     * @return resultado de a * b
     */
    // calcula a multiplicação de dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
