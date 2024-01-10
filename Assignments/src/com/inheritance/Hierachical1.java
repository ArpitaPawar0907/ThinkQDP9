package com.inheritance;
class Shape1 {
	double s1,s2;
	Shape1()
	{
		
	}
	Shape1(double s1)
	{
		this.s1=s1;
	}
	Shape1(double s1,double s2)
	{
		this.s1=s1;
		this.s2=s2;
	}

}
class Rectangle1 extends Shape1{
	//double ans;
	Rectangle1()
	{
		
	}
	Rectangle1(double s1,double s2)
	{
		super(s1,s2);
		
	}
	
    public void draw()
    {
    	System.out.println("Rectangle Area ="+s1*s2);
    }
}
class Square extends Shape1 {
	Square()
	{
		
	}
	Square(double s1)
	{
		super(s1);
	}
	 public void draw()
	    {
	    	System.out.println("Square Area ="+s1*4);
	    }

}
class Circle extends Shape1{
	Circle(double s1)
	{
		super(s1);
	}
	 public void draw()
	    {
	    	System.out.println("Circle Area ="+s1*s1*3.14f);
	    }
}

public class Hierachical1 {

	public static void main(String[] args) {
		
		Rectangle1 r1=new Rectangle1(2,3);
		Circle c1=new Circle(2);
		Square s1=new Square(4);
       r1.draw();
       c1.draw();
       s1.draw();

	}

}
