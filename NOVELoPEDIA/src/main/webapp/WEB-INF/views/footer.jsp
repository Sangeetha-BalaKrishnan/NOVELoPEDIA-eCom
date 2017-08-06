<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="fonts" value="/resources/fonts" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript" src="${js}/bootstrap.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<h3>
					<a href="">About us</a>
				</h3>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="https://www.facebook.com/"><i
							style="background-color: #3b5998"
							class="fa fa-2x fa-fw fa-facebook text-white"></i> </a></li>
					<li><a href="https://twitter.com/"> <i
							style="background-color: #4099FF"
							class="fa fa-2x fa-fw fa-twitter text-white"></i></a></li>
					<li><a href="https://www.linkedin.com/company/"> <i
							style="background-color: #0077B5"
							class="fa fa-2x fa-fw fa-linkedin text-white"></i></a></li>
					<li><a href="https://www.google.com/"> <i
							style="background-color: #d34836"
							class="fa fa-2x fa-fw fa-google text-white"></i></a></li>
				</ul>
			</div>
		</div>
	</nav>

</body>
</html>