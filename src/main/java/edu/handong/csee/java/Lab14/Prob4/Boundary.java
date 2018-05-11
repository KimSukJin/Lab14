package edu.handong.csee.java.Lab14.Prob4;

public class Boundary {

	private static int[] arr = new int[5]; // instantiating arr
	private static int cnt = 0; // instantiating cnt

	public void receive(int num) throws ArrayIndexOutOfBoundsException {
		int i = cnt; // substituting cnt into i
		arr[i] = num; // substituting num into arr[i]
		cnt++; // cnt add one
		System.out.printf("arr[%d] <- %d\n", i, num); // printing out message
	}
}
