package com.bs.practice.chap02_abstractNInterface.run;

import com.bs.practice.chap02_abstractNInterface.controller.PhoneController;

public class RUN {
	public static void main(String[] args) {
		String[] total = new PhoneController().method();
		
		for(String s : total) {
			System.out.println(s);
		}
	}
}
