package basicIO.slideDeck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Slide16IOEx2 {

	public static void main(String[] args)throws IOException {
		FileReader inputStream=null;
		FileWriter outputStream=null;
		BufferedReader bufferStream=null;
		PrintWriter printStream=null;
		File readin=new File( ".//resources//sample.txt");
		File writeTo=new File( ".//resources//sample.txt");
		try {
			inputStream=new FileReader(readin);
			outputStream=new FileWriter(writeTo);
			bufferStream=new BufferedReader(inputStream);
			printStream=new PrintWriter(outputStream);
			String l;
			while((l=bufferStream.readLine())!=null) {
				printStream.println(l);
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
