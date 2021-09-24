<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServlet"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--  Utilizado formulário para captar campo para servlet novaEmpresa -->
	<!--  Foi utilizado método POST para que a informação não fique na URL -->

	<form action="${linkServletAlteraEmpresa}" method="post"> 
		
		Nome: <input type="text" name="nome" value="${empresa.nome }"/>
		
		Data de Abertura: <input type="text" name="data"  value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>" />
		
		<input type="hidden" name="id" value="${empresa.id }"/>
		
		<input type="submit"/>
	
	</form>


</body>
</html>