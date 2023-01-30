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
import java.util.Scanner;

class Catalogo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("How many products do you want to add?");
		int number = s.nextInt();
		s.nextLine();

		Prodotto[] products = new Prodotto[number];
		int counter = 0;

		while (counter < number) {
			System.out.println("Choose to insert Smartphone (1), Televisore (2) or Cuffie (3):");
			int choice = s.nextInt();
			s.nextLine();
			System.out.println("Insert name:");
			String name = s.nextLine();
			double price;
			do {
				System.out.println("Insert positive price:");
				price = s.nextDouble();
				s.nextLine();
			} while (price < 0);
			System.out.println("Insert brand:");
			String brand = s.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Insert memory capacity in GB:");
				int memory = s.nextInt();
				Random r = new Random();
				int IMEI = r.nextInt();
				products[counter] = new Smartphone(name, price, brand, memory, IMEI);
				break;
			case 2:
				System.out.println("Insert inches:");
				int inches = s.nextInt();
				s.nextLine();
				System.out.println("Is it a Smart TV? Type 'yes' or 'no':");
				boolean isSmart = false;
				if (s.nextLine().equals("yes")) {
					isSmart = true;
				}
				products[counter] = new Televisore(name, price, brand, inches, isSmart);
				break;
			case 3:
				System.out.println("Insert color:");
				String color = s.nextLine();
				System.out.println("Is it wireless? Type 'yes' or 'no':");
				boolean isWireless = false;
				if (s.nextLine().equals("yes")) {
					isWireless = true;
				}
				products[counter] = new Cuffie(name, price, brand, color, isWireless);
				break;
			}
			counter++;
		}
		s.close();

		System.out.println("Catalogo prodotti:");
		for (Prodotto product : products) {
			System.out.println(product.toString());
		}
	}
}
