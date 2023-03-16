package com.bs.hw.shape.controller;

import com.bs.hw.shape.model.vo.Shape;

public class SquareController {
	// import
	private Shape s = new Shape();
	
	// 메소드
	public double calcPerimeter(double height, double width) {
		s.setType(4);
		s.setHeight(height);
		s.setWidth(width);
		return (height + width) * 2;
	}
	
	public double calcArea(double height, double width) {
		s.setType(4);
		s.setHeight(height);
		s.setWidth(width);
		return height * width;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String squarePrint = "사각형 " + s.information();
		return squarePrint;
	}
}
