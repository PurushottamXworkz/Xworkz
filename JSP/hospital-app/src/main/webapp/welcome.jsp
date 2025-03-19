<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hospital</title>
</head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
<body>

<nav class="navbar navbar-light " style = "background-color: #dc3545;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Medical_Symbol.svg/1024px-Medical_Symbol.svg.png" alt="" width="30" height="24" class="d-inline-block align-text-top">
      Hospital
    </a>
  </div>
</nav>

<div>
<p>Welcome to Hospital</p>
<p>${user}</p>
<p>${pass}</p>
</div>
<br>

<div align = "left">
<p>For Patient, click here : <a type="submit" class="btn btn-primary" href="patient.jsp">Patient</a></p>
<p>For Doctor, click here : <a type="submit" class="btn btn-primary" href="doctor.jsp">Doctor</a></p>
</div>
<br>
<div align = "center">
<h6>Copyright@2025</h6>
Created By pacchi
</div>

</body>
</html>