<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--  Utilizado formul�rio para captar campo para servlet novaEmpresa -->
	<!--  Foi utilizado m�todo POST para que a informa��o n�o fique na URL -->

	<form action="${linkEntradaServlet}" method="post"> 
		
		Nome: <input type="text" name="nome"/>
		
		Data de Abertura: <input type="text" name="data">
		
		<input type="hidden" name="acao" value="NovaEmpresa"/>
		
		<input type="submit"/>
	
	</form>


</body>
</html>