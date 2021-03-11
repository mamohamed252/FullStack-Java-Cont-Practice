package week6HashMapSandobox.main;

import java.util.HashMap;
import java.util.Map.Entry;

public class SandboxHashMap {

	public static void main(String[] args) {
		testCreateHashMap();
		
//		testPrintHashMap();

	}

	private static void testCreateHashMap() {
		HashMap<Integer, String>  items = new HashMap<Integer, String>();
		
		String itemNameA, itemNameB;
		// crud add, read, update, delete
		
		//add
		System.out.println("*****ADD");

		items.put(5, "Mango");
		items.put(5, "Orange"); // error
		items.put(1, "Kiwi");
		
		printItems(items);
		

		//read
		System.out.println("*****READ");

		
		itemNameA = items.get(1);
		System.out.println(itemNameA);
		
		itemNameB = items.get(99);
		if(itemNameB != null) {
			System.out.println(itemNameB);
		} else System.out.println("not found");
		
					
		
		//update
		
		System.out.println("*****UPDATE");

		items.replace(1, "Apple");
		printItems(items);

		
		//delete
		System.out.println("*****DELETE");

		String removedItemNamed = items.remove(5);
		printItems(items);

		
	}

	
	// print hashmap
	private static void printItems(HashMap<Integer, String> items) {
		
		for(Entry element : items.entrySet()) {
			System.out.println("-------");
			System.out.println(element.getKey());
			System.out.println(element.getValue());
		}
		
	}

}
