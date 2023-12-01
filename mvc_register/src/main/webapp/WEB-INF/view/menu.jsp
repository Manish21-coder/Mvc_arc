<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Menu</title>

<style type="text/css">

  .header {
    background-color:black;
    color: white;
    padding: 10px;
    text-align: center;
}



.header-options {
    display: flex;
    justify-content: space-around;
    margin-top: 10px;
}

.header-options a,.log {
    color: white;
    text-decoration: none;
    padding: 10px 20px;
    border: 1px solid white;
    border-radius: 7px;
    transition: 0.3s;
    margin:5px;
   
}

.header-options a:hover{
	
	color: black;
	border: 1px solid black;
	transform: translateY(-5px);
	border-radius: 7px;
}

.log{
  background-color:hotpink;
  color:white;
}
.header-options .log:hover{
	
	color: black;
	background-color:darkhotpink;
	border: 1px solid black;
	transform: translateY(-5px);
	border-radius: 7px;
}

   
</style>
</head>
<body>
<div class = "header">


  <div class="header-options ">
        <a href="new_reg" style="background-color:green;">Create</a>
        <a href="read_controller" style="background-color:blue;">Read</a>
        <a href="updte_reg" style="background-color:yellow; color:black;">Update</a>
        <a href="Del_reg" style="background-color:red;">Delete</a>
        <form action="logoutController" method="post"><input type="submit" value="Log-out"  class="log"></form>
    </div>
</div>

</body>
</html>