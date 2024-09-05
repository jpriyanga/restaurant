<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/Image/logo.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Style/login.css">
</head>
<body>
<form action="<%= request.getContextPath() %>/login" method="POST">
        <h1>LOGIN</h1>
        <label>E-mail ID</label>
        <input type="email" name="email" required="">
        <label>Password</label>
        <input type="password" name="password" required="">
        <label>User Type</label>
        <select name="usertype">
        <option value="customer">Customer</option>
        <option value="restaurantstaff">Restaurant Staff</option>
     </select>
        <button type="submit" name="submit">Login</button>
        <p>don't have an account?<a href="Registration.jsp">Sign Up</a></p>
    </form>
</body>
</html>