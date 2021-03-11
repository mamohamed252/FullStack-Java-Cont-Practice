package week5Sandbox.deck2_2;

public class SandboxStrings {

	public static void main(String[] args) {
		
		//stringCaseOne();
		stringCaseSecond();

		
		
	}

	private static void stringCaseSecond() {
	
		
		String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 
        
        System.out.println(s1 == s2); 
        System.out.println(s1.equals(s2));
        
        s1 = "welcome";
        System.out.println(s1 == s2); 
        System.out.println(s1.equals(s2));

	}

	private static void stringCaseOne() {
		String name1 = "Ricardo";
		String name2 = "Derek";
		
		System.out.println(name1.equals(name2));
		
		System.out.println("---ricardo before ---");
		System.out.println(name1 == name2);

		
		name2 = name1;
		
		System.out.println(name1.equals(name2));
		System.out.println("---ricardo after ---");
		System.out.println(name1 == name2);

		System.out.println(name1);
		System.out.println(name2);
		
		name1 = "Amy";
		System.out.println(name1.equals(name2));
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2);		
	}

}
