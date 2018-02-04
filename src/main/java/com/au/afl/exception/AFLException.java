package com.au.afl.exception;

public class AFLException extends Exception{

	private static final long serialVersionUID = 5508303790542730560L;
	public AFLException(){
		super();
	}
	
	public AFLException(String errorMessage){
		super(errorMessage);
	}
}
