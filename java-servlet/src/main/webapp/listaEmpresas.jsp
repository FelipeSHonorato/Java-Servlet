<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- Fazendo o import de Empresa e Classe List -->
    <%@
    
    page import= "java.util.List, br.com.java_servlet.Empresa"
    
    %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Lista de Empresas:
	<br>
	<ul>
	
	<% 
	List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
	for (Empresa empresa : lista){ 
	%>
	
	<li><%= empresa.getNome() %></li>
	
	<%
	} 
	%>

	</ul>

</body>
</html>