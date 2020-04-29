/*
 * Dream
 * 4/24/20
 * CS 211 - Assignment 3
 * ShoppingCart class stores info about overall order
 */

import java.util.*;

public class ShoppingCart {
	// fields
	private ArrayList<ItemOrder> orders;
	private boolean discount;

	// constructor
	public ShoppingCart() {
		this.orders = new ArrayList<ItemOrder>();
		this.discount = false;
	}

	// adds ItemOrder to list
	// replaces previous orders
	public void add(ItemOrder itemOrder) {

		// goes through each order to see if previous orders exist
		for (ItemOrder o : orders) {
			boolean exit = false;

			// checks if order contains same item
			if (o.getItem().equals(itemOrder.getItem())) {
				// updates order if true
				orders.set(orders.indexOf(o), itemOrder);
				exit = true;
			}

			// exits loop if itemOrder was added to list
			if (exit) {
				break;
			}
		}

		// adds order to list if not added in loop
		if (!orders.contains(itemOrder)) {
			orders.add(itemOrder);
		}
	}

	// sets whether or not this order gets a discount
	public void setDiscount(boolean value) {
		this.discount = value;
	}

	// returns total cost of shopping cart
	public double getTotal() {
		double total = 0;

		for (ItemOrder o : orders) {
			total += o.getPrice();
		}

		// returns 90% of price if discounted
		if (discount) {
			return 0.9 * total;
		}

		// returns regular price otherwise
		return total;
	}
}
