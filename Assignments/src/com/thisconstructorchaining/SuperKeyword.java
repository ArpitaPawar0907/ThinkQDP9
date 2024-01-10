package com.thisconstructorchaining;


class Furniture {
	int len,wid;
	Furniture()
	{
		
	}
	
	public Furniture(int len, int wid)
	{
		
		this.len = len;
		this.wid = wid;
	}
    
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	
	
	public String toString() {
		return "Furniture len:" + len + ", wid:" + wid ;
	}

}
class Chair extends Furniture{
	int height;
	Chair()
	{
		
	}
	
	public Chair(int len, int wid, int height) 
	{
		super(len, wid);//invoke parent class constructor
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
     void display()
     {
    	 System.out.println("Parent class variable:"+super.len);
     }
	@Override
	public String toString() {
		return super.toString()+" Chair height:" + height;//invoke parent class method
	}
	

}

public class SuperKeyword {

	public static void main(String[] args) {
		
        Chair c1=new Chair(10,12,10);
        Chair c2=new Chair(8,10,8);
        
        System.out.println(c1);
        System.out.println(c2);
        c1.display();
	}

}
