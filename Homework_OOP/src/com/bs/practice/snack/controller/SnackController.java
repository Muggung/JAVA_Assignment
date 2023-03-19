package com.bs.practice.snack.controller;

import com.bs.practice.snack.model.vo.Snack;

public class SnackController {
	// import
	private Snack s = new Snack();
	
	// 생성자
	public SnackController () {}
	
	// 메소드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		return s.information();
	}
}
