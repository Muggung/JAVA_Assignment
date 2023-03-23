package com.bs.practice.chap02_abstractNInterface.model.vo;

// CallPhone, TouchDisplay Interface 상속
public abstract class SmartPhone implements CellPhone, TouchDisplay{
	// 브랜드 필드
	private String maker;
	
	// 기본 생성자
	public SmartPhone() {}
	
	// 각 브랜드 정보 종합하는 추상 메소드
	public abstract String printlnformation();
	
	// getter & setter
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return this.maker;
	}
}
