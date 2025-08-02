

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PR_23_Xiii_1
 */
public class PR_23_Xiii_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	      
	        HttpSession session = request.getSession();
	        
	     
	        session.setAttribute("username", "ABC");
	        session.setAttribute("userRole", "adminstrator");
	        
	        out.println("<html><body>");
	        out.println("<h1>Session Details</h1>");
	        
	       
	        String sessionId = session.getId();
	        out.println("Session ID: " + sessionId + "<br>");
	        
	   
	        boolean isNew = session.isNew();
	        out.println("Is New Session: " + isNew + "<br>");
	        
	     
	        long creationTime = session.getCreationTime();
	        out.println("Session Creation Time: " + creationTime + "<br>");
	        
	        
	        long lastAccessTime = session.getLastAccessedTime();
	        out.println("Last Access Time: " + lastAccessTime + "<br>");
	        
	      
	        String username = (String) session.getAttribute("username");
	        String userRole = (String) session.getAttribute("userRole");
	        out.println("Username: " + username + "<br>");
	        out.println("User Role: " + userRole + "<br>");
	      
	        session.invalidate();
	        
	        out.println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
