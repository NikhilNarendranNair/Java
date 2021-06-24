<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation Page</title>
</head>
<body>

	
	Students's first name is ${student.firstName} and last name is ${student.lastName}
	<br /><br />
	And Student is from ${student.country}
	<br /><br />
	And Students Favourite Subject is : ${student.favouriteSubject}
	<br /><br />
	And Students used to Operating system is : 
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}" >	
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
</body>
</html>