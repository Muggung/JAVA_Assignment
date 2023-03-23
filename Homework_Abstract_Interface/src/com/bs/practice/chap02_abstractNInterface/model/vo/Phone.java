package com.bs.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	final char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};
	
	// 전화 받기 기능
	String makeCall();
	
	// 전화 걸기 기능
	String takeCall();
}
