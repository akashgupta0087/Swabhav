<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Students</title>
<style type="text/css">
.delete{
border-radius: 50%;
}
</style>
</head>
<body>
<s:include value="header.jsp"></s:include>
 <table class="table">
 <thead>
 <tr>
 <th>Id</th>
 <th>Roll No.</th>
 <th>Name</th>
 <th>Age</th>
 <th>Email</th>
  <th>Edit</th>
  <th>Delete</th>
 </tr>
 </thead>
 <tbody>
 <s:iterator  var="i" step="1" value="students">
 <tr>
 	<td><s:property value="id"/></td>
    <td><s:property value="rollNo"/></td>
    <td><s:property value="name"/></td>
 	<td><s:property value="age"/></td>
 	<td><s:property value="email"/></td>
 	
 	<s:url action="editStudent" var="edit" >
    <s:param name="id"><s:property value="id"/></s:param>
	</s:url>
	
	<s:url action="deleteStudent" var="delete" >
    <s:param name="id"><s:property value="id"/></s:param>
	</s:url>
	
	<td><s:a href="%{edit}"><button class="btn btn-primary">Edit</button></s:a></td>
	<td><s:a href="%{delete}"><button class="glyphicon glyphicon-remove delete btn btn-danger"></button></s:a>

 </tr>
  </s:iterator>
 </tbody>
 </table>
</body>
</html>