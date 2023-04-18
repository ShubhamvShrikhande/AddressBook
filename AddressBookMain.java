package com.addressBook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome to AddressBook program");
			System.out.println("1) Press 1 to add new contact");
			System.out.println("2) press 2 to display contact");
			System.out.println("3) press 3 to Edit contact");
			System.out.println("4) press 4 to Exit");
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				addressBook.AddContact();
			}
			case 2: {
				addressBook.display();
			}
			case 3: {
				addressBook.editDetails(input);
			}
			case 4: {
				System.out.println("Thank you so much !!!");
				System.exit(0);
			}

			}
		}
	}

}
