package it.uniroma3.negozio.models;

import java.util.ArrayList;
import java.util.List;

public class Prodotto {
	private String nome;
	private float prezzo;
	private String descrizione;
	private String codice;
	
	public Prodotto(String nome, float prezzo, String descrizione, String codice){
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodice() {
		return codice;
	}
	
	public static final List<Prodotto> createTrial(){
		List<Prodotto> prodotti = new ArrayList<Prodotto>();
		prodotti.add(new Prodotto("Scarpe", 60, "Scarpe della Nike", "ABCD"));
		prodotti.add(new Prodotto("Zaino", 40, "Eastpak", "EFG1"));
		prodotti.add(new Prodotto("Zaino Costoso", 70, "Eastpak più figo", "EFG2"));
		return prodotti;
	}
}
