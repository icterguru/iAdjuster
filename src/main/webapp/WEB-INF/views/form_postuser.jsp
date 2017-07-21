<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<br>
Test form for REST services 
<br>
Please enter a new username and password for testing purposes:
<br>
<!-- http://localhost:8080/iAdjuster/form_postuser.html  -->

	<form action="restapi/dbuser/postuser" method="post">
		Username:<input name="username" type="text"><br /> Password:<input
			name="password" type="password"><br /> <input type="submit"
			value="Submit">
	</form>
</body>
</html>
