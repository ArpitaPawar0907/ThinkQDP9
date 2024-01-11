package com.nov28;

public class Refill {
	private String inkColor;
	private float lenght;
	private Nib nib;

	Refill()
	{
		
	}
	Refill(String inkColor)
	{
		
	}
	
	public void setInkColor(String inkColor)
	{
		this.inkColor=inkColor;
	}
	public String getInkColor()
	{
		return inkColor;
		
	}
	public float getLenght() {
		return lenght;
	}
	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	public Nib getNib() {
		return nib;
	}
	public void setNib(Nib nib) {
		this.nib = nib;
	}
	@Override
	public String toString() {
		return "Refill inkColor=" + inkColor + ", lenght=" + lenght + ", nib=" + nib;
	}
    
}
