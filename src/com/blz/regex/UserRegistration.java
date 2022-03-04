/**
 *@PROBLEM_STATEMENT : UC1
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

public class UserRegistration {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @Purpose : Take First Name And Check It Is Getting Matched With Regex/Regular
	 *          Expression Or Not
	 * @Param : Name, Regex
	 * @Function : check for first name validity
	 * @Return : string results
	 */

	public static void validFirstName() {

		System.out.println("Enter First Name:");
		String name = scanner.next();
		String regex = "^[A-Z]{1}[a-z]*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean r = m.matches();

		if (r)
			System.out.println("First name is valid");
		else
			System.out.println("First name is !Invalid");

	}

}
