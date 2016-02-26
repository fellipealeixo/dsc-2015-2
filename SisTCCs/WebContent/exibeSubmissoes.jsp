<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.edu.ifrn.sistcc.entidades.Submissao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Submissões por Evento</title>
</head>
<body>
<h2>Submissões por Evento</h2>
<ol>
<%
	List<Submissao> lista = (List<Submissao>) session.getAttribute("lista");
	for(Submissao s : lista) {
%>
	<li><%= s.getId() %>, <%= s.getTitulo() %>, <%= s.getUrlArquivo() %></li>
<%
	}
%>
</ol>
</body>
</html>