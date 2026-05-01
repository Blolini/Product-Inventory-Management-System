<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*, com.pack.ProductBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f5f7fa;
            margin: 0;
            padding: 20px;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        table {
            margin: 20px auto;
            border-collapse: collapse;
            width: 80%;
            background: white;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
        }

        th {
            background: #667eea;
            color: white;
            padding: 12px;
        }

        td {
            padding: 10px;
            border: 1px solid #ddd;
        }

        tr:hover {
            background: #f1f1f1;
        }

        .msg {
            color: red;
            font-weight: bold;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background: #667eea;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
        }

        a:hover {
            background: #5a67d8;
        }
    </style>
</head>

<body>

<h1>Product List</h1>

<%
    String msg = (String) request.getAttribute("msg");
    if (msg != null) {
%>
    <div class="msg"><%= msg %></div>
<%
    }
%>

<table>
    <tr>
        <th>Code</th>
        <th>Name</th>
        <th>Company</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>

<%
    ArrayList<ProductBean> list = (ArrayList<ProductBean>) request.getAttribute("product");

    if (list != null && !list.isEmpty()) {
        for (ProductBean p : list) {
%>
    <tr>
        <td><%= p.getPcode() %></td>
        <td><%= p.getPname() %></td>
        <td><%= p.getPcompany() %></td>
        <td><%= p.getPprice() %></td>
        <td><%= p.getPqty() %></td>
    </tr>
<%
        }
    } else {
%>
    <tr>
        <td colspan="5">No Products Found</td>
    </tr>
<%
    }
%>

</table>

<a href="index.jsp">⬅ Back to Home</a>
</body>
</html>