package acessobanco;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ContatosDAO {

    private Conexao conn;

    public void adicionar(Contatos cadastroDto) throws SQLException {

        conn = new Conexao(); //instancia a conexao

        String sql = "Insert into contatos(nome) values(?);"; //cria a string sql

        PreparedStatement ps;  //estrutura para insercao de valores na string sql-evitar injecao de sql
        ps = null;
        try {
            ps = conn.getConexao().prepareStatement(sql); //instancia a estrutura
        } catch (ClassNotFoundException ex) {
        }

        ps.setString(1, cadastroDto.getNomeContato()); //numero do campo no banco {0-id, 1-nome}
        ps.execute(); //executa a consulta

    }

    public void delete(Contatos cadastroDTO) throws SQLException {
        conn = new Conexao(); //instancia a conexao

        String sql = "Delete from contatos where id=?;"; //cria a string sql

        PreparedStatement ps;  //estrutura para insercao de valores na string sql-evitar injecao de sql
        ps = null;
        try {
            ps = conn.getConexao().prepareStatement(sql); //instancia a estrutura
        } catch (ClassNotFoundException ex) {
        }

        ps.setInt(0, cadastroDTO.getIdContato()); //numero do campo no banco {0-id, 1-nome}
        ps.execute(); //executa a consulta
    }

    public List<Contatos> listarCadastros() throws SQLException {
        List<Contatos> lista = new ArrayList<>();

        Conexao conn = new Conexao();                //instancia a conexao

        String sql = "Select * from contatos";       //cria a string do sql

        PreparedStatement ps; //criar a estrutura para insercao de dados-evitar injeacao de sql
        ps = null;
        ResultSet rs; //criar o resultSet, uma lista especializada para receber dados SQL
        rs = null;

        try {
            ps = conn.getConexao().prepareStatement(sql); //obtem a conexao e prepara a estrutura para a string sql
            rs = ps.executeQuery(); //execute consulta 
        } catch (ClassNotFoundException ex) {

        }

        while (rs.next()) { //enquanto existe linha da consulta
            Contatos cadDto = new Contatos();         //criar o data transaction object
            cadDto.setIdContato(rs.getInt(0));            //obtem o primeiro item, via valor
            cadDto.setNomeContato(rs.getString("nome"));  //obtem o segundo valor, via string            
            lista.add(cadDto);                            //adiciona o objeto a lista
        }

        return lista; //retorna a lista
    }

    public Contatos searchById(int id) throws SQLException {
        Conexao conn = new Conexao();

        String sql = "Select * from contatos where id=?";

        PreparedStatement ps;
        ps = null;
        ResultSet rs;
        rs = null;

        try {
            ps = conn.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery(); 
        } catch (ClassNotFoundException ex) {

        }

        Contatos contatos = null;
        if (rs.next()) {
            contatos = new Contatos();
            contatos.setIdContato(rs.getInt(1));
            contatos.setNomeContato(rs.getString("nome"));
        }

        return contatos;
    }
    
    
    
}
