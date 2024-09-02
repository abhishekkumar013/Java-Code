package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
	        "Why do Java developers wear glasses? Because they don't C#!",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
	        // Add more jokes here
	    };
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2"); 
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		String btn=request.getParameter("bt1");
		int btnVal=Integer.parseInt(btn);
		int res;
		switch (btnVal) {
			case 1: res=num1+num2; break;
			case 2: res=num1-num2; break;
			case 3: res=num1*num2; break;
			case 4: res=num1/num2; break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + btnVal);
		}
		int randomIndex=(int)(Math.random()*jokes.length);
		String randomjoke=jokes[randomIndex];
		
//		response.getWriter().append("Ans = "+res);
		response.sendRedirect("result.jsp?ans="+res+"&joke="+randomjoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
