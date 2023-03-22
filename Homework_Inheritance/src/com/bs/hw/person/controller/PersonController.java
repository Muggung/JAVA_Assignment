package com.bs.hw.person.controller;

import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		/* PersonMenu의 mainMenu에 학생, 사원 수를 반환하는 메소드
		 * 1. 정수형 배열을 생성한다.
		 * 2. Student 배열 s와 Employee 배열 e에 각 인덱스 번호를 통해 null 값 확인
		 * 3. null이 아닌 값이 있을 시 countArr애 1을 누적
		 * 4. countArr[0]에 s 배열의 카운트 값, countArr[1]에 e 배열의 카운트 값 넣고 반환
		 */
		int[] countArr = new int[2];
		
		for(Student sIndex : s) {
			if(sIndex != null) {
				countArr[0] += 1;
			}
		}
		
		for(Employee eIndex : e) {
			if(eIndex != null) {
				countArr[1] += 1;
			}
		}
		return countArr;
	}
	
	public void insertStudnet(String name, int age, double height, double weight, int grade, String major) {
		
	}
	
	public Student[] printStudent() {
		
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	
	public Employee[] printEmployee() {
		
	}
}
