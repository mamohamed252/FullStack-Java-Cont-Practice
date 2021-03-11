package intermediateIO.slideDeck;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

public class Slide14NIOEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream input=new FileInputStream("sample.txt");
		ReadableByteChannel source= input.getChannel();
		FileInputStream output=new FileInputStream("sampleTo.txt");

	}

}
