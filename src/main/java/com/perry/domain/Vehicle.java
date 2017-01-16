package com.perry.domain;

public class Vehicle {

	private String year;

	private String make;

	private String model;

	private String color;

	private String licensePlateNumber;

	private KeyLocationType keyLocationType;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public KeyLocationType getKeyLocationType() {
		return keyLocationType;
	}

	public void setKeyLocationType(KeyLocationType keyLocationType) {
		this.keyLocationType = keyLocationType;
	}

}
