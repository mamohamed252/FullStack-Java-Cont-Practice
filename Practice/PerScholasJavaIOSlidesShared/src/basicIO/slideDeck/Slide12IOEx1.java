package basicIO.slideDeck;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Slide12IOEx1 {
	// Removed throw exception from main to use in try-catch line 41
	public static void main(String[] args)  {

		File sourceFile = new File( ".//resources//sample.txt");
		FileReader fileReader = null;  // source file  		sample.txt


		File destinationFile = new File( ".//resources//sampleTo.txt");
		FileWriter fileWriter = null; // destination file   sampleTo.txt


		try {
			fileReader = new FileReader(sourceFile);

			fileWriter = new FileWriter(destinationFile);

			int c;

			//			while((c = inputStream.read()) != -1) {  // -1 ==> EOF


			c = fileReader.read();
			while(c != -1) {  // -1 ==> EOF

				
				// business logic
				
				fileWriter.write(c);

				c = fileReader.read();
			}
			System.out.println("Printing done");
		} catch(Exception e){
			System.out.println(e.getMessage());

		}finally {
			try { 
				if(fileReader != null)	fileReader.close();
				if(fileWriter != null) fileWriter.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}

