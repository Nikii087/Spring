<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="base.jsp"%>
</head>
<body>
	<div class="container ">
		<div class="row">
			<dir class="col-md-3"></dir>
			<dir class="col-md-6">
				<h2 class=" text-center p-3">Fill the product detail</h2>
				<form action="handle-product" method="post">
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Product
							Name</label> <input type="text" class="form-control" name="name"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							placeholder="Enter product name">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Product
							Description</label>
						<textarea class="form-control" name="description"
							id="exampleFormControlTextarea1" rows="3"
							placeholder="Enter product description"></textarea>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Product
							Price</label> <input type="text" class="form-control" name="price"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							placeholder="Enter product price">
					</div>
					<div class="text-center">
						<a class="btn btn-danger"
							href="${pageContext.request.contextPath }/">Back</a>
						<button type="submit" class="btn btn-primary">Add</button>
					</div>

				</form>
			</dir>
			<dir class="col-md-3"></dir>
		</div>
	</div>
</body>
</html>