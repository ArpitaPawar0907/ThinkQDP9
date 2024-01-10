package com.methodoverriding;
class Bike{
	String color;
	float speed;
	Bike()
	{
		
	}
	Bike(String color,float speed)
	{
		this.color=color;
		this.speed=speed;
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public void bikeInfo()
	{
		System.out.println("Color of bike"+color+"Speed is "+speed);
	}
	
	
}
class Pulsur extends Bike{
	int id;
	Pulsur(String color,float speed,int id)
	{
		super(color,speed);
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void bikeInfo()
	{
		System.out.println("Color of bike "+color+"  Speed is "+speed+" Bike id "+id);
	}
	
}
public class BikeTest {

	public static void main(String[] args) {
	
		Pulsur p1=new Pulsur("Black",27.8f,23);
		p1.bikeInfo();

	}

}
