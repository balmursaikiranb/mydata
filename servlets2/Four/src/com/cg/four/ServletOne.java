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
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne.do")
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
		out=response.getWriter();
		String name=request.getParameter("txtName").trim();	
		String mobile=request.getParameter("txtMobile").trim();
		String email=request.getParameter("txtEmail").trim();
		String username=request.getParameter("txtUsername").trim();
		String gender=request.getParameter("radioGender");
		String course[]=request.getParameterValues("checkCourse");
		String cities[]=request.getParameterValues("cities");
		HttpSession session=request.getSession(true);
		session.setAttribute("name",name);
		session.setAttribute("mobile",mobile);
		session.setAttribute("email",email);
		session.setAttribute("username",username);
		session.setAttribute("gender",gender);
		session.setAttribute("course",course);
		session.setAttribute("cities",cities);
	/*	request.setAttribute("name",name);
		request.setAttribute("mobile",mobile);
		request.setAttribute("email",email);
		request.setAttribute("username",username);
		request.setAttribute("gender",gender);
		request.setAttribute("course",course);
		request.setAttribute("cities",cities);*/
		//request.getRequestDispatcher("ServletTwo.view").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
