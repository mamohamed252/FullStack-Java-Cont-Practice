package intermediateIO.slideDeck;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Slide4ByteStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(".//resources//sample.txt");
			fos= new FileOutputStream(".//resources//sampleTo.txt");
			int temp;
			while((temp=fis.read())!=-1) {
				fos.write((byte)temp);
			}if(fis!=null)
				fis.close();
			if(fos!=null)
				fos.close();
		}catch(Exception e) {
			System.out.println();
		}

	}

}
