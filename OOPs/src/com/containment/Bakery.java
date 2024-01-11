package com.containment;

public class Bakery {
	
	private String bname;
	private Cake cake;
	private static int noOfCakes=0;
	private static double earning=0.0;
	Bakery()
	{
		
	}
	Bakery(String bname)
	{
		this.bname=bname;
	}
	
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public String getBname()
	{
		return bname;
	}
	public void setCake(Cake cake)
	{
		this.cake=cake;
		noOfCakes++;
	}
	private void setNoOfCakes(int noOfCakes)
	{
		Bakery.noOfCakes=noOfCakes;
	}
	private int getNoOfCakes()
	{
		return noOfCakes;
	}
	private void setEarning(double earning)
	{
		Bakery.earning=earning;
		earning+=cake.getPrice();
	}
	public double getEarning()
	{
		return earning;
	}
	
	
    public static void main(String[] args) {
		
    	Bakery b1=new Bakery("Cake Confection");
    	
    	Cake c1=new Cake("Vanilla",250);
    	Cake c2=new Cake("Butterschoch",200);
    	Cake c3=new Cake("pineapple",300);
    	
    	b1.setCake(c1);
    	b1.setCake(c3);
    	b1.setCake(c1);
    	b1.setCake(c2);
    	
    	System.out.println(b1.getBname());
    	System.out.println("------------------------");
    	System.out.println("No of cake: "+Bakery.noOfCakes);
    	System.out.println("Earning"+Bakery.earning);
    	
    	
    	
    	
	}
}
