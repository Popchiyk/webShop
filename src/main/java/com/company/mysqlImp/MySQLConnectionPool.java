package com.company.mysqlImp;/*
com.company
webShop
Popchiyk
08.05.2022 05 12:33 2022 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class MySQLConnectionPool implements IConnectionPool {

    private static MySQLConnectionPool connectionPool = null;
    private final List<Connection> availableConnections;
    private final List<Connection> usedConnections = new ArrayList<>();
    private static final int INITIAL_POOL_SIZE = 10;

    private MySQLConnectionPool(List<Connection> availableConnections) {
        this.availableConnections = availableConnections;
    }


    public static MySQLConnectionPool getInstance(String url, String login, String password) throws SQLException {
        if (connectionPool == null) {
            List<Connection> connections = new ArrayList<>(INITIAL_POOL_SIZE);
            for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
                connections.add(createConnection(url, login, password));
            }
            connectionPool = new MySQLConnectionPool(connections);
        }

        return connectionPool;
    }

    private static Connection createConnection(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    @Override
    public Connection getConnection() {
        Connection connection = availableConnections
                .remove(availableConnections.size() - 1);
        usedConnections.add(connection);
        return connection;
    }

    @Override
    public boolean releaseConnection(Connection connection) {
        availableConnections.add(connection);
        return usedConnections.remove(connection);
    }

    public int getSize() {
        return availableConnections.size() + usedConnections.size();
    }
}
