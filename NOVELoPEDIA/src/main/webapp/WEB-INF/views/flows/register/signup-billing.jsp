<%@include file="../shared/flows-header.jsp"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<div class="container">

	<div class="row">
		<div class="col-md-offset-2 col-md-8">
			<div class="panel  panel-info">
				<div class="panel-heading">
					<h4 style="text-align: center">Sign Up - Address</h4>
				</div>

				<div class="panel-body">

					<f:form method="POST" class="form-horizontal" id="billingForm"
						modelAttribute="billing">

						<div class="form-group">
							<label class="control-label col-md-4" for="addressLineOne">Address
								Line One</label>
							<div class="col-md-8">
								<f:input type="text" path="addressLineOne" id="addressLineOne"
									placeholder="Enter Address Line One" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="addressLineTwo">Address
								Line Two</label>
							<div class="col-md-8">
								<f:input type="text" path="addressLineTwo" id="addressLineTwo"
									placeholder="Enter Address Line Two" class="form-control" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="city">City</label>
							<div class="col-md-8">
								<f:input type="text" path="city" id="city"
									placeholder="Enter  city Name" class="form-control" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="state">State</label>
							<div class="col-md-8">
								<f:input type="text" path="state" id="state"
									placeholder="Enter state Name" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="state">Country</label>
							<div class="col-md-8">
								<f:input type="text" path="country" id="country"
									placeholder="Enter Country Name" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="postalCode">Postal
								Code</label>
							<div class="col-md-8">
								<f:input type="text" path="postalCode" id="postalCode"
									placeholder="XXXXX" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">

								<button type="submit" class="btn btn-warning"
									name="_eventId_personal">


									<span class="glyphicon glyphicon-chevron-left"></span>
									Previous-Personal


								</button>

								<button type="submit" class="btn btn-warning"
									name="_eventId_confirm">


									
									Next-Confirm<span class="glyphicon glyphicon-chevron-right"></span>


								</button>


							</div>


						</div>



					</f:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="../shared/flows-footer.jsp"%>
