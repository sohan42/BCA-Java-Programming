

/**
 *
 * @author Sohan
 */

import java.sql.*;
import java.util.Scanner;

public class CRUD_DB{
    Scanner sc;
    Connection conn = null;
    Statement stat = null;
    public static void main(String[] args){
        CRUD_DB obj = new CRUD_DB();
            while(true){
                System.out.println("\n -- Choose an operation to be perform on Student table --");
                System.out.println("1. Display record");
                System.out.println("2. Insert ");
                System.out.println("3. Update ");
                System.out.println("4. Delete ");
                System.out.println("5. Exit ");
                
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        obj.display();
                        break;
                    case 2:
                        sc = new Scanner(System.in);
                        System.out.println("Enter following details...");
                        System.out.println("Name: ");
                        String name = sc.nextLine();
                        System.out.println("Roll_no: ");
                        int roll = sc.nextInt();
                        System.out.println("Faculty: ");
                        sc.nextLine();
                        String faculty = sc.nextLine();
                        System.out.println("Inserted Successfully!");
                        obj.insert(roll,name,faculty);
                        break;
                }
            }
        }

    public Statement statement(){
        String url = "jdbc:mysql://localhost:3306/MyDatabase";
        String username = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, username, password);
            stat= conn.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
        return stat;
    }
    
    void display(){
        stat = statement();
        ResultSet rs;
        try {
            rs = stat.executeQuery("SELECT * FROM Student");
            while (rs.next()){
                int id = rs.getInt("id");
                int roll_no = rs.getInt("roll_no");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name + ", Roll no: " + roll_no);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    void insert(int roll, String name, String faculty){
        stat = statement();
        try {
            String sql = "INSERT INTO student(roll_no, name, faculty) VALUES("+roll+", '"+name+"', '"+faculty+"')";
            stat.executeUpdate(sql); 
        } catch (SQLException ex) {
            System.out.println("Data insertion failed!");
        }
    }
    
    void update(){
        
    }
    
    void delete(){
    
    }
}
