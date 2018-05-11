package edu.handong.csee.java.Lab14.Prob3;

import java.util.Scanner;

public class Demonstrator {
	public static final Powercalc calculator = new Powercalc(); // instantiating calculator
	public static final Scanner in = new Scanner(System.in); // instantiating in

	public static void main(String[] args) {
		System.out.println("Enter Base and Exponent"); // printing out message

		while (in.hasNextInt()) {
			int n = in.nextInt(); // instantiating n
			int p = in.nextInt(); // instantiating p

			try {
				System.out.println(calculator.power(n, p)); // printing out the value of n power p
			} catch (Exception e) {
				System.out.println(e); // printing out exception
			}
		} // repeats until in received integer

	}

}
