package com.methodoverloading;

class Room
{
	public void room(int side)
	{
		System.out.println("Room is square "+(side*side));
	}
	void room(int length,int breath)
	{
		System.out.println("Room is rectangular:"+(length*breath));
		
	}
	
	void roomVolume(int side)
	{
		System.out.println("Volume of room:"+(side*side*side));
	}
	void roomVolume(int length,int breath,int height)
	{
		System.out.println("Volume of rectangular room"+(length*breath*height));
	}


}
public class AreaRoom {
	
	Room r1=new Room();
	Room r2=new Room();
	
	
	
	
	
	}
