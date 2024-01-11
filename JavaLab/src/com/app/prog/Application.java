package com.app.prog;

public class Application {
	protected String version;
	protected String technology;
	protected Developer developer;
	public Application() {
	
	}
	public Application(String version, String technology, Developer developer) {
		super();
		this.version = version;
		this.technology = technology;
		this.developer = developer;
	}
	public void install()
	{
		System.out.println("Application has been installed");
	}
	public void uninstall()
	{
		System.out.println("Application has been uninstalled");
	}
	@Override
	public String toString() {
		return "Application [version=" + version + ", technology=" + technology + ", developer=" + developer + "]";
	}
	
	
	

}
