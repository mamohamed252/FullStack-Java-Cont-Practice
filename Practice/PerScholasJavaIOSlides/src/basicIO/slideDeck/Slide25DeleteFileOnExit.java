package basicIO.slideDeck;

import java.io.File;
import java.io.IOException;

public class Slide25DeleteFileOnExit {

	public static void main(String[] args) {
		File temp;
		try {
			temp=File.createTempFile(".//resources//sample", ".txt");
			System.out.println("Temp file created:"+temp.getAbsolutePath());
			temp.deleteOnExit();
			System.out.println("Tempfile exists: "+ temp.exists());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	

	}

}
