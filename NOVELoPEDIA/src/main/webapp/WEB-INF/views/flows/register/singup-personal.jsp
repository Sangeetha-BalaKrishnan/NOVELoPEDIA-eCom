<%@include file="../shared/flows-header.jsp"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<div class="row">
		<div class="col-md-offset-2 col-md-8">
			<div class="panel  panel-info">
				<div class="panel-heading">
					<h4 style="text-align: center">Sign Up - Personal</h4>
				</div>

				<div class="panel-body">

					<f:form method="POST" class="form-horizontal" id="registerForm"
						modelAttribute="user">


						<div class="form-group">
							<label class="control-label col-md-4" for="firstName">First
								Name</label>
							<div class="col-md-8">
								<f:input type="text" path="firstName" id="firstName"
									placeholder="First Name" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="lastName">Last
								Name</label>
							<div class="col-md-8">
								<f:input type="text" path="lastName" id="lastName"
									placeholder="Last Name" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="email">Email
								id</label>
							<div class="col-md-8">
								<f:input type="text" path="email" id="email"
									placeholder="Email Id" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="contactNumber">Contact
								Number</label>
							<div class="col-md-8">
								<f:input type="text" path="contactNumber" id="contactNumber"
									placeholder="XXXXXXXX" maxlength="10" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="password">Password</label>
							<div class="col-md-8">
								<f:input type="password" path="password" id="password"
									class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Select Role</label>
							<div class="col-md-8">
								<label class="radio-inline"></label>
								<f:radiobutton path="role" value="USER" checked="checked" />
								User <label class="radio-inline"></label>
								<f:radiobutton path="role" value="SUPPLIER" />
								Supplier
							</div>

						</div>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">

								<button type="submit" class="btn btn-warning"
									name="_eventId_billing">


									Next-Billing<span class="glyphicon glyphicon-chevron-right"></span>


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