package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class ContactMethod{
	private int index;
	ContactDetails[] contactDetailsArray;

	ContactMethod(int size) {
		this.contactDetailsArray = new ContactDetails[size];
	}

	void mainMenu() {

		String text;
		do {
			System.out.println("***********************************************");
			System.out.println("**********ADDRESS BOOK***************************");
			System.out.println("***********************************************");

			System.out.println("Enter the option u want to perform :");
			System.out.println("1.Add a contact");
			System.out.println("2.Edit a contact");
			System.out.println("3.Delete a contact");


			Scanner input = new Scanner(System.in);// scanner class
			int options = input.nextInt();
			switch (options) {
			case 1:
				addContact();
				break;
			case 2:
				editContact();
				break;
			case 3:
				deleteContact();
				break;

			default:
				System.out.println("Wrong Choice");
			}
			System.out.println("Do u Want to continue(y/n)");
			text = input.next();

		} while (text.equalsIgnoreCase("y"));

		System.out.println("Thanks ");

	}

	public void pushData(ContactDetails contact) {

		contactDetailsArray[index] = contact;
		index++;

	}

	public void addContact() {

		Scanner input = new Scanner(System.in);// scanner class
		System.out.println("Enter how many contact you want to add in Address Book");
		int numOfContacts = input.nextInt();
		for (int i = 0; i < numOfContacts; i++) {
			System.out.println("Enter" + (i + 1) + " First name and last name");
			String firstName = input.next();
			String lastName = input.next();
			System.out.println("Enter " + (i + 1) + " Address, City and State");
			String address = input.next();
			String city = input.next();
			String state = input.next();
			System.out.println("Enter " + (i + 1) + " Zip,Phone NUmber and Email");
			long zip = input.nextInt();
			long phonenumber = input.nextInt();
			String email = input.next();
			ContactDetails contactDetails = new ContactDetails(firstName, lastName, address, city, state, zip,
					phonenumber, email);
			pushData(contactDetails);
		}
	}

	public void editContact() {
		System.out.println("Enter the name u want to edit");
		Scanner input1 = new Scanner(System.in);// scanner class
		String ffirstName = input1.next();
		System.out.println(ffirstName);
		for (ContactDetails contactt : contactDetailsArray) {
			if (contactt == null) {
			} else {
				if (ffirstName.equals(contactt.getFirstName())) {
					System.out.println("Cong.. found " + ffirstName);
					System.out.println("Choose the attribute to edit");
					System.out.println("1.Last Name \n 2. Phone Number \n 3.Zip \n 4.City \n" + " 5.State \n 6. Email");
					int choice = input1.nextInt();

					switch (choice) {

					case 1:
						System.out.println("Enter the correct Last Name:");
						String lastName = input1.next();
						contactt.setLastName(lastName);
						break;
					case 2:
						System.out.println("Enter the correct Phone Number:");
						long phoneNumber = input1.nextLong();
						contactt.setPhoneNumber(phoneNumber);
						break;
					case 3:
						System.out.println("Enter the correct Zip :");
						long zip = input1.nextLong();
						contactt.setPhoneNumber(zip);
						break;
					case 4:
						System.out.println("Enter the correct City:");
						String city = input1.next();
						contactt.setLastName(city);
						break;
					case 5:
						System.out.println("Enter the correct State:");
						String state = input1.next();
						contactt.setLastName(state);
						break;
					case 6:
						System.out.println("Enter the correct Email:");
						String email = input1.next();
						contactt.setLastName(email);
						break;

					}
				}

				else {
					System.out.println("Contact not found");
				}
			}
		}
	}
	void deleteContact() {
		System.out.println("Enter the name of Contact Details u want to Delete");
		Scanner input1 = new Scanner(System.in);// scanner class
		String deletedName = input1.next();
		for(ContactDetails i:contactDetailsArray){
			if(i == null) {
			} else {
				if (deletedName.equals(i.getFirstName())) {
					System.out.println("Cong.. found " + deletedName);
					System.out.println(i);
					i.setFirstName(null);
					i.setLastName(null);
					i.setZip(0);
					i.setPhoneNumber(0);
					i.setAddress(null);
					i.setState(null);
					i.setCity(null);
					i.setEmail(null);
					System.out.println("After Deletion" );
					System.out.println(i);


				}
			}
		}
}
}
