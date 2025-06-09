<!DOCTYPE html>
<html>
<head>
    <title>Railway Booking System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f5f6fa;
            margin: 0;
            padding: 0;
        }
        .navbar {
            background-color: #273c75;
            padding: 1em 2em;
            display: flex;
            align-items: center;
            justify-content: space-between;
        }
        .navbar .brand {
            color: #fff;
            font-size: 1.5em;
            font-weight: bold;
            text-decoration: none;
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
            transition: color 0.2s;
        }
        .navbar ul li a:hover {
            color: #fbc531;
        }
        .dashboard {
            max-width: 900px;
            margin: 3em auto;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 2px 8px rgba(0,0,0,0.1);
            padding: 2em;
        }
        .dashboard h2 {
            color: #273c75;
            margin-bottom: 1em;
        }
        .dashboard-links {
            display: flex;
            flex-wrap: wrap;
            gap: 2em;
        }
        .dashboard-link {
            flex: 1 1 200px;
            background: #e1b12c;
            color: #fff;
            padding: 1.5em;
            border-radius: 8px;
            text-align: center;
            text-decoration: none;
            font-size: 1.1em;
            font-weight: bold;
            transition: background 0.2s;
        }
        .dashboard-link:hover {
            background: #fbc531;
            color: #273c75;
        }
    </style>
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar">
        <a class="brand" href="#">Railway Booking</a>
        <ul>
            <li><a href="dashboard.html">Dashboard</a></li>
            <li><a href="redirectToRegister">Register</a></li>
            <li><a href="redirectToPassengerInfo">Passenger Info</a></li>
            <li><a href="searchTrains.html">Search Trains</a></li>
            <li><a href="bookingHistory.html">Booking History</a></li>
            <li><a href="logout.html">Logout</a></li>
        </ul>
    </nav>

    <!-- Dashboard Section -->
    <div class="dashboard">
        <h2>Welcome to the Railway Booking Dashboard</h2>
        <div class="dashboard-links">
            <a class="dashboard-link" href="redirectToRegister">New Registration</a>
            <a class="dashboard-link" href="redirectToPassengerInfo">Passenger Information</a>
            <a class="dashboard-link" href="searchTrains.html">Search & Book Trains</a>
            <a class="dashboard-link" href="bookingHistory.html">View Booking History</a>
            <a class="dashboard-link" href="profile.html">Edit Profile</a>
            <a class="dashboard-link" href="logout.html">Logout</a>
        </div>
    </div>
</body>
</html>
