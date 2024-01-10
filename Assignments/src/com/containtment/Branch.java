package com.containtment;

public class Branch {
	private int branchId;
	private String branchName;
	private Subject subject;
	Branch()
	{
		
	}
	public Branch(int branchId, String branchName, Subject subject)
	{
		this.branchId = branchId;
		this.branchName = branchName;
		this.subject = subject;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return "Branch-" + branchId + " " + branchName + "\n " + subject ;
	}
	

}
