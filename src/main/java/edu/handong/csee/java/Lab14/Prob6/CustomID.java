package edu.handong.csee.java.Lab14.Prob6;

public class CustomID extends Exception {

	private String[] races = new String[] { "Vsulcans", "Romulan", "Klingons" }; // instantiating races
	private String name = ""; // instantiating name
	private int age = 0; // instantiating age
	private String race = ""; // instantiating race
	private int state = 0; // instantiating state

	public void setName(String str) throws Exception {
		if (str.length() < 5) {
			state = 0; // substituting 0 into state
			throw new Exception("Your name is short! Try again!"); // when length of str is shorter than five, printing
																	// out message
		} else {
			this.name = str; // substituting str into this.name
			System.out.println("Name is valid."); // message
			System.out.println("Name: " + this.name); // message
			state++; // state add one
		}
	}

	public void setAge(int num) throws Exception {
		if (num < 18) {
			state = 1;
			throw new Exception("Your are too young! Try again!"); // when num is smaller than 18, printing out message
		} else {
			this.age = num; // substituting num into this.age
			System.out.println("Age is valid."); // message
			System.out.println("Age: " + this.age); // message
			state++; // state add one
		}
	}

	public void setRace(String race) throws Exception {
		for (int i = 0; i < races.length; i++) {
			if (races[i].equals(race)) {
				this.race = races[i]; // substituting races[i] into this.race
				System.out.println("Race is valid."); // message
				System.out.println("Race: " + races[i]); // message
				state = 0; // back to initial state
				return;
			}
		}
		state = 2;
		throw new Exception("Human! Try again!"); // when race is not "Vsulcans", "Romulan", "Klingons", printing out
													// message
	}

	public int getState() {
		return state; // returning state
	}
}
