/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SerializacaoObjetos;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author felipe
 */
public class PrincipalSerializacaoXML {

    public static void main(String[] args) throws Exception {
        // Cria a lista de endereços
        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(new Endereco("Rua 1", "Cidade A"));
        enderecos.add(new Endereco("Rua 2", "Cidade B"));

        // Cria o objeto Pessoa com a lista de endereços
        PessoaS pessoa = new PessoaS("João", 30, enderecos);

        // Cria um objeto Serializer para serializar e desserializar
        Serializer serializer = new Persister();

        // Serializa o objeto Pessoa para XML e imprime no console
        serializer.write(pessoa, System.out);

        // XML de exemplo para desserialização
        String xml = "<pessoa><nome>João</nome><idade>30</idade><enderecos><endereco><rua>Rua 1</rua><cidade>Cidade A</cidade></endereco><endereco><rua>Rua 2</rua><cidade>Cidade B</cidade></endereco></enderecos></pessoa>";

        // Desserializa o XML de volta para um objeto Pessoa
        PessoaS pessoaDesserializada = serializer.read(PessoaS.class, xml);

        // Imprime os dados desserializados
        System.out.println("Nome: " + pessoaDesserializada.getNome());
        System.out.println("Idade: " + pessoaDesserializada.getIdade());
        for (Endereco endereco : pessoaDesserializada.getEnderecos()) {
            System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getCidade());
        }
    }
}
//https://mvnrepository.com/artifact/org.simpleframework/simple-xml/2.7.1