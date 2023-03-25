package com.bs.practice.charCheck.exception;

// Exception 만들기
public class CharCheckException extends RuntimeException {
	
	public CharCheckException() {}
	
	public CharCheckException(String msg) {
		super(msg);
	}
}
