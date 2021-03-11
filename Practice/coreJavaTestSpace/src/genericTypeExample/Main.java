package genericTypeExample;

import java.util.ArrayList;

@SuppressWarnings("deprecation") // just to compile without warnings
public class Main {

	public static void main(String[] args) {
		runExample1();
		runExample2();
		runExample3();
	}
	
	public static void runExample1() {
		System.out.println("Example 1:");
		
		Box intBox = new Box();
		Integer someInt = new Integer(5);
		intBox.setContent(someInt);
		System.out.println("intBox contains: " + intBox.getContent());
		
		Box stringBox = new Box();
		String someString = "Hello World";
		stringBox.setContent(someString);
		System.out.println("stringBox contains: " + stringBox.getContent());
		
		// this is fine, but we run into this problem:
		/*
		Box intBox2 = new Box();
		intBox2.setContent(someString);
		int sum = (Integer)intBox.getContent() + (Integer)intBox2.getContent();
		System.out.println("sum is " + sum);
		*/
		// compiler doesnt complain because it is syntactically correct
		// so how do we solve this?
	}
	
	public static void runExample2() {
		System.out.println("\nExample 2:");
		
		GenericBox<Integer> intGenericBox = new GenericBox<Integer>();
		Integer someInt = new Integer(10);
		intGenericBox.setContent(someInt);
		System.out.println("intGenericBox contains: " + intGenericBox.getContent());
		
		GenericBox<String> stringGenericBox = new GenericBox<String>();
		String someString = "Goodbye World";
		stringGenericBox.setContent(someString);
		System.out.println("stringGenericBox contains: " + stringGenericBox.getContent());
		
		// notice now we cant get the same error we had before, they are considered different types
		//GenericBox<Integer> intGenericBox2 = new GenericBox<>();
		//intGenericBox2.setContent(someString);
	}
	
	public static void runExample3() {
		System.out.println("\nExample 3:");
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			intList.add(i);
		}
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("This");
		stringList.add("is");
		stringList.add("a");
		stringList.add("short");
		stringList.add("sentence.");
		
		// using printElements
		Printer printer = new Printer();
		System.out.print("intList contents: ");
		printer.printElements(intList);
		System.out.print("stringList contents: ");
		printer.printElements(stringList);
		
		// using checkEmpty
		intList = new ArrayList<Integer>();
		boolean isEmpty = printer.checkEmpty(intList);
		System.out.println("Is intList empty? " + isEmpty);
		
		// using getFirstElement
		String firstWord = printer.getFirstElement(stringList);
		System.out.println("First entry of stringList: " + firstWord);
	}
}
