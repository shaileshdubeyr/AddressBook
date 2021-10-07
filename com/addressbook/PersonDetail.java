package com.addressbook;

import java.util.*;

public abstract class PersonDetail {
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String e_mail;
	private String phoneNumber;
	private int zipCode;
	
	Scanner scanObj = new Scanner(System.in);
	
	public void getEmail() {
		System.out.println("Enter the Email");
		 e_mail = scanObj.nextLine();
	}
	
	public void getName() {
		System.out.println("Enter the first Name");
		firstName = scanObj.nextLine();
	}
	
	public void getLastName() {
		System.out.println("Enter the Last Name");
		lastName = scanObj.nextLine();
	}
	
	public void getAddress() {
		System.out.println("Enter the Address");
		address = scanObj.nextLine();
	}
	
	public void getStateName() {
		System.out.println("Enter the State");
		state = scanObj.nextLine();
	}
	
	public void getPhoneNumber() {
		System.out.println("Enter the Phone Number");
		phoneNumber = scanObj.nextLine();
	}
	
	public void getZipCode() {
		System.out.println("Enter the Zip Code/Postal Code");
		zipCode = scanObj.nextInt();
	}

	public String toString() {
		return "PersonDetail [firstName = " + firstName + ", lastName = " + lastName + ", address = " + address + ", state = "
				+ state + ", email=" + e_mail + ", phoneNumber = " + phoneNumber + ", zipCode = " + zipCode + "]";
	}		
}
