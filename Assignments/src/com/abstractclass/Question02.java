package com.abstractclass;

abstract class Machine1 {
	int id;
	String brand;

	Machine1() {

	}

	Machine1(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}

	public void rotate() {
		System.out.println("Machine1 id:" + id);
		System.out.println("Brand :" + brand);

	}

	public abstract void crush();

}

abstract class Mixer extends Machine1 {
	String name;
	String model;
    int speed;
	public Mixer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mixer(int id, String brand, String name, String model,int speed)
	{
		super(id, brand);
		this.name = name;
		this.model = model;
		this.speed=speed;
	}

	public void crush() {
		System.out.println("Name:"+name);
		System.out.println("Model:"+name);

	}
	public void blend()
	{
		System.out.println("Blender speed"+speed);
	}
}

class MyJuicer extends Machine1 {
	String name;
	String model;

	public MyJuicer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyJuicer(int id, String brand, String name, String model) {
		super(id, brand);
		this.name = name;
		this.model = model;
	}

	@Override
	public void crush() {
		System.out.println("Name:" + name);
		System.out.println("Crusher");
	}

	public void filter() {
		System.out.println("MyJuicer filter");
	}
}
class MixerTest extends Mixer
{

	public MixerTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MixerTest(int id, String brand, String name, String model, int speed) {
		super(id, brand, name, model, speed);
		// TODO Auto-generated constructor stub
	}
	
}
public class Question02 {
	public static void main(String[] args) {
   
		 Machine1 m1;
		
	    m1 = new MyJuicer(12, "IKON", "MyJuicer", "ik342");
		m1.crush();
		
	     Mixer mixer;
	     mixer=new MixerTest(11, "Sujata", "Mixer" ,"Mxs232", 45);
	     mixer.blend();
	     
	     
		

	}
}
