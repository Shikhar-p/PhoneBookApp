<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Contact Details</title>
</head>
<body>
<a href="addContact">+Add New Contact</a>
<table border="1">
	<thead>
		<tr>
			<th>S.No</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Action</th>
		</tr>
	</thead>
	
	<tbody>
	<c:forEach items="${contacts}" var="c" varStatus="index">
	<tr>
		<td>${index.count+1}</td>
		<td>${c.contactName}</td>
		<td>${c.contactEmail}</td>
		<td>${c.contactNumber}</td>
		<td>
		<a href="">Edit |</a>
		<a href="">Delete</a>
		</td>
	</tr>
	</c:forEach>
	</tbody>
</table>

</body>
</html>