<%@ page import="java.sql.*"%>
<%@ include file="menu.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
    <title>Read Registration</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
           
        }

        header {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 1em;
        }

        .form {
            margin: 20px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
             display:flex;
           justify-content: space-evenly;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #333;
            color: white;
        }
        
        table a {
            color: white;
            text-decoration: none;
            padding: 10px 20px;
            border: 1px solid tan;
            border-radius: 3px 50px;
            transition: 0.3s;
            margin: 5px;
            display: inline-block;
        }
        
        .new-link1{
        background-color:red;
        color:white;
        }
        .new-link2{
        background-color:yellow;
        color:red;
        }
        .new-link3{
        background-color:green;
        color:white;
        }

     table a:hover {
    background-color: lightgreen; 
    color:black;
    border:1px solid black;
     border-radius: 50px 3px;
     transform:translateY(-10px);
}
    </style>
</head>
<body>

<header>
    <h1>Read Registration</h1>
</header>

<div class="form">
    <table>
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>City</th>
            <th>Mobile</th>
            <th>Remove</th>
            <th>Update</th>
            <th>Create</th>
        </tr>
        <% ResultSet result = (ResultSet) request.getAttribute("res");
        while (result.next()) { %>
        <tr>
            <td><%= result.getString(1) %></td>
            <td><%= result.getString(2) %></td>
            <td><%= result.getString(3) %></td>
            <td><%= result.getString(4) %></td>
            <td><a  class="new-link1" href="Del_reg?email=<%= result.getString(3)%>">Delete</a></td>
            <td><a  class="new-link2" href="updte_reg?email=<%= result.getString(3)%>&mob=<%= result.getString(4)%>">Update</a></td>
            <td><a  class="new-link3" href="new_reg">New</a></td>
        </tr>
        <% } %>
    </table>
</div>

</body>
</html>
