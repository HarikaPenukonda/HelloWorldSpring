package com.penukondah1.HelloWorld.Model;

public class Student {
	
	private int sid;
	private String sname;
	private String dept;
	
	/*A no-arg constructor, so that the object is easier to initialize*/
	public Student() {
	
	}
	
	/* A parameterized contructor which takes the arguments and intializes the object */
	public Student(int sid, String sname, String dept) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dept = dept;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	

}
