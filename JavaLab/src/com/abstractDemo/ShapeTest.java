package com.abstractDemo;

abstract class Shape{
	
	protected String name;
	public Shape()
	{
		
	}
	public Shape(String name)
	{
		this.name=name;
	}
	
	abstract void calArea();
	abstract void calCir();
	
}

class Circle extends Shape
{
     float radius;
     Circle()
     {
    	 super();
     }
     public Circle(String name,float radius)
     {
    	 super(name);
    	 this.radius=radius;
     }
	@Override
	void calArea() {
		
		System.out.println("Area of circle:"+(3.14*radius*radius));
		
	}

	@Override
	void calCir() {
		System.out.println("Circumfence of circle:"+(2*3.14*radius));
		
	}
	
}
class Rectangle extends Shape
{
      float lenght;
      float breath;
      
     public  Rectangle()
      {
    	  super();
      }
      public Rectangle(String name,float lenght,float breath)
      {
    	  super(name);
    	  this.lenght=lenght;
    	  this.breath=breath;
      }
	  
      
	@Override
	void calArea() {
		
		System.out.println("Area of Rectangle :"+(lenght*breath));
		
	}

	@Override
	void calCir() {
		
		System.out.println("Circumfernce:"+(2*(lenght+breath)));
		
	}
	
}
class Square extends Shape
{
	float side;
	Square()
	{
		
	}
	Square(String name,float side)
	{
		super(name);
		this.side=side;
	}
	
	

	@Override
	void calArea() {
		System.out.println("Area of Square:"+(side*side));
		
	}

	@Override
	void calCir() {
		System.out.println("Circumferece of "+(4*side));
		
	}
	void suqaremethod()
	{
		System.out.println("method");
	}
	
}
public class ShapeTest {
	public static void main(String[] args) {
	
		Circle c1=new Circle("Circle", 3.4f);
		Rectangle r1=new Rectangle("Rectangle", 5.5f, 6.7f);
		Square s1=new Square("Square", 4f);
		Circle c2=new Circle();
		c1.calArea();
		c1.calCir();
		
		
		
	}
	
     
	
	

}
