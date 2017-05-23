package register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		String am= request.getParameter("am");
		String fullname = request.getParameter("fullname");
		response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = new PrintWriter(response.getWriter());
	    out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("  <head>");
			out.println("    <meta charset='utf-8'>");
			out.println("    <title>Registration</title>");
			out.println("  </head>");
			out.println("  <body>");
			out.println("   <h1>Success!</h1>");
			out.println("am:"+am+"<br>");
			out.println("fullname:"+fullname+"<br>");
			out.println(" </body>");
			out.println("</html>");
			}
	}


