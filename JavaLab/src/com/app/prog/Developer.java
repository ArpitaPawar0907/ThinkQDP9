package com.app.prog;

public class Developer {
	private String devName;
	private float exp;
	private String skill;
	
	
	public Developer() {
	}
	
	public Developer(String devName, float exp, String skill) {
		super();
		this.devName = devName;
		this.exp = exp;
		this.skill = skill;
	}

	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void debugApp()
	{
		System.out.println("Devloper debugs app");
	}
	
	public void intergradeApp()
	{
		System.out.println("Intergrade app");
	}
	@Override
	public String toString() {
		return "Developer [devName=" + devName + ", exp=" + exp + ", skill=" + skill + "]";
	}
	
	

}
