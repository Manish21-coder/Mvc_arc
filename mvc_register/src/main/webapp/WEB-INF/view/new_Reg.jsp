<%@ include file="menu.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  href = "style.css"> 
<title>New Registration</title>
<style>
  .form-submit {
            background-color: rgb(3, 78, 255);
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .form-submit:hover {
            background-color:rgb(82, 121, 212);
        }
</style>
</head>
<body>
<div class="form">
 <div class="login-container">
        <h2>New Registration</h2>
        <form class="login-form" action="new_reg" method="post">
            <input class="form-input" type="text" name="name" placeholder="Name" required>
            <input class="form-input" type="text" name="city" placeholder="City" required>
            <input class="form-input" type="text" name="email" placeholder="Email" required>          
            <input class="form-input" type="number" name="mobile" placeholder="Phone" required>
          
           <%  if(request.getAttribute("msg")!=null){
            	out.println(request.getAttribute("msg"));}
                 
            	%>
            <button class="form-submit" type="submit">Register</button>
            
        </form>
    </div>
</div>
</body>
</html>