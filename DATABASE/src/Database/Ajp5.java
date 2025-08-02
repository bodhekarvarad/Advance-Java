package Database;

import java.sql.*;
public class Ajp5 {
    public static void main(String[] args) {
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
          Statement stmt=con.createStatement();
         stmt.executeUpdate("create table students(SRoll int,sname varchar2(20))");
      stmt.executeUpdate("insert into stud values(09, 'RR')");
         ResultSet rs=stmt.executeQuery("select * from student");
         System.out.println("Roll Number \t Name  ");
         while(rs.next()) {
        	 System.out.println(rs.getInt(1)+"              "+rs.getString(2));
         }
       
         con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // TODO code application logic here
    }
    
}


