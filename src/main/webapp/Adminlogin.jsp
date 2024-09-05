<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADMIN LOGIN</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/Image/logo.png">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/Style/adminlogin.css">
</head>
<body>
<form action="<%= request.getContextPath() %>/adminlogin" method="POST">
    <h1> ADMIN LOGIN</h1>
    <label>Username</label>
    <input type="text" name="username" required="">
    <label>Password</label>
    <input type="password" name="password" required="">
    <button type="submit" name="submit">Login</button>
   </form>
</body>
</html>