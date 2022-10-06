package com.simplilearn.filehandling;

import java.io.Serializable;

public class Student2 implements Serializable{
	private int sid;
	private String sname;
	private String subject;
	public Student2(int sid, String sname, String subject) {
		this.sid = sid;
		this.sname = sname;
		this.subject = subject;
	}
	public String toString() {
		return "Student [sid="+sid+" sname="+sname+" subject="+subject+"]";
	}
	
	
}
