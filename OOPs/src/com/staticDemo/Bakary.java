package com.staticDemo;

public class Bakary {

	private String flavor;
	private int price;
	
	private static int noOfCake=0;
	private static double totalAmount=0;
	{
		noOfCake++;
		
	}
	
	Bakary()
	{
		
	}
	
	public void setFlavor(String flavor)
	{
		this.flavor=flavor;
	}
	public String getFlavor()
	{
		return flavor;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public static void setNoOfCake(int noOfCakes)
	{
		Bakary.noOfCake=noOfCakes;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
