package com.cg.three.one1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UUserDataController
 */
@WebServlet("/user.do")
public class UUserDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UUserDataController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("txtName").trim();	
		String mobile=request.getParameter("txtMobile").trim();
		String email=request.getParameter("txtEmail").trim();
		String username=request.getParameter("txtUsername").trim();
		String gender=request.getParameter("radioGender");
		String course[]=request.getParameterValues("checkCourse");
		String cities[]=request.getParameterValues("cities");
		request.setAttribute("name",name);
		request.setAttribute("mobile",mobile);
		request.setAttribute("email",email);
		request.setAttribute("username",username);
		request.setAttribute("gender",gender);
		request.setAttribute("course",course);
		request.setAttribute("cities",cities);
		RequestDispatcher rd=request.getRequestDispatcher("Servlet.view");
	rd.forward(request,response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
