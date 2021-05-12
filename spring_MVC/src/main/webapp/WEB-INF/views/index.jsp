<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h1>This is Home Page</h1>
	<h2>Called by HomeController</h2>
	<h3>By fire /home</h3>
	<%
		int id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h4>
		ID :
		<%=id%></h4>
	<h4>
		Name :
		<%=name%></h4>
	<h3>
		<%
			for (String fr : friends)
				out.print(fr+ "<br>");
		%>
	</h3>
</body>
</html>