package com.filehandlingdemo;

import java.io.File;

public class DeleteFile {

	public void deleteFile(File f)
	{
		if(f.exists())
		{
		   if(f.delete())
		   {
			   System.out.println("File deleted");
		   }
		   else
		   {
			   System.out.println("error");
		   }
		}
		else
		{
			System.out.println("no such file");
		}
	}
	public static void main(String[] args) {
		
		DeleteFile d1=new DeleteFile();
		
		File f1=new File("F:\\Java\\FileDemo\\Arpita.txt");

		d1.deleteFile(f1);
	}

}
