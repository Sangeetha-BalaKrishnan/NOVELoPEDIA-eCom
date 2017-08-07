<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="fonts" value="/resources/fonts" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
<c:set var="contextRoot" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
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
<title>NOVELoPEDIA</title>
<link rel="icon" type="image/png" href="${images}/title.PNG" />

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
				<a href="#"> <img src="${images}/Logo.png" alt="NOVELoPEDIA" 	style="color: grey; height: 50px; width: 50%">
				</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li id="home" style="font-size: 20px"><a
						href="${contextRoot}/home">Home</a></li>
					<li class="dropdown" style="font-size: 20px"><a href="product"
						class="dropdown-toggle" data-toggle="dropdown" role="button"
						aria-haspopup="true" aria-expanded="false">Product<span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<c:forEach items="${categories}" var="category">
								<li><a href="#">${category.name}</a></li>
							</c:forEach>

						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<!--<li><a href="${pageContext.request.contextPath}/adding" style="font-size: 20px">Admin</a></li>  -->
					<li><a href="${contextRoot}/goTologin" style="font-size: 20px">Log
							In</a></li>
					<li><a href="${contextRoot}/register" style="font-size: 20px">Sign
							in</a></li>
				</ul>
			</div>
		</div>
		<!-- /.container-fluid -->
	</nav>
</body>
</html>