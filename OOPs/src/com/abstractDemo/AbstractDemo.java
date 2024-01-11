package com.abstractDemo;
abstract class Bike
{
	private int id;
	private String name;
	private double cost;
	static String brand;
	static double discount;
	static
	{
		brand="Honda";
	}
	Bike()
	{
		
	}
	public Bike(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	static double giveDiscount(double dis)
	{
		Bike.discount=dis;
		return discount;
	}
	
	abstract void description();
	
	final void display()
	{
		System.out.println("Brand name:"+brand);
		System.out.println("Discount on all bikes "+discount+"%");
		System.out.println("------------------------------------");
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Cost:"+cost);
		
	}
	
	
}
class SportsBike extends Bike
{

	int gears;
	double maxSpeed;
	public SportsBike() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	public SportsBike(int id, String name, double cost, int gears,double maxSpeed) {
		super(id, name, cost);
		this.gears = gears;
		this.maxSpeed=maxSpeed;
	}

	
	public int getGears() {
		return gears;
	}


	public void setGears(int gears) {
		this.gears = gears;
	}


	public double getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	@Override
	void description() {
		System.out.println("Sports Bike");
		System.out.println("no of gears:"+gears);
		System.out.println("Max Speed:"+maxSpeed);
		
	}
	
}
class BasicBike extends Bike
{
     double avg;
     
	public BasicBike() {
		super();
		
	}
	
	public BasicBike(int id, String name, double cost, double avg) {
		super(id, name, cost);
		this.avg = avg;
	}
     



	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
    
	@Override
	void description() {
		System.out.println("no of gears :4");
		System.out.println("Average speed:"+avg);
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		//Bike b1=new Bike();
		
		SportsBike s1=new SportsBike(120,"CRV0", 78000, 6,300);
		
		s1.display();
		s1.description();
		System.out.println("--------------------------------------------");
		BasicBike b1=new BasicBike(123, "Shine", 40000, 17);
		
		b1.display();
		b1.description();
		
		Bike b;
		b=new SportsBike(121,"KTM",56000,5,280);
		b.display();
		b.description();
		

	}

}
