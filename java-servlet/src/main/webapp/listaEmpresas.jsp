<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.java_servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	
	<c:if test="${not empty empresa}">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	<br />
	Lista de empresas: <br />
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			
		<li>${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
			<a href="/java-servlet/mostraEmpresa?id=${empresa.id}">edita</a>
			<a href="/java-servlet/removeEmpresa?id=${empresa.id}">remove</a>
						
			</li>
		
		</c:forEach>
	</ul>
	
</body>
</html>