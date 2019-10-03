<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Authentication Page</title>
</head>
<body>
    <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    if(username.equals("admin") && password.equals("admin"))
    {%>
        <h1>Welcome <%=username%></h1>
    <%}

    else{%>
        <h1>Invalid username or password</h1>
        <a href="login.html">Click here to Login again!!</a>
    <%}%>



</body>
</html>