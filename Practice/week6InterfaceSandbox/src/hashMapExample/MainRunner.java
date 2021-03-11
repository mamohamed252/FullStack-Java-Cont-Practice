package hashMapExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainRunner {
	private static Scanner scn;

	public static void main(String[] args) {

		Map<Integer, Person> hMap = new HashMap<>();
		try {
			File file = new File("resources/names.csv");
			scn = new Scanner(file);

			scn.nextLine(); // disregard the header
			while (scn.hasNextLine()) {
				String[] line = scn.nextLine().split(",");

				int id = Integer.parseInt(line[0]); // will throw exception if not formated properly
				String fName = line[1];
				String lName = line[2];

				Person person = new Person(id, fName, lName);
				hMap.put(id, person); // add key value pair in hMap
			}
			scn.close();
		} catch (FileNotFoundException e) {
			System.out.println("NO FILE FOUND...");
		} catch (NumberFormatException e) {
			System.out.println("ID MUST BE AN INTEGER...");
		}

		printHashMap(hMap);

		// SEARCH
//		contains(hMap, 1);
//		contains(hMap, 20);

		// INSERTION-REPLACE
//		Person personA = new Person(10, "John", "Doe");
//		int id = personA.getId();
//		hMap.put(id, personA);
//		printHashMap(hMap);

		// What if we add person with an already existing ID/KEY into hMap?
//		Person personB = new Person(3, "Monica", "Hall");
//		hMap.put(personB.getId(), personB);
//		printHashMap(hMap);

		// DELETE
//		hMap.remove(3);
//		printHashMap(hMap); 

//		Person removePerson = hMap.remove(3);
//		System.out.println(removePerson == null ? "NOT REMOVED" : "REMOVED");
	}

	// Looping through a hash map
	public static void printHashMap(Map<Integer, Person> hMap) {
		System.out.println("\n\n==========================================================\n\n");
//		hMap.forEach((key, value) -> {
//			System.out.printf("[KEY: %-10d VALUE: %-30s]%n%n", key, value);
//		});

		for (Map.Entry<Integer, Person> element : hMap.entrySet()) {
			System.out.printf("[KEY: %-10d VALUE: %-30s]%n%n", element.getKey(), element.getValue());
		}
	}

	public static void contains(Map<Integer, Person> hMap, int key) {
		boolean flag = hMap.containsKey(key);
		if (flag)
			System.out.printf("KEY %d FOUND IN MAP." + "VALUE: %s%n", key, hMap.get(key).toString()); // get(key)
																										// returns value
																										// associated
																										// with key
		else
			System.out.printf("KEY %d NOT FOUND IN MAP.", key);
	}
}
