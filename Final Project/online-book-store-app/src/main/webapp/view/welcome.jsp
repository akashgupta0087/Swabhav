<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Welcome Page</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Online Book Store</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Home</a></li> -->
      <li><a href="register">Registration</a></li>
      <li><a href="login">Login</a></li>
       <%if(session.getAttribute("loggedIn")!=null){
    		out.println("<li><a>"+(String)session.getAttribute("loggedIn")+"</a></li>");
    		out.println("<li><a href=logout>Logout</a></li>");
    	} %>
    </ul>
  </div>
</nav>
<table class="table">
<thead>
<tr>
<th>Id</th>
<th>Book Name</th>
<th>Book Category</th>
<th>Price</th>
<th>Quantity</th>
<th>Image</th>
</tr>
</thead>
<tbody>
 <s:iterator  var="i" step="1" value="books">
	 <tr>
	 	<td><s:property value="id"/></td>
		<td><s:property value="bookName"/></td>
		<td><s:property value="category"/></td>
		<td><s:property value="price"/></td>
		<td><s:property value="quantity"/></td>
		<td><img width="100" height="100" src="<s:url value='Image.action?id='/><s:property value='id' />"></td>
 	</tr>
 </s:iterator>
</tbody>
</table>
	<div class="container-fluid">
		<div class="row">
			<s:iterator value="books" begin="0" end="num">
				<div class="col-xs-3"
					style="height: 250px; border-radius: 20px;">
					<img width="130"
						style="display: block; margin-left: auto; margin-right: auto;"
						height="150"
						src="<s:url value='Image.action?id='/><s:property value='id' />">
					<center>
						<h4 style="overflow: hidden; max-width: 20ch;">
							<a href="bookInfo?id=<s:property value='id' />"><s:property
									value="bookName" /></a>
						</h4>
						<span>Price:<s:property value="price" /></span>
					</center>
				</div>
			</s:iterator>
			<div class="col-xs-3"
				style="height: 250px; border-radius: 20px;">
				<center>
					<h2 class="glyphicon glyphicon-plus"></h2>
					<br>
					<br> <span>View more books</span>
				</center>
			</div>
		</div>
	</div>
</body>
</html>