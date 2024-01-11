package com.inheritance;

class Vehicle
{
	private int id;
	private String model;
	private double price;
	public Vehicle() {
		
	}
	public Vehicle(int id, String model, double price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle id=" + id + ", model=" + model + ", price=" + price ;
	}
	
	
}
class Car extends Vehicle
{
	private String etype;
	private int noOfGear;
	public Car() {
		
	}
	
	public Car(int id, String model, double price,String etype, int noOfGear) {
		super(id, model, price);
		this.etype = etype;
		this.noOfGear = noOfGear;
	
	
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public int getNoOfGear() {
		return noOfGear;
	}
	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}
	@Override
	public String toString() {
		return super.toString()+"\nCar etype=" + etype + ", noOfGear=" + noOfGear ;
	}
	
	
	
}
class RacingCar extends Car{
	
	private int maxSpeed;
	private int milage;
	public RacingCar()
	{
		
	}
	
	public RacingCar(int id, String model, double price,String etype, int noOfGear,int maxSpeed, int milage) {
		super(id, model, price,etype, noOfGear);
		this.maxSpeed = maxSpeed;
		this.milage = milage;
	
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return super.toString()+"\nRacingCar maxSpeed=" + maxSpeed + ", milage=" + milage ;
	}
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Car c1=new Car(12, "BMW",3400000, "Petrol", 4);
		System.out.println(c1);
		System.out.println("---------------------------");
		RacingCar rc=new RacingCar(101,"Ferrari", 4000000,"Disel", 4,200, 30);
		System.out.println(rc);
		System.out.println("---------------------------");
		RacingCar r1=new RacingCar();
		
		r1.setId(102);
		r1.setMaxSpeed(230);
		r1.setNoOfGear(5);
		System.out.println(r1);

	}

}
