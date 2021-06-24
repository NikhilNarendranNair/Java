<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
		
		First Name :<form:input path="firstName" />
		<br /><br />


		Last Name :<form:input path="lastName" />
		<br /><br />
			
		Country : 
		<form:select path="country">
		<%--
			Since here we will be using list of Countries passed from Student class, we have commented the below options tag
 	
			<form:option value="India" label="India" />
			<form:option value="Australia" label="Australia" />
			<form:option value="New-zeland" label="Newzeland" />
			<form:option value="West-Indies" label="WestIndies" />
			<form:option value="South-Africa" label="South-Africa" />
			
		--%>
			
			<form:options items="${student.countryOptions}" />

		</form:select> 
		
		<br /><br />
		
		Favourite Language :
		Java <form:radiobutton path="favouriteSubject" value="Java" />
		Python <form:radiobutton path="favouriteSubject" value="Python" />
		Ruby <form:radiobutton path="favouriteSubject" value="Ruby" />
		C# <form:radiobutton path="favouriteSubject" value="C#" />
			
		<br /><br />
		
		Operating System that you are used-too:
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac-OS <form:checkbox path="operatingSystems" value="Mac-OS" />
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		
		<br /><br />
		
		<input type="submit" value="Submit" />
		
	</form:form>
	
</body>
</html>