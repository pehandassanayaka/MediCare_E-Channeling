<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	  	<meta charset="ISO-8859-1">
	  	
	  	<link rel="stylesheet" href="css/feedbackSuccess.css">
	    <link href="https://fonts.googleapis.com/css?family=Nunito+Sans:400,400i,700,900&display=swap" rel="stylesheet">
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
	    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
	    
		<title>Registered</title>
	</head>
	
    
    <body>
        <nav class = "navbar navbar-dark bg-info navbar-expand-sm" >
            <div class = "container-fluid">
                <a class = "navbar-brand bi bi-hospital " href = "#">HealthCare</a>
                <button class = "navbar-toggler" data-toggle = "collapse" data-target = "#ccsl"><span class = "navbar-toggler-icon"></span></button>
                <div class = "collapse navbar-collapse justify-content-center" id = "ccsl">
                    <ul class = "navbar-nav">
                        <li class = "nav-item"><a href = "home.jsp" class = "nav-link">Home</a></li>
                        <li class = "nav-item active"><a href = "feedback" class = "nav-link">Feedbacks</a></li>
                        <li class = "nav-item"><a href = "contactUs.jsp" class = "nav-link">Contact Us</a></li>
                        <li class = "nav-item"><a href = "login.jsp" class = "nav-link">Login</a></li>
                    </ul>
                </div>
            </div>
      </nav>
        
      <div class="card">
        <div style="border-radius:200px; height:200px; width:200px; background: #F8FAF5; margin:0 auto;">
            <i class="checkmark">&#10003;</i>
        </div>
        <h1>Success</h1> 
        <p>Your Feedback has successfully published<br/> Thank you!</p><br>
        <a href = "feedback">
        	<button type="button" class="btn" style = "background-color: #89e018;">See Feedbacks</button>
        </a>
      </div>
      </body>
    </body>
</html>