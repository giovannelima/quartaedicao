<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Entrada de carros</title>
<link rel="stylesheet" href="css/entrada.css">
</head>
	<div id="conteudo">
	<form action="cadastro" method="get">
		<table>
			<tr>
				<td>Modelo:</td>
				<td><input type="text" name="modelo"></td>
			</tr>
			<tr>
				<td>Marca:</td>
				<td><input type="text" name="marca"></td>
			</tr>
			<tr>
				<td>Cor:</td>
				<td><input type="text" name="cor"></td>
			</tr>
			<tr>
				<td>Placa:</td>
				<td><input type="text" name="placa"></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit">
				</td>
			</tr>
		</table>
	</form>
</div>
</html>