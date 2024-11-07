/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author felipe
 * @param <T>
 */
public class Funcionario implements Comparavel<Funcionario> {

    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int comparar(Funcionario outra) {
        if(this.idade==outra.idade) return 0;
        else if(this.idade<outra.idade) return -1;
        else return 1;
        
        //mesma coisa
        //return Integer.compare(this.idade, outra.idade);
        
    }

    @Override
    public String toString() {
        return nome + " " + idade;
    }
}
