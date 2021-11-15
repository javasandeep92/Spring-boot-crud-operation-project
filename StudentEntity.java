package com.curdoperation.app.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rollno;
	private String name;
	private String address;
	private int contectno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContectno() {
		return contectno;
	}
	public void setContectno(int contectno) {
		this.contectno = contectno;
	}
	
	
	

}
