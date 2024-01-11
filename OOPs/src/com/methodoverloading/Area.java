package com.methodoverloading;

class Shape{
	
	void calArea(int side)
	{
		System.out.println("Area of square:"+(side*side));
	}

	void calArea(float radius)
	{
		System.out.println("Area of circle:"+(3.14*radius*radius));
	}

	void calArea(int length,int breath)
	{
		System.out.println("Area of rectangle:"+(length*breath));
	}
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape circle=new Shape();
		Shape square=new Shape();
		Shape rect=new Shape();
		
		
		circle.calArea(5.8f);
		square.calArea(6);
		rect.calArea(5, 6);
	}

}
