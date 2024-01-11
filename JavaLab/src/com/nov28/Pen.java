package com.nov28;

public class Pen {
	
	private Refill refill;
	private float capLenght;
	private String brand;
	Pen()
	{
		
	}
	public Pen(Refill refill, float capLenght, String brand) {
		super();
		this.refill = refill;
		this.capLenght = capLenght;
		this.brand = brand;
	}
	public Refill getRefill() {
		return refill;
	}
	public void setRefill(Refill refill) {
		this.refill = refill;
	}
	public float getCapLenght() {
		return capLenght;
	}
	public void setCapLenght(float capLenght) {
		this.capLenght = capLenght;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Pen  capLenght=" + capLenght + ", brand=" + brand + "refill=" + refill;
	}
	

}
