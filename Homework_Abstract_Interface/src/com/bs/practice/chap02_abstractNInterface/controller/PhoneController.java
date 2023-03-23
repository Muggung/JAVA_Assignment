package com.bs.practice.chap02_abstractNInterface.controller;

import com.bs.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		/* 1. 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
		 * 2. 각 인덱스에 '다형성'을 이용해 GalaxyNote9, V40 객체 저장
		 * 3. for문을 사용해 Phone 객체배열에 각 인덱스의 printInformation()의 반환 값을 String배열에 담고 반환
		 */
		Phone[] phoneMaker = new Phone[2];
		
		phoneMaker[0] = new GalaxyNote9();
		phoneMaker[1] = new V40();
		
		for(Phone p : phoneMaker) {
			if(p instanceof GalaxyNote9) {
				result[0] = ((GalaxyNote9)p).printlnformation();
			} else if(p instanceof V40) {
				result[1] = ((V40)p).printlnformation();
			}
		}
		
		return result;
	}
}
