<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>Struts 2 image insert example</title>
</head>
<body style="background-color: #f8f8f8; margin-left: 200px; margin-top: 40px; font-size: 25px;">

	<h1>Struts 2 image insert example</h1>
	
	<s:form action="imageupload" method="POST" enctype="multipart/form-data">
		<s:textfield name="name" label="Name" maxlength="20" />
		<s:file name="image" label="Select Image" />
		<s:submit name="sumbit" value="Submit" />
	</s:form>
	
	<div style="margin-top: 40px; font-size: 30px; color: green;">
		<s:property value="msg" />
	</div>
	
	<a href="retrieveImage.jsp">Click to view images</a>
	
</body>
</html>