package secondJavaSample;

public class MainRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoopExample();
		ForLoopExample();
		DoWhileLoop();
		makeLoop();
	}
	
	private static void makeLoop() {
		// TODO Auto-generated method stub
		
	}

	private static void DoWhileLoop() {
		// TODO Auto-generated method stub
		int count = 5;
		System.out.println("This is for Do While Loop");
		do {
			System.out.println(count --);
		} while (count > 0);
	}

	private static void ForLoopExample() {
		// TODO Auto-generated method stub
		System.out.println("This is for the for ForLoop");
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void WhileLoopExample() {
		int count = 5;
		System.out.println("This is for the for while loop");

		while(count > 0) {
			System.out.println(count --);
		}
	}

}
