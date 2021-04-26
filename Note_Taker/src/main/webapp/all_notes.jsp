<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Query"%>
<%@page import="java.util.List"%>
<%@page import="com.entities.Note"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="all_css.jsp"%>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="container">

		<%@ include file="navbar.jsp"%>
		<br>

		<h1 class="text-uppercase">All Notes</h1>
		<div class="row">
			<div class="col-12">
				<%
					Session s = FactoryProvider.getFactory().openSession();
					Query q = s.createQuery("from Note");
					List<Note> list = q.list();

					for (Note note : list) {
				%>

				<div class="card mt-3" >
					<img class="card-img-top mt-2 mx-auto" style="max-width:100Px;" src="img/notebook.png" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title px-4"><%=note.getTitle() %></h5>
						<p class="card-text px-4"><%=note.getContent()%>
						</p>
						<p class="card-text px-4"><b><%=note.getAddedDate() %></b></p>
						<div class="container text-center">
						<a href="DeleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a>
						
						<a href="edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">Update</a>
						
						</div>
						
					</div>
				</div>


				<%
					}
					s.close();
				%>



			</div>

		</div>


	</div>

</body>
</html>