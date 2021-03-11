package library.activity;

public class AdultUsers implements LibraryUser{
	
	public int age;
	public String bookType;

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if (age > 12) {
			 System.out.println("You have successfully registered under an Adult Account");
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if (bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days!");
		} else System.out.println("Oops, you're only allowed to take adult Fiction books!");
				
	}


}
