package com.bs.practice.charCheck.view;

import java.util.Scanner;

import com.bs.practice.charCheck.controller.CharacterController;
import com.bs.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);
	CharacterController cc = new CharacterController();
	
	public void menu() {
		System.out.print("문자열을 입력해주세요 : ");
		String msg = sc.nextLine();
		
		try {
			System.out.println("\'" + msg + "\'" + "에 포함된 영문자 개수 : " + cc.countAlpha(msg));
		}catch(CharCheckException e) {
			e.printStackTrace();
		}
		
	}
}
