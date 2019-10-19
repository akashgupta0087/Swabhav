<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%if(session.getAttribute("loggedIn")!=null){
    		out.println("<h1> Welcome "+(String)session.getAttribute("loggedIn")+"<h1>");
    	}
%>
</body>
</html>