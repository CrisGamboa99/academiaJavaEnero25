package com.exception.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import org.apache.commons.dbcp.BasicDataSource;
/**
 * @author Crunchify.com
 * 
 */
public class CrunchifyDataSourceExample {
    public static void main(String[] args) throws Exception {
//        // Creates a BasicDataSource
//        BasicDataSource crunchifyDS = new BasicDataSource();
//        // Define Driver Class
//        crunchifyDS.setDriverClassName("com.mysql.jdbc.Driver");
//        // Define Server URL
//        crunchifyDS.setUrl("jdbc:mysql://localhost/crunchifydb");
//        // Define Username
//        crunchifyDS.setUsername("admin");
//        // Define Your Password
//        crunchifyDS.setPassword("password");
//        // onnection (session) with a specific database. SQL statements are
//        // executed and results are returned within the context of a connection.
//        Connection conn = null;
//        // An object that represents a precompiled SQL statement.
//        PreparedStatement stmt = null;
//        try {
//            conn = crunchifyDS.getConnection();
//            stmt = conn.prepareStatement("select * from company");
//            // A table of data representing a database result set, which is
//            // usually generated by executing a statement that queries the
//            // database.
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                System.out.println("Comapny: " + rs.getString("company"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // Close Statement and Connection
//            if (stmt != null) {
//                stmt.close();
//            }
//            if (conn != null) {
//                conn.close();
//            }
//        }
    }
}