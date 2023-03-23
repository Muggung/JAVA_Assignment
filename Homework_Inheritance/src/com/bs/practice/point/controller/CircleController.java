package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	// 원 넓이 계산 기능
	public String calcArea(int x, int y, int radius) {
		String circleArea = "";
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		// Math.pow() : 제곱근을 해주는 함수
		circleArea = "면적 : " + Math.pow(radius, radius) * 3.14159265359 + " / 입력한 값 : x = " + c.getX() + " y = " + c.getY() + " 반지름 = " + c.getRadius();
		
		return circleArea;
	}
	
	// 원 둘레 계산 기능
	public String calcCircum(int x, int y, int radius) {
		String circleRound = "";
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		circleRound = "둘레 : " + (2 * radius) * 3.14159265359 + " / 입력한 값 : x = "+ c.getX() + " y = " + c.getY() + " 반지름 = " + c.getRadius(); 
		
		return circleRound;
	}
}
