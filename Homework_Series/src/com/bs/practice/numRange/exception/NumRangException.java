package com.bs.practice.numRange.exception;

// 나만의 예외처리 만들기
public class NumRangException extends Exception {
	
	public NumRangException() {}
	
	public NumRangException(String msg) {
		super(msg);
	}
}
