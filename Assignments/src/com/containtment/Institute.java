package com.containtment;

public class Institute {
	
	private int instId;
	private String instName;
	private Branch branch;
	
	Institute()
	{
		
	}

	Institute(int instId, String instName, Branch branch) 
	{
		this.instId = instId;
		this.instName = instName;
		this.branch = branch;
	}

	
	public String toString() {
		return "[Institute" + instId + " " + instName + " \n" + branch + "]";
	}

	public int getInstId() {
		return instId;
	}

	public void setInstId(int instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	

}
