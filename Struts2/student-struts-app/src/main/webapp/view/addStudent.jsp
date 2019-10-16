<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<style type="text/css">
.errorMessage{
color:red;
}
</style>
</head>
<body>
<h1>Add Student</h1>
<s:form method="post" action="add.do"> 
<s:textfield name="rollNo" label="Roll No "></s:textfield>
<s:textfield name="name" label="Name "></s:textfield>
<s:textfield name="age" label="Age"></s:textfield>
<s:textfield name="email" label="Email "></s:textfield>
<s:submit value="Add"></s:submit>
</s:form>
</body>
</html>