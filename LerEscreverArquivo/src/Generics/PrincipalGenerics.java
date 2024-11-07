/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author felipe
 */
public class PrincipalGenerics {

    public static void main(String[] args) {
        
        //usando o objeto com generics
        Caixa<String> caixaString = new Caixa<>();
        caixaString.adicionar("Olá, Mundo!");
        System.out.println(caixaString.obter());
        Caixa<Integer> caixaInteger = new Caixa<>();
        caixaInteger.adicionar(123);
        System.out.println(caixaInteger.obter());

        
        //usando o método com generics
        Integer[] numeros = {1, 2, 3, 4, 5};
        String[] palavras = {"Java", "Generics", "São", "Legais"};
        Util.imprimirArray(numeros);
        Util.imprimirArray(palavras);

        //usando o comparável com gerenrics
        Funcionario func1 = new Funcionario("João", 25);
        Funcionario func2 = new Funcionario("Maria", 30);
        System.out.println("Comparando João e Maria:");
        int resultado = func1.comparar(func2);
        if (resultado < 0) {
            System.out.println(func1.getNome() + " é mais jovem que " + func2.getNome());
        } else if (resultado > 0) {
            System.out.println(func1.getNome() + " é mais velho que " + func2.getNome());
        } else {
            System.out.println(func1.getNome() + " e " + func2.getNome() + " têm a mesma idade");
        }

    }
}
