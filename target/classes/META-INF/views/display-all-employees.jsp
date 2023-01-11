<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>

	<h1>All Employees</h1>

	
	<table border="1" align="center">
	<tr>
		<th>Employee ID</th>
		<th>Name</th>
		<th>Email-ID</th>
		<th>DateOfBirth</th>
		<th>Age</th>
		<th>Salary</th>
		<th>Status</th>
		<th colspan="2">Actions</th>
	</tr>
	
	<c:forEach var="employee" items="${ employees }">
		<tr>
			<td>${ employee.employeeId }</td>
			<td>${ employee.name }</td>
			<td>${ employee.emailId }</td>
			<td>${ employee.dateOfBirth }</td>
			<td>${ employee.age }</td>
			<td>${ employee.salary }</td>
			<td>${ employee.status }</td>
			<td><a href='./edit/${ employee.employeeId }'>EDIT</a></td>
			<td><a href='./delete?trainNumber=${ employee.employeeId }'>DELETE</a></td>
		</tr>
	</c:forEach>
	
	</table>
</body>
</html>