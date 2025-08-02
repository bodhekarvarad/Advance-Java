

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Prac_xiii1
 */
public class Prac_xiii1 extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter pw=response.getWriter();
		
		String res=request.getParameter("o");
		String res1=request.getParameter("r1");
		
		pw.println("You selected "+res);
		pw.println("You selected ");
		
		pw.println(res1);
		
	}

}
