/**
 *@PROBLEM_STATEMENT : UC6
 *One upper case
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

	/**
	 * @Purpose :check for password min 8 char
	 * @Param :Name, Regex, Matches
	 * @Function :take i/p and compare
	 * @Return :no return
	 */
	public static void validPasswordOne() {
		System.out.print("Enter The Password Atleast Eight Character : ");
		String passWord = scanner.nextLine();
		String regex4 = "^[A-Z a-z 0-9]{8,}$";
		Pattern p4 = Pattern.compile(regex4);
		Matcher m4 = p4.matcher(passWord);
		boolean r4 = m4.matches();
		if (r4)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is Invalid");
	}

	/**
	 * @Purpose :check for password One upper case
	 * @Param :Name, Regex, Matches
	 * @Function :take i/p and compare
	 * @Return :no return
	 */

	public static void validPassRule2() {
		System.out.print("Enter the Password Atleast One Upper Case & Eight Character :");
		String passWord1 = scanner.nextLine();
		String regex5 = "^[A-Z]{1}+[a-zA-z0-9]{7,}$";
		Pattern p5 = Pattern.compile(regex5);
		Matcher m5 = p5.matcher(passWord1);
		boolean r5 = m5.matches();
		if (r5)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is Invalid");
	}
}
