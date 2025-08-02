

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PR_24_Userp
 */
public class PR_24_Userp extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String u1 = request.getParameter("n1");
		String e1 = request.getParameter("e1");
		String p1 = request.getParameter("p1");
		Cookie ck = new Cookie("username",u1);
		Cookie ck1 = new Cookie("email",e1);
		Cookie ck2 = new Cookie("password",p1);
		response.addCookie(ck);
		response.addCookie(ck1);
		response.addCookie(ck2);
		out.println("<form action ='PR_24_Userp2' method='post'>");
		out.println("Click go button to get all cookies :");
		out.println("<input type='submit'value='go'>");
		out.println("</form>");
		
		out.close();
	}

}
