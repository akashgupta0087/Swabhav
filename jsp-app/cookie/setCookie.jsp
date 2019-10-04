<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Set Cookie</title>
</head>
<body>
        <% 
        Cookie cookie = new Cookie("color","red");
        cookie.setMaxAge(120);
        response.addCookie(cookie);
        out.print("<h1>Cookie Created</h1>");
        %>

        <h1> <a href="getCookie.jsp"> View </a> </h1>
</body>
</html>