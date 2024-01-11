package com.inhritance;

class Mobile{
	  private String brand;

    Mobile() 
	{
		
	}

	Mobile(String brand)
	{
	
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "Mobile brand=" + brand ;
	}
	  
}


class AndroidMobile extends Mobile
{
	private int id;
	private String name;
    AndroidMobile()
    {
	
	}
	
	AndroidMobile(String brand, int id, String name) 
	{
		super(brand);
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return super.toString()+"AndroidMobile id=" + id + ", name=" + name;
	}
	
}

class IOSMobile extends Mobile
{
	private int id;
	private String name;
	IOSMobile()
    {
	
	}
	
	IOSMobile(String brand, int id, String name) 
	{
		super(brand);
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return super.toString()+"AndroidMobile id=" + id + ", name=" + name;
	}
	
}
class WindowasMobile extends Mobile
{
	private int id;
	private String name;
	WindowasMobile()
    {
	
	}
	
	WindowasMobile(String brand, int id, String name) 
	{
		super(brand);
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return super.toString()+"  WindowasMobile id=" + id + ", name=" + name;
	}
	
}



public class MobileTest {

	public static void main(String[] args) {
		
		AndroidMobile a1=new AndroidMobile("SamSung", 123, "Galaxy");
		IOSMobile i1=new IOSMobile("Apple",234,"mac");
		WindowasMobile w1=new WindowasMobile("HP",56,"web");
		
		System.out.println(a1);
		System.out.println(i1);
		System.out.println(w1);
		

	}

}
