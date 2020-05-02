/*
Mustafa Alibek
HomeWork 10.2
Implement update method (input: id, name, surname, grade) that update the values in row by id.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Update {

    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/test1";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

            String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "qwerty123");
            statement.setString(2, "Mustafa Alibek");
            statement.setString(3, "a.mustafa@astanait.edu.kz");
            statement.setString(4, "qwertyqwerty");

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated!");
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
