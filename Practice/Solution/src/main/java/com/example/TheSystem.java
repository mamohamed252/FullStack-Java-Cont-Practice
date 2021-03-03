package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {

	public static final String CART_FILE = "sample.txt";
	public static String DELIMITTER = "  ";
	private HashMap<String, Item> itemCollection;

	TheSystem() {
		// Your code here

		itemCollection = new HashMap<>();

		if (getClass().getSimpleName().equals("AppSystem")) {
			// this puts items from cart into map
			loadCart();
		}
	}

	private Item unmarshallItem(String itemAsText) {

		// TODO Auto-generated method stub

		String[] itemTokens = itemAsText.split(DELIMITTER);
		String itemName = itemTokens[0];

		Item itemFromFile = new Item(itemName);

		itemFromFile.setItemDesc(itemTokens[1]);
		itemFromFile.setItemPrice(Integer.parseInt(itemTokens[2]));
		itemFromFile.setAvailableQuantity(Integer.parseInt(itemTokens[3]));

		return itemFromFile;
	}

	private void loadCart() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(
					new FileReader(CART_FILE));
		} catch(FileNotFoundException e) {
			System.out.println("Could not load cart");
		}

		String currentLine;
		Item currentItem;

		while(scanner.hasNextLine()) {
			currentLine = scanner.nextLine();
			currentItem = unmarshallItem(currentLine);
			itemCollection.put(currentItem.getItemName(), currentItem);
		}
		scanner.close();
	}


	public HashMap<String, Item> getItemCollection(){
		// Your code here

		// change later. 
		return null;
	}

	public Boolean checkAvailability(Item item) {
		// Your code here
		if(item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + " to the card. System only has " + item.getAvailableQuantity() + " " + item.getItemName() + "s.");
			return false;
		}else {
			return true;
		}
	}

	public Boolean add(Item item) {
		// Your code here
		if (item == null) {
			return false;
		}else if(itemCollection.containsKey(item.getItemName()) && checkAvailability(item)) {
			item.setQuantity(item.getQuantity() + 1);
			return true;
		}else if(!itemCollection.containsKey(item.getItemName())) {
			itemCollection.put(item.getItemName(), item);

			return true;
		}
		return false;

	}

	public Item remove(String itemName) {
		// Your code here
		if (itemCollection.containsKey(itemName)) {
			return itemCollection.remove(itemName);
		}
		return null;
	}

	public abstract void display();
}

