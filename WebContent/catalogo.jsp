<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="it.uniroma3.negozio.models.Prodotto,
    		java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="it">
<head>
	<meta charset="ISO-8859-1" />
	<title>Catalogo</title>
	<link rel="stylesheet" href="style.css" />
</head>
<body>
	<section>
		<header>
			<h1>Catalogo</h1>
		</header>
		<nav>
			<a href="inserisciProdotto.jsp">
				Inserisci un nuovo prodotto nel catalogo
			</a>
		</nav>
		<article>
			<table>
				<tr>
					<th>Codice</th>
					<th>Nome</th>
					<th>Prezzo</th>
					<th>Descrizione</th>
				</tr>
				<% request.setAttribute("prodotti", Prodotto.createTrial()); %>
				<c:forEach var="prodotto" items="${prodotti}">
					<tr>
						<td>${prodotto.codice}</td>
						<td>${prodotto.nome}</td>
						<td>${prodotto.prezzo} &euro;</td>
						<td>${prodotto.descrizione}</td>
					</tr>
				</c:forEach>
			</table>
		</article>
		<footer>Credits by Er San&ograve;</footer>
	</section>
</body>
</html>