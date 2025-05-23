/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Sohan
 */
public class Database {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/MyDatabase";
        String username = "root";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stat= conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM Student");

            while (rs.next()){
                int id = rs.getInt("id");
                int roll_no = rs.getInt("roll_no");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name + ", Roll no: " + roll_no);
            }

            rs.close();
            stat.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
