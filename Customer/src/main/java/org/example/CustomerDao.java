package org.example;

import java.sql.*;

public class CustomerDao {
    static Connection con;  // connection build to dbconnection

    static void createCustomer(CustomerInfo customer) throws SQLException {
        String query = "insert into customers values(?, ?, ?)";
        con = DBConnection.createConnection();
        PreparedStatement pr = con.prepareStatement(query);
        pr.setInt(1, customer.getId());
        pr.setInt(2, customer.getAge());
        pr.setString(3, customer.getName());
        int res = pr.executeUpdate(); // if this will give 0 means insert nhi hua and if give other than 0 means inserted.
        if (res != 0)
            System.out.println("---------------------------------------------" +
                    "INSERT SUCCESSFULLY" +
                    "---------------------------------------------");
    }

    static void getAllCustomers() {
        con = DBConnection.createConnection();
        String query = "select * from customers";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getInt(2) + " " +
                        rs.getString(3));
            }
            System.out.println("---------------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void getCustomerById(int id) {
        con = DBConnection.createConnection();
        String query = "select * from customers where id =" + id;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getInt(2) + " " +
                        rs.getString(3));
            }
            System.out.println("---------------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void updateCustomerById(int id, String updatedName) {
        con = DBConnection.createConnection();
        String query = "update customers set cust_name = ? where id = ?";
        try {
            PreparedStatement pr = con.prepareStatement(query);
            pr.setString(1, updatedName);
            pr.setInt(2, id);
            int a = pr.executeUpdate();
            if (a != 0)
                System.out.println("---------------------------------------------" +
                        "UPDATED SUCCESSFULLY" +
                        "---------------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void deleteCustomerById(int id) {
        con = DBConnection.createConnection();
        String query = "delete from customers where id = ?";
        try {
            PreparedStatement pr = con.prepareStatement(query);
            pr.setInt(1, id);
            int a = pr.executeUpdate();
            if (a != 0)
                System.out.println("---------------------------------------------" +
                        "DELETED SUCCESSFULLY" +
                        "---------------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
