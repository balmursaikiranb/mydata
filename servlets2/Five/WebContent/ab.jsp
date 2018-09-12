<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<Script type="text/javaScript">
img{
	height:100px;
	width:100px;
}
</script>
</head>
<body>
<%=request.getParameter("pid") %>
<%=request.getParameter("pname") %>
<img src="Desert.jpg"  height=100 width=100/>
<img src="Jellyfish.jpg"  height=100 width=100/>
<img src="Koala.jpg"  height=100 width=100/>
<img src="Penguins.jpg"  height=100 width=100/>
</body>
</html>