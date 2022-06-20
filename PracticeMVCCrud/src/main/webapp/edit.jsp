<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1 align="center">EDIT DATA</h1>
</head>
<body>
<form action="update">
<table border="1">
<tr>
<td>
<input type="hidden" name="id" value="${data.id}"></td>
</tr>

<tr>
<td>Name:-</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>
<tr>
<td>Email:-</td>
<td><input type="text" name="addr" value="${data.addr}"></td>
</tr>
<tr>
<td>MobileNo:-</td>
<td><input type="text" name="mobno" value="${data.mobno}"></td>
</tr>
<tr>
<td>UserName:-</td>
<td><input type="text" name="uname" value="${data.uname}"></td>
</tr>
<td>Password:-</td>
<td><input type="text" name="pass" value="${data.pass}"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>