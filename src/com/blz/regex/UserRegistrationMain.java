/**
 *@PROBLEM_STATEMENT : UC6
 *Password One upper case
 *@author Suraj Chaudhary
 *@Date 04-Mar-2022
 */
package com.blz.regex;

import java.util.Scanner;

public class UserRegistrationMain {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {

			System.out.println("Enter 0 : Exit");
			System.out.println("Enter 1 : To validate First Name ");
			System.out.println("Enter 2 : To validate Last Name ");
			System.out.println("Enter 3 : To validate E-mail ");
			System.out.println("Enter 4 : To validate Moblie Number ");
			System.out.println("Enter 5 : To validate Password Rule 1 ");
			System.out.println("Enter 6 : To validate Password Rule 2 One upper case ");

			switch (scanner.nextInt()) {
			case 0:
				System.exit(0);

			case 1:
				UserRegistration.validFirstName();
				break;

			case 2:
				UserRegistration.validLastName();
				break;

			case 3:
				UserRegistration.validEmail();
				break;
			case 4:
				UserRegistration.validMobileNumber();
				break;
			case 5:
				UserRegistration.validPasswordOne();
				break;
			case 6:
				UserRegistration.validPassRule2();
				break;

			default:
				System.out.println("Invalid Input : try 1-6");
			}
		}
	}
}
