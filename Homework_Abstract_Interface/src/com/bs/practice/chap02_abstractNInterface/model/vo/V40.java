package com.bs.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	// 브랜드 값 초기화
	public V40() {
		super.setMaker("LG");
	}
	
	// Interface & 추상메소드 구현
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	
	@Override
	public String picture() {
		return "1200만, 1600만 트리플 카메라";
	}
	
	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	
	@Override
	public String touch() {
		return "정전식";
	}
	
	@Override
	public boolean bluetoothPen() {
		return false;
	}
	
	@Override
	public String printlnformation() {
		String result = makeCall() + "\n" + takeCall() + "\n" + picture() + "\n" + charge() + "\n" + touch() + "\n블루투스 펜 탑재 여부 : " + bluetoothPen() + "\n";
		return "V40는 LG에서 만들어졌고 제원은 다음과 같다.\n" + result;
	}
}
