<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>display</title>
</head>
<body>
	

	<c:choose>
		<c:when test="${ msg.getClass().getSimpleName().equals(\"String\")}">
			<h2>${msg }</h2>
		</c:when>
		<c:when test="${ msg.getClass().getSimpleName().equals(\"TrainDto\")}">
			<table border="1" align="center">
				<tr>
					<th>Employee ID</th>
					<th>Name</th>
					<th>Email-ID</th>
					<th>DateOfBirth</th>
					<th>Age</th>
					<th>Salary</th>
					<th>Status</th>
				</tr>
				<tr>
					<td>${ msg.employeeId }</td>
					<td>${ msg.name }</td>
					<td>${ msg.emailId }</td>
					<td>${ msg.dateOfBirth }</td>
					<td>${ msg.age }</td>
					<td>${ msg.salary }</td>
					<td>${ msg.status }</td>
				</tr>
			</table>
		</c:when>
	</c:choose>

</body>
</html>