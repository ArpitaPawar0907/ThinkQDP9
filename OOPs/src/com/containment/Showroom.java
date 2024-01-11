package com.containment;

public class Showroom {
	private int sid;
	private String sname;
	private Car car;
	
	Showroom()
	{
		
	}

	public Showroom(int sid, String sname, Car car) 
	{
		this.sid = sid;
		this.sname = sname;
		this.car = car;
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

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	
	public String toString() {
		return "[Showroom " + sid + " " + sname + "\n " + car + "]";
	}
	

}
