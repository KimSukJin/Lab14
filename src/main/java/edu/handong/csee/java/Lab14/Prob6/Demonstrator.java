package edu.handong.csee.java.Lab14.Prob6;

import java.util.Scanner;

public class Demonstrator {

	public static void main(String[] args) {
		String name; // instantiating name
		String race; // instantiating race
		CustomID obj = new CustomID(); // instantiating obj
		int age = 0; // instantiating age
		Scanner keyboard = new Scanner(System.in); // instantiating keyboard
		boolean repeat = true; // instantiating repeat

		while (repeat) {
			try {
				if (obj.getState() == 0) {
					System.out.println("Enter your name: "); // message
					name = keyboard.nextLine(); // received name from keyboard
					obj.setName(name); // running method setName
				} else if (obj.getState() == 1) { // first state
					System.out.println("Enter your age: "); // message
					age = keyboard.nextInt(); // received age from keyboard
					keyboard.nextLine(); // running nextLine
					obj.setAge(age); // runnig method setAge
				} else if (obj.getState() == 2) { // second state
					System.out.println("Enter your race: "); // message
					race = keyboard.nextLine();// running nextLine
					obj.setRace(race); // running method setRace
				}
			} catch (Exception e) {
				System.out.println(e.getMessage()); // message
				continue; // continue
			}
		}

	}

}
