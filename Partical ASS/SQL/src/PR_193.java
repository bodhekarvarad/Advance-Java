

import java.sql.*;
public class PR_193 {
    public static void main(String[] args) {
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
          Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery("SELECT * FROM student");
       
          while(rs.next())
          {
              System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
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