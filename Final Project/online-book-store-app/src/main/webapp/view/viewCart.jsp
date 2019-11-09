<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Cart</title>
<link rel="stylesheet"
	href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
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
							src="<s:property value='image' />"></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
</body>
</html>