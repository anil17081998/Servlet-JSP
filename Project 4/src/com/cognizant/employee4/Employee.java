package com.cognizant.employee4;

public class Employee {
	private String id;
	private String name;
	private String gender;
	private String dateOfBirth;
	private String fullTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFullTime() {
		return fullTime;
	}
	public void setFullTime(String fullTime) {
		this.fullTime = fullTime;
	}
	public Employee(String id, String name, String gender, String dateOfBirth, String fullTime) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.fullTime = fullTime;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
