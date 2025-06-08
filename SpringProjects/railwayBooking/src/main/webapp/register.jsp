<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: white;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        div {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 6px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="password"] {
            width: 100%;
            padding: 10px 12px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <form action="saveData" method="post">

        <div>
            <label for="userName">Name :</label>
            <input type="text" id="userName" name="userName">
        </div>

        <div>
            <label for="email">Email :</label>
            <input type="email" id="email" name="email">
        </div>

        <div>
            <label for="phoneNumber">Phone Number :</label>
            <input type="tel" id="phoneNumber" name="phoneNumber">
        </div>

        <div>
            <label for="password">Password :</label>
            <input type="password" id="password" name="password">
        </div>

        <div>
            <input type="submit" value="Register">
        </div>

    </form>
</body>
</html>
