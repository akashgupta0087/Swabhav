<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
.errorMessage{
color:red;
}
</style>
</head>
<body>
<s:form method="post" action="login.do"> 
<s:textfield name="username" label="Username "></s:textfield>
<s:textfield name="password" label="Password "></s:textfield>
<s:submit value="Login"></s:submit>
</s:form>
<h1><s:property value="message"/></h1>
</body>
</html>