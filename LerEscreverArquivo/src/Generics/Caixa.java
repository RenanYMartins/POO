/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author felipe
 */
public class Caixa<T> {

    private T conteudo;

    public void adicionar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T obter() {
        return conteudo;
    }
}
