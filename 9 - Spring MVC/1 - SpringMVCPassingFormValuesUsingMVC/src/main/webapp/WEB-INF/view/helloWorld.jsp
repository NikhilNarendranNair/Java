<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to Hello World Page:</h2>
	<h3>
<!-- 		If you call have to access the variable passed from previous page via form get property use param as below -->
		<%-- Hello ${param.studentName} --%>
		Hello ${Message}
	</h3>
</body>
</html>