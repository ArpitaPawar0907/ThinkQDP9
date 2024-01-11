package com.lamdaDemo;
interface Movable
{
	void move();
}

class Vehicle implements Movable
{

	@Override
	public void move() {
		System.out.println("Object is moving");
		
	}
	
}

public class InterFaceExample implements Movable {

	public static void main(String[] args) {
	
		Movable car = new InterFaceExample();
		car.move();
		
		Movable bike=new InterFaceExample();
		bike.move();
		
			
			
	}

	@Override
	public void move() {
		
		System.out.println("Object is moving");
		
	}

}
