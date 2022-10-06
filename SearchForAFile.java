package com.simplilearn.filefolder;

import java.io.File;
import java.util.Scanner;

public class SearchForAFile {
public static void main(String[] args) {
	String path="F:\\FILES\\";
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the file name to be searched within the path: "+path);
	String file=sc.next();
	
	File f=new File(path);
	File [] filenames=f.listFiles();
	
	int flag=0;
	
	for(File ff: filenames) {
		if(ff.getName().equals(file)) {
			flag=1;
		break;
		}
	}
	
	if(flag==1) {
		System.out.println("File is present");
	}
	else {
		System.out.println("File not present");
	}
	
	sc.close();
}
}
