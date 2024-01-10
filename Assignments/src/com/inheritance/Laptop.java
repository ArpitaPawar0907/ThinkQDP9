package com.inheritance;

public class Laptop {
	private int noOfProcessor;
	private int speedOfProcessor;
	Laptop()
	{
		
	}
	public Laptop(int noOfProcessor, int speedOfProcessor) 
	{
		this.noOfProcessor = noOfProcessor;
		this.speedOfProcessor = speedOfProcessor;
	}
	public int getNoOfProcessor() {
		return noOfProcessor;
	}
	public void setNoOfProcessor(int noOfProcessor) {
		this.noOfProcessor = noOfProcessor;
	}
	public int getSpeedOfProcessor() {
		return speedOfProcessor;
	}
	public void setSpeedOfProcessor(int speedOfProcessor) {
		this.speedOfProcessor = speedOfProcessor;
	}
	
	public String toString() {
		return "Laptop noOfProcessor=" + noOfProcessor + ", speedOfProcessor=" + speedOfProcessor ;
	}
	
	
   public static void main(String[] args) {
	
	   Laptop l1=new Laptop(4,4);
	   Laptop l2=new Laptop(3,5);
	   System.out.println(l1);
	   System.out.println(l2);
	   l1.setNoOfProcessor(5);
	   System.out.println(l1);
	   
	   
			   
			   
			   
			   
}
}
