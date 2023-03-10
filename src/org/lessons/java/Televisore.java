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

public class Televisore extends Prodotto {

	protected double inches;
	protected boolean isSmart;

	public Televisore(String name, Double price, String brand, double inches, boolean isSmart) {
		super(name, price, brand);
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.inches = inches;
		this.isSmart = isSmart;
	}

	@Override
	public String toString() {
		return super.toString() + "\nInches: " + inches + "\nSmart TV: " + isSmart + "\n ";
	}

}
