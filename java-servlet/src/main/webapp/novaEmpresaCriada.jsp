<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Através do < % podemos criar scriptlet, introduzir códigos java dentro de um JSP-->
<%
	//Recuperando a informação enviada por NovaEmpresaServlet com apelido "empresa"
	String nomeEmpresa = (String) request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso!

</body>
</html>