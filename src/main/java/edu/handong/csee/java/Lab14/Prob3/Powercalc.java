package edu.handong.csee.java.Lab14.Prob3;

public class Powercalc {
	public long power(int n, int p) throws Exception {
		long result = 0; // instantiating result

		result = (long) Math.pow(n, p); // substituting n power p into result
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} // when n or p is negative, throw Exception message
		if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");

		} // when n and p are zero, throw Exception message
		return result; // return value is result
	}

}
