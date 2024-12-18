/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acessobanco;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author aluno
 */
public class Conexao {

    private Connection conn;

    private void conectar() throws ClassNotFoundException { //esse erro ocorre quando não encontra o driver
        System.out.println("Conectando ao banco...");
        try {
            Class.forName("org.mariadb.jdbc.Driver"); //verifica o driver via reflection
            System.out.println("conn:" + conn);
            //estabelece a conexao usando a string de conexao
            conn = (Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3309/teste","root", "123");
            if (conn != null) {
                System.out.println("Conexão realizada!");
                System.out.println("conn:" + conn);
            }
        } catch (SQLException e) { //esse erro ocorre quando não conexta ao banco
            e.printStackTrace();
        }
    }

    public Connection getConexao() throws ClassNotFoundException {

        conectar();
        return conn;
    }
}

