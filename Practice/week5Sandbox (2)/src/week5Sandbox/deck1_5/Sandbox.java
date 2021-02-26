package week5Sandbox.deck1_5;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class Sandbox {
	
	// Class variables 
	// Class properties
	static int id = 99;

	
	public static void main(String[] args) {
		//declareVariablesSample(); //Slide #
		//usingVariables(); //slide #
		//usingBitwise(); //slide #
		//displayTime(); //slide # 
		//currentTime();
		//typeConversion();
		System.out.println("Sales tax ver 1" );
		displaySalesTax(); 
		System.out.println("Sales tax ver 2" );
		displaySalesTaxVer2();
		
	}
	
	/* 
	 ver 2 ==> includes the use of the scanner to capture the input (SALES)

	 output ==> output = sales tax amount
	 input ==> input = sales amount
	 process or computation ==> 
	      sales tax = sales amount * 0.0875
	*/
	private static void displaySalesTaxVer2() {
		final double RATE = 0.08875;
		// input
		double sales = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter sales amount = ");
		sales = keyboard.nextDouble();
		// process
		double salesTax = sales * RATE;
		//output
		System.out.println("Input = " + sales);
		System.out.println("Output = "+salesTax);


		// kevin contribution
		DecimalFormat df = new DecimalFormat("###0.00");
		System.out.println("Output: $" + df.format(salesTax));

		// dustin contribution
		System.out.printf("Input: $%.0f \nOutput: $%.2f", sales, salesTax);
		keyboard.close();
	}

	private static void displaySalesTax() {
		// output ==> output = sales tax amount

		// input ==> input = sales amount
		 
		
		// process or computation ==> 
		//      sales tax = sales amount * 0.0875
		
		// input
		double sales = 100.00;
		final double RATE = 0.08875;

		// process
		double salesTax = sales * RATE;
		
		//output
		System.out.println("Input = " + sales);
		System.out.println("Output = "+salesTax);
		
		
		// kevin contribution
		DecimalFormat df = new DecimalFormat("###0.00");
		System.out.println("Output: $" + df.format(salesTax));

		// dustin contribution
		System.out.printf("Input: $%.0f \nOutput: $%.2f \n", sales, salesTax);

	}
	

	private static void typeConversion() {
		byte i = 100;
		long k = i * 3 + 4;
		double d = i * 3.1 + k / 2;
		System.out.println(d);
	}

	@SuppressWarnings("deprecation")
	private static void currentTime() {
		
		System.out.println("this is the currentTimeMillis ");
		System.out.println(System.currentTimeMillis());
		
		Date today = new Date();
		System.out.println("DATE ");
		System.out.println(today.toInstant());
		System.out.println(today.getDate());
		System.out.println(today.getDay());
		System.out.println(today.getHours());
		
	}

	private static void displayTime() {
		//sample:
		//input = 130 seconds
		//output = 2 min and 10 sec
		
		//input
		int inputTime = 130;
		
		// process
		int minutes = inputTime/60;
		int seconds = inputTime%60;
		
		// output
		System.out.println("input = "+ inputTime + " seconds");
		System.out.println("output = " + minutes + " minutes " + seconds + " seconds");
		//System.out.printf();
		System.out.printf("input = %d seconds\noutput = %d minutes %d seconds", inputTime, minutes, seconds);
		
		
	}

	private static void usingBitwise() {
		int i = 7;
		System.out.println(i);
		
		int j = i >> 2;
		System.out.println(j); //3
		
	}

	private static void usingVariables() {
		int n = 0;
		double dou = 0; 
		float fl = 10f;
		long lo = 55L;
		short sh = 5;
		byte by = 0;
		boolean bo = true; // false
		char ch = '$';
		String name = "Derek";
		
		n = by;
		n = (int) dou; // casting ??? 
		n = ch;
		
		
		// n = name;
		
		System.out.println("this is the character = "+ch);
		System.out.println("this is the int =" + n);
		
		String fullName = name.concat(", Chou");
		
		fullName = "derek".concat("\tchou\"Java Developer\"");
		
		System.out.println(name);
		System.out.println(fullName);
		
	}

	private static void declareVariablesSample() {
			// method variables or local variables
				// primitive data types
				int n = 0;
				double dou = 0; 
				float fl = 10f;
				long lo = 55L;
				short sh = 5;
				byte by = 0;
				boolean bo = true; // false
				char ch = 'A';

				
				// reference data types
				String name = "xyz";  // null
				Scanner input = new Scanner(System.in);
				
			
				dou = dou * 10;
				
				// print the variables
				System.out.println("int = " + n);
				

				
				System.out.println("double = " + dou);
				System.out.println("float = " + fl);
				System.out.println("Long = " + lo);
				System.out.println("Short = " + sh);
				System.out.println("Byte = " + by);
				System.out.println("Boolean = " + bo);
				System.out.println("Char  = " + ch);
				System.out.println("String = " + name);
				System.out.println("Scanner = " + input);
				
				System.out.println("id = " + id);
				
				System.out.println(input.hashCode());
				
				Integer number = 12345;
				
				System.out.println(number);
				System.out.println(number.hashCode());
				
				 
				input.close();
		
	}
	//-----------

//	 public static void time1(String[] args) {
//
//	      // returns the current time in milliseconds
//	      System.out.print("Current Time in milliseconds = ");
//	      System.out.println(System.currentTimeMillis());
//	   }
//	
//	public class time2 {
//		LocalDateTime myDateObj = LocalDateTime.now();
//		System.out.println("Before formatting: " + myDateObj);
//		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//
//		String formattedDate = myDateObj.format(myFormatObj);
//		System.out.println("After formatting: " + formattedDate);
//		
//	}
//	public static void time3 (String args[]) {
//		// Instantiate a Date object
//		Date date = new Date();
//
//		// display time and date
//		String str = String.format("Current Date/Time : %tc", date );
//
//		System.out.printf(str);
//	}
//
//	public static void time4(String args[]) {
//		// Instantiate a Date object
//		Date date = new Date();
//
//		// display time and date
//		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
//	}
//
//	public static void time5(String args[]) {
//		// Instantiate a Date object
//		Date date = new Date();
//
//		// display formatted date
//		System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
//	}
		
	
}
