package com.interfacedemo;

interface Moveable
{
	void move();
}
interface Displayable extends Moveable
{
	void printMe(String msg);
}
class Car implements Displayable
{

	@Override
	public void move() {
		System.out.println("Car moves at speed 50 km/hour");
		
	}

	@Override
	public void printMe(String msg) {
		System.out.println("Brand:"+msg);
		
	}
	
}

class Bike implements Moveable
{

	@Override
	public void move() {
		System.out.println("Bike moves at speed 60km/hour");
		
	}
	
}

public class ExtendsInterface {

	public static void main(String[] args) {
	
		Displayable d;
		d=new Car();
		d.move();
		d.printMe("BMW200series");
		
		
		
		Moveable m;
		m=new Car();
		m.move();
		
		m=new Bike();
		m.move();

	}

}
