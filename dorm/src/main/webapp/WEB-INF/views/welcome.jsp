<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible"content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
                 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">               
                   
                    
                    
<title>Welcome</title> 
<style>
  /* Make the image fully responsive */
  .carousel-inner img {
      width: 100%;
      height: 100%;
  }
  </style>
</head>
<body>
	<body>
   		<div class="jumbotron">
             	<h1> ${greeting} </h1>
             	<p> ${tagline} </p>
      	</div>
      	<div id="demo" class="carousel slide" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="la.jpg" alt="Los Angeles" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Student Life</h3>
        <p>We had such a great time in Fairfield!</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="chicago.jpg" alt="Chicago" width="1100" height="500">
      <div class="carousel-caption">
        <h3>HH</h3>
        <p>This amazing dormitory for women</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="ny.jpg" alt="New York" width="1100" height="500">
      <div class="carousel-caption">
        <h3>DOM</h3>
        <p>Compro students live new amazing DOM!</p>
      </div>   
    </div>
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>
    	</body>
</body>
</html>