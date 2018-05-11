package edu.handong.csee.java.Lab14.Prob5;

public class MyException extends Exception {
	private String message = null; // instantiating message

	public MyException() {
		super();
	} // default constructor

	public MyException(String message) {
		super(message);
		this.message = message;
	} // constructor received message

	public MyException(Throwable cause) {
		super(cause);
	} // constructor received cause

	public String toString() {
		return message;
	} // overring

}
