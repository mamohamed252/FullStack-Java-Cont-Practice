package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class TheSystem {

	private HashMap<String, Item> itemCollection;

	TheSystem() {
		// Your code here
		// initialized item collection with empty hashMap
		itemCollection = new HashMap<String, Item>();
		// invoking the constructor
		// if condition is met proceed to try-catch block
		if (getClass().getSimpleName().equals("AppSystem")) {
			try {
				// reading file with scanner in try and splitting on delimiter
				File file = new File("./resources/sample.txt");
				Scanner sc = new Scanner(file);
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					// reading each line and splitting on double space.
					String[] itemInfo = line.split("  ");
					Item temp = new Item(itemInfo[0], itemInfo[1], Double.parseDouble(itemInfo[2]),
							Integer.parseInt(itemInfo[3]));
					itemCollection.put(temp.getItemName(), temp);
				} // if file not found in scanner then an exception will be caught

				// close scanner to prevent memory leak
				sc.close();
				// catch File not found exception if the try does not contain file.
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

	}

	public HashMap<String, Item> getItemCollection() {
		return itemCollection;
	}

	public Boolean checkAvailability(Item item) {
		// checks for quantity is greater or equal to available quantity, prints msg and
		// returns false else returns true
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + " to the card. System only has "
					+ item.getAvailableQuantity() + " " + item.getItemName() + "s.");
			return false;
		} else {
			return true;
		}
	}

	public Boolean add(Item item) {
		// adds item with this method. if item is null returns false. if already in
		// collection and available increases quantity by 1.
		// if it does not in collection it adds to it and returns true all else returns
		// false.
		if (item == null) {
			return false;
		} else if (itemCollection.containsKey(item.getItemName()) && checkAvailability(item)) {
			item.setQuantity(item.getQuantity() + 1);
			return true;
		} else if (!itemCollection.containsKey(item.getItemName())) {
			itemCollection.put(item.getItemName(), item);

			return true;
		}
		return false;

	}

	public Item remove(String itemName) {
		// removes item and returns what was removed
		if (itemCollection.containsKey(itemName)) {
			return itemCollection.remove(itemName);
		}
		return null;
	}

	public abstract void display();
}
