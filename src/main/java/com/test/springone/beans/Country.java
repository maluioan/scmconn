package com.test.springone.beans;

public class Country {

	private int id;
	private String countryName;

	public Country() {
		System.out.println("************* Country");
	}

	public Country(int i, String countryName) {
		super();
		this.id = i;
		this.countryName = countryName;
		System.out.println("************* Country integer and string");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
