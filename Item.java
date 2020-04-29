
/*
 * Dream Dasgupta
 * 4/24/20
 * CS 211 - Assignment 3
 * Item class stores info about the individual items
 */
import java.text.NumberFormat;

public class Item {
	// fields
	private String name;
	private double price;
	private int bulkQuantity;
	private double bulkPrice;

	// constructors
	public Item(String name, double price) {
		this(name, price, 1, price);
	}

	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		// checks is any variables are negative
		if (price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
			throw new IllegalArgumentException();
		}

		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
	}

	// returns price for given quantity of item
	public double priceFor(int quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException();
		} else if (quantity == 0) {
			return 0;
		}

		// amount that can be bought in bulk
		int bulkBuy = quantity / bulkQuantity;

		// returns price of bulk buy + price of excess items
		return bulkBuy * this.bulkPrice + (quantity - bulkBuy * bulkQuantity) * this.price;
	}

	// String representation of Item
	public String toString() {
		// formats double as price (ex. 16.9 to $16.90)
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String s = this.name + ", " + nf.format(this.price);

		// if there is a bulk price
		if (bulkQuantity > 1) {
			s += " (" + this.bulkQuantity + " for " + nf.format(this.bulkPrice) + ")";
		}

		return s;
	}
}
