package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainRunner {
	
	public static void main(String[] args) {
		// Create
		Map<Integer, String> hMap = new HashMap<>();
		
		hMap.put(1, "mango");
		hMap.put(10, "orange");
		hMap.put(20, "grape");
		hMap.put(30, "cherry");
		hMap.put(45, "apple");
		
		
		
		// Read
//		System.out.println(hMap.get(2));
//		System.out.println(hMap.get(3));
		
//		int[] arr = {1, 2, 3, 4, 5};
//		for(int number : arr) {
//			System.out.println(number);
//		}
//	
//		System.out.println();
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		
//		for(Integer number : list) {
//			System.out.println(number);
//		}
		
		//Needed for read
//		for(Entry element : hMap.entrySet()) {
//			System.out.println("-------");
//			System.out.println(element.getKey());
//			System.out.println(element.getValue());
//		}

//		if(hMap.containsKey(6)) {
//			System.out.println("FOUND");
//		} else { 
//			System.out.println("NOT FOUND");
//		}
		
//		System.out.println("\n\n");
//		// Update
//		hMap.put(4, "kiwi");
//		System.out.println(hMap.get(4));
//		for(Entry element : hMap.entrySet()) {
//			System.out.println("-------");
//			System.out.println(element.getKey());
//			System.out.println(element.getValue());
//		}
//		System.out.println("\n\n");
//		hMap.replace(4, "banana");
//		System.out.println(hMap.get(4));
		for(Entry element : hMap.entrySet()) {
			System.out.println("-------");
			System.out.println(element.getKey());
			System.out.println(element.getValue());
		}

		// Delete
	
		// 5
		// i -> 5
		// 45
		for(int i = 1; i <= hMap.size(); i++) {
			System.out.println(hMap.get(i));
		}
		

		
	}
}
