package it.uniroma3.negozio.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma3.negozio.models.Prodotto;

@WebServlet("prodottoController")
public class ProdottoController extends HttpServlet	{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = getServletContext();
		
		String nome = request.getParameter("nome");
		String prezzo = request.getParameter("prezzo");
		String descrizione = request.getParameter("descrizione");
		String codice = request.getParameter("codice");
		
		if(nome == null || prezzo == null || descrizione == null
				|| codice == null){
			if(nome != null)
				request.setAttribute("nome", nome);
			if(prezzo != null)
				request.setAttribute("prezzo", prezzo);
			if(descrizione != null)
				request.setAttribute("descrizione", descrizione);
			if(codice != null)
				request.setAttribute("codice", codice);
		
	        RequestDispatcher rd = application
	        		.getRequestDispatcher("/inserisciProdotto.jsp");
	        rd.forward(request, response);
	        return;
		}
		
		float prz = Float.parseFloat(prezzo);
		Prodotto prodotto = new Prodotto(nome, prz, descrizione, codice);
		List<Prodotto> prodotti = (List<Prodotto>) application
				.getAttribute("prodotti");
		if(prodotti == null) prodotti = new ArrayList<Prodotto>();
		prodotti.add(prodotto);
		
	}
}
