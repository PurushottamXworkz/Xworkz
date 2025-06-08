<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %>
<html>
<head>
    <title>successful registration</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<style>
    .details{
        text-alignment:center;
    }

</style>
<body>
<h2>Bank Application</h2>
<div class="details">
    <h2>Registration done successfully</h2>
    <h4>Customer Name: ${customerName}</h4>
    <h4>Email : ${email}</h4>
    <h4>Phone Number :${phoneNumber}</h4>
</div>
</body>
</html>
