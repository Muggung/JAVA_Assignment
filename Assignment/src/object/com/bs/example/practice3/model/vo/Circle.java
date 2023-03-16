package object.com.bs.example.practice3.model.vo;

public class Circle {
	private static double PI = 3.14;
	private static int radius = 1;
	
	public Circle(){}
	
	// get & set 설정
	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// 메소드 설정
	public void incrementRadius() {
		this.radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.println(2 * getRadius() * getPI());
	}
	
	public void getSizeOfCircle() {
		System.out.println(getRadius() * getRadius() * getPI());
	}
}
