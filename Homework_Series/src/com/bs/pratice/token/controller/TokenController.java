package com.bs.pratice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	// 기본 생성자
	public TokenController() {}
	
	// 공백을 토큰으로 처리한 문자열을 반환하는 기능
	public String afterToken(String str) {
		String total = "";
		
		StringTokenizer strToken = new StringTokenizer(str, " ");
		
		while(strToken.hasMoreElements()) {
			total += strToken.nextElement();
		}
		
		return total;
	}
	
	// 첫 글자만 대문자로 바꾸서 반환하는 기능
	public String firstCap(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	
	// 문자열에 찾을 문자 개수를 반환하는 기능
	public int findChar(String input, char one) {
		int count = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		
		return count;
	}
}
