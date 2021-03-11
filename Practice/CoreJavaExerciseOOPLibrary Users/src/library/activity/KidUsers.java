package library.activity;

public class KidUsers implements LibraryUser {

	int age;
	String bookType;

	@Override
	public void registerAccount() {
		if (age > 12) {
			System.out.println("Sorry, age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if (bookType == "Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");

		}else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

}
