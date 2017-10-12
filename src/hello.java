

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 */
@WebServlet("/hello")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletResponse responce;
		// TODO Auto-generated method stub
		responce.setContentType("text/html");
		PrintWriter out=response.grtWriter();
		out.printlnn("<html><body>");
		out.printlnn("<h3>hello servlet</h3>");
		out.printlnn("</html></body>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg=request.getParameter("username");
		 String pwd = request.getParameter("password");
		 PrintWriter out=response.getWriter();
			
	   		out.println("username:"+msg);
	   		out.println("password:"+pwd);
		
	}

}
