package com.containtment;

public class Address {
	private int roomNo;
	private String city;
	private long pincode;
	
	Address()
	{
		
	}
	Address(int roomNo,String city,long pincode)
	{
		this.roomNo=roomNo;
		this.city=city;
		this.pincode=pincode;
	}
	
	public void setRoomNo(int roomNo)
	{
		this.roomNo=roomNo;
	}
	public int getRoomNo()
	{
		return roomNo;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setPincode(long pincode)
	{
		this.pincode=pincode;
	}
	public long getPincode()
	{
		return pincode;
	}
	
	public String toString()
	{
		return " Room no"+roomNo+" ,"+ city+ " ,"+pincode;
	}
	
	
	

}
