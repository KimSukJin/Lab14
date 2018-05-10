package edu.handong.csee.java.Lab14.Prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception {
	private int x = 0; //instantiating x
	private int y = 0; //instantiating y
	
	public In_exception() {
		
	} //constructor
	public void error_det() {
		try {
			Scanner keyboard = new Scanner(System.in); //instantiating scanner
			System.out.println("x: "); //message
			x = keyboard.nextInt(); //receiving by keyboard
			System.out.println("y: "); //message
			y = keyboard.nextInt(); //receiving by keyboard
			System.out.println(this.x/this.y); //message
		}
		catch(ArithmeticException e) {
			System.out.println("java.Lang.ArithmeticException" + e.getMessage());
		} //printing out message when arithmetic exception has occured
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} //printing out message when inputmismatch exception has occured
		catch(Exception e) {
			System.out.println("Some other exception has occurred: " + e.getMessage());
		} //printing out message when other exception has occured
	}
}
