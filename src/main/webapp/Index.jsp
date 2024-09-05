
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ABC RESTAURANT</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/Image/logo.png">
<link rel="stylesheet" href="${pageContext.request.contextPath}/Style/home.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">

</head>
<body>

<!-- Nav Bar -->

<nav class="navbar navbar-expand-lg navbar-light" id="navbar">
  <div class="container-fluid">
   <div class="logo">
      <img src="${pageContext.request.contextPath}/Image/logo.png" alt="Image">
  </div>
  
  <a href="#" class="navbar-brand">ABC RESTAURANT</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"  aria-expanded="false" >
      <span class="navbar-toggler-icon"></span>
    </button>
  
 <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mx-auto">
        <li class="nav-item">
            <a class="nav-link" href="">HOME</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Branches.jsp">BRANCHES</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Services.jsp">OUR SERVICES</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Registration.jsp">REGISTER</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Adminlogin.jsp">ADMIN</a>
          </li>
        </ul>
        
        
   </div>
   </nav>
  
    
    
    
   


  <!-- Home -->

  <section id="home">
    <br>
    <h1 class="text-center"><br>ABC RESTAURANT <br>WELCOMES YOU </h1>
    <p>treat your buds with our delicious nourishments</p>
    <h2><b>RELY ON US</b> <br><b>FOR ALL YOUR</b> <br><b>FOOD CRAVINGS</b></h2>
  </section>


<!-- Footer -->

<section id="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 footer-box">
                <p><b>QUICK LINKS</b></p>
                <p><a href="Branches.jsp">Branches</a></p>
                <p><a href="Services.jsp">Services</a></p>
                <p><a href="Registration.jsp">Register</a></p>
                </div>
                <div class="col-md-4 footer-box">
                    <p><b>CONTACT US<b></P>
                    <input type="email" class="form-control" placeholder="Your Email Address">
                    <button type="submit" class="btn btn-success">Submit</button>
                </div>
                <div class="col-md-4 footer-box">
                    <p><b>CONTACT</b></p>
                    <p><i class="fa-solid fa-location-dot"></i><br>No.22,Main Street,Colombo09,Srilanka</p>
                    <p><i class="fa fa-solid fa-phone"></i> 0112867945</p>
                    <p><i class="fa fa-solid fa-at"></i>abcrestaurant@gmail.com</p>
                    </div>
            </div>
        </div>
        <hr>
        <p class="copyright">2024 ABC Restaurant,Designed by Web Development Officer,All Rights Reserved.</p>
    </section>
   <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"></script>

</body>
</html>