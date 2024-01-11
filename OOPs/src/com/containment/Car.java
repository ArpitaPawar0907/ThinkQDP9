package com.containment;

public class Car {
	
	private int carId;
	private String carModel;
	private Driver  driver;
	Car()
	{
		
	}
	public Car(int carId, String carModel, Driver driver) 
	{
		this.carId = carId;
		this.carModel = carModel;
		this.driver = driver;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public String toString() {
		return "Car " + carId + " " + carModel + "\n " + driver;
	}
	
	

}
