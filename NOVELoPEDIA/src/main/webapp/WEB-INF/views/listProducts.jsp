<div class="container">
	<div class="row">

		<!-- SideBar -->
		<div class="col-sm-3">
			<%@include file="./Shared/sidebar.jsp"%>


		</div>

		<!-- Products -->
		<div class="col-md-9">

			<!-- BreadCrub -->
			<div class="row">
				<div class="col-md-12">

					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>

						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>

				</div>



			</div>

			<div class="row">
				<div class="col-xs-12">
					<table id="productListTable"
						class="table table-striped table-borderd">

						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
							</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>