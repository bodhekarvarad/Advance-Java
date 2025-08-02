package Database;

import java.sql.*;
public class PR_192 {

	public static void main(String args[])
	{
	try 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
		stmt.setInt(1,101);
		stmt.setString(2,"Abhishek");
		stmt.setString(3,"Yadav");
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
