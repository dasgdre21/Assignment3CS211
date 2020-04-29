/*
 * Dream
 * 4/24/20
 * CS 211 - Assignment 3
 * Catalog class stores info about collection of Items
 */

import java.util.*;

public class Catalog {
	// fields
	private String name;
	private ArrayList<Item> list;

	// constructor
	public Catalog(String name) {
		this.name = name;
		this.list = new ArrayList<Item>();
	}

	// adds Item to end of list
	public void add(Item item) {
		list.add(item);
	}

	// returns number of items in list
	public int size() {
		return list.size();
	}

	// returns Item with given index
	public Item get(int index) {
		return list.get(index);
	}

	// returns name of Catalog
	public String getName() {
		return this.name;
	}
}
