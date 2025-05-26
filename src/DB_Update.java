/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sohan
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DB_Update {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String User = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, User, pass);
            Statement st = con.createStatement();
            String sql = "UPDATE student SET Roll_No = 3 WHERE name = 'sujan'";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data is Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }  
}

