package com.cg.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Usercontroller
 */
@WebServlet(urlPatterns= {"/Usercontroller.do","login","register"})
public class Usercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */PrintWriter out=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		switch(request.getServletPath())
		{
		case "/login":
			String un=request.getParameter("txtUserName").trim();
			String pwd=request.getParameter("txtPwd").trim();
			request.setAttribute("name",un);
			request.setAttribute("mobile",pwd);
			if(un.equals("admin")&&pwd.equals("admin"))
			{
			request.getRequestDispatcher("Servlet1.view").forward(request, response);
			}
			else
			{
				out.println("<h1> Please enter valid credentials</h1>");
			}
			break;
		case "/register":
		
		String name=request.getParameter("txtName").trim();
		String id=request.getParameter("txtId").trim();
		String price=request.getParameter("txtPrice").trim();
		
		request.setAttribute("email",name);
		request.setAttribute("username",id);
		request.setAttribute("gender",price);
		request.getRequestDispatcher("Servlet2.view").forward(request, response);
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
