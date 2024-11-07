/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReflectionJava;

/**
 *
 * @author felipe
 */
public class Exemplo{
    private String campoPrivado;

    public String getCampoPrivado() {
        return campoPrivado;
    }

    public void setCampoPrivado(String campoPrivado) {
        this.campoPrivado = campoPrivado;
    }
    
    

    

    public void metodoExemplo(String a, int b) { // Método de exemplo
        campoPrivado="Ola Mundo";
        System.out.println(campoPrivado);
    }
}