<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Inserisci Prodotto</title>
	<link rel="stylesheet" href="style.css" />
</head>
<body>
	<section>
		<header>
			<h1>Inserisci un prodotto nel catalogo</h1>
		</header>
		<article>
			<p class="errorString">
				${error}
			</p>
			<form action="<c:url value="prodottoController" />" method="get">
				<p>
					Nome: <input type="text" name="nome"
							value="${nome}"/>
				</p>
				<p>
					Prezzo (&euro;): <input type="text" name="prezzo"
							value="${prezzo}" />
				</p>
				<p>
					Descrizione:<br/>
					<textarea name="descrizione" cols="50" rows="10">
						<%
						String d = "Inserisci la descrizione del prodotto...";
						if(request.getAttribute("descrizione") == null)	
							out.println(d);
						else
							out.println(request.getAttribute("descrizione"));
						%>
					</textarea>
				</p>
				<p>
					Codice: <input type="text" name="codice"
							value="${codice}" />
				</p>
				<p>
					<input type="submit" value="inserisci prodotto" />
					<input type="reset" value="resetta campi" />
				</p>
			</form>
		</article>
	</section>
</body>
</html>