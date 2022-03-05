/**
 *@PROBLEM_STATEMENT : UC4
 * As a User need to enter a valid mobile number
 *@author Suraj Chaudhary
 *@Date 04-Mar-2022
 */
package com.blz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Purpose :check for last name validity
 * @Param :Name, Regex, Matches
 * @Function :take i/p and compare
 * @Return :no return
 */
public class UserRegistration {

	static Scanner scanner = new Scanner(System.in);

	public static void validFirstName() {

		System.out.println("Enter First Name:");
		String name = scanner.next();
		String regex = "^[A-Z]{1}[a-z]*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean r = m.matches();

		if (r)
			System.out.println("It Is A Valid First Name");
		else
			System.out.println("It Is Invalid First Name");

	}

	/**
	 * @Purpose :check for phone no validity
	 * @Param :Name, Regex, Matches
	 * @Function :take i/p and compare
	 * @Return :no return
	 */

	public static void validLastName() {

		System.out.println("Enter Last Name:");
		String lname = scanner.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		boolean r = m.matches();

		if (r)
			System.out.println("It Is A Last Name");
		else
			System.out.println("It Is Invalid Last name");
	}

	/**
	 * @Purpose :check for email validity
	 * @Param :Name, Regex, Matches
	 * @Function :take i/p and compare
	 * @Return :no return
	 */

	public static void validEmail() {

		System.out.println("Enter E-mail:");
		String email = scanner.next();

		String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
		;

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		boolean r = m.matches();

		if (r)
			System.out.println("Valid Email Address");
		else
			System.out.println("Email Address is Invalid");
	}

	public static void validMobileNumber() {

		System.out.print("Enter your Mobile Number : ");
		String phoneNo = scanner.nextLine();
		String regex3 = "(91|0)?\\s?[6-9][0-9]{9}$";
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(phoneNo);
		boolean r3 = m3.matches();
		if (r3)
			System.out.println("Phone Number is Valid");
		else
			System.out.println("Phone Number is Invalid");
	}
}