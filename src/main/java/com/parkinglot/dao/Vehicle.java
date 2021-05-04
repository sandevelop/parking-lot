package com.parkinglot.dao;

public abstract class Vehicle {

	protected String regNumber = null;
	protected String color = null;
	
	
	public Vehicle() {
		super();
	}

	public Vehicle(String regNumber, String color) {
		super();
		this.regNumber = regNumber;
		this.color = color;
	}
	
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		return "[registrationNumber: " + this.regNumber + ", color: " + this.color + "]";
	}
}
