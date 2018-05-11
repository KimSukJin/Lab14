package edu.handong.csee.java.Lab14.Prob4;

import java.util.Scanner;

public class Demonstrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); // instantiating keyboard
		int num = 0; // instantiating num
		Boundary arr = new Boundary(); // instantiating arr
		boolean repeat = true; // instantiating repeat
		while (repeat) {
			try {
				System.out.println("Enter an integer: "); // printing out message
				num = keyboard.nextInt(); // receive integer from keyboard
				arr.receive(num); // running method 'receive'
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index access!"); // printing out message
				repeat = false; // when array has full, repeat become false
			}
		}

	}

}
