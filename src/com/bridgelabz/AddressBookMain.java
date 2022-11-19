package com.bridgelabz;

import java.util.Arrays;

public class AddressBookMain{

	public static void main(String[] args){
		ContactMethod contactMethodObj = new ContactMethod(10);
		contactMethodObj.mainMenu();
		System.out.println(Arrays.toString(contactMethodObj.contactDetailsArray));

	}

}
