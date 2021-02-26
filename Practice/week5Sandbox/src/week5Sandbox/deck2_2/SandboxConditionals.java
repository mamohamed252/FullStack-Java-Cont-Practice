package week5Sandbox.deck2_2;

public class SandboxConditionals {

	public static void main(String[] args) {
//		slide12();
//		slide12b();
//		slide13();
//		slide16();
//		slide16b();
		
		
		System.out.println("Hello team!");
		
		slide34();
	}
	private static void slide34() {
		
		if (false) {
			if (true) System.out.println("any value");
		} else {
			System.out.println("other value");
		}
				
			
	}
	private static void slide16b() {
		int num = 5;
		
		//boolean flag = 1<3 ? true : false;  // true
		
		String message = num % 2 == 0 ? "is even" :  " is odd";
		
		if (1<3 ? true : false) {
			System.out.print(num);
			System.out.println(message);
		} else  {
			System.out.println("error: go home");
		}
		
	}
	private static void slide16() {
		int num = 5;
		System.out.print(num);
		System.out.println(num % 2 == 0 ? "is even" :  " is odd");
		
	}

	private static void slide13() {
		
		int x = 1;
		
		boolean a = (x > 1) & (x++ < 10);
		boolean b = (1 > x) && ( 1 > x++);
		boolean c = (1 == x) || (10 > x++);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	private static void slide12b() {
		int number = 10;
		
		boolean e1 = ((number % 2 == 0) && (number % 3 == 0)),
				e2 = ((number % 2 == 0) || (number % 3 == 0)),
				e3 = ((number % 2 == 0) ^ (number % 3 == 0));
		
		System.out.println("Is " + number + " divisible by 2 and 3? " + e1 );  
		System.out.println("Is " + number + " divisible by 2 or 3? "  + e2); 
		System.out.println("Is " + number + " divisible by 2 or 3, but not both? " + e3);

	}

	private static void slide12() {
		
		int number = 10;
		System.out.println("Is " + number + " divisible by 2 and 3? " + ((number % 2 == 0) && (number % 3 == 0)));  
		System.out.println("Is " + number + " divisible by 2 or 3? "  + ((number % 2 == 0) || (number % 3 == 0))); 
		System.out.println("Is " + number + " divisible by 2 or 3, but not both? " + ((number % 2 == 0) ^ (number % 3 == 0)));

	}

}
