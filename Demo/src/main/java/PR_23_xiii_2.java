

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PR_23_xiii_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
			out.println(" <h3> LastAccessedtime :</h3>");
			 Long lastaccessedtime = session.getLastAccessedTime();
			Date d = new Date(lastaccessedtime);
			out.println("<h3>"+d+"</h3>");
			 session.setMaxInactiveInterval(1000);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
