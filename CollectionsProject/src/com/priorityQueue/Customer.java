package com.priorityQueue;

public class Customer {

	private int id;
	private int category;
	private String name;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, int category, String name) {
		this.id = id;
		this.category = category;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", category=" + category + ", name=" + name + "]";
	}
	
}
