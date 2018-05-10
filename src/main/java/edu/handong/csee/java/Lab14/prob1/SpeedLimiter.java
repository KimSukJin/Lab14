package edu.handong.csee.java.Lab14.prob1;

public class SpeedLimiter {
	private int speed = 0; //instantiating speed
	private int limit = 0; //instantiating limit
	
	public SpeedLimiter (int limit, int speed) {
		this.limit = limit; //means parameter limit
		this.speed = speed; //means parameter speed
	}
	
	public void warnSpeedLimit() {
		try {
			if(this.limit < this.speed) {
				throw new Exception("Speed Limit " + this.limit + "Km exceeded!"); //message when speed exceed limit
		
			}
			System.out.println("You are a Law abiding citizen!"); // message when speed not exceed limit
		} catch(Exception e) {
			System.out.println(e.getMessage()); //printing out message
			System.out.println("You are being fined."); // message when speed exceed limit
		}
		System.out.println("Your current Speed: " + this.speed); //message that shows current speed
	}

}
