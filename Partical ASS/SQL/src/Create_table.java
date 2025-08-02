/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.sql.Connection;
/**
 *
 * @author bodhe
 */
public class Create_table {
    public static void main(String args[]) 
    {
        try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys","dbms");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("Create table student(id number(30),first_name varchar(20));");
        System.out.println("MaDE");
        con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
            
    
}
