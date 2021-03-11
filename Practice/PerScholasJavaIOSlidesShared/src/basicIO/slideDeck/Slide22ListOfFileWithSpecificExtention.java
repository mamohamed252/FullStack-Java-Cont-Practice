package basicIO.slideDeck;

import java.io.File;

public class Slide22ListOfFileWithSpecificExtention {

	public static void main(String[] args) {
		File file=new File( ".//resources//sample.txt");
		String[] list= file.list();
		for(String f:list) {
			if(f.toLowerCase().endsWith(".txt")) {
				System.out.println(f);
			}
			
		}

	}

}
