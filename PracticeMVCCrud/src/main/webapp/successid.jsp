<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center">
<tr>
			<th>Sr No</th>
			<th>Name</th>
			<th>Address</th>
			<th>Mobile No</th>
			<th>UserName</th>
			<th>Password</th>
			</tr>
			<tr>
			
	
					<td><input type="radio" name="id" value="${user.id}"></td>
					<td>${user.name}</td>
					<td> ${user.addr}</td>
					<td>${user.mobno}</td>
					<td>${user.uname}</td>
					<td>${user.pass}</td>
					
			</tr>
			

		</table>

</body>
</html>