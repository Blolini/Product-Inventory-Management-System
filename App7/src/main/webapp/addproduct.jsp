<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <center>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #667eea, #764ba2);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background: white;
            padding: 40px;
            border-radius: 10px;
            text-align: center;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            width: 350px;
        }

        h1 {
            color: #333;
        }

        .message {
            color: green;
            margin-bottom: 15px;
            font-weight: bold;
        }

        a {
            display: block;
            text-decoration: none;
            background: #667eea;
            color: white;
            padding: 12px;
            margin: 10px 0;
            border-radius: 5px;
            transition: 0.3s;
        }

        a:hover {
            background: #5643c1;
        }
    </style>

    <script>
        function showAlert(action) {
            alert(action + " page loading...");
        }
    </script>

</head>

<body>

<div class="container">

    <h1>Product Dashboard</h1>

    <%
        String data = (String) request.getAttribute("msg");
        if (data != null) {
    %>
        <div class="message">
            <%= data %>
        </div>
    <%
        }
    %>

    <a href="add.html" onclick="showAlert('Add Product')">Add Product Details</a>

    <a href="view" onclick="showAlert('View Products')">View Product Details</a>

</div>

</body>
</html>