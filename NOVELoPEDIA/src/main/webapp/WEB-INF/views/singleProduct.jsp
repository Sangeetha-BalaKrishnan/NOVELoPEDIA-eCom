<div class="container">

	<!-- BreadCrumb -->
	<div class="row">

		<div class="col-xs-12">

			<ol class="breadcrumb">

				<li><a href="${contextRoot }/home">Home</a></li>
				<li><a href="${contextRoot }/show/all/products">Products</a></li>
				<li class="active">${product.name}</li>

			</ol>

		</div>

	</div>

	<div class="row">

		<!--  Product Image -->
		<div class="col-xs-12 col-sm-4">

			<div class="tumbnail">

				<img src="${images}/${product.code}.jpg" class="img img-responsive"  style = "height:500px;width:500px;"/>

			</div>

		</div>

		<!-- Product Discription -->

		<div class="col-xs-12 col-sm-8">

			<h3>${product.name}</h3>
			<hr />

			<p>${product.description}</p>
			<hr />

			<h4>
				price:<strong>&#8377; ${product.unit_price} /-</strong>
			</h4>
			<hr />

			<h6>Quantity Available: ${product.quantity}</h6>

			<a href="${contextRoot}/cart/add/${product.id}/product"
				class="btn btn-success"> <span
				class="glyphicon glyphicon-shopping-cart"></span>Add To Cart
			</a> <a href="${contextRoot}/show/all/products" class="btn btn-primary">
				Back </a>

		</div>

	</div>

</div>