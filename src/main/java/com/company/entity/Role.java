package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 10:56 2022*/

import com.company.DAO.IRoleDAO;
import com.company.mysqlImp.MySQLConnectionPool;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Role implements IRoleDAO {

    static final String url = "jdbc:mysql://localhost:3306/website";
    static final String login ="root";
    static final String passwordDb = "12345";
    private Integer idRole;
    private String name;

    public Role() {
    }

    public Role(int idRole, String name) {
        this.idRole = idRole;
        this.name = name;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Role add(Role role) {
        return null;
    }

    @Override
    public void update(Role role, Integer id) {

    }

    @Override
    public Role getById(Integer id) {
        String sql = "SELECT * FROM role_entity where idRole_Entity ='" + id + "'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Role role = new Role();
        try {
            Connection con = MySQLConnectionPool.getInstance(url,login,passwordDb).getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
              role.setIdRole(rs.getInt("idRole_Entity"));
              role.setName(rs.getString("name"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Role> getAll() {
        return null;
    }
}
