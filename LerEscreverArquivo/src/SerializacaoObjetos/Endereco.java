/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SerializacaoObjetos;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author felipe
 */
@Root
public class Endereco {
    @Element
    private String rua;

    @Element
    private String cidade;

    // Construtor padrão necessário para SimpleXML
    public Endereco() {
    }

    // Construtor com parâmetros
    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    // Getters e setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
