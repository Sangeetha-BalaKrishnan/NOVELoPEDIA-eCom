<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="fonts" value="/resources/fonts" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE HTML>
<html style="width: 100%">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${css}/css1.css" rel="stylesheet">
<!-- Adding theme -->

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>NOVELoPEDIA</title>
<link rel="icon" type="image/png" href="${images}/title.PNG" />
<script>
	window.menu = $
	{
		val
	};
</script>
</head>
<body style="height: 100%">
	<!--==== Header ===-->
	<div class="wrapper">
		<jsp:include page="Shared/header.jsp" />
		<!-- Carousel -->
		<div class="content">
			<div class="container" class="col-lg-14">
				<div id="myCarousel" class="carousel slide">
					<!-- Indicators -->

					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img class="img-round" class="img-responsive center-block"
								alt="Image Not Found" src="${images}/image3.jpg"
								style="height: 600px; width: 100%">
						</div>
						<div class="item">
							<img alt="Image Not Found" class="img-round"
								class="img-responsive center-block" src="${images}/image2.jpg"
								style="height: 600px; width: 100%">
						</div>
						<div class="item">
							<img class="img-round" class="img-responsive center-block"
								alt="Image Not Found" src="${images}/image1.jpg"
								style="height: 600px; width: 100%">
						</div>
					</div>
					<!-- Controls -->
					<a class="left carousel-control" href="#myCarousel"
						data-slide="prev"> <i class="glyphicon glyphicon-chevron-left"></i>
					</a> <a class="right carousel-control" href="#myCarousel"
						data-slide="next"> <i
						class="glyphicon glyphicon-chevron-right"></i>
					</a>
				</div>
			</div>
			<!-- /.carousel -->

			<hr />
			<div class="row">
				<div class="col-sm-4">
					<div class="card">
						<div class="card-block">
							<a href="#"> <img class="card-img-top"
								src="${images}/One.jpg" style="width: 40%; height: 40%;">
								<h3 class="card-title">
									People , Portraits and <br>photography
								</h3>
							</a>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="card">
						<div class="card-block">
							<a href="#"> <img class="card-img-top"
								src="${images}/Two.jpg" style="width: 40%; height: 40%;">
								<h3 class="card-title">Annabella fights life</h3></a>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="card">
						<div class="card-block">
							<a href="#"> <img class="card-img-top"
								src="${images}/Three.jpg" style="width: 40%; height: 40%;">
								<h3 class="card-title">The Boy</h3>
							</a>

						</div>
					</div>
				</div>
			</div>
		</div>
		<!--====== Footer  ==========-->
		<jsp:include page="Shared/footer.jsp" />
	</div>
	<!-- JQuery -->
	<script src="${js}/js1.js"></script>
</body>
</html>