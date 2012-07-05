package com.epam.nulp.tasks.exceptions;

@SuppressWarnings("serial")
public class AgeFormatException extends Exception {
	public AgeFormatException(String message) {
	    super("Student: " + message);
	}
	
}
