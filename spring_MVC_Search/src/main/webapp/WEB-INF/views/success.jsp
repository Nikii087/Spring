<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Student Name : ${student.name }</h2>
<h1> Street :  ${student.address.street}</h1>

<p> all data : ${ student }</p>
</body>
</html>