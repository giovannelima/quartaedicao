<%@page import="br.com.park.object.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventário</title>
<link rel="stylesheet" href="css/listagem.css">
</head>
<body>
	<div>
		<table>
			<tr>
				<th>Codigo</th>
				<th>Modelo</th>
				<th>Marca</th>
				<th>Cor</th>
				<th>Placa</th>
			</tr>
			<c:forEach var="park" items="${carros}">
				<tr>
					<td><c:out value="${park.id}" /></td>
					<td><c:out value="${park.modelo}" /></td>
					<td><c:out value="${park.marca}" /></td>
					<td><c:out value="${park.cor}" /></td>
					<td><c:out value="${park.placa}" /></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>