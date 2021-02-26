package arrays;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simpleArray();
		//middleArray();
		//stringArrayColors();
		//arrayIndexOutOfBounds();
		//loopControl();
		//loopArrayMultiply();
		//loopArrayNotMiddle();
		//swapMiddle();
		comboArray();
		
		
	}

	private static void simpleArray() {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that creates an array of integers 
		 * with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. 
		 * Print out each array element.
		 */
		int[] threeArray = {1, 2, 3};
		System.out.println("Your array: " + Arrays.toString(threeArray));
	}
	private static void middleArray() {
		// TODO Auto-generated method stub
		/*
		 * Write a program that returns the middle element
		 *  in an array. Give the following values to the 
		 *  integer array: {13, 5, 7, 68, 2}
		 *   and produce the following output: 7
		 */
		
		int[] array = {13, 5, 7, 68, 2};
		
		int mid = array.length / 2;
		System.out.println("Your array: " + Arrays.toString(array));
		System.out.println("Middle value is: " + array[mid]);
		
	}
	private static void stringArrayColors() {
		// TODO Auto-generated method stub
		/*
		 * Write a program that creates an array of String type and 
		 * initializes it with the strings “red”, “green”, “blue” and “yellow”. 
		 * Print out the array length. Make a copy using the clone( ) method. 
		 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
		 */
		
		String[] colors = {"red", "green", "yellow"};
		
		System.out.println("Your array colors are: " + Arrays.toString(colors));
		
		String[] clonedColors = colors.clone();
		System.out.println("Your cloned array colors are: " + Arrays.toString(clonedColors));
	}
	
	private static void arrayIndexOutOfBounds() {
		// TODO Auto-generated method stub
		/*
		 * Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 * The numbers can be any integers.  Print out the value at the first index and 
		 * the last index using length - 1 as the index. Now try printing the value 
		 * at index = length ( e.g., myArray[myArray.length ] ).  
		 * Notice the type of exception which is produced. Now try to assign a value to 
		 * the array index 5. You should get the same type of exception
		 */
		
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("0 index value is: " + (numbers[0]));
		//hard coded length
		System.out.println("last index value is: " + (numbers[4]));
		System.out.println("last index value is: " + numbers[numbers.length - 1]);
	}
	
	private static void loopControl() {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program where you create an integer array 
		 * with a length of 5. Loop through the array and assign the 
		 * value of the loop control variable (e.g., i) 
		 * to the corresponding index in the array.
		 */
		
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
	}
	
	public static void loopArrayMultiply() {
		/*
		 * Write a program where you create an integer array of 5 numbers. 
		 * Loop through the array and assign the value of the loop control 
		 * variable multiplied by 2 to the corresponding index in the array.
		 */
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2;
		}
		
	}

	public static void 	loopArrayNotMiddle() {
		/*
		 * Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, 
		 * except for the middle (index 2) element.
		 */
		
		int[] array = {1, 2, 3, 4, 5};
		
		int mid = array.length / 2;
		for (int i = 0; i < array.length; i++) {
			if(mid == i ) {
				continue;
			}else {
				System.out.println(array[i]);
			}
		}
		System.out.println("Complete");
		
	}
	
	public static void swapMiddle() {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("Orginal array: " + Arrays.toString(array));
		int mid = array.length / 2;
		int tempArray = array[0];
		array[0] = array[mid];
		array[mid] = tempArray;
		
		System.out.println("Array swapped is: " + Arrays.toString(array));
	}
	
	public static void ascendingArray() {
		/*
		 * Write a program to sort the following int array in 
		 * ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
		 *  print the smallest and the largest element of the array. 
		 *  The output will look like the following:
			Array in ascending order: 0, 1, 2, 4, 9, 13
			The smallest number is 0
			The biggest number is 13
		 */
		int[] array = {4, 2, 9, 13, 1, 0};
		
		Arrays.sort(array);
		System.out.println("Acending order: " + Arrays.toString(array));
		System.out.println("Smallest number: " + array[0]);
		System.out.println("Biggest number: " + array[5]);
		
	}
	
	public static void comboArray() {
		Object[] array = new Object [5];
		array[0] = new Integer(1);
		array[1] = new String ("Hello");
		array[2] = new String ("My name is: ");
		array[3] = new String ("Mohamed");
		array[4] = new Double (5.0);
		
		System.out.println(Arrays.toString(array));
	}
	
	
}
