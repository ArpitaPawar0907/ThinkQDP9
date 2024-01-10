package com.inheritance;

class Year
{
	float year;
	Year()
	{
		
	}
	Year(float year)
	{
		this.year=year;
	}
	public void display()
	{
		System.out.println(year+"Year");
	}
}
class Month extends Year{
	float m;
	Month()
	{
		
	}
	Month(float year)
	{
		super(year);
		m=year%12;
		
	}
	public void display()
	{ 
		super.display();
		System.out.println(m+"months");
	}
}
class Day extends Month{
	float day;
	Day()
	{
		
	}
	Day(float m)
	{
		super(m);
		day=m%7;
	}
	public void display()
	{    super.display();
		System.out.println(day+"days");
	}
}

public class Multilevel2 {

	public static void main(String[] args) {
		
		Day d1=new Day(4f);
	    d1.display();


	}

}
