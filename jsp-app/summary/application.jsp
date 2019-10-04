<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <%
    int oldValue = 0;
    int newValue = 0;

    if(application.getAttribute("counter")!=null)
    {
        oldValue = (int)application.getAttribute("counter");
        application.setAttribute("counter",oldValue+1);

        newValue = (int)application.getAttribute("counter");
    }
    else{
            application.setAttribute("counter",oldValue+1) ;  
            newValue = (int)application.getAttribute("counter");    
    }
    %>

    <h1> Old Value : <%=oldValue%> </h1>
    <h1> New Value : <%=newValue%> </h1>

    <h1><a href="summary.jsp">Summary page</a></h1>
</body>
</html>