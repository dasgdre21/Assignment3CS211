/*
 * Dream Dasgupta
 * 4/24/20
 * CS 211 - Assignment 3
 * ItemOrder class stores info about particular item and its quantity
 */
public class ItemOrder {
	// fields
	private Item item;
	private int quantity;

	// constructor
	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	// returns cost for item order
	public double getPrice() {
		return item.priceFor(quantity);
	}

	// returns reference to item in order
	public Item getItem() {
		return this.item;
	}

}
