<!DOCTYPE html5>
<html>
<head></head>
<body>
<% 
String devName = request.getParameter("developer");
if(devName == null)
    devName = "JSP";

for(int i = 1; i <=6; i++){%>
    <h<%=i%>>Welcome to <%=devName%></h<%=i%>>
    <%}%>

<% 
out.print("Welcome " + devName);
%>
</body>
</html>