package com.app.mob;

import com.app.prog.Application;
import com.app.prog.Developer;

public class MobileApplication extends Application {
	
	private String name;
	private float space;
	
	public MobileApplication() {
		super();
	}
	public MobileApplication(String version,String technology,Developer developer,String name,float space)
	{
		super(version,technology,developer);
		this.name=name;
		this.space=space;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSpace() {
		return space;
	}
	public void setSpace(float space) {
		this.space = space;
	}
	public String toString()
	{
		return " MobileApplication name="+name+" ,space="+space+" "+super.toString();
	}
}
