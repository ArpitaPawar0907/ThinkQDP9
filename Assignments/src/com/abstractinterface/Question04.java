package com.abstractinterface;
class Locker
{
	private double money;
	private String jewellary;
	private long pin;
	public Locker() {
		// TODO Auto-generated constructor stub
	}
	public Locker(double money, String jewellary, long pin) {
		this.money = money;
		this.jewellary = jewellary;
		this.pin = pin;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getJewellary() {
		return jewellary;
	}
	public void setJewellary(String jewellary) {
		this.jewellary = jewellary;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Locker [money=" + money + ", jewellary=" + jewellary + ", pin=" + pin + "]";
	}
	
}
public class Question04 {

	public static void main(String[] args) {
		
		Locker l1=new Locker(34200,"necklases",9797);
		
		System.out.println(l1);

	}

}
