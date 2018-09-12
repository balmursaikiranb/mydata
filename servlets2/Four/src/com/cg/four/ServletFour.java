package com.cg.four;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFour
 */
@WebServlet("/ServletFour.view")
public class ServletFour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFour() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    PrintWriter out=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		String name=(String) request.getAttribute("name");
		String mobile=(String) request.getAttribute("mobile");
		String email=(String) request.getAttribute("email");
		String username=(String) request.getAttribute("username");
		String gender=(String) request.getAttribute("gender");
		String course[]=(String[]) request.getAttribute("course");
		String cities[]=(String[]) request.getAttribute("cities");
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
