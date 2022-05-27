package com.company.mysqlImp;/*
com.company.mysqlImp
webShop
Popchiyk
10.05.2022 05 16:33 2022 */

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnectionPool {
    Connection getConnection();
    boolean releaseConnection(Connection connection);
}
