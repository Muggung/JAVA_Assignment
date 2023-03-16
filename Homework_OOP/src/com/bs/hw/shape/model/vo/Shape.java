package com.bs.hw.shape.model.vo;

public class Shape {
	// 필드
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	//생성자
	public Shape() {}
	
	// 매개변수 생성자
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	// 메소드
	public String information() {
		String info = "높이 : " + this.height + "\n너비 : " + this.width + "\n색깔 : " + this.color;
		return info;
	}
	
	// get & set 설정
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
