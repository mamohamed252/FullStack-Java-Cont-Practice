package basicIO.slideDeck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Slide16IOEx2 {

	public static void main(String[] args)throws IOException {

		File readin=new File( ".//resources//sample.txt");
		FileReader inputStream=null;
		BufferedReader bufferStream=null;

		File writeTo=new File( ".//resources//sampleToOther.txt");
		FileWriter outputStream=null;		
		PrintWriter printStream=null;

		try {
			inputStream=new FileReader(readin);
			bufferStream=new BufferedReader(inputStream);


			outputStream=new FileWriter(writeTo);
			printStream=new PrintWriter(outputStream);


			String line;
			while((line = bufferStream.readLine())!=null) { //eos /eof null
				//add code here

				printStream.println(line);
			}


		}finally {
			if(inputStream!=null) {
				inputStream.close();
			}
			if(outputStream!=null) {
				outputStream.close();
			}
			if(bufferStream!=null) {
				bufferStream.close();
			}
			if(printStream!=null) {
				printStream.close();
			}

		}

	}
}	
