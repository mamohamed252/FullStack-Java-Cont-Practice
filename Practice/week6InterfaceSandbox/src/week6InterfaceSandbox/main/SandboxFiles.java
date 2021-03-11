package week6InterfaceSandbox.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SandboxFiles {

	public static void main(String[] args) throws IOException {
		
//		testFile();
		
//		testFileUsingArrayList();
		
		testFileWriter();
	}

	private static void testFileWriter() throws IOException {
		
		System.out.println("TEST FILE WRITER");
		
		String location = ".\\Resources\\newNames.csv";
		File file = new File(location);
		FileWriter fileWriter = new FileWriter(file, false);  // true ==>       false ==>
		
		fileWriter.write("id, first_name, last_name\n");
		
		fileWriter.close();
		
	}

	private static void testFileUsingArrayList() {

		String location = ".\\Resources\\names.csv";
		File source = new File(location);
		
		ArrayList<String[]> dataList = new ArrayList<>(); 

		
		try {
			Scanner scFile = new Scanner(source);
			
			while(scFile.hasNextLine()) { // while there is data coming from the scanner
				String[] line = scFile.nextLine().split(",");
				dataList.add(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// print the array list
//		System.out.println(dataList);
//		
		for(String[] element : dataList) {
			System.out.println(Arrays.toString(element)); // print array
		}
		
		System.out.println("size of the dataList = " + dataList.size());
		System.out.println("first element = " + dataList.get(0));
		System.out.println("second element = " + dataList.get(1));
		System.out.println(dataList.get(2));
		System.out.println(dataList.get(3));
		
	}

	/*
	 *  Method: read file and print the first line
	 *  File name : name.csv
	 *  file format: csv
	 *  location  : .\Resources\ 
	 */
	private static void testFile() throws FileNotFoundException {

		// location
		String location = ".\\Resources\\names.csv";

		try {

			// File instance
			File file = new File(location);

			// access/read/fetch data from the file 
			Scanner scInputFile = new Scanner(file);
			String line; 
			line = scInputFile.nextLine();
			System.out.println(line);  // header
			System.out.println("====================================");
			String[] fields;
			while(scInputFile.hasNextLine()) {
				line = scInputFile.nextLine();
				System.out.println(line);
				fields = line.split(",");
				for (String field : fields) {
					System.out.println(field);
				}
			}
		} catch (Exception e) {
			System.out.println("THIS IS AN ERROR MESSAGE");
			// add code here
		} finally {
			// add code here
			System.out.println("This is the END");
			
		}
	
	}

}









