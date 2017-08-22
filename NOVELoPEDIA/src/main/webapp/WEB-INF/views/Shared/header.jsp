<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>>
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

				<security:authorize access="hasAuthority('ADMIN')">
					<li id="manageProducts" style="font-size: 20px"><a
						href="${contextRoot}/manage/products">Manage Products</a></li>
				</security:authorize>
			</ul>

			<ul class="nav navbar-nav navbar-right">

				<security:authorize access="isAnonymous()">

					<li><a href="${contextRoot}/login" style="font-size: 20px">LogIn</a></li>
					<li><a href="${contextRoot}/register" style="font-size: 20px">SignUp</a></li>

				</security:authorize>

				<security:authorize access="isAuthenticated()">

					<li class="dropdown"><a href="javascript:void(0)"
						class="btn btn-secondary dropdown-toggle" id="dropdownMenu1"
						data-toggle="dropdown" style="font-size: 20px">
							${userModel.fullName} <span class="caret"></span>
					</a>
						<ul class="dropdown-menu">

							<security:authorize access="hasAuthority('USER')">
								<li><a href="${contextRoot}/cart"> <span
										class="glyphicon glyphicon-shopping-cart"></span> <span
										class="badge">${userModel.cart.cartLines}</span> -&#8377;
										${userModel.cart.grandTotal}
								</a></li>

								<li class="divider" role="seperator"></li>

							</security:authorize>

							<li><a href="${contextRoot}/logout">Logout</a></li>

						</ul></li>

				</security:authorize>

			</ul>

		</div>

	</div>

</nav>
<script>
	window.userRole = '${userModel.role}';
</script>