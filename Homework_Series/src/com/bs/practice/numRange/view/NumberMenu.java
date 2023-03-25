package com.bs.practice.numRange.view;

import java.util.Scanner;

import com.bs.practice.numRange.controller.NumberController;
import com.bs.practice.numRange.exception.NumRangException;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);
	NumberController nc = new NumberController();
	
	public void menu() {
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		int secondNum = sc.nextInt();
		
		try {
			System.out.println(firstNum +  "은(는) " + secondNum + "의 배수인가? " + nc.checkDouble(firstNum, secondNum));
		}catch(NumRangException e) {
			e.printStackTrace();
		}
	}
}
