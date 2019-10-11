<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.techlabs.model.Contact" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Contacts List</title>
</head>
<body>
<h1>Contacts List</h1>
<a href="addContact">Add Student</a>
<table class="table table-bordered">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Phone No.</th>
</tr>
<%
List<Contact> contacts = (List)request.getAttribute("contacts");
for(Contact contact : contacts){
	out.print("<tr> <td>" + contact.getFirstName() + "</td>" + "<td>" + contact.getLastName() + "</td>" + "<td>" + contact.getEmail() + "</td>" + "<td>" + contact.getPhoneNo() + "</td></tr>");
}

%>
</table>
</body>
</html>