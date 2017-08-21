<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="images" value="/resources/images" />
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
			<img src="${images}/Logo.png" alt="NOVELoPEDIA"
				style="color: grey; height: 50%; width: 50%">

		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">

			<ul class="nav navbar-nav">

				<li id="home" style="font-size: 20px"><a
					href="${contextRoot}/home">Home</a></li>
				<li id="product" style="font-size: 20px"><a
					href="${contextRoot}/show/all/products">Product</a></li>
				<li id="manageProducts" style="font-size: 20px"><a
					href="${contextRoot}/manage/products">Manage Products</a></li>

			</ul>

			<ul class="nav navbar-nav navbar-right">
				<!--<li><a href="${pageContext.request.contextPath}/adding" style="font-size: 20px">Admin</a></li>  -->

				<li><a href="${contextRoot}/Login" style="font-size: 20px">LogIn</a></li>
				<li><a href="${contextRoot}/register" style="font-size: 20px">SignUp</a></li>

			</ul>

		</div>

	</div>

</nav>