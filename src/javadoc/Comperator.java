package javadoc;

import java.util.Comparator;

public class Comperator implements Comparator<Product> {

	@Override
	public int compare(Product firstProduct, Product secondProduct) {
		return (firstProduct.getPrijs() - secondProduct.getPrijs());
	}

}
