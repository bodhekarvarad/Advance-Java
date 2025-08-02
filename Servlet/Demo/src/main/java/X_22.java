

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class X_22
 */
public class X_22 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public X_22() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 String user=request.getParameter("t");
	 if(user == null)
	 {
	 int length=user.length();
	 response.getWriter().write(String.valueOf(length));
	 
	 }
	 else
	 {
		 response.getWriter().write("Username parameter is missing.");
	 }
		
	}

}
