<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image Test</title>
</head>
<body>
	<div style="margin-left: 15%; margin-top: 20px;">
		<h2>How to display byte image in JSP using Struts2</h2>
		<form method="get" action="getImage">
		 ID: <input type="text" name="id" value="<s:property value='id'/>" placeholder="Enter the Id no..." />
			<button type="submit">Get Image</button>
		</form>
		<table style="width: 60%; margin-top: 30px; text-align: center;">
			<tr>
				<th>Name</th>
				<th>Image</th>
			</tr>
			<tr>
				<td><i><s:property value="name" /></i></td>
				<td><img width="100" height="100"
					src="<s:property value="image" />"></td>
			</tr>
		</table>
	</div>
</body>
</html>