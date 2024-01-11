package com.dec28;

public class Department {
	
	private int deptid;
	private String dname;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int deptid, String dname) {
		this.deptid = deptid;
		this.dname = dname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDid(int did) {
		this.deptid = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department " + deptid + " " + dname ;
	}
	

}
