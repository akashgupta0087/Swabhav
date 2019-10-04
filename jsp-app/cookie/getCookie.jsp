<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body bgcolor=<%
Cookie[] cookies = request.getCookies();
Cookie cookie = cookies[0];
if(cookie.getName().equals("color")){
    out.print(cookie.getValue());
}
%>>

<% 
if(cookie.getName().equals("color"))
    out.print("<h1>Cookie found</h1>");
else
    out.print("<h1>Cookie not found</h1>");
%>
</body>
</html>