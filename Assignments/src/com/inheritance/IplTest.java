package com.inheritance;

class Ipl{
	
	void play()
	{
		System.out.println("Player plays ipl ");
	}
}
class Csk extends Ipl
{
	String playerName;
	Csk()
	{
		
	}
	Csk(String playerName)
	{
		this.playerName=playerName;
	}
	void play()
	{
		System.out.println(playerName+"Playes in csk ");
	}
}
class Rcb extends Ipl
{
	String playerName;
	Rcb()
	{
		
	}
	Rcb(String playerName)
	{
		this.playerName=playerName;
	}
	void play()
	{
		System.out.println(playerName+"Playes in rcb ");
	}
}
public class IplTest {

	public static void main(String[] args) {
		
		Csk c1=new Csk("Dhoni");
        Rcb r1=new Rcb("Kohli");
        
        c1.play();
        r1.play();
	}

}
