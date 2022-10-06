package com.simplilearn.filehandling;
//Since FW deals with character data,so no need to convert user received char data to byte data,as for writing operation in FW--character data is used.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the file to be created");
	String filename = sc.next();
	FileWriter fw= new FileWriter(filename,true);				//using true will do the append operation,will add the contents rather than updating
	// .....If file is available,it will write into the file, if file is not available,it will create one file.....
	if(fw!=null) {
		System.out.println("File has been created!!");
	}
			//Adding data to your file
	System.out.println("Enter data to your file");
	String inputData=sc.next()+sc.nextLine();						///////////////////////////// IMP------> to take input with spaces,write in this format
	System.out.println("Your entered data is: "+inputData);
	
	fw.write(inputData);										//directly pushing character data in FW for writing operation		
	
	System.out.println("Writing into file done");
	fw.close();
	sc.close();
}
}
