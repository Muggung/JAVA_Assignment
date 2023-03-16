package com.bs.hw.shape.controller;

import com.bs.hw.shape.model.vo.Shape;

public class TriangleController {
	// import
	private Shape s = new Shape();
	
	// 메소드
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return height * width;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String trianglePrint = "삼각형 " + s.information();
		return trianglePrint;
	}
}
