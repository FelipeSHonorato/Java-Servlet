<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		
		<c:if test="${not empty empresa}">
		Empresa ${ empresa } cadastrada com sucesso!
		
		<form method="get" action="/java-servlet/listaEmpresas">
    		<button type="submit">Lista de Empresas</button>
		</form>
		
		</c:if>
		<br>
		
		<c:if test="${empty empresa}">
		Nenhuma empresa está cadastrada!
		</c:if>
		<br>
		
		
	</body>
</html>