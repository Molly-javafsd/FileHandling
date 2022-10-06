package com.simplilearn.filefolder;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	String path="F:\\FILES\\";
	System.out.println("Enter the file to be created in path: "+path);
	String file=sc.next();

	
	File f=new File(path+file);				// "File class" is used to create files (FOS and FW also creates file)
	boolean b=f.createNewFile();		// f.createNewFile creates file in f....  "b" is true when file f is created inside given path
	
	if(b!=true) {
		System.out.println("File is not created in path "+path);
		}
	else {
		System.out.println("File has been created in path: "+path);
	}
	sc.close();

}
}
