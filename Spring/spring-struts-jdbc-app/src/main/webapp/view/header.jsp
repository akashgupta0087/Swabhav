
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Banking-Spring-Struts</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Home</a></li> -->
      <li><a href="addStudent">Registration</a></li>
      <li><a href="addStudent">Login</a></li>
      <%if(session.getAttribute("loggedIn")!=null){
    		out.println("<li><a>"+(String)session.getAttribute("loggedIn")+"</a></li>");
    		out.println("<li><a href=logout>Logout</a></li>");
    	} %>
    </ul>
  </div>
</nav>