package register;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String am= request.getParameter("am");
		String fullname = request.getParameter("fullname");
		if((am=="")||(fullname=="")){
			
			//forward to form
			RequestDispatcher errorDispatcher = (RequestDispatcher) request.getRequestDispatcher("/form.html");
			errorDispatcher.forward(request, response);
		}else{ //print success
		RequestDispatcher pageHeader = getServletContext().getRequestDispatcher("/SecondServlet");
	    pageHeader.forward (request, response);
		
	}
	}
	
/*	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
