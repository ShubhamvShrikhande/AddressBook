package com.addressBook;

import java.util.Scanner;

public class AddressBook {

	public void AddContact() {
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		System.out.print("Enter First name :");
		String firstname = sc.next();
		contact.setFirstName(firstname);
		System.out.print("Enter last name :");
		String lastname = sc.next();
		contact.setLastName(lastname);
		System.out.print("Enter Address :");
		String address1 = sc.next();
		contact.setAddress(address1);
		System.out.print("Enter City :");
		String city1 = sc.next();
		contact.setCity(city1);
		System.out.print("Enter zip code :");
		int zipCode1 = sc.nextInt();
		contact.setZipCode(zipCode1);
		System.out.print("Enter phone number : ");
		long phone = sc.nextLong();
		contact.setPhoneNumber(phone);
		System.out.print("Enter Email :");
		String email1 = sc.next();
		contact.setEmail(email1);

		System.out.println("Contact added Successfully!!!");
	}

	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of the contact : ");
		String name = sc.next();

		System.out.println();
	}

	public void editDetails(int input) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the contact which you want to edit");
		Contact contact = new Contact();

		String name = sc.next();

		{
			if (contact.getFirstName().equals(name)) {
				System.out.println("Contact Found!!");
				System.out.println("Please update the details");
				System.out.print("Enter First name :");
				String firstname = sc.next();
				contact.setFirstName(firstname);
				System.out.print("Enter last name :");
				String lastname = sc.next();
				contact.setLastName(lastname);
				System.out.print("Enter Address :");
				String address1 = sc.next();
				contact.setAddress(address1);
				System.out.print("Enter City :");
				String city1 = sc.next();
				contact.setCity(city1);
				System.out.print("Enter zip code :");
				int zipCode1 = sc.nextInt();
				contact.setZipCode(zipCode1);
				System.out.print("Enter phone number : ");
				long phone = sc.nextLong();
				contact.setPhoneNumber(phone);
				System.out.print("Enter Email :");
				String email1 = sc.next();
				contact.setEmail(email1);
				System.out.println("Contact Edited Successfully");
			} else {
				System.out.println(" please Enter valid contact name !!");
				editDetails(input);
			}
		}

	}

}
