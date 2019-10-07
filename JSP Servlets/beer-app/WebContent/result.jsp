<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Beer Recommedations JSP</h1>
<p>
<%
List results = (List)request.getAttribute("results");
for(Object result : results){
	 out.print("<br> Try : " + result);
}
%>
</p>
</body>
</html>