/*
 * Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri 
metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
- il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato
Lo shop gestisce diversi tipi di prodotto:
- Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di prodotti con dati 
inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smartphone o un Televisore o Cuffie e in base alla 
scelta dell’utente utilizzate il costruttore opportuno.
Al termine dell’inserimento stampate il catalogo (fate l’override del metodo toString per restituire le informazioni da stampare 
per ogni classe)
 */

package org.lessons.java;

import java.util.Random;

public class Prodotto {
	protected int code;
	String name;
	String brand;
	double price;
	double IVA = 22;

	public Prodotto(String name, Double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;

		Random r = new Random();
		this.code = r.nextInt();
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getIVA() {
		return IVA;
	}

	public double getPriceIVA() {
		return (this.price + (this.price * 20 / 100));
	}

	public void setIVA(double iVA) {
		IVA = iVA;
	}

}
