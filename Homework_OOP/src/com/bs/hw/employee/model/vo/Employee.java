package com.bs.hw.employee.model.vo;

public class Employee {
	// 필드
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	// 생성자
	public Employee() {}
	
	public Employee(int empNo, String name, char gender, String phone) {
		setEmpNo(empNo);
		setName(name);
		setGender(gender);
		setPhone(phone);
	}
	
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		setEmpNo(empNo);
		setName(name);
		setGender(gender);
		setPhone(phone);
		setDept(dept);
		setSalary(salary);
		setBonus(bonus);
	}
	
	// 메소드
	public String printEmployee() {
		String result = getEmpNo() + " " + getName() + " " + getGender() + " " + getPhone() + " " + getDept() + " "
				+ getSalary() + " " + getBonus();
		return result;
	}
	
	// get&set 설정
	public int getEmpNo() {
		return this.empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getBonus() {
		return this.bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
