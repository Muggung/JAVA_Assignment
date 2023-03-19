package com.bs.practice.student.controller;

import com.bs.practice.student.model.vo.Student;

public class StudentController {
	// 필드
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	// 생성자
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	// 메소드
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i=0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] copyArr = new double[2];
		copyArr[0] = sumScore();
		copyArr[1] = sumScore() / sArr.length;
		return copyArr;
	}
}
