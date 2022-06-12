package com.spring.boot.main.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Person {

	@Id
	private int sid;
	private String sname;
	private String uname;
	private String pass;
	

	@Override
	public String toString() {
		return "Person [sid=" + sid + ", sname=" + sname + ", uname=" + uname + ", pass=" + pass + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}


}
