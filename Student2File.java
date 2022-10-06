package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Student2File {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Student s1= new Student(1, "Molly", "Maths");
	Student s2= new Student(2, "Ayaansh", "English");
	Student s3= new Student(3, "Naanu", "Science");
	
	ArrayList <Student> al= new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	FileOutputStream fo = new FileOutputStream("Input");		// in place of input,path of file can also be written
	ObjectOutputStream out = new ObjectOutputStream(fo);
	out.writeObject(al);
	System.out.println("The write operation is done into the file input");
	out.close();
	fo.close();
	
	//Deserialization
	FileInputStream fi= new FileInputStream("Input");
	ObjectInputStream in=new ObjectInputStream(fi);
	
	//LHS is Student type and RHS is Super class object,so typecasting
	ArrayList <Student> s=(ArrayList <Student>) in.readObject();
	System.out.println("Deserialized values");
	for(Student m:s) {
		System.out.println(m);
	}
	in.close();
	fi.close();
	
}
}
