package com.inheritance;

class Shape {
	double s1,s2;
	Shape()
	{
		
	}
	Shape(double s1,double s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	public double getS1() {
		return s1;
	}
	public void setS1(double s1) {
		this.s1 = s1;
	}
	public double getS2() {
		return s2;
	}
	public void setS2(double s2) {
		this.s2 = s2;
	}
	
	public String toString() {
		return "Shape s1=" + s1 + ", s2=" + s2 ;
	}
	
	
}
class Rectangle extends Shape{
	//double ans;
	Rectangle()
	{
		
	}
	Rectangle(double s1,double s2)
	{
		super(s1,s2);
		
	}
	public String toString()
	{
		return super.toString()+" Area of Rectangle : "+s1*s2;
	}

}

public class SingleInheritance2 {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle(2.4,4.3);
		
	       System.out.println(r1);

	}

}
