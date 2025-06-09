<!DOCTYPE html>
<html>
<head>
    <title>Railway Booking System</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background: linear-gradient(120deg, #f5f6fa 0%, #dff9fb 100%);
            margin: 0;
            padding: 0;
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
        .dashboard {
            max-width: 950px;
            margin: 3em auto;
            background: #fff;
            border-radius: 16px;
            box-shadow: 0 4px 24px rgba(39,60,117,0.10);
            padding: 2.5em 2em;
        }
        .dashboard h2 {
            color: #273c75;
            margin-bottom: 1.5em;
            text-align: center;
            font-size: 2em;
            letter-spacing: 1px;
        }
        .dashboard-links {
            display: flex;
            flex-wrap: wrap;
            gap: 2em;
            justify-content: center;
        }
        .dashboard-link {
            flex: 1 1 220px;
            background: linear-gradient(120deg, #00a8ff 60%, #273c75 100%);
            color: #fff;
            padding: 2em 1em;
            border-radius: 12px;
            text-align: center;
            text-decoration: none;
            font-size: 1.15em;
            font-weight: bold;
            box-shadow: 0 2px 10px rgba(0,168,255,0.10);
            transition: background 0.2s, color 0.2s, transform 0.15s;
            position: relative;
            overflow: hidden;
        }
        .dashboard-link:hover {
            background: linear-gradient(120deg, #fbc531 60%, #00a8ff 100%);
            color: #273c75;
            transform: translateY(-4px) scale(1.03);
            box-shadow: 0 4px 18px rgba(251,197,49,0.18);
        }
        /* Responsive */
        @media (max-width: 800px) {
            .dashboard-links {
                flex-direction: column;
                gap: 1.5em;
            }
            .dashboard-link {
                flex: 1 1 100%;
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
            <li><a href="index.jsp">Dashboard</a></li>
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