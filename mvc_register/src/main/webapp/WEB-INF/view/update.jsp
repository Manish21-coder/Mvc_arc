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
            background-color: yellow;
            color: black;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .form-submit:hover {
            background-color:lightyellow;
        }
</style>
</head>
<body>
<div class="form">
 <div class="login-container">
        <h2>Update Registration</h2>
        <form class="login-form" action="updte_reg" method="post">
            <input class="form-input" type="text" name="email" placeholder="Email"  value=<%=request.getAttribute("email")%>>          
            <input class="form-input" type="text" name="mobile" placeholder="Mobile" value=<%=request.getAttribute("mob")%> >          
          
          
           <%  if(request.getAttribute("msg")!=null){
            	out.println(request.getAttribute("msg"));}
                 
            	%>
            <button class="form-submit" type="submit">Update</button>
            
        </form>
    </div>
</div>
</body>
</html>