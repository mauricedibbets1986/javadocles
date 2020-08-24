package javadoc;

import java.util.ArrayList;
import java.util.Collections;

//wat is javadoc?
//een tool voor het generen van documentatie van je source code
//html files worden gegenereerd die samen een website maken

//javadoc is voor je commentaar bij je code

//voorbeeld uitgebreide javadoc: https://docs.oracle.com/javase/7/docs/api/

//een javadoc comment heeft 2 delen gescheiden door een blank line:
//deel1: omschrijving
//deel2: tag list

//hoe javadoc runnen
//1. cmd line: javadoc -sourcepath src\main\java -d docs -subpackages .
//1.2 javadoc -sourcepath src\main\java -d docs -subpackages . -author -version
//2. vanuit IDE

//start java doc altijd onder imports en direct boven de class (geen enters ertussen)

public class Javadoc {
	public static void main(String[] args) {
		System.out.println("javadoc is running");
		
		ArrayList <Product> producten = new ArrayList();
		
		System.out.println("\n");
		
		producten.add(new Product("Kaas",1400));
		producten.add(new Product("Wasmiddel",800));
		producten.add(new Product("Worst",200));
		producten.add(new Product("Chips",400));
		producten.add(new Product("Appels",150));
		
		System.out.println("niet gesorteerd:");
		
		for(Product p : producten) {
			System.out.println(p.naam + " > "+ p.prijs);
		}
		
		Comperator productPrijsComperator = new Comperator();
		
		Collections.sort(producten, productPrijsComperator);
		
		System.out.println("\n");
		System.out.println("gesorteerd op prijs:");
		
		for(Product p : producten) {
			System.out.println(p.naam + " > "+ p.prijs);
		}
		
	}
}
