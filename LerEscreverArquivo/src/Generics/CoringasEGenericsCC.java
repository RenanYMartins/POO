/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe
 */
public class CoringasEGenericsCC {

    public static void main(String[] args) {
        // Cria uma lista de Number
        List<Number> listaNumber = new ArrayList<>();

        // Chama o método para adicionar números à lista
        adicionarNumero(listaNumber);

        // Imprime os números adicionados
        for (Number numero : listaNumber) {
            System.out.println(numero);
        }
    }

    // Método que aceita listas de qualquer tipo que seja superclasse de Integer
    public static void adicionarNumero(List<? super Integer> lista) {
        lista.add(10);
        lista.add(20);
    }
}
