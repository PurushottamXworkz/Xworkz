<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background: linear-gradient(120deg, #f5f6fa 0%, #dff9fb 100%);
            margin: 0;
            padding: 0;
            min-height: 100vh;
        }
        .navbar {
            background: linear-gradient(90deg, #273c75 70%, #00a8ff 100%);
            padding: 1em 2em;
            display: flex;
            align-items: center;
            justify-content: space-between;
            box-shadow: 0 2px 8px rgba(0,0,0,0.08);
        }
        .navbar .brand {
            display: flex;
            align-items: center;
            text-decoration: none;
        }
        .navbar .logo {
            width: 40px;
            height: 40px;
            margin-right: 12px;
        }
        .navbar .brand-name {
            color: #fff;
            font-size: 1.7em;
            font-weight: bold;
            letter-spacing: 1px;
            text-shadow: 1px 2px 6px rgba(0,0,0,0.12);
        }
        .navbar ul {
            list-style: none;
            display: flex;
            margin: 0;
            padding: 0;
        }
        .navbar ul li {
            margin-left: 2em;
        }
        .navbar ul li a {
            color: #fff;
            text-decoration: none;
            font-size: 1.1em;
            font-weight: 500;
            padding: 6px 14px;
            border-radius: 5px;
            transition: background 0.2s, color 0.2s;
        }
        .navbar ul li a:hover {
            background: #fbc531;
            color: #273c75;
        }
        .form-container {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 80vh;
        }
        form {
            background: #fff;
            padding: 32px 38px;
            border-radius: 16px;
            box-shadow: 0 4px 24px rgba(39,60,117,0.10);
            width: 100%;
            max-width: 400px;
        }
        form h2 {
            text-align: center;
            color: #273c75;
            margin-bottom: 1.5em;
            font-size: 1.5em;
            letter-spacing: 1px;
        }
        div {
            margin-bottom: 18px;
        }
        label {
            display: block;
            margin-bottom: 7px;
            font-weight: bold;
            color: #273c75;
            letter-spacing: 0.5px;
        }
        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="password"] {
            width: 100%;
            padding: 11px 13px;
            border: 1.5px solid #00a8ff;
            border-radius: 8px;
            font-size: 16px;
            background: #f5f6fa;
            transition: border 0.2s;
        }
        input[type="text"]:focus,
        input[type="email"]:focus,
        input[type="tel"]:focus,
        input[type="password"]:focus {
            border: 2px solid #fbc531;
            outline: none;
            background: #eaf6fb;
        }
        input[type="submit"] {
            width: 100%;
            background: linear-gradient(90deg, #00a8ff 70%, #fbc531 100%);
            color: #fff;
            padding: 13px;
            border: none;
            border-radius: 8px;
            font-size: 17px;
            font-weight: bold;
            cursor: pointer;
            transition: background 0.3s, color 0.2s, box-shadow 0.2s;
            box-shadow: 0 2px 10px rgba(0,168,255,0.10);
            letter-spacing: 1px;
        }
        input[type="submit"]:hover {
            background: linear-gradient(90deg, #fbc531 70%, #00a8ff 100%);
            color: #273c75;
            box-shadow: 0 4px 18px rgba(251,197,49,0.18);
        }
        @media (max-width: 600px) {
            .form-container {
                padding: 1em;
            }
            form {
                padding: 18px 8px;
            }
            .navbar ul li {
                margin-left: 1em;
            }
        }
    </style>
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar">
        <a class="brand" href="#">
            <!-- Indian Railways-inspired Wheel SVG Logo -->
            <svg class="logo" viewBox="0 0 64 64" fill="none">
              <circle cx="32" cy="32" r="28" fill="#e74c3c" stroke="#b71c1c" stroke-width="4"/>
              <circle cx="32" cy="32" r="16" fill="#fff" stroke="#e74c3c" stroke-width="2"/>
              <g stroke="#e74c3c" stroke-width="2">
                <line x1="32" y1="8" x2="32" y2="24"/>
                <line x1="32" y1="40" x2="32" y2="56"/>
                <line x1="8" y1="32" x2="24" y2="32"/>
                <line x1="40" y1="32" x2="56" y2="32"/>
                <line x1="15.6" y1="15.6" x2="24.9" y2="24.9"/>
                <line x1="39.1" y1="39.1" x2="48.4" y2="48.4"/>
                <line x1="15.6" y1="48.4" x2="24.9" y2="39.1"/>
                <line x1="39.1" y1="24.9" x2="48.4" y2="15.6"/>
              </g>
              <circle cx="32" cy="32" r="3" fill="#e74c3c"/>
            </svg>
            <span class="brand-name">Railway Booking</span>
        </a>

        <ul>
            <li><a href="dashboard.html">Dashboard</a></li>
            <li><a href="redirectToRegister">Register</a></li>
            <li><a href="redirectToPassengerInfo">Passenger Info</a></li>
            <li><a href="searchTrains.html">Search Trains</a></li>
            <li><a href="bookingHistory.html">Booking History</a></li>
            <li><a href="logout.html">Logout</a></li>
        </ul>
    </nav>

    <!-- Registration Form -->
    <div class="form-container">
        <form action="saveData" method="post">
            <h2>Register</h2>
            <div>
                <label for="userName">Name :</label>
                <input type="text" id="userName" name="userName" required>
            </div>
            <div>
                <label for="email">Email :</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div>
                <label for="phoneNumber">Phone Number :</label>
                <input type="tel" id="phoneNumber" name="phoneNumber" required>
            </div>
            <div>
                <label for="password">Password :</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div>
                <input type="submit" value="Register">
            </div>
        </form>
    </div>
</body>
</html>
