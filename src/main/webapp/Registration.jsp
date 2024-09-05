<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CREATE ACCOUNT</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/Image/logo.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Style/registration.css">
</head>
<body>
<form action="<%= request.getContextPath() %>/registration" method="post">
 <h1>REGISTER</h1>
    <label>Name</label>
    <input type="text" name="name" placeholder="Ënter Your Name" required="">
    <label>E-mail</label>
    <input type="email" name="email" placeholder="Ënter Your Email" required="">
    <label>Password</label>
    <input type="password" name="password" placeholder="Create a Password" required="">
    <label>User Type</label>
    <select name="usertype">
        <option value="customer">Customer</option>
        <option value="restaurantstaff">Restaurant Staff</option>
    </select>
    <button type="submit" name="submit">Create Account</button>
    <p>already have an account?<a href="Login.jsp">Log In</a></p>
</form> 


</body>
</html>