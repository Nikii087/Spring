<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h1 class="text-center text-primary">${head }</h1>
	<p class="text-center">${desc }</p>
	<hr>
	<div class="alert alert-success" role="alert">
			<h4 class="alert-heading">Well done!</h4>
			<p>${msg }</p>
		</div>
	<h1>Welcome ${user.userName}</h1>
	<h1>Your email is: ${user.email}</h1>
	<h1>Your password is: ${user.pass} try to secure your password</h1>
</body>
</html>