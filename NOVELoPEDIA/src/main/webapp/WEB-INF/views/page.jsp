<!-- Carousel -->
		
			<div class="row">
				<div class="col-md-3">
					<p class="lead">NOVELS</p>
					<%@include file="./Shared/sidebar.jsp"%>
				</div>

				<div class="col-md-9">
					<div class="row carousel-holder">
						<div class="col-md-12">
							<div id="myCarousel" class="carousel slide">
								<!-- Indicators -->

								<ol class="carousel-indicators">
									<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
									<li data-target="#myCarousel" data-slide-to="1"></li>
									<li data-target="#myCarousel" data-slide-to="2"></li>
								</ol>
								<div class="carousel-inner">
									<div class="item active">
										<img class="img-round" class="img-responsive center-block"
											alt="Image Not Found" src="${images}/image3.jpg"
											style="height: 600px; width: 100%">
									</div>
									<div class="item">
										<img alt="Image Not Found" class="img-round"
											class="img-responsive center-block"
											src="${images}/image2.jpg" style="height: 600px; width: 100%">
									</div>
									<div class="item">
										<img class="img-round" class="img-responsive center-block"
											alt="Image Not Found" src="${images}/image1.jpg"
											style="height: 600px; width: 100%">
									</div>
								</div>
								<!-- Controls -->
								<a class="left carousel-control" href="#myCarousel"
									data-slide="prev"> <i
									class="glyphicon glyphicon-chevron-left"></i>
								</a> <a class="right carousel-control" href="#myCarousel"
									data-slide="next"> <i
									class="glyphicon glyphicon-chevron-right"></i>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /.carousel -->

			<hr />
			<div class="row">

				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="${images}/One.jpg" style="width: 500px; height: 500px;"
							alt="Image Not Found">
						<div class="caption">
							<h4 class="pull-right">$24.99</h4>
							<h4>
								<a href="#">First Product</a>
							</h4>
							<p>
								See more snippets like this online store item at <a
									target="_blank" href="http://www.bootsnipp.com">Bootsnipp -
									http://bootsnipp.com</a>.
							</p>
						</div>
						<div class="ratings">
							<p class="pull-right">15 reviews</p>
							<p>
								<span class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span>
							</p>
						</div>
					</div>
				</div>

				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="${images}/Two.jpg" style="width: 500px; height: 500px;"
							alt="Image Not Found">
						<div class="caption">
							<h4 class="pull-right">$64.99</h4>
							<h4>
								<a href="#">Second Product</a>
							</h4>
							<p>This is a short description. Lorem ipsum dolor sit amet,
								consectetur adipiscing elit.</p>
						</div>
						<div class="ratings">
							<p class="pull-right">12 reviews</p>
							<p>
								<span class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star-empty"></span>
							</p>
						</div>
					</div>
				</div>

				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="${images}/Three.jpg"
							style="width: 500px; height: 500px;" alt="Image Not Found">
						<div class="caption">
							<h4 class="pull-right">$74.99</h4>
							<h4>
								<a href="#">Third Product</a>
							</h4>
							<p>This is a short description. Lorem ipsum dolor sit amet,
								consectetur adipiscing elit.</p>
						</div>
						<div class="ratings">
							<p class="pull-right">31 reviews</p>
							<p>
								<span class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star"></span> <span
									class="glyphicon glyphicon-star-empty"></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		
