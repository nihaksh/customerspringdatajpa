package com.cg.customerjparest.exceptions;

public class InvalidIdException extends RuntimeException {

	public InvalidIdException() {

	}

	public InvalidIdException(String msg) {
		super(msg);
	}
}
