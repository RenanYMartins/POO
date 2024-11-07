/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericsVetor;

/**
 *
 * @author felipe
 */
// Classe genérica que manipula um vetor usando curingas
public class ManipuladorVetor<T> {
    private T[] vetor;

    // Construtor que inicializa o vetor
    public ManipuladorVetor(T[] vetor) {
        this.vetor = vetor;
    }

    // Método que imprime todos os elementos do vetor
    public void imprimirVetor() {
        for (T elemento : vetor) {
            System.out.println(elemento);
        }
    }

    // Método que retorna o elemento na posição especificada
    public T obterElemento(int indice) {
        if (indice >= 0 && indice < vetor.length) {
            return vetor[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice fora do limite do vetor.");
        }
    }

    // Método que substitui o elemento na posição especificada
    public void substituirElemento(int indice, T novoElemento) {
        if (indice >= 0 && indice < vetor.length) {
            vetor[indice] = novoElemento;
        } else {
            throw new IndexOutOfBoundsException("Índice fora do limite do vetor.");
        }
    }
}
