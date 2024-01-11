package com.loosecoupling;

interface MessageS
{
	void sendMessge(String msg);
	default void messageStatus(String st)
	{
		System.out.println(st);
	}
}

class Whatsapp implements MessageS
{

	String rname;
	public Whatsapp(String rname) {
		this.rname=rname;
	}
	
	@Override
	public void sendMessge(String msg) {
		System.out.println("WhatsApp:"+msg);
		
	}
	public void status()
	{
		System.out.println("Seen");
	}
	
}
class FaceBook implements MessageS
{

	@Override
	public void sendMessge(String msg) {
		System.out.println("FaceBook:"+msg);
		
	}
	
}
public class TightCoupling {

	public void seenmesg(Whatsapp w,String msg)
	{
	    w.sendMessge(msg);	
	}
	public void seenMsg(MessageS s,String msg)
	{
		s.sendMessge(msg);
		s.messageStatus("Send");
	}
	public static void main(String[] args) {
		
		TightCoupling t1=new TightCoupling();
		
		Whatsapp w1=new Whatsapp("Sonali");
		t1.seenmesg(w1, "Welcome");
		
		FaceBook f1=new FaceBook();
		
		
		MessageS s1;
		s1=new Whatsapp("Arpita");
		t1.seenMsg(s1, "Welcome");
		
		s1=new FaceBook();
		t1.seenMsg(s1, "Hello");
		
		
		
	

	}

}
