<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wish</title>
</head>
<body>
<s:form method="post" action="wish.do">
<s:textfield name="name" label="Name"></s:textfield>    
<s:submit value="Wish"/> 
</s:form>
<h1><s:property value="message"/></h1>
</body>
</html>