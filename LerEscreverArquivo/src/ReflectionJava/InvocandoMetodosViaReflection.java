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
public class InvocandoMetodosViaReflection {

    public static void main(String[] args) {
        try {
            // Obtém o objeto Class da classe "Exemplo"
            Class<?> classe = Class.forName("ReflectionJava.Exemplo");

            // Cria uma nova instância da classe "Exemplo"
            Object obj = classe.getConstructor().newInstance();

            // Obtém o método "metodoExemplo"
            Method metodoExemplo = classe.getMethod("getCampoPrivado");

            // Invoca o método "metodoExemplo" na instância criada
            metodoExemplo.invoke(obj);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
