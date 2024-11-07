/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericsVetor;

/**
 *
 * @author felipe
 */
public class PrincipalManipuladorVetor {

    public static void main(String[] args) {
        // Cria um vetor de Integers
        Integer[] vetorInt = {1, 2, 3, 4, 5};
        ManipuladorVetor<Integer> manipuladorInt = new ManipuladorVetor<>(vetorInt);

        // Imprime o vetor de Integers
        System.out.println("Vetor de Integers:");
        manipuladorInt.imprimirVetor();

        // Obtém e imprime o terceiro elemento do vetor
        System.out.println("Terceiro elemento: " + manipuladorInt.obterElemento(2));

        // Substitui o terceiro elemento e imprime o vetor novamente
        manipuladorInt.substituirElemento(2, 99);
        System.out.println("Vetor de Integers após substituição:");
        manipuladorInt.imprimirVetor();

        // Cria um vetor de Strings
        String[] vetorString = {"A", "B", "C"};
        ManipuladorVetor<String> manipuladorString = new ManipuladorVetor<>(vetorString);

        // Imprime o vetor de Strings
        System.out.println("\nVetor de Strings:");
        manipuladorString.imprimirVetor();

        // Obtém e imprime o segundo elemento do vetor
        System.out.println("Segundo elemento: " + manipuladorString.obterElemento(1));

        // Substitui o segundo elemento e imprime o vetor novamente
        manipuladorString.substituirElemento(1, "Z");
        System.out.println("Vetor de Strings após substituição:");
        manipuladorString.imprimirVetor();
    }
}

