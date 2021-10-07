package com.addressbook;

public class ContactDetails extends PersonDetail {
	public static void main(String[] args) {
		ContactDetails onePersonDetails = new ContactDetails();
		onePersonDetails.getName();
		onePersonDetails.getLastName();
		onePersonDetails.getAddress();
		onePersonDetails.getStateName();
		onePersonDetails.getPhoneNumber();
		onePersonDetails.getEmail();
		onePersonDetails.getZipCode();
		System.out.println(onePersonDetails.toString());
	}

}
