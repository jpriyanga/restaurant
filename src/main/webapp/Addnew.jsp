<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD NEW SERVICES</title>
 <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/Image/logo.png">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="col-lg-6 m-auto">
    <form method="POST">
        <br><br><div class="card">
            <div class="card-header bg-primary">
                <h1 class="text-white text-center">Add New Service</h1>
            </div><br>
            <label>SERVICE ID:</label>
            <input type="text" name="serviceid" class="form-control" required="" ><br>
            <label>NAME:</label>
            <input type="text" name="name" class="form-control" required="" ><br>
            <label>Description:</label>
            <input type="text" name="description" class="form-control"  required="" ><br>
            <button class="btn btn-success" type="submit" name="submit">Add</button><br>
            <a href="Admin.jsp" class="btn btn-info" type="submit" name="cancel">Cancel</a><br>
        </div>
    </form>
</div>
</body>
</html>