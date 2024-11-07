/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReflectionJava;

import java.lang.reflect.Method;

/**
 *
 * @author felipe
 */
public class ObtendoInformacoesReflection {

    public static void main(String[] args) {
        try {
            // Obtém o objeto Class da classe "Exemplo"
            Class<?> classe = Class.forName("ReflectionJava.Exemplo");

            // Imprime o nome da classe
            System.out.println("Nome da Classe: " + classe.getName());

            // Imprime os métodos declarados na classe
            System.out.println("Métodos:");
            for (Method metodo : classe.getDeclaredMethods()) {
                System.out.println(metodo.getName());
                
                int quantidadeDeParametros = metodo.getParameterCount();
                Class<?>[] tiposDeParametros = metodo.getParameterTypes(); 
                // Imprime o nome do método e os tipos de seus parâmetros 
                System.out.print("Método: " + metodo.getName() + ", Tipos de parâmetros: "); 
                for (Class<?> tipo : tiposDeParametros) { 
                    System.out.print(tipo.getName() + " "); 
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
