package Database;
import java.sql.*;
public class pr_20_X2 {
	public static void main(String[] args) {
		
		try
		{
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
		PreparedStatement st = con.prepareStatement("update student set sroll=3 where sname = 'Abhishek' ");
		  st.executeUpdate();


		}
			catch(Exception ex)
		{
				
		System.out.println(ex);


		}
	}
}

