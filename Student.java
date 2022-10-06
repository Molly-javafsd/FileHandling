package com.simplilearn.filehandling;

import java.io.Serializable;

public class Student implements Serializable{
private int sid;
private String sname;  //to make any field non usable, add "Transient" keyword, like
//"private transient String sname;  to make sname non usable
private String subject;

public Student(int sid, String sname, String subject) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.subject = subject;
}

@Override
public String toString() {
	return "Student [sid="+sid+" sname="+sname+" subject="+subject+"]";
}
}
