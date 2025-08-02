package Database;
import java.sql.*;
public class PR_20_Xiii_2 {
public static void main(String[] args) {
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dbms");
		PreparedStatement pstmt = con.prepareStatement("delete from product where price>500 AND ID ='P1234'");
		pstmt.executeUpdate();
		System.out.println("Record deleted i.e price > 500 and Id = P1234");
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
			
		}
		
		
		
}
}
