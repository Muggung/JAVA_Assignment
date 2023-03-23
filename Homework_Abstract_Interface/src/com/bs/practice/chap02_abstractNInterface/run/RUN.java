package com.bs.practice.chap02_abstractNInterface.run;

import com.bs.practice.chap02_abstractNInterface.controller.PhoneController;

public class RUN {
	public static void main(String[] args) {
		// PhoneController 클래스의 method() 메소드의 반환 배열을 String 배열에 저장 
		String[] total = new PhoneController().method();
		
		// 반환받은 값을 저장한 배열을 for문으로 출력
		for(String s : total) {
			System.out.println(s);
		}
	}
}
