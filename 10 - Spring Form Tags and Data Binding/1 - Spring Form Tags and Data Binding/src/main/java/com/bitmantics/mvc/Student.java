package com.bitmantics.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String > countryOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IND", "INDIA");
		countryOptions.put("BR", "BRAZIL");
		countryOptions.put("PAK", "PAKISTAN");
		countryOptions.put("AUS", "AUSTRALIA");
		
	}
	
	private String favouriteSubject;
	
	private String[] operatingSystems;
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public void setFirstName(String firstName) {
	
		this.firstName = firstName;
	
	}
	
	public String getLastName() {
	
		return lastName;
	
	}
	
	public void setLastName(String lastName) {
	
		this.lastName = lastName;
	
	}

	public String getCountry() {
		
		return country;
	
	}

	public void setCountry(String country) {
	
		this.country = country;
	
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		
		return countryOptions;
	
	}

	public String getFavouriteSubject() {
	
		return favouriteSubject;
	
	}

	public void setFavouriteSubject(String favouriteSubject) {
	
		this.favouriteSubject = favouriteSubject;
	
	}

	public String[] getOperatingSystems() {
		
		return operatingSystems;
	
	}

	public void setOperatingSystems(String[] operatingSystems) {
	
		this.operatingSystems = operatingSystems;
	
	}
	
	
}
