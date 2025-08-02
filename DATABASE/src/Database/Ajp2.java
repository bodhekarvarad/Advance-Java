package Database;

import java.sql.*;
public class Ajp2 {



    public static void main(String[] args) {
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
          Statement stmt=con.createStatement();
       stmt.executeUpdate("create table student(SRoll int,Name varchar2(20),perc int)");
       stmt.executeUpdate(" insert into student values(0018,'VK',92)");
       
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // TODO code application logic here
    }
    
}



