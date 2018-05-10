package edu.handong.csee.java.Lab14.prob1;

import java.util.Random;
import java.util.Scanner;

public class Demonstrator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //instantiating keyboard
		Random rand = new Random(); //instantiating rand
		int limit = 0; //instantiating limit
		int speed = 0; //instantiating speed
		
		System.out.println("Set the speed limit, officer: "); //printing out message
		limit = keyboard.nextInt(); //receiving limit by keyboard
		speed = rand.nextInt(101); //receiving speed by rand (0~100)
		
		SpeedLimiter limiter = new SpeedLimiter(limit, speed); //instantiating limiter
	
		limiter.warnSpeedLimit(); //running warnSpeedLimit
		 
		keyboard.close(); //closing keyboard

	}

}
