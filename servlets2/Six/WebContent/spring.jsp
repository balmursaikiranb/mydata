<%@ include file="header.jsp" %>

<body>

<form action="store.do" method="get">
User Name:<input type="text" name="txtName" id="txtName"/><br/>
First Name:<input type="text" name="txtFN" id="txtFN"/><br/>
Last Name:<input type="text" name="txtLN" id="txtLN"/><br/>
Email id:<input type="email" name="txtId" id="txtId"/><br/>
Mobile No:<input type="text" name="txtM" id="txtM"/><br/>
Interested in buying<br/>

<input type="submit" value="store"/>
</form>

</body>
<%@  include file="footer.jsp" %>