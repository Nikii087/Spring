<%@ page import= "org.hibernate.Session"%>
<%@ page import= "com.helper.FactoryProvider"%>
<%@ page import= "org.hibernate.Transaction"%>
<%@ page import= "com.entities.Note"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="all_css.jsp"%>
<title>Hello, world!</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="container">

		<%@ include file="navbar.jsp"%>
		<h1>Edit your Note</h1>
		<%
			int note_id = Integer.parseInt(request.getParameter("note_id").trim());

			Session s = FactoryProvider.getFactory().openSession();
			

			// get data from database
			Note note = s.get(Note.class, note_id);
		%>
		
		<form action="UpdateServlet" method="post">
		<input value="<%=note.getId() %>"name=noteId type="hidden"/>
		 
			<div class="form-group">
				<label for="title">Note Title</label> <input name="title"
					required  type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter here" value="<%= note.getTitle() %>">
			</div>
			<div class="form-group">
				<label for="content">Note Content</label> 
				<textarea required name="content" id="content" placeholder="Enter your content" class="form-control"> <%= note.getContent() %></textarea>
			</div>
			<div class="container text-center">
			<button type="submit" class="btn btn-success">Save your note</button>
			</div>
		</form>


	</div>

</body>
</html>