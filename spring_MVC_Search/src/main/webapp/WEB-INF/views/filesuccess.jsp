<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Upload Success</title>
</head>
<body>
	<div class="container mt-5">
		<div class="card bg-dark text-white">
			<img src="<c:url value = "/resources/image/${filename }" />"
				class="card-img" alt="Profile-img">
			<div class="card-img-overlay">
				<h3 class="card-title">${msg }</h3>

			</div>
		</div>
</body>
</html>