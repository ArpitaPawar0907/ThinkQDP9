package com.methodoverloading;

class MyRoom
{
	//does not differentiate between return type
	int calArea(int length)
	{
		
		return (length*length);
	}
//	void calArea(int length)
//	{
//		System.out.println("Area:"+length*length);
//	}
	void calArea(int length,int breath)
	{
		System.out.println("Area:"+length*breath);
	}
	
	void calVol(int length)
	{
		System.out.println("Volume"+length*length*length);
	}
	void calVol(int length,int breath,int height)
	{
		System.out.println("Volume :"+length*breath*height);
	}
	
}



public class Hotel {

	public static void main(String[] args) {
		MyRoom r1=new MyRoom();
		System.out.println("Area:"+r1.calArea(2));
		r1.calArea(3, 4);
		r1.calVol(4);
		r1.calVol(3,4, 5);

	}

}
