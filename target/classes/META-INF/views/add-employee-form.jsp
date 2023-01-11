<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	
	<div class="container">
		<form action="employees" method="POST">
			<label>Employee Name</label><br>
			<input type="text" name="name" placeholder="Enter your name">
			<br><br>
			
			
		
			<label>Email-ID</label><br>
			<input type="email" name="emailId" placeholder="Enter your email-id">
			<br><br>
			
			<label>Date-Of-Birth</label><br>
			<input type="date" name="dateOfBirth">
			<br><br>
			
			
			<label>Employee Salary</label><br>
			<input type="number" name="salary" placeholder="Enter your salary">
			<br><br>
			
			<label>Status</label><br>
			<label for="Active">Active</label><input type="radio" name="type" value="Active" id="active">
			<label for="In-Active">In-Active</label><input type="radio" name="type" value="Inactive" id="inactive">
			<br><br>
			
			
			
			
			<input type="submit" value="ADD EMPLOYEE">
			
		</form>
	</div>
	
</body>
</html>