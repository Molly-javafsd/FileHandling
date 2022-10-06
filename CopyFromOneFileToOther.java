package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFromOneFileToOther {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter file name for copying to other:");
	String file=sc.next();
	FileOutputStream fo=new FileOutputStream(file);
	System.out.println("Enter contents to your file:");
	String input=sc.next()+sc.nextLine();
	
	byte []b=input.getBytes();
	fo.write(b);
	System.out.println("Writing done!!");
	fo.close();
	
	FileInputStream fi=new FileInputStream(file);
	
	System.out.println("Enter filename to be copied");
	String file2=sc.next();
	FileOutputStream fo1= new FileOutputStream(file2);
	
	if(fi!=null) {
		System.out.println("Starting to copy....");
	}
	
	int i=0;
	while((i=fi.read())!=-1) {
		fo1.write(i);;
	}
	
	System.out.println("Done copying!!");
	
	fo1.close();
	fi.close();
	sc.close();
}
}
