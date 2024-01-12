package com.serilizalbledemo;

import java.io.Serializable;

public class UserDemo implements Serializable {
	
	private int uid;
	private String name;
	private String pass;
	public UserDemo() {
		// TODO Auto-generated constructor stub
	}
	public UserDemo(int uid, String name, String pass) {
		this.uid = uid;
		this.name = name;
		this.pass = pass;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "UserDemo [uid=" + uid + ", name=" + name + ", pass=" + pass + "]";
	}
	

}
