<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  href = "style.css"> 
<title>New Registration</title>
<style>
  .form-submit {
            background-color: red;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .form-submit:hover {
            background-color:darkred;
        }
</style>
</head>
<body>
<div class="form">
 <div class="login-container">
        <h2>Delete Registration</h2>
        <form class="login-form" action="Del_reg" method="post">
            <input class="form-input" type="text" name="email" placeholder="Email" value=<%=request.getAttribute("email")%>>          
                    
         
            <button class="form-submit" type="submit">Delete</button>
            
        </form>
    </div>
</div>
</body>
</html>