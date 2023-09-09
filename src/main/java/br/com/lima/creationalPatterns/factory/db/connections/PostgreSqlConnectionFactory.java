package br.com.lima.creationalPatterns.factory.db.connections;

import java.sql.Connection;
import java.sql.SQLException;

public class PostgreSqlConnectionFactory implements ConnectionFactory{

    private String url;
    private String username;
    private String password;

    public PostgreSqlConnectionFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public Connection createConnection() throws SQLException {
        return null;
    }
}
