package com.inheritance;

class GrandFather {
	String name;
	GrandFather()
	{
		
	}
	GrandFather(String name)
	{
		this.name=name;
	}
    public void display() {
        System.out.println("GrandFather Name  "+name);
    }
}
class Father  extends GrandFather{
	String pname;
	Father()
	{
		
	}
	Father(String name,String pname)
	{
	  super(name);
	  this.pname=pname;
	}
    public void display() {
    	super.display();
        System.out.println("Parent Name "+pname);
    }
}
 
class Son extends Father {
	String sname;
	Son()
	{
		
	}
	Son(String name,String pname,String sname)
	{
		super(name,pname);
		this.sname=sname;
	
	}
    public void display() {
    	super.display();
        System.out.println("Son name "+sname);
    }
}

public class Multilevel3 {

	public static void main(String[] args) {
		

		Son s1=new Son("Shahaji","Shivaji","Sambhaji");
		
		System.out.println(s1);


	}

}
