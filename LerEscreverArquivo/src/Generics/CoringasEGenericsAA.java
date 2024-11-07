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
public class CoringasEGenericsAA {

    public static void main(String[] args) {
        // Cria listas de diferentes tipos
        List<String> listaString = Arrays.asList("A", "B", "C");
        List<Integer> listaInt = Arrays.asList(1, 2, 3);

        // Chama o método para imprimir as listas
        imprimirLista(listaString);
        imprimirLista(listaInt);
    }

    // Método genérico que aceita qualquer tipo de lista
    public static void imprimirLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}

