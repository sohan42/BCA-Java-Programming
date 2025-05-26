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

public class DB_Delete {
    public static void main(String[] args) {
     try{
         String url = "jdbc:mysql://localhost:3306/mydatabase";
         String User = "root";
         String pass = "";
         
         Connection con = DriverManager.getConnection(url, User, pass);
         Statement st = con.createStatement();
         
         String sql = "DELETE FROM student WHERE Roll_No=5";
         st.executeUpdate(sql);
         JOptionPane.showMessageDialog(null, "SuccessFully Deleted!");
     }
     catch(Exception e){
         e.printStackTrace();
     }
     
    }        
}

