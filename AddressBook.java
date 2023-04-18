package com.addressBook;

import java.util.Scanner;

public class AddressBook {

	public void AddContact() {
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact(null, null, null, null, null, null, 0, 0);
		System.out.print("Enter First name :");
		String firstname = sc.next();
		contact.setFirstName(firstname);
		System.out.print("Enter last name :");
		String lastname = sc.next();
		contact.setLastName(lastname);
		System.out.print("Enter Address :");
		String address = sc.next();
		contact.setAddress(address);
		System.out.print("Enter City :");
		String city = sc.next();
		contact.setCity(city);
		System.out.print("Enter zip code :");
		int zipCode = sc.nextInt();
		contact.setZipCode(zipCode);
		System.out.print("Enter phone number : ");
		long phone = sc.nextLong();
		contact.setPhoneNumber(phone);
		System.out.print("Enter Email :");
		String email = sc.next();
		contact.setEmail(email);

		System.out.println("Contact added Successfully!!!");
	}

}
