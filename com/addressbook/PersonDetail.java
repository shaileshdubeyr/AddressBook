package com.addressbook;

import java.util.ArrayList;

public abstract class PersonDetail {
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String e_mail;
	private String phoneNumber;
	private String zipCode;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		//contatctDetails.add(firstName);
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		//contatctDetails.add(lastName);
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
		//contatctDetails.add(address);
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
		//contatctDetails.add(state);
	}
	
	public String getE_mail() {
		return e_mail;
	}
	
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
		//contatctDetails.add(e_mail);
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		//contatctDetails.add(phoneNumber);
	}
	
	public String  getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
		//contatctDetails.add(zipCode);
	}

	@Override
	public String toString() {
		return "PersonDetail [firstName=" + firstName + ", lastName="+ lastName + ", address=" + address + ", state=" + state + ", e_mail=" + e_mail + ", phoneNumber="
				+ phoneNumber + ", zipCode=" + zipCode + "]";
	}			
}