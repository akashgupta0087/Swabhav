<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Edit Student</title>
<style type="text/css">
.errorMessage{
color:red;
}
label {
	color: black ! important;
}
.editPanel {
	height: 50%;
	width: 30%;
	margin-left: 30%;
}
</style>
</head>
<body>
<%@ include file = "header.jsp" %>
<div class="panel panel-primary editPanel">
		<div class="panel-heading">
			<span class="heading">Edit Student</span>
		</div>
<div class="panel-body">
<s:form method="post" action="edit.do"> 
<div class="form-inline">
<b>Id : <s:property value="id"/></b>
<s:textfield name="rollNo" type="number" class="form-control" label="Roll No "></s:textfield>
</div>
<div class="form-inline">
<s:textfield name="name" class="form-control" label="Name "></s:textfield>
</div>
<div class="form-inline">
<s:textfield name="age" type="number" class="form-control" label="Age"></s:textfield>
</div>
<div class="form-inline">
<s:textfield name="email" type="email" class="form-control" label="Email "></s:textfield>
</div>
<s:submit value="Update" class="btn btn-primary"></s:submit>
</s:form>
</div>
</div>
</body>
</html>