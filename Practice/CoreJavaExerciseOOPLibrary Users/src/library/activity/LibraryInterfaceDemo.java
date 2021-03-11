package library.activity;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		
		KidUsers firstKid = new KidUsers();
		KidUsers secondKid = new KidUsers();
		
		firstKid.age = 10;
		firstKid.bookType = "Kids";
		firstKid.registerAccount();
		firstKid.requestBook();
		System.out.println("\n========================================\n");
		secondKid.age = 18;
		secondKid.bookType ="Fiction";
		secondKid.registerAccount();
		secondKid.requestBook();
		System.out.println("\n========================================\n");
		AdultUsers au = new AdultUsers();
		AdultUsers au2 = new AdultUsers();
		au.age = 5;
		au.bookType = "Kids";
		au.registerAccount();
		au.requestBook();
		System.out.println("\n========================================\n");
		au2.age = 23;
		au2.bookType = "Fiction";
		au2.registerAccount();
		au2.requestBook();
		
	}
}
