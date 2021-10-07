package com.addressbook;

public class AddContact extends PersonDetail {
	
	public void personDetails(int personLimit) {
		final int ONE = 1;
		
		for(int i = ONE; i <= personLimit; i++) {
			System.out.println("enter the  "+i+" user details");
			this.getName();
			this.getLastName();
			this.getAddress();
			this.getStateName();
			this.getPhoneNumber();
			this.getZipCode();
			this.getEmail();
			System.out.println(this.toString());
		}
	}
}
