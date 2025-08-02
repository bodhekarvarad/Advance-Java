import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class PR_201 {

	public static void main(String args[])
	{
	try 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
		PreparedStatement stmt=con.prepareStatement("delete from student2 where sname=?");
		stmt.setString(1,"Virat");
		int i=stmt.executeUpdate();
		System.out.println(i+" records updated");
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

