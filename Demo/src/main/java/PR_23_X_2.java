

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PR_23_X_2
 */
public class PR_23_X_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PR_23_X_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		try
		{
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String n =  request.getParameter("userName");
			out.print("Welcome "+n);
			//Cookie ck = new Cookie("uname",n);
			HttpSession session=request.getSession();
			//session.setAttribute(uname, session);
		//	response.addCookie(ck);
			out.print("<a href='PR_24_Userp2'>visit</a>");
			//out.print("<input type='submit'value='go'>");
			//out.print("</form>");
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
			
		}
	
	}

}
