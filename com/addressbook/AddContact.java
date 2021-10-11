package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddContact extends PersonDetail {
	Scanner scanData = new Scanner(System.in);

	public void setContactDetails() {
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

	public void editDetails(ArrayList<AddContact> contatctDetails) {
		String name = scanData.nextLine();
		System.out.println(contatctDetails.size());
		for (int i = 0; i < contatctDetails.size(); i++) {
			if (contatctDetails.get(i).getFirstName().equals(name)) {
				System.out.printf("enter the number to update contact details 1 First Name 2 to update Last Name 3 to phone number 4 to pincode 5 to address 6 to email 7 to state");
				int updateChoice = scanData.nextInt();
				scanData.nextLine();
				
				switch (updateChoice) {
				case 1:
					System.out.println("enter the name to update");
					String fName = scanData.nextLine();
					System.out.println("acb");
					contatctDetails.get(i).setFirstName(fName);
					break;
				case 2:
					System.out.println("enter the Last name to update");
					String lName = scanData.nextLine();
					contatctDetails.get(i).setLastName(lName);
					break;
				case 3:
					System.out.println("enter the Phone Number to Update");
					String phNumber = scanData.nextLine();
					contatctDetails.get(i).setPhoneNumber(phNumber);
					break;
				case 4:
					System.out.println("enter the Pincode/Postalcode to Update");
					String pinC = scanData.nextLine();
					contatctDetails.get(i).setZipCode(pinC);
					break;
				case 5:
					System.out.println("enter the Address to Update");
					String address = scanData.nextLine();
					contatctDetails.get(i).setAddress(address);
					break;
				case 6:
					System.out.println("enter the Email to Update");
					String email = scanData.nextLine();
					contatctDetails.get(i).setE_mail(email);
					break;
				case 7:
					System.out.println("enter the State to Update");
					String state = scanData.nextLine();
					contatctDetails.get(i).setState(state);
					break;
				default:
					System.out.println("you have not update any details");
					break;
				}

			} else
				System.out.println("not match any details");
		}
	}

	public void deleteDetails(ArrayList<AddContact> contatctDetails) {
		System.out.println("enter the name");
		String name = scanData.nextLine();
		for(int i = 0; i < contatctDetails.size(); i++ ) {
			if (contatctDetails.get(i).getFirstName().equals(name)) {
				contatctDetails.remove(i);
			} else 
				System.out.println("not match any details");
		}
	}
}