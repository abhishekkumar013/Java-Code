package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class MyServlet2
 */
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String str=request.getParameter("username");
//		String str2=request.getParameter("password");
//		response.getWriter().append("Servlet 2 "+"username  :"+str+" "+"password :"+str2);
		
//		String str=(String) request.getAttribute("username");
//		String str2=(String) request.getAttribute("password");
//		response.getWriter().append("<h1>Servlet 2 </h1>"+"username  :"+str+" "+"password :"+str2);
		
		
		HttpSession session=request.getSession();
		String str=(String) session.getAttribute("username");
		String str2=(String) session.getAttribute("password");
		response.getWriter().append("<h1>Servlet 2 </h1>"+"username  :"+str+" "+"password :"+str2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
