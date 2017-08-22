<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
<c:set var="contextRoot" value="${pageContext.request.contextPath }" />

<!DOCTYPE HTML>
<html style="height: 100%">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<!-- Custom CSS -->
<link href="${css}/MyCss.css" type="text/css" rel="stylesheet">

<!-- Font awesome -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>NOVELoPEDIA</title>

<!-- Title Image -->
<link rel="icon" type="image/png" href="${images}/title.PNG" />


<script>
	window.menu = '${Value}';

	window.contextRoot = '${contextRoot}';
</script>
<style>
.help-block {
	color: red;
}
</style>

</head>
<body style="height: 100%">

	<div class="wrapper">

		<!-- Header -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="${contextRoot}/home">NOVELoPEDIA</a>
				</div>
			</div>
		</nav>

		<div class="content">
			<div class="container">

				<br /> <br /> <br /> <br />

				<!-- will be displayed only when the credentials are wrong -->
				<c:if test="${not empty message}">
					<div class="row">
						<div class="col-md-offset-2 col-md-8">



							<div class="alert alert-danger">
								<button type="button" class="close" data-dismiss="alert">&times;</button>
								${message}
							</div>

						</div>
					</div>

				</c:if>
				<div class="row">
					<div class="col-md-offset-2 col-md-8">
						<div class="panel  panel-info">
							<div class="panel-heading">
								<h4 style="text-align: center">Sign Up - Address</h4>
							</div>

							<div class="panel-body">
								<form action="${contextRoot}/login" method="post"
									class="form-horizontal" id="loginForm">

									<div class="form-group">
										<label class="control-label col-md-4" for="username">Email:</label>
										<div class="col-md-8">
											<input type="text" name="username" id="username"
												class="form-control" />
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-4" for="password">Password:</label>
										<div class="col-md-8">
											<input type="password" name="password" id="password"
												class="form-control" />
										</div>
									</div>

									<div class="form-group">
										<div class="col-md-offset-4 col-md-8">
											<input type="submit" value="login" class="btn btn-warning" />
											<input type="hidden" name="${_csrf.parameterName}"
												value="${_csrf.token }" />
										</div>
									</div>

									<div class="panel-footer">
										<div class="text-right">
											New User-<a href="${contextRoot}/register">Register Here</a>
										</div>
									</div>

								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--====== Footer  ==========-->

		<jsp:include page="Shared/footer.jsp" />

	</div>


	<!-- JQuery -->
	<script src="${js}/JQuery.js"></script>


	<!-- JQuery validator -->
	<script src="${js}/jquery.validate.js"></script>
</body>
</html>