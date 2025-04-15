<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hotelbooking</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand"> <marquee>Welcome to Hotel Booking</marquee></a>
    <form class="d-flex" role="search">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
</nav>
	<form action="submit" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Email address</label>
  <input type="email" name="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Full Name</label>
  <input type="text" name="fullname" class="form-control" id="exampleFormControlInput1" placeholder="Full name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Contact</label>
  <input type="number" name="contact" class="form-control" id="exampleFormControlInput1" placeholder="Enter contact">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Adhar Number</label>
  <input type="number" name="adhar" class="form-control" id="exampleFormControlInput1" placeholder="Enter Adhar Number">
</div>
<input type="reset" class="btn btn-dark" ></input>
<input type="submit" class="btn btn-dark"></input>
</form>
</body>
</html>