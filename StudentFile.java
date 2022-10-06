package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentFile {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	//Serialization
	Student s1=new Student(1, "Molly", "Java");
	FileOutputStream fo = new FileOutputStream("Input");		// in place of input,path of file can also be written
	ObjectOutputStream out = new ObjectOutputStream(fo);
	out.writeObject(s1);
	System.out.println("The write operation is done into the file input");
	out.close();
	fo.close();
	
	//Deserialization
	FileInputStream fi= new FileInputStream("Input");
	ObjectInputStream in=new ObjectInputStream(fi);
	
	//LHS is Student type and RHS is Super class object,so typecasting
	Student s=(Student) in.readObject();
	System.out.println("Deserialized values");
	System.out.println(s);
	in.close();
	fi.close();
	
}
}
