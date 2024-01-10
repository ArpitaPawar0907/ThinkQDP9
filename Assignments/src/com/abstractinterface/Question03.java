package com.abstractinterface;
class Closet
{
	int id;
	String material;
	float price;
	public Closet() {
		// TODO Auto-generated constructor stub
	}
	public Closet(int id, String material, float price) {
		this.id = id;
		this.material = material;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Closet [id=" + id + ", material=" + material + ", price=" + price + "]";
	}
	
}
public class Question03 {

	public static void main(String[] args) {
	
		Closet c1=new Closet(12, "Wood", 34000);
		Closet c2=new Closet(43, "Still", 5000);
		Closet c3=new Closet(32, "Copper", 4400);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
