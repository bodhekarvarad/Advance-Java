

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class xii_21
 */
public class xii_21 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xii_21() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter p=res.getWriter();
		p.print("<html>"
				+ "<body>"
				+ "<h1> Hello MSBTE </h1>"
				+ "<body>"
				+ "</html>");
		
	}

}
