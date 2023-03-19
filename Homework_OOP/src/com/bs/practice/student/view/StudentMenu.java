package com.bs.practice.student.view;

import com.bs.practice.student.controller.StudentController;

public class StudentMenu {
	// 필드
	private StudentController ssm = new StudentController();
	
	// 생성자
	public StudentMenu() {
		System.out.println("===== 학생 정보 출력 =====");
		for(int i=0; i<ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());
		}
		System.out.println("===== 학생 성적 출력 =====");
		System.out.printf("학생 점수 합계 : %.0f\n", ssm.avgScore()[0]);
		System.out.println("학생 점수 합계 : " + ssm.avgScore()[1]);
		
		System.out.println("===== 성적 결과 출력 =====");
		for(int i=0; i<ssm.printStudent().length; i++) {
			if(ssm.printStudent()[i].getScore() < 60) {
				System.out.println(ssm.printStudent()[i].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(ssm.printStudent()[i].getName() + "학생은 통과입니다.");
			}
		}
	}
}
