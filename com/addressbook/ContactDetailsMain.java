package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactDetailsMain {
	
	private static char inputCharater() {
		Scanner scanCharater = new Scanner(System.in);
		char charaterInput = scanCharater.next().charAt(0);
		return charaterInput;
	}

	public static void main(String[] args) {
		AddContact addPersonDetails = new AddContact();
		while (true) {
			System.out.println("Input the Charater to add Details A to Edit E and remove D any charater to Ignore");
			char charater = inputCharater();
			if (charater == 'A' || charater == 'E' || charater == 'D' || charater == 'a' || charater == 'e'
					|| charater == 'd') {
				switch (charater) {
				case 'A':
					addPersonDetails.SetContactDetails();
					addPersonDetails.getContactDetails();
					break;
				case 'E':
					System.out.println("Enter the name to edit");
					addPersonDetails.editDetails();
					break;
				case 'D':
					System.out.println("Enter the name to edit");
					addPersonDetails.deleteDetails();
					break;
				default:
					System.out.println("you have not perform any operation");
					break;
				}

			} else {
				System.out.println("Invalid input");
				break;
			}
		}
		System.out.println(addPersonDetails.contatctDetails);
	}
}
