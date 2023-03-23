package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	// 사각형 넓이 계산 기능
	public String calcArea(int x, int y, int height, int width) {
		String rectangleArea = "";
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		rectangleArea = "넓이 : " + height * width + " / 입력한 값 : x = " + r.getX() + " y = " + r.getY() +
						" 높이 = " + r.getHeight() + " 너비 = " + r.getWidth();
		
		return rectangleArea;
	}
	
	// 사각형 둘레 계산 기능
	public String calcPerimeter(int x, int y, int height, int width) {
		String rectangleRound = "";
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		rectangleRound = "둘레 : " + 2 * (width + height) + " / 입력한 값 : x = " + r.getX() + " y = " + r.getY()
						+ " 높이 = " + r.getHeight() + " 너비 = " + r.getWidth();
		
		return rectangleRound;
	}
}
