package com.bs.practice.chap02_abstractNInterface.model.vo;

// Interface는 다중상속 가능!
// Phone, Camera Interface 상속
public interface CellPhone extends Phone,Camera {
	// 충전 방식
	String charge();
}
