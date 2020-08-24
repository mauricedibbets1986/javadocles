package javadoc;

public class Product {

	String naam;
	int prijs;
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getPrijs() {
		return prijs;
	}

	public void setPrijs(int prijs) {
		this.prijs = prijs;
	}

	Product(String naam, int prijs){
		this.naam = naam;
		this.prijs = prijs;
	}
	
}
