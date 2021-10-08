<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
		<p>Nome: <input type="text" name="nome"/> </p>
		<p>Time: <input type="text" name="nome"/> </p>
		<p><input type="submit" value="Enviar"></p>
		<p>${mensagem}</p>
	</form>
</body>
</html>