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
</body>
</html>