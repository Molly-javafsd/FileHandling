package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamDemo {
public static void main(String[] args) throws IOException  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the file name");
	String filename=sc.next();
	
	FileInputStream fi=new FileInputStream(filename);
	if(fi!=null) {
		System.out.println("File exists!!");
	}
	

//	fi.read()  -->  it will give the ascii value of 1st character present in the file. so type-casting ascii(numeric value) to char
//	fi.read()!= -1,-1 means it has reached END OF FILE
	int i=0;
	while((i=fi.read())!=-1) {  
		System.out.print((char)i);
	}
	fi.close();
	sc.close();
	
	
}
}
