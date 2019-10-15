<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
<s:form action="login"> 
<s:textfield name="username" label="Username "></s:textfield>
<s:textfield name="password" label="Password "></s:textfield>
<s:submit value="Login"></s:submit>
</s:form>
</body>
</html>