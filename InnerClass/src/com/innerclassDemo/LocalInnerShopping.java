package com.innerclassDemo;

class Mall
{
	static String name="Pacefic";
	String city="Pune";
	void doShopping()
	{
		class Cart
		{
			String item;
			double price;
			 double bill=0;
		 void addItem(String item,double price)
		 {
			 this.item=item;
			 this.price=price;
			 System.out.println(this.item+": "+this.price);
			 bill+=price;
		 }
		 void displayBill()
		 {
			 
			 System.out.println("Total Bill: "+bill);
			 System.out.println("Thank you for shopping at "+name+"  "+city);
		 }
			
			
		}
		Cart c1=new Cart();
		c1.addItem("Laptop",45000);
		c1.addItem("Chocolate",50);
		c1.addItem("Juice", 345);
		System.out.println("------------------------------");
		c1.displayBill();
	}
}
public class LocalInnerShopping {

	public static void main(String[] args) {
		
		Mall cust1=new Mall();
		cust1.doShopping();

	}

}
