package com.nov28;

public class Nib {
     private String mtype;
     private float width;
     
     Nib()
     {
    	 
     }
     Nib(String mtype,float width)
     {
    	 this.mtype=mtype;
    	 this.width=width;
     }
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Nib mtype=" + mtype + ", width=" + width ;
	}
     
}
