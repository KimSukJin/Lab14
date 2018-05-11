package edu.handong.csee.java.Lab14.Prob5;

import java.util.Scanner;

public class Demonstrator {

	public static void main(String[] args) {
		System.out.println("TEST");
		try {
			Scanner keyboard = new Scanner(System.in); // instantiating keyboard
			String str = keyboard.nextLine(); // instantiating str
			Demonstrator.myTest(str); // running method myTest
		} catch (MyException mae) {
			System.out.println("Inside catch block: " + mae); // printing out message
		}

	}

	static void myTest(String str) throws MyException {
		if (str.equals("null")) {
			throw new MyException("String val is null"); // when string is null, throw Exception
		} else
			System.out.println("String val is: " + str); // when string is not null, showing message
	}

}
