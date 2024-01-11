package com.interfacedemo;

interface Calculate {
	void area();

	default void volume() {
		System.out.println("In volume method");
		show();
	}

	static void info() {
		System.out.println("Geometry");
		showMe();
	}
	
	private void show()
	{
		System.out.println("Made by :Arpita");
	}
	private static void showMe()
	{
		System.out.println("pan no:FDDSKOCD99");
	}

}

class Square implements Calculate {
	double side;

	public Square() {

	}

	public Square(double side) {
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of square: " + (side * side));

	}

}

class Cube implements Calculate {
	double side;

	public Cube() {
		side = 20;
	}

	public Cube(double side) {
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of cube :" + (6 * side * side));

	}

	public void volume() {
		System.out.println("Volume of cube :" + (side * side));
	}

}

public class InterfaceAdvance {

	public static void main(String[] args) {

		Calculate c;
		Calculate.info();

		c = new Square(23);
		c.area();
		c.volume();

		c = new Cube(30);
		c.area();
		c.volume();

	}

}
