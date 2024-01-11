package com.staticDemo;

public class Car {
	 int id;
	 String modelName;
	 static int noOfCar=0;
	 {
		 noOfCar++;
	 }
	 Car()
	 {
		 
	 }
	 Car(int id,String modelName)
	 {
		 this.id=id;
		 this.modelName=modelName;
	 }
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 public int getId()
	 {
		 return id;
	 }
	 public void setModelName(String modelName)
	 {
		 this.modelName=modelName;
	 }
	 public String getModelName()
	 {
		 return modelName;
	 }
	 public void setNoOfCar(int noOfCar)
	 {
		 Car.noOfCar=noOfCar;
	 }
	 public int getNoOfCar()
	 {
		 return noOfCar;
	 }
	 
	 
	 public String toString()
	 {
		 return "Id: "+id+" Name: "+modelName;
	 }
     public static void main(String[] args) {
		
    	 Car c1=new Car();
    	 Car c2=new Car();
    	 Car c3=new Car(12,"BMW");
    	 
    	 
    	 System.out.println("No of cars: "+Car.noOfCar);
	}
}
