<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="default.jsp" method="">
User name:<input type="text" name="user"/>
Password:<input type="password" name="pass"/>
<input type="submit" value="login"/>
<!-- <%!static int count=1; %> -->
<%

//int a=10;
String name=(String)request.getParameter("user");
String pass=(String)request.getParameter("pass");
%>
<%if(name!=null && pass!=null)
	{
if((name.equals("admin"))&&(pass.equals("123")))
{
	
	response.sendRedirect("https://www.google.in");
	out.println("no of hiits: "+(++count));
	
}
else{
	out.println("failure");
	out.println("no of hiits: "+(++count));
	response.setHeader("refresh","5;http://localhost:8081/JSPDemo/default.jsp");
}
	}
%>
</form>
</body>
</html>