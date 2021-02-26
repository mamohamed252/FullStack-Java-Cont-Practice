package ArraySample_30;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraySample();
	}


	public static void arraySample() {



		//1 INPUT
		// Generate/read one hundred numbers. Store the numbers in an Array
		int max = 10000;
		int min = 1;
		int[]arr = new int[100];

		for (int i = 0; i < 100; i++)
		{
			// Inserting a random number between min and max into the array
			arr[i] = i * 2;//(int) (Math.random() * (max - min + 1) + min); 
		}

		//2 PROCESS
		//- Compute their average
		double average = 0;
		for (int i = 0; i < arr.length; i++) {
			average += arr[i];
		}
		average /= arr.length;

		// - Count out how many numbers are above the average

		int highNumber = 0;

		for (int i = 0; i < arr.length; i++) 
			if (arr[i] > average) highNumber++;

		//3 Output
		// print the original 
		//Hello team
		for (int i = 0; i < arr.length; i++) {

			if (i % 10 == 0 && i != 0)
			{
				System.out.println();
			}
			System.out.print(arr[i] + ", ");
		}
		//  - Print  "how many numbers are above the average"
		System.out.printf("\nHow many numbers are above the average: %d\n", highNumber);
	}
}
