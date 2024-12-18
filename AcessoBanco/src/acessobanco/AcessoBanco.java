/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acessobanco;

import java.sql.SQLException;

public class AcessoBanco {

    public static void main(String[] args) {
        //primeiro teste
        //testa a conexao com o banco de dados
        Conexao conn = new Conexao();

        try {
            conn.getConexao();
        } catch (ClassNotFoundException ex) { //quando não encontra o driver
            ex.getStackTrace();
        }

        //========segundo teste
        //========Criar o objeto de transacao
        Contatos contato = new Contatos(); //criar o DTO
        contato.setNomeContato("Joao");        //Configurar os dados

        ContatosDAO cadDAO = new ContatosDAO();  //Criar o DAO

//        try {
//            cadDAO.adicionar(contato);         //Chamar o metodo para add no banco
//        } catch (SQLException e) {
//            e.getSQLState();
//        }
       
        try {
            System.out.println(cadDAO.searchById(1));
        } catch(SQLException e) {
            e.getSQLState();
        }

    }
}
