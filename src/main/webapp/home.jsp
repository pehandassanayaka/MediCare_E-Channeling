<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <header>
 <style>
 	*{
    margin: 0;
    padding: 0;
}
body{
    font-family: 'Lato', sans-serif;
}
.wrapper{
    width: 1170px;
    margin: auto;
}
header{
    background: linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)),url(images/a.jpg);
    height: 100vh;
    -webkit-background-size: cover;
    background-size: cover;
    background-position: center center;
    position: relative;
}
.nav-area{
    float: right;
    list-style: none;
    margin-top: 40px;
    margin-right: -200px;
    
}
.nav-area li{
    display: inline-block;
}
.nav-area li a {
color: #fff;
text-decoration: none;
padding: 5px 20px;
font-family: poppins;
font-size: 16px;
text-transform: uppercase;
margin-left: 20px;
}
.nav-area li a:hover{
    background: #fff;
    color: #333;
}
.logo{
    float: left;
    margin-left: -200px;
    
}
.logo img{
    width: 40%;
    padding: 15px 0;
    
}
.welcome-text{
    position: absolute;
    width: 600px;
    height: 300px;
    margin: 20% 30%;
    text-align: center;
}
.welcome-text h1{
    text-align: center;
    color: #fff;
    text-transform: uppercase;
    font-size: 60px;
}
 .welcome-text p{
 font-family: Courier;
text-align: center;
    color: silver;
    text-transform: uppercase;
    font-size: 20px;
}
.welcome-text a{
    border: 1px solid #fff;
    padding: 10px 25px;
    text-decoration: none;
    text-transform: uppercase;
    font-size: 14px;
    margin-top: 20px;
    display: inline-block;
    color: #fff;
}
.welcome-text a:hover{
    background: #fff;
    color: #333;
}


/*resposive*/

@media (max-width:600px){
    .wrapper {
width: 100%;
}
.logo {
float: none;
width: 50%;
text-align: center;
margin: auto;
}
img {
width: ;
}
.nav-area {
float: none;
margin-top: 0;
margin-left: 300px;
}
    .nav-area li a {
padding: 5px;
font-size: 11px;

}
.nav-area {
text-align: center;
}
    .welcome-text {
width: 100%;
height: auto;
margin: 30% 0;
}
    .welcome-text h1 {
font-size: 30px;
}

}

 	
 </style>
    <div class="wrapper">
        <div class="logo">
            <img src="images/logo.jpg" alt="">
        </div>
<ul class="nav-area">
<li><a href="home.jsp">Home</a></li>
<li><a href="#">About</a></li>
<li><a href="feedback">Feedbacks</a></li>

<li><a href="contactus.jsp">Contact</a></li>
</ul>
</div>
<div class="welcome-text">
        <h1>
HEALTHCARE</h1>
<p>medical center
A Healthier, Happier You</p>
<a href="login.jsp">Login</a>
<a href="register.jsp">Register</a>
    </div>
</header>

</html>