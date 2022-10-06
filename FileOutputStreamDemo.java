package com.simplilearn.filehandling;

// since FileOutputStream deals with byte data,so it is necessary to convert user received char data to byte data before the WRITING operation

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the file to be created");
	String filename = sc.next();
	//Fileoutputstream & filewriter--> writes from java code to file
	
	FileOutputStream fo= new FileOutputStream(filename,true);	//using true will do the append operation,will add the contents rather than updating
	// .....If file is available,it will write into the file, if file is not available,it will create one file.....
	
	if(fo!=null) {
		System.out.println("File has been created!!");
	}
			//Adding data to your file
	System.out.println("Enter data to your file");
	String inputData=sc.next()+sc.nextLine();						///////////////////////////// IMP------> to take input with spaces,write in this format
	System.out.println("Your entered data is: "+inputData);
	byte b[]=inputData.getBytes();				//FileOutputStream is a byte stream,so converting the received char stream to byte stream forFOSoperation
	fo.write(b);											//byte data pushed to file object now(WRITE to file from java)
	System.out.println("Writing into file done");
	fo.close();
	sc.close();
	
}
}
