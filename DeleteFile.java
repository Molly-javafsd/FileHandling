package com.simplilearn.filefolder;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String path="F:\\FILES\\";
	System.out.println("Enter the file to be deleted in path: "+path);
	String file=sc.next();

	File f=new File(path+file);
	
	 boolean b=f.delete();			//delete option
	
	 if(b) {
		 System.out.println("File got deleted");
	 }
	 else {
		 System.out.println("File not found,,cannot be deleted");
	 }
	
	sc.close();
}
}
