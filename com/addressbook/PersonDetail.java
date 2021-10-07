package com.addressbook;

import java.util.*;
import java.util.ArrayList;

public abstract class PersonDetail {
	
	ArrayList details = new ArrayList(4);
	Scanner scanObj = new Scanner(System.in);
	
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String e_mail;
	private String phoneNumber;
	private int zipCode;
	
	public void getEmail() {
		System.out.println("Enter the Email");
		 e_mail = scanObj.nextLine();
		 details.add(e_mail);
	}
	
	public void getName() {
		System.out.println("Enter the first Name");
		firstName = scanObj.nextLine();
		details.add(firstName);
	}
	
	public void getLastName() {
		System.out.println("Enter the Last Name");
		lastName = scanObj.nextLine();
		details.add(lastName);
	}
	
	public void getAddress() {
		System.out.println("Enter the Address");
		address = scanObj.nextLine();
		details.add(address);
	}
	
	public void getStateName() {
		System.out.println("Enter the State");
		state = scanObj.nextLine();
		details.add(state);
	}
	
	public void getPhoneNumber() {
		System.out.println("Enter the Phone Number");
		phoneNumber = scanObj.nextLine();
		details.add(phoneNumber);
	}
	
	public void getZipCode() {
		System.out.println("Enter the Zip Code/Postal Code");
		zipCode = scanObj.nextInt();
		details.add(zipCode);
	}

	public String toString() {
		return "PersonDetail [firstName = " + firstName + ", lastName = " + lastName + ", address = " + address + ", state = "
				+ state + ", email=" + e_mail + ", phoneNumber = " + phoneNumber + ", zipCode = " + zipCode + "]";
	}		
}
