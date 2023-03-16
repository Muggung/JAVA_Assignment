package object.com.bs.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		Student.grade = 1;
		this.classroom = 2;
		this.name = "이당당";
		this.height = 200.5;
		this.gender = '남';
	}
	
	public Student() {}
	
	// set & get 적용
	public static int getGrade() {
		return grade;
	}

	public static void setGrade(int grade) {
		Student.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// 메소드 적용
	public void information() {
		System.out.println(getGrade() + " " + getClassroom() + " " + getName() + " " + getHeight() + " " + getGender());
	}
}
