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
    String oldVal;
    String newVal;
    int oldCounter = 0 ;
    int newCounter = 0;

    session = request.getSession(false);
    if(session==null)
    {
        // out.print("Inside if")
        oldCounter = (int)session.getAttribute("counter");
        // out.print(oldVal)
        // oldVal = "0";
        // oldCounter = Integer.valueOf(oldVal);
        session.setAttribute("counter",oldCounter++);

        newCounter = (int)session.getAttribute("counter");
    }
    else{
        session = request.getSession();
            session.setAttribute("counter",oldCounter++) ;  
            newCounter = (int)session.getAttribute("counter");    
    }
    %>

    <h1> Old Value : <%=oldCounter%> </h1>
    <h1> New Value : <%=newCounter%> </h1>
</body>
</html>