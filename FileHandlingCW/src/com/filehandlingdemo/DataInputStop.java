package com.filehandlingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;



public class DataInputStop {

	public void enterDate(File f)
	{
		try
		{
		   if(!f.exists())
		   {
			   f.createNewFile();
		   }
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   FileWriter fw=new FileWriter(f, true);
		   System.out.println("Enter Stop to stop");
		   String data="";
		   while(true)
		   {
			  data=br.readLine();
			  if(data.equalsIgnoreCase("stop"))
				  break;
			  
			  fw.write(data);
			  fw.write("\n");
		   }
		  br.close();
		  fw.close();
		   
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}
	public static void main(String[] args) {

		DataInputStop d1=new DataInputStop();
		
		File f1=new File("F:\\Java\\FileDemo\\DataStopDemo.txt");
        
		d1.enterDate(f1);
		
	}

}
