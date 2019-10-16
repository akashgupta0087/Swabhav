<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Students</title>
</head>
<body>
<a href="view/addStudent.jsp">Add</a>
<%
if(session.getAttribute("loggedIn")!=null){
	out.println("<label>"+(String)session.getAttribute("loggedIn")+"</label>");
	out.println("<a href=logout>Logout</a>");
}
	
%>
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
	
	<td><s:a href="%{edit}">Edit</s:a></td>
	<td><s:a href="%{delete}"><button class="glyphicon glyphicon-remove"></button></s:a>

 </tr>
  </s:iterator>
 </tbody>
 </table>
</body>
</html>