package com.bs.pratice.token.view;

import java.util.Scanner;

import com.bs.pratice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	// 메인메뉴 출력
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : tokenMenu(); break;
				case 2 : inputMenu(); break;
				case 9 : System.out.println("===== 프로그램을 종료합니다. ====="); return;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	// 토큰 처리 전/후 출력
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + (str.length() + 1));
		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		System.out.println("토큰 처리 후 개수 : " + (tc.afterToken(str).length() + 1));
	}
	
	// 첫 글자 대문자와 찾을 문자 개수 출력
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String userInput = sc.next();
		
		System.out.println("첫 글자 대문자 : " + tc.firstCap(userInput));
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char find = sc.next().charAt(0);
		
		System.out.println(find + " 문자가 들어간 개수 : " + tc.findChar(userInput, find));
	}
}
