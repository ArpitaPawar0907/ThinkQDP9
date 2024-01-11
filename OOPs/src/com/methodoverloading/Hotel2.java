package com.methodoverloading;

class MyRoom2
{
	int lenght;
	int breath;
	int height;
	
	MyRoom2()
	{
		lenght=breath=height=0;
	}
	MyRoom2(int lenght)
	{
		this.lenght=lenght;
		this.breath=lenght;
		this.height=lenght;
	}
	MyRoom2(int length,int breath,int height)
	{
		this.lenght=lenght;
		this.breath=breath;
		this.height=height;
	
	}
	
	void calArea()
	{
		System.out.println("Area"+lenght*breath);
	}
	void calVol()
	{
		System.out.println("Volume:"+lenght*breath*height);
	}
		
}



public class Hotel2 {

	public static void main(String[] args) {
		MyRoom2 r1=new MyRoom2(2);
		MyRoom2 r2=new MyRoom2(2,4,3);
	
		r1.calArea();
		r1.calVol();

		r2.calArea();
		r2.calVol();
	
			}

}
