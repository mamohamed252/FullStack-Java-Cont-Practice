package basicIO.slideDeck;

import java.io.File;

public class Slide21ListOfFileNames {

	public static void main(String[] args) {
		File file=new File( ".//resources//sample.txt");
		String[] fileList= file.list();
		for(String name:fileList) {
			System.out.println(name);
		}

	}

}
