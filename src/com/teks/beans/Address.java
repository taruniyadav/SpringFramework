package com.teks.beans;

import org.springframework.stereotype.Component;

@Component// spring creates an object for the Address
public class Address {

	private String houseno;
	private String city;
	private int pincode;
	public String getHousno() {
		return houseno;
	}
	public void setHousno(String housno) {
		this.houseno = housno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "houseno: " + houseno + " city: " + city +" pincode: "+ pincode;
	}
	
}
