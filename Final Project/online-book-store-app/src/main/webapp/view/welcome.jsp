<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet"
	href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<script src="assets/jquery-3.4.1.js"></script>
<style type="text/css">
.row.no-gutter {
	margin-left: 0;
	margin-right: 0;
}

.row.no-gutter [class*='col-']:not (:first-child ), .row.no-gutter [class*='col-']:not
	(:last-child ) {
	padding-right: 0;
	padding-left: 0;
}
</style>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="jumbotron">
		<h1>Welcome to Aurionpro Bank</h1>
	</div>
	<!-- <div class="container-fluid">
		<table class="table table-hover">
			<tr>
			<thead>
				<th>Id</th>
				<th>Name</th>
				<th>Category</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Image</th>
			</thead>
			</tr>
			<tbody>
				<s:iterator value="books">
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="bookName" /></td>
						<td><s:property value="category" /></td>
						<td><s:property value="quantity" /></td>
						<td><s:property value="price" /></td>
						<td><img width="100" height="100"
							src="<s:url value='Image.action?id='/><s:property value='id' />"></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div> -->
	<section class="container-fluid">
		<header>
			<h2>
				<a href="bookCategory?category=Comedy">Comedy</a>
			</h2>
		</header>
		<article class="row">
			<s:iterator value="comedyBooks" begin="0" end="c_num">
				<div class="col-xs-3" style="height: 250px; border-radius: 20px;">
						<img width="130"
							style="display: block; margin-left: auto; margin-right: auto;"
							height="150"
							src="<s:property value='image' />">
						    
					<center>
						<h4 style="overflow: hidden; max-width: 20ch;">
							<a href="bookInfo?id=<s:property value='id' />"><s:property
									value="bookName" /></a>
						</h4>
						<span>Price:<s:property value="price" /></span>
					</center>
				</div>
			</s:iterator>
			<div class="col-xs-3" style="height: 250px; border-radius: 20px;">
				<center style="margin-top: 50px;">
					<a class="btn btn-default" href="bookCategory?category=Comedy">
						<h2 class="glyphicon glyphicon-plus"></h2> <br> <br> <span>View
							more books</span>
					</a>
				</center>
			</div>
		</article>
	</section>

	<section class="container-fluid">
		<header>
			<h2>
				<a href="bookCategory?category=Romance">Romance</a>
			</h2>
		</header>
		<article class="row">
			<s:iterator value="RomanceBooks" begin="0" end="r_num">
				<div class="col-xs-3" style="height: 250px; border-radius: 20px;">
					<img width="130"
						style="display: block; margin-left: auto; margin-right: auto;"
						height="150"
						src="<s:property value='image' />">
					<center>
						<h4 style="overflow: hidden; max-width: 20ch;">
							<a href="bookInfo?id=<s:property value='id' />"><s:property
									value="bookName" /></a>
						</h4>
						<span>Price:<s:property value="price" /></span>
					</center>
				</div>
			</s:iterator>
			<div class="col-xs-3" style="height: 250px; border-radius: 20px;">
				<center style="margin-top: 50px;">
					<a class="btn btn-default" href="bookCategory?category=Romance">
						<h2 class="glyphicon glyphicon-plus"></h2> <br> <br> <span>View
							more books</span>
					</a>
				</center>
			</div>
		</article>
	</section>

	<section class="container-fluid">
		<header>
			<h2>
				<a href="bookCategory?category=Thriller">Thriller</a>
			</h2>
		</header>
		<article class="row">
			<s:iterator value="ThrillerBooks" begin="0" end="t_num">
				<div class="col-xs-3" style="height: 250px; border-radius: 20px;">
					<img width="130"
						style="display: block; margin-left: auto; margin-right: auto;"
						height="150"
						src="<s:property value='image' />">
					<center>
						<h4 style="overflow: hidden; max-width: 20ch;">
							<a href="bookInfo?id=<s:property value='id' />"><s:property
									value="bookName" /></a>
						</h4>
						<span>Price:<s:property value="price" /></span>
					</center>
				</div>
			</s:iterator>
			<div class="col-xs-3" style="height: 250px; border-radius: 20px;">
				<center style="margin-top: 50px;">
					<a class="btn btn-default" href="bookCategory?category=Thriller">
						<h2 class="glyphicon glyphicon-plus"></h2> <br> <br> <span>View
							more books</span>
					</a>
				</center>
			</div>
		</article>
	</section>
</body>
</html>