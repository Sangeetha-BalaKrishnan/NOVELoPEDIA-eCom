<style>
.site-footer {
	background-color: black;
	text-color: White;
	margin-top: 10px;
	padding-top: 10px;
	position: absolute;
	width: 100%;
	bottom: 0%;
	height: 50px;
}

.footer-nav {
	text-align: right;
	list-style: none;
	
}

.footer-nav li {
	display: inline;
	padding:0px 10px;
}

a:hover {
	color: White;
	text-decoration: none;
}

</style>
<footer class="site-footer">
	<div class="container">
		<div class="row">
			<div class="col-xs-4" class="bottom-footer">
				<font size="5px" id="About"> <a
					href="${pageContext.request.contextPath}/About" >About us</a>
				</font>
			</div>
			<div class="col-xs-8">
				<ul class="footer-nav">

					<li><a href="https://www.facebook.com/"> <i
							class="fa fa-2x fa-fw fa-facebook"></i>
					</a></li>
					<li><a href="https://twitter.com/"> <i
							class="fa fa-2x fa-fw fa-twitter "></i></a></li>
					<li><a href="https://www.linkedin.com/company/"> <i
							class="fa fa-2x fa-fw fa-linkedin "></i></a></li>
					<li><a href="https://www.google.com/"> <i
							class="fa fa-2x fa-fw fa-google "></i></a></li>

				</ul>

			</div>
		</div>
	</div>

</footer>

