

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstservlet
 */
@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	   
		String msg=req.getParameter("username");
		String pwd=req.getParameter("userpass");
  	     
   
		PrintWriter out=resp.getWriter();
		
   		out.println("username:"+msg);
   		out.println("password:"+pwd);
    }
    
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//String msg=request.getParameter("username");
		
	     
//	PrintWriter out=response.getWriter();
//		out.println(msg);
		
	}

//}
