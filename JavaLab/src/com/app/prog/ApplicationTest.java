package com.app.prog;

import com.app.mob.MobileApplication;

public class ApplicationTest {

	public static void main(String[] args) {
		
	
       Developer d1=new Developer("ABCD", 2.3f, "Technical");
       
      // Application a1=new Application();
       
       DestktopApplication da=new DestktopApplication("jdk13", "java", d1, "Eclipse", 345.5f);
       
       WebApplication wa=new WebApplication("web120", "html", d1, "firefox");
       
       MobileApplication m1=new MobileApplication("version 2.23.4","android",d1,"Whatsapp",2.63f);
		
      
       da.install();
       da.uninstall();
       da.developer.debugApp();
       da.developer.intergradeApp();
       System.out.println(da);
       System.out.println(wa);
       System.out.println(m1);
	}

}
