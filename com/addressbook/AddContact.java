package com.addressbook;

import java.util.Iterator;
import java.util.Scanner;

public class AddContact extends PersonDetail {
	Scanner scanData = new Scanner(System.in);

	public void SetContactDetails() {
		System.out.println("enter the First Name");
		setFirstName(scanData.nextLine());
		System.out.println("enter the Last Name");
		setLastName(scanData.nextLine());
		System.out.println("enter the Address Name");
		setAddress(scanData.nextLine());
		System.out.println("enter the State Name");
		setState(scanData.nextLine());
		System.out.println("enter the Phone Number");
		setPhoneNumber(scanData.nextLine());
		System.out.println("enter the Zip/postal Code");
		setZipCode(scanData.nextLine());
		System.out.println("enter the Email");
		setE_mail(scanData.nextLine());
	}

	public void getContactDetails() {
		getFirstName();
		getLastName();
		getAddress();
		getState();
		getPhoneNumber();
		getZipCode();
		getE_mail();
	}

	public void editDetails() {
		
		String name = scanData.nextLine();
		int index = contatctDetails.indexOf(name);
		while (true) {
			if (contatctDetails.contains(name)) {
				System.out.println("enter the first name");
				contatctDetails.set(index, scanData.nextLine());
				System.out.println("enter lastname");
				contatctDetails.set(++index, scanData.nextLine());
				System.out.println("enter the address");
				contatctDetails.set(++index, scanData.nextLine());
				System.out.println("enter the state");
				contatctDetails.set(++index, scanData.nextLine());
				System.out.println("enter the phonenumber");
				contatctDetails.set(++index, scanData.nextLine());
				System.out.println("enter the Zipcode");
				contatctDetails.set(++index, scanData.nextLine());
				System.out.println("enter the email");
				contatctDetails.set(++index, scanData.nextLine());
				break;
			} else {
				System.out.println("not match any details");
				break;
			}
		}
	}
	
	public void deleteDetails() {
		String name = scanData.nextLine();
		int index = contatctDetails.indexOf(name);
		while (true) {
			if (contatctDetails.contains(name)) {
				System.out.println("enter the first name");
				contatctDetails.remove(index);
				System.out.println("enter lastname");
				contatctDetails.remove(++index);
				System.out.println("enter the address");
				contatctDetails.remove(++index);
				System.out.println("enter the state");
				contatctDetails.remove(++index);
				System.out.println("enter the phonenumber");
				contatctDetails.remove(++index);
				System.out.println("enter the Zipcode");
				contatctDetails.remove(++index);
				System.out.println("enter the email");
				contatctDetails.remove(++index);
				break;
			} else {
				System.out.println("not match any details");
				break;
			}
		}
	}
}