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

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" type="text/css" rel="stylesheet">

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


<!-- Bootstrap DataTable CSS -->
<link href="${css}/jquery.dataTables.min.css" rel="stylesheet">
<%-- <link href="${css}/datatables.foundation.css" rel="stylesheet"> --%>
</head>
<body style="height: 100%">

	<div class="wrapper">

		<!-- Header -->
<%@include file="flows-navbar.jsp" %>
		<!-- Page Content -->
		
<div class="content">
<br/>
<br/>
<br/>
<br/>