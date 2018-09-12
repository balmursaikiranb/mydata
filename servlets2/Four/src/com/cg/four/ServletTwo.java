package com.cg.four;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/ServletTwo.view")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    PrintWriter out=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		out=response.getWriter();
		String name=(String) session.getAttribute("name");
		String mobile=(String) session.getAttribute("mobile");
		String email=(String) session.getAttribute("email");
		String username=(String) session.getAttribute("username");
		String gender=(String) session.getAttribute("gender");
		String course[]=(String[]) session.getAttribute("course");
		String cities[]=(String[]) session.getAttribute("cities");
		/*String name=(String) request.getAttribute("name");
		String mobile=(String) request.getAttribute("mobile");
		String email=(String) request.getAttribute("email");
		String username=(String) request.getAttribute("username");
		String gender=(String) request.getAttribute("gender");
		String course[]=(String[]) request.getAttribute("course");
		String cities[]=(String[]) request.getAttribute("cities");*/
		out.println("<h1>Name:"+name+"</h1>");
		out.println("<h1>Mobile:"+mobile+"</h1>");
		out.println("<h1>Email:"+email+"</h1>");
		out.println("<h1>User Name:"+username+"</h1>");
		out.println("<h1>Gender:"+gender+"</h1>");
		out.print("<h1>Courses selected are:</h1>");
		for (String string : course) {
			out.print("<h1>"+string+"</h1>");
		}
		out.print("<h1>City selected:</h1>");
		for (String string : cities) {
			out.print("<h1>"+string+"</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
