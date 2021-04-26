<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@ include file="all_css.jsp"%>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="container">

		<%@ include file="navbar.jsp"%>
		<h1>Plz fill your Note detail</h1>
		<!--This is add form-->
		<form action="SaveNoteSarvlet" method="post">
		 
			<div class="form-group">
				<label for="title">Note Title</label> <input name="title"
					required  type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter here">
			</div>
			<div class="form-group">
				<label for="content">Note Content</label> 
				<textarea required name="content" id="content" placeholder="Enter your content" class="form-control"></textarea>
			</div>
			<div class="container text-center">
			<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>

	</div>

</body>
</html>