/**
 *@PROBLEM_STATEMENT : UC2
 * As a User need to enter a valid First Name
 *First name starts with Cap and has minimum 3 character
 *
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
	 * @Purpose :check for last name validity
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
}