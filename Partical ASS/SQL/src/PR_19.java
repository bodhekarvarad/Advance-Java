import java.sql.*;
public class PR_19 {
	public static void main(String args[])
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
			PreparedStatement ps=con.prepareStatement("update student2 set sname='rahul',sroll=1 where sroll=5");
			int count=ps.executeUpdate();
			System.out.println(count+" rows updated");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
