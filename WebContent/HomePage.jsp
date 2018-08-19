<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h1{color:grey;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<center>
	<h1>WELCOME TO HOME PAGE</h1>
	<form action="CalcServlet" method="post">
		First Number:<br/>
		<input type="text" name="num1" size = "20px">
		<br/>
		Second Number:<br/>
		<input type="text" name="num2" size = "20px">
		<br/>
		<br/>
		<input type="submit" value="Submit">
	</form>
	</center>
</body>
</html>