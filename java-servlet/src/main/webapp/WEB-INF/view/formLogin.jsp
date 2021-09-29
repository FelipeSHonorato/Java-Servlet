<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--  Utilizado formulário para captar campo para servlet novaEmpresa -->
	<!--  Foi utilizado método POST para que a informação não fique na URL -->

	<form action="${linkEntradaServlet}" method="post"> 
		
		Login: <input type="text" name="login"/>
		
		Senha: <input type="password" name="senha">
		
		<input type="hidden" name="acao" value="Login"/>
		
		<input type="submit"/>
	
	</form>


</body>
</html>