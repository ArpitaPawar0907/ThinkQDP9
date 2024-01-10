package com.inheritance;

class Fruit{
	String color;
	Fruit()
	{
		
	}
	Fruit(String color)
	{
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Fruit color=" + color ;
	}
	
}
class Apple extends Fruit
{
	String taste;
	String name;
	Apple()
	{
		
	}
	Apple(String color,String taste,String name)
	{
		super(color);
		this.name=name;
		this.taste=taste;
	}
	
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Apple taste=" + taste + ", name=" + name ;
	}
	
}

public class SingleInheritance3 {

	public static void main(String[] args) {
		Apple a1=new Apple("Red","Sweet","Apple");
	
		System.out.println(a1);


	}

}
