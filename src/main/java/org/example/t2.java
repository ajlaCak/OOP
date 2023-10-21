
package org.example;

import java.sql.*;

public class t2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test"; // Correct JDBC URL for MySQL
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
