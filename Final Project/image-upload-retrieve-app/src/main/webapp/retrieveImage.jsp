<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve Image</title>
</head>
<body>
<s:iterator value="images">
	<h1><s:property value="name"/></h1>
	<img alt="image" src="<s:property value='image'/>">
</s:iterator>
</body>
</html>