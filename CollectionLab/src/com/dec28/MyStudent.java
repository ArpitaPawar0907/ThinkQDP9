package com.dec28;

public class MyStudent {
	
	private int sid;
	private String sname;
	private Course course;
	public MyStudent() {
		// TODO Auto-generated constructor stub
	}
	public MyStudent(int sid, String sname, Course course) {
		this.sid = sid;
		this.sname = sname;
		this.course = course;
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "MyStudent [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}
	

}
