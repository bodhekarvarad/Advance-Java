package Database;


import java.sql.*;
import java.sql.Connection;

public class Create_table {
    public static void main(String args[]) 
    {
        try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("create table student(id number(30),first_name varchar(20),Percentage number(30));");
        System.out.println("MaDE");
        con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
            
    
}
