<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
.tdErrorMessage{
color:red;
}
</style>
</head>
<body>
<h1>Register Page</h1>
<s:form method="post" action="register.do"> 
<s:textfield name="rollNo" label="Roll No "></s:textfield>
<s:textfield name="firstname" label="Firstname "></s:textfield>
<s:textfield name="lastname" label="Lastname "></s:textfield>
<s:textfield name="age" label="Age "></s:textfield>
<s:textfield name="location" label="Location "></s:textfield>
<s:submit value="Register"></s:submit>
</s:form>
<pre><s:property value="message"/></pre>
</body>
</html>