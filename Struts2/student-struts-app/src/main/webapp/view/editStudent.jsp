<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
<style type="text/css">
.errorMessage{
color:red;
}
</style>

</head>
<body>
<h1>Edit Student</h1>
<h1>Id : <s:property value="id"/></h1>
<s:form method="post" action="edit.do"> 
<s:textfield name="rollNo" label="Roll No "></s:textfield>
<s:textfield name="name" label="Name "></s:textfield>
<s:textfield name="age" label="Age"></s:textfield>
<s:textfield name="email" label="Email "></s:textfield>
<s:submit value="Edit"></s:submit>
</s:form>
</body>
</html>