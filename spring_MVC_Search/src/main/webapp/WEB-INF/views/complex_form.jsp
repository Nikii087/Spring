<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    <body class="bg-secondary bg-gradient ">
  <div class="container">

    <div class="card mx-auto mt-5 border border-info border border-4" style="width: 60%;">
      <div class="card-body bg-light">
        <h4 class="card-title text-center text-primary "><strong>Complex Form</strong></h4>
        <!--  handle error -->
        <div class="alert alert-danger" role="alert">
        	<form:errors path = "student.*"/>
		</div>

        <form action="handleform" method="post">
          <div class="mb-3">
            <label for="name" class="form-label text-dark"> <strong>Your Name</strong> </label>
            <input type="text" name="name" class="form-control" placeholder="Enter your name">
          </div>

          <div class="mb-3">
            <label for="name" class="form-label "> <strong>Your Id</strong></label>
            <input type="text" name="id" class="form-control" placeholder="Enter your Id">
          </div>

          <div class="mb-3">
            <label for="name" class="form-label "><strong>Date-of-Birth</strong></label>
            <input type="text" name="bdate" class="form-control" >
          </div>

          <div class="mb-3">
            <label for="name" class="form-label"><strong>Course</strong> </label>
           
            <select class="form-select" name="course" multiple aria-label="multiple select example">
                  <option>Java</option>
              <option>Python</option>
              <option>Nodejs</option>
              <option>C++</option>
              <option>Php</option>
              <option>JavaScript</option>
              <option>C</option>
            </select>
          </div>

          <div class="mb-3">
            <label for="name" class="form-label"><strong>Select Gender : </strong> </label>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male">
              <label class="form-check-label" for="inlineRadio1">Male</label>
            </div>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female">
              <label class="form-check-label" for="inlineRadio2">Female</label>
            </div>
          </div>

          <div class="mb-3">
            <label class="form-check-label " for="inlineRadio2"><strong>Select Type</strong></label>
            <select class="form-select" name="type">
              <option>Old Student</option>
              <option>Normal Student</option>
            </select>
          </div>
          
          <div class="card">
          	<div class = "card-body">
          		<p> Your Address </p>
          		<div class="form-group">
          			<input type="text" name ="address.street" class="form-control" placeholder="Enter Street"/s>
          		</div>
          		<br>
          		<div class="form-group">
          			<input type="text"  name ="address.city" class="form-control" placeholder="Enter City"/s>
          		</div>
          	</div>
          </div>

          <div class="container text-center py-2">
            <button type="submit" class="btn btn-primary">Submit</button>
          </div>
        </form>

      </div>
    </div>

  </div>

</body>
</html>