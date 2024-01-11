package com.app.prog;

public class DestktopApplication extends Application{
	private String appName;
	private float space;
	public DestktopApplication() {
		super();
	
	}
	
	public DestktopApplication(String version, String technology, Developer developer, String appName, float space) {
		super(version, technology, developer);
		this.appName = appName;
		this.space = space;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public float getSpace() {
		return space;
	}

	public void setSpace(float space) {
		this.space = space;
	}

	@Override
	public String toString() {
		return " DestktopApplication appName=" + appName + ", space=" + space +" "+super.toString();
	}
	
	
	

}
