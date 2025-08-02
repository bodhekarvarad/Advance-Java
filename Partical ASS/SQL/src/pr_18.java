import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class pr_18 {

	 public static void main(String[] args) {
	        try{
	          Class.forName("oracle.jdbc.driver.OracleDriver");
	          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
	          Statement stmt=con.createStatement();
	         stmt.executeUpdate("create table empolyee(emp_id int,emp_name varchar2(20))");
	         //stmt.executeUpdate(" insert into empo values(09,'Adu')");
	         System.out.println("Created table");
	       
	            con.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	        // TODO code application logic here
	    }
}
