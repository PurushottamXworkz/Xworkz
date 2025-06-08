<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Registration</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: rgb(31, 30, 30);
    }
  </style>
</head>
<body>

  <div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="col-sm-12 col-md-8 col-lg-5 col-xl-4">
      <div class="card shadow-lg rounded">
        <div class="card-body p-4">
          <h3 class="card-title text-center mb-4">Customer Registration</h3>

          <form action="saveData" method="post" class="row g-3">
            <div class="col-12">
              <label for="customer_Name" class="form-label">Name</label>
              <input type="text" class="form-control form-control-lg" id="customer_Name" name="customer_Name" placeholder="Enter Customer Name">
            </div>

            <div class="col-12">
              <label for="email" class="form-label">Email</label>
              <input type="email" class="form-control form-control-lg" id="email" name="email" placeholder="Enter Email">
            </div>

            <div class="col-12">
              <label for="phone_Number" class="form-label">Phone Number</label>
              <input type="tel" class="form-control form-control-lg" id="phone_Number" name="phone_Number" placeholder="Enter Phone Number">
            </div>

            <div class="col-12 text-center mt-3">
              <button type="submit" class="btn btn-dark btn-lg px-5">Register</button>
            </div>
          </form>

        </div>
      </div>
    </div>
  </div>

</body>
</html>
