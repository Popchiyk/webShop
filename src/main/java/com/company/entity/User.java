package com.company.entity;/*
com.company.entity
webShop
Popchiyk
05.05.2022 05 10:53 2022*/

import com.company.DAO.IUserDAO;
import com.company.mysqlImp.MySQLConnectionPool;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.FileReader;
import java.sql.*;
import java.sql.Date;
import java.util.*;

//@XmlRootElement(name = "user")
public class User implements IUserDAO {

    static final String url = "jdbc:mysql://localhost:3306/website";
    static final String login ="root";
    static final String passwordDb = "root";

    private Integer idUser;
    private String userName;
    private String password;
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/dd/yyyy")
    private Date createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/dd/yyyy")
    private Date updatedAt;
    private String phoneNumber;
    private List<Role> roles;

    public User() {
    }

    public User(Integer idUser, String userName, String password, String email, Date createdAt,
                Date updatedAt, String phoneNumber,  List<Role> idRole) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.phoneNumber = phoneNumber;
        this.roles = idRole;
    }

    public User(Integer idUser, String userName) {
        this.idUser = idUser;
        this.userName = userName;
    }

    public User(Integer id , String userName, String password, String email, Date createdAt, Date updatedAt,
                String phoneNumber) {
        this.idUser = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.phoneNumber = phoneNumber;
    }

   // @XmlAttribute(name = "idUser")
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    //@XmlElement(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //@XmlTransient
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //@XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //@XmlJavaTypeAdapter(value = DateAdapter.class)
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    //@XmlJavaTypeAdapter(DateAdapter.class)
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    //@XmlElement(name = "phone")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //@XmlAttribute(name = "idRole")
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUser.equals(user.idUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser);
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", roles=" + roles +
                '}';
    }

    @Override
    public User add(User user) {
        String sql = "INSERT INTO User(idUser,user_name,password,email,createAt,updatedAt," +
                "phone_number,Role_Entity_idRole_Entity)" + "VALUES(?,?,?,?,?,?,?,?)";
        ResultSet rs = null;
        OptionalInt idRole = user.getRoles().stream().mapToInt(role -> role.getIdRole()).findFirst();
        try {
            Connection con = MySQLConnectionPool.getInstance(url,login,passwordDb).getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,user.getIdUser());
            preparedStatement.setString(2,user.getUserName());
            preparedStatement.setString(3,user.getPassword());
            preparedStatement.setString(4,user.getEmail());
            preparedStatement.setDate(5,user.getCreatedAt());
            preparedStatement.setDate(6,user.getUpdatedAt());
            preparedStatement.setString(7,user.getPhoneNumber());
            preparedStatement.setInt(8,idRole.getAsInt());
            preparedStatement.execute();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void update(User user, Integer id) {
        OptionalInt idRole = user.getRoles().stream().mapToInt(role -> role.getIdRole()).findFirst();
        String sql = "UPDATE User" + " SET user_name='"+user.getUserName()+"', email='"+user.getEmail()+"', password='"+user.getPassword()+
                "', updatedAt='"+user.getUpdatedAt() + "', createAt='"+user.getCreatedAt() + "', phone_number='" + user.getPhoneNumber() +
                "', Role_Entity_idRole_Entity=" + idRole.getAsInt() + " WHERE idUser ="+ id +"; ";
        PreparedStatement ps = null;
        try {
            Connection con = MySQLConnectionPool.getInstance(url,login,passwordDb).getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            con.close();
            System.out.println("Complete update ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getById(Integer id) {
        String sql = "SELECT * FROM User where idUser ='" + id + "'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = new User();
        Role role = new Role();
        try {
            Connection con = MySQLConnectionPool.getInstance(url,login,passwordDb).getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                user.setIdUser(rs.getInt("idUser"));
                user.setUserName(rs.getString("user_name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setUpdatedAt(rs.getDate("updatedAt"));
                user.setCreatedAt(rs.getDate("createAt"));
                user.setPhoneNumber(rs.getString("phone_number"));
                user.setRoles(new ArrayList<>(Collections.singletonList(
                        role.getById(rs.getInt("Role_Entity_idRole_Entity"))
                )));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM User WHERE idUser ='" + id + "'";
        PreparedStatement ps = null;
        try {
            Connection con = MySQLConnectionPool.getInstance(url,login,passwordDb).getConnection();
            ps = con.prepareStatement(sql);
            ps.execute();
            con.close();
            System.out.println("Complete Delete ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getAll() {
        String sql = "select idUser,user_name,password,email,createAt,updatedAt,phone_number,Role_Entity_idRole_Entity " +
                " from User INNER JOIN role_entity ON User.Role_Entity_idRole_Entity=role_entity.idRole_Entity";
        PreparedStatement ps=null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();
        Role role = new Role();
        try {
            Connection con = MySQLConnectionPool.getInstance(url,login,passwordDb).getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                role = role.getById(rs.getInt("Role_Entity_idRole_Entity"));
                users.add(new User(
                        rs.getInt("idUser"),
                        rs.getString("user_name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getDate("updatedAt"),
                        rs.getDate("createAt"),
                        rs.getString("phone_number"),
                        new ArrayList<>(Collections.singletonList(
                                new Role(role.getIdRole(), role.getName())
                        ))

                ));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

}
