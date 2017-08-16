<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<spring:url var="css" value="/resources/css" />


<c:set var="contextRoot" value="${pageContext.request.contextPath }" />

<!DOCTYPE HTML>
<html style="height: 100%">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/css1.css" rel="stylesheet">

<title>NOVELoPEDIA-${Title}</title>

<!-- Title Image -->
<link rel="icon" type="image/png" href="${images}/title.PNG" />

</head>
<body style="height: 100%">

	<div class="wrapper">

		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="${contextRoot}/home"><font size="6px" color="white">Home</font></a>
				</div>
			</div>
		</nav>
		<br />
		<div class="content">

			<div class="container">

				<div class="row">

					<div class="col-md-12">

						<div class="jumbotron">

							<h1>${errorTitle}</h1>
							<hr />

							<blockquote style="word-wrap:break-word">${errorDescription}</blockquote>

						</div>

					</div>

				</div>

			</div>

		</div>

		<!-- Footer -->
		<jsp:include page="Shared/footer.jsp" />
	</div>
	<!-- JQuery -->
	<script src="${js}/JQuery.js"></script>

</body>
</html>