package com.pojo;

public class Movie {
	
	private int id;
	private String mname;
	private float rating;
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie(int id, String mname, float rating) {
		this.id = id;
		this.mname = mname;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", mname=" + mname + ", rating=" + rating + "]";
	}
	
	

}
