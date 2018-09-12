package com.cg.servletdummy;

import java.io.IOException;
import java.io.PrintWriter;

import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet(urlPatterns= {"/ServletOne","*.do"})
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    PrintWriter out=null;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		out=response.getWriter();
/*System.out.println("hai");
out.println("<html><body>");
out.println("<h1>doget method</h1>");
out.println("</body></html>");*/
String path=request.getServletPath();
switch(path)
{
case "/add.do":
	add();
	break;
case "/delete.do":
	delete();
	break;
case "/edit.do":
	edit();
	break;
case "/update.do":
	update();
	break;
case "/button.do":
	buttonLink();
	break;
}
	}

	private void buttonLink() {
		// TODO Auto-generated method stub
		LocalDateTime d=LocalDateTime.now();
		out.println("<html><body>");
		out.println("<h1>"+d+"</h1>");
		out.println("</body></html>");
	}

	private void update() {
		// TODO Auto-generated method stub
		out.println("<html><body>");
		out.println("<h1>update method</h1>");
		out.println("</body></html>");
		
	}

	private void edit() {
		// TODO Auto-generated method stub
		out.println("<html><body>");
		out.println("<h1>edit method</h1>");
		out.println("</body></html>");
	}

	private void delete() {
		// TODO Auto-generated method stub
		out.println("<html><body>");
		out.println("<h1>delete method</h1>");
		out.println("</body></html>");
	}

	private void add() {
		// TODO Auto-generated method stub
		out.println("<html><body>");
		out.println("<h1>add method</h1>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
