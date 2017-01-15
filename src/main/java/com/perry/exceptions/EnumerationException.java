package com.perry.exceptions;

public class EnumerationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EnumerationException() {
		super("Failed to convert Enumeration");
	}

	public EnumerationException(String message, String enumerationClassName) {
		super(message + ":" + enumerationClassName);
	}

	public EnumerationException(long id, String className) {
		super("Failed to conver Enumeration for class: " + className + " | id: " + id);
	}

}
