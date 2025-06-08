<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f4f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .card {
            background-color: #fff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        h4 {
            margin: 15px 0;
            font-weight: normal;
            color: #333;
        }

        h4 span {
            font-weight: bold;
            color: #555;
        }
    </style>
</head>
<body>
    <div class="card">
        <h4><span>Name:</span> ${userName}</h4>
        <h4><span>Email:</span> ${email}</h4>
        <h4><span>Password:</span> ${password}</h4>
        <h4><span>Phone Number:</span> ${phoneNumber}</h4>
    </div>
</body>
</html>
