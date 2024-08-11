package com.scm.SmartContactsManager.Exceptions;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(String msg) {
		super(msg);
	}
}
