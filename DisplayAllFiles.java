package com.simplilearn.filefolder;

import java.io.File;

public class DisplayAllFiles {
public static void main(String[] args) {
	String path="F:\\FILES\\";
	System.out.println("Displaying all the files present in the path: "+path);
	
	File f=new File(path);
	
	File [] filenames=f.listFiles();								// listFiles function displays all the files in f,which is taken in above "File" class
	
	for(File ff : filenames) {										//Iterating through all the files
		System.out.print(ff.getName()+"  ");					// only ff will display path with each name,so for name only using ".getName" method
			}
																			//File names are diplayed in ascending order
}
}
