<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Login</title>
<style>
fieldset.scheduler-border {
            border: 2px solid black;
            padding: 15px;
            margin: 0px;
            width: 50%;
    
        }
    
        legend.scheduler-border {
            font-size: 1.2em;
            font-weight: bold;
            text-align: left;
            width: auto;
            padding: 0 10px;
            border-bottom: none;
        }
        #form {
            margin-left: 500px;
            margin-top: 20px;
</style>
</head>
<body>
<div id="form">
    <form method="POST" action="login">
        <fieldset class="scheduler-border">
            <legend class="scheduler-border">Login</legend>
            <div class="form-inline">
                <label>A/c Name : </label><input type="text" class="form-control" name="name">
            </div>
            <br>
            <div class="form-inline">
                    <label>Password : </label><input type="password" class="form-control" name="password">
            </div>
            <br>
            <br>
            <input type="submit" value="Login" class="btn btn-primary">
        </fieldset>
    </form>
</div>
<h1><%= (request.getAttribute("message")==null)? "" : request.getAttribute("message") %></h1>
</body>
</html>