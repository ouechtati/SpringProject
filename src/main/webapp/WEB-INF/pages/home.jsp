<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Liste d'employee</h1>
		
		<table border="1">
		<th>Nom</th>
		<th>telephone</th>
		<th>adresse</th>
		<th>Action</th>
		<c:forEach var="emp" items="${listEmploye}">
		<tr>
		<td>${emp.name}</td>
		<td>${emp.tel}</td>
		<td>${emp.adress}</td>
		<td><a href="update?id=${emp.id}">Edit</a>
		<a href="delete?id=${emp.id}">delete</a></td>
		</tr>
		</c:forEach>
		</table>
		<h4>
			Ajouter un nouveau employee <a href="add">Ajouter</a>
		</h4>
		</div>
</body>
</html>