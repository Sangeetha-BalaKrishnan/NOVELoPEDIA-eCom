<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="fonts" value="/resources/fonts" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
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

<title>NOVELoPEDIA</title>

<!-- Title Image -->
<link rel="icon" type="image/png" href="${images}/title.PNG" />

<script>
	window.menu = '${Value}';

	window.contextRoot = '${contextRoot}';
</script>

<%-- <!-- Bootstrap Theme CSS -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet"> --%>

<!-- Bootstrap DataTable CSS -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">

</head>
<body style="height: 100%">
	<!--======= Header ======-->
	<div class="wrapper">
		<%@include file="./Shared/header.jsp"%>
		<div class="content">

			<!--====== Carosule =======-->
			<c:if test="${userClickHome == true}">
				<%@include file="page.jsp"%>
			</c:if>

			<!--======== List of Products ==========-->
			<c:if
				test="${userClickAllProducts == true or userClickCategoryProducts == true }">
				<%@include file="listProducts.jsp"%>
			</c:if>

			<!-- Loads when user clicks show products -->
			<c:if test="${userClickShowProduct == true }">
				<%@include file="singleProduct.jsp"%>
			</c:if>

		</div>

		<!--====== Footer  ==========-->
		<jsp:include page="Shared/footer.jsp" />
	</div>


	<!-- JQuery -->
	<script src="${js}/JQuery.js"></script>

	<%-- 	<!-- Bootstrap Core JS -->
	<script src="${js}/bootstrap.min.js"></script>
 --%>
	<!-- Data Table Plugins -->
	<script src="${js}/jquery.dataTables.js"></script>

	<!-- DataTable Bootstrap JS -->
	<script src="${js}/dataTables.bootstrap.js"></script>


	<!--  -->

</body>
</html>