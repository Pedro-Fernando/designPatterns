package br.com.lima.creationalPatterns.factory.db;

import br.com.lima.creationalPatterns.factory.db.connections.ConnectionFactory;
import br.com.lima.creationalPatterns.factory.db.connections.MySqlConnectionFactory;
import br.com.lima.creationalPatterns.factory.db.connections.PostgreSqlConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {

    public static void main(String[] args) {
        ConnectionFactory factory1 = new MySqlConnectionFactory("jdbc:mysql://localhost/mydb", "user", "password");
         ConnectionFactory factory2 = new PostgreSqlConnectionFactory("jdbc:postgresql://localhost/mydb", "user", "password");

        try {
            Connection connection = factory1.createConnection();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
