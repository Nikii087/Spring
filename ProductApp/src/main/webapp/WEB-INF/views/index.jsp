<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="base.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Wel-Come to Product App</h1>
				<table class="table ">
					<thead>
						<tr class="table-dark">
							<th scope="col">Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products }" var="prod">
							<tr>
								<th scope="row">Nike${prod.id }</th>
								<td>${prod.name }</td>
								<td>${prod.description }</td>
								<td class=""><b>&#x20B9;${prod.price }</b></td>
								<td><a href="delete/${prod.id }"><i
										class="far fa-trash-alt text-danger" style="font-size: 20px;"></i></a>
									<a href="update/${prod.id }"><i
										class="fas fa-pen-nib text-primary ml-1" style="font-size: 20px;"></i></a>

								</td>
							</tr>
						</c:forEach> 
					</tbody>
				</table>
			</div>
			<div class="container text-center">
				<a href="add-product" class="btn btn-success"> Add Product</a>
			</div>
		</div>
	</div>
</body>
</html>