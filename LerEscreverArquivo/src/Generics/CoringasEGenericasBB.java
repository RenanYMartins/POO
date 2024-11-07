/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author felipe
 */
public class CoringasEGenericasBB {

    public static void main(String[] args) {
        // Cria listas de diferentes tipos numéricos
        List<Integer> listaInt = Arrays.asList(1, 2, 3);
        List<Double> listaDouble = Arrays.asList(1.1, 2.2, 3.3);

        // Chama o método para imprimir as listas de números
        imprimirNumeros(listaInt);
        imprimirNumeros(listaDouble);
    }

    // Método que aceita listas de qualquer tipo que estenda Number
    public static void imprimirNumeros(List<? extends Number> lista) {
        for (Number numero : lista) {
            System.out.println(numero);
        }
    }
}
