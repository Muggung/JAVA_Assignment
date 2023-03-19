package com.bs.practice.student.model.vo;

public class Student {
	// 필드
	private String name;
	private String subject;
	private int score;

	// 생성자
	public Student() {}

	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// 메소드
	public String inform() {
		return "이름 : " + this.name + " / 과목 : " + this.subject + " / 점수 : " + this.score;
	}
	
	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
