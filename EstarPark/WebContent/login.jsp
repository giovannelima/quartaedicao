<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<form name="formLogar" method="post" action="login.jsp">
		<div>
			<img class="mb-4" src="" alt="" width="250" height="159">
		</div>

		<label for="login">Login:</label> <input type="text" name="login" /><br />

		<label for="senha">Senha:</label> <input type="password" name="senha" /><br />
		<br /> <input type="submit" name="entrar" value="Entrar" /><br />
	</form>
</body>
</html>