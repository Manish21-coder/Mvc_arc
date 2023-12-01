<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  href = "style.css"> 
<title>Login here</title>
</head>
<body>
  <div class = "form">
        
        <div class="login-container">
        <h2>Login</h2>
        <form class="login-form" action="auth_login" method="post">
            <input class="form-input" type="text" name="username" placeholder="Username" required>
            <input class="form-input" type="password" name="password" placeholder="Password" required>
            <%  if(request.getAttribute("msg")!=null){
            	out.println(request.getAttribute("msg"));}
                 
            	%>
            <button class="form-submit" type="submit">Login</button>
        </form>
      </div>
      </div>
</body>
</html>