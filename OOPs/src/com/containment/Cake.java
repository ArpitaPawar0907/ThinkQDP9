package com.containment;

public class Cake {
	 private String flavor;
	 private float price;
	 
	 Cake()
	 {
		 
	 }
	 Cake(String flavor,float price)
	 {
		 this.flavor=flavor;
		 this.price=price;
	 }
	 
	 public void setFlavor(String flavor)
	 {
		 this.flavor=flavor;
	 }
	 public String getFlavor()
	 {
		 return flavor;
	 }
	 public void setPrice(float price)
	 {
		 this.price=price;
		 
	 }
	 public float getPrice()
	 {
		 return price;
	 }
	 public String toString()
	 {
		 return "[ Cake "+flavor+"  "+price+" ";
		 
	 }

}
