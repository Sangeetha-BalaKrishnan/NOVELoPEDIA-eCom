<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<style>
.help-block {
	color: red;
}

.table-responsive {
	overflow-x: inherit;
}

</style>
<div class="container">
	<div class="row">

		<c:if test="${not empty message}">

			<div class="col-xs-12">

				<div class="alert alert-info alert-dismissible">

					<button type="button" class="close" data-dismiss="alert">&times;</button>

					${message}

				</div>
			</div>

		</c:if>


		<div class="col-md-offset-2 col-md-8">
			<div class="panel  panel-default">
				<div class="panel-heading">
					<h4>Product Management</h4>
				</div>
				<div class="panel-body">

					<!-- Form Elements -->
					<f:form class="form-horizontal" modelAttribute="product"
						action="${contextRoot}/manage/products" method="POST"
						enctype="multipart/form-data">

						<div class="form-group">
							<label class="control-label col-md-4" for="name">Enter
								Product Name:</label>
							<div class="col-md-8">
								<f:input type="text" path="name" id="name"
									placeholder="Product Name" class="form-control" />
								<f:errors path="name" cssClass="help-block" element="em" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="author">Enter
								Author Name:</label>
							<div class="col-md-8">
								<f:input type="text" path="author" id="author"
									placeholder="Author Name" class="form-control" />
								<f:errors path="author" cssClass="help-block" element="em" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="Product description">
								Product Description:</label>
							<div class="col-md-8">
								<f:textarea path="description" id="description" rows="4"
									placeholder="Description" class="form-control" />
								<f:errors path="description" cssClass="help-block" element="em" />

							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="price">Enter
								Unit Price:</label>
							<div class="col-md-8">
								<f:input type="text" path="unit_price" id="unit_price"
									placeholder="Unit Price" class="form-control" />
								<f:errors path="unit_price" cssClass="help-block" element="em" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="Quantity">Quantity
								Available:</label>
							<div class="col-md-8">
								<f:input type="text" path="quantity" id="quantity"
									placeholder="Quantity Availaable" class="form-control" />
							</div>
						</div>

						<!-- File Image Upload -->
						<div class="form-group">
							<label class="control-label col-md-4" for="file">Select
								an Image:</label>
							<div class="col-md-8">
								<f:input type="file" path="file" id="file" class="form-control" />
								<f:errors path="file" cssClass="help-block" element="em" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="Category">Select
								Category:</label>
							<div class="col-md-8">
								<f:select class="form-control" id="categoryId" path="categoryId"
									items="${categories}" itemLabel="name" itemValue="id" />

								<c:if test="${product.id == 0}">
									<div class="text-right">
										<br />
										<button type="button" data-toggle="modal"
											data-target="#myCategoryModal" class="btn btn-info btn-xs">Add
											Category</button>
									</div>
								</c:if>


								<!-- Hidden Fields -->
								<f:hidden path="id" />
								<f:hidden path="code" />
								<f:hidden path="active" />
								<f:hidden path="supplierId" />
								<f:hidden path="purchases" />
								<f:hidden path="views" />
							</div>
						</div>


						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<input type="submit" name="submit" id="submit" value="Submit"
									class=" btn btn-warning" />
							</div>
						</div>

					</f:form>

				</div>
			</div>
		</div>
	</div>


	<div class="row">

		<div class="col-xs-12">

			<h3>Available Products</h3>
			<hr />

		</div>


		<div class="col-xs-12">

			<div class="container-fluid">

				<div class="table-responsive">


					<!-- Products table for admin -->
					<table id="adminProductsTable"
						class="table table-striped table-bordered">

						<thead>
							<tr>
								<th>Id</th>
								<th>&#160;</th>
								<th>Name</th>
								<th>Author</th>
								<th>Quantity</th>
								<th>Unit Price</th>
								<th>Active</th>
								<th>Edit</th>
							</tr>
						</thead>



						<tfoot>
							<tr>
								<th>Id</th>
								<th>&#160;</th>
								<th>Name</th>
								<th>Author</th>
								<th>Quantity</th>
								<th>Unit Price</th>
								<th>Active</th>
								<th>Edit</th>
							</tr>
						</tfoot>

					</table>


				</div>


			</div>




		</div>

	</div>


	<div class="modal fade" id="myCategoryModal" role="dialog"
		tabindex="-1">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span>&times;</span>
					</button>
					<h4 class="modal-title">Add New Category</h4>
				</div>
				<div class="modal-body">
					<!-- Category Form -->
					<f:form id="categoryForm" modelAttribute="category"
						action="${contextRoot}/manage/category" method="POST"
						class="form-horizontal">

						<div class="form-group">
							<label for="category_name" class="control-label col-md-4">Category
								Name</label>
							<div class="col-md-8">
								<f:input type="text" path="name" id="category_name"
									class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="category_description" class="control-label col-md-4">Category
								Description</label>
							<div class="col-md-8">
								<f:textarea cols="" rows="5" path="description"
									id="category_description" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<input type="submit" value="Add Category"
									class="btn btn-primary" />
							</div>
						</div>



					</f:form>
				</div>
			</div>
		</div>
	</div>


</div>