package com.app.prog;


public class WebApplication extends Application{
	private String appName;
	//private float space;
	public WebApplication() {
		super();
	
	}
	
	public WebApplication(String version, String technology, Developer developer, String appName) {
		super(version, technology, developer);
		this.appName = appName;
	
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}


	@Override
	public String toString() {
		return " Web[appName=" + appName +" "+super.toString();
	}
	
	
	

}
