<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
	
	<div class="container">
		<form action="/employee-app/update-employee" method="POST">
			<label>Employee ID</label><br>
			<input type="text" name="employeeId" value="${employee.employeeId }" readonly="readonly">
			<br><br>
		
			<label>Employee Name</label><br>
			<input type="text" name="name" value="${employee.name }">
			<br><br>
			
			
			
			
			<label>Email ID</label><br>
			<input type="email" name="emailId" value="${employee.emailId }">
			<br><br>
			
			<label>Date Of Birth</label><br>
			<input type="date" name="dateOfBirth" value="${employee.dateOfBirth}">
			<br><br>
			
			<label>Salary</label><br>
			<input type="number" name="salary" value="${employee.salary }">
			<br><br>
			
			<label>Status</label><br>
			<input type="text" name="Status" value="${employee.status }">
			<br><br>
			
			<input type="submit" value="Update Employee">
			
		</form>
	</div>
</body>
</html>