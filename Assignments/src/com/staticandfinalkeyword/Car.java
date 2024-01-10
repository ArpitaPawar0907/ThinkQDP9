package com.staticandfinalkeyword;

public class Car {
	private String model;
	private static int totalCarSold;
	Car()
	{
		
	}
	Car(String model,int totalCarSold)
	{
		this.model=model;
		this.totalCarSold=totalCarSold;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public int getTotalCarSold()
	{
		return totalCarSold;
	}
	public void setTotalCarSold(int totalCarSold) 
	{
		this.totalCarSold = totalCarSold;
	}

	public String toString() {
		return "model:" + model + " totalCarSold:" + totalCarSold ;
	}
	
	

}
