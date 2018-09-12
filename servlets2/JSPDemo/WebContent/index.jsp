<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--This is the comment which i wrote in jsp page  -->
<!-- This is the comment which i wrote in jsp page-->

int a=100;
request.getParameter("a");

/*int a=200;  */
out.println(a);
%>
<%=10*12 %>
<%=request.getParameter("name") %>
</body>
</html>