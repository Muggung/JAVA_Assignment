package object.com.bs.example.practice7.run;

import object.com.bs.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e1 = new Employee(123, "동동이", "학생부", "수강생", 25, '남', 50, 0, "010-0000-0000", "어딜까?");
		Employee e2 = new Employee(999, "이순신");
		
		e1.setDept("부부부");
		e1.setJob("학생");
		
		System.out.println(e1.getEmpNo() + " " + e1.getEmpName() + " " + e1.getDept() + " " + e1.getJob() + " " + 
		e1.getAge() + " " + e1.getGender() + " " + e1.getSalary() + " " + e1.getBonusPoint() + " " + e1.getPhone() +
		" " + e1.getAddress());
		
		System.out.println(e2.getEmpNo() + " " + e2.getEmpName() + " " + e2.getDept() + " " + e2.getJob() + " " + 
				e2.getAge() + " " + e2.getGender() + " " + e2.getSalary() + " " + e2.getBonusPoint() + " " + e2.getPhone() +
				" " + e2.getAddress());
	}
}
