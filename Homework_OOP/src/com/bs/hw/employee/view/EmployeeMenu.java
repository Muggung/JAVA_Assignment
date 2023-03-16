package com.bs.hw.employee.view;

import java.util.Scanner;

import com.bs.hw.employee.controller.EmployeeController;
import com.bs.hw.employee.model.vo.Employee;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	// 생성자
	public EmployeeMenu() {
		while(true) {
		System.out.println("===== 사원관리 =====");
		System.out.println("1. 사원추가");
		System.out.println("2. 사원수정");
		System.out.println("3. 사원삭제");
		System.out.println("4. 사원출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int menuChoice = sc.nextInt();
		
		switch(menuChoice) {
			case 1 : insertEmp(); break;
			case 2 : updateEmp(); break;
			case 3 : deleteEmp(); break;
			case 4 : printEmp(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("메뉴에 없는 번호를 누르셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 메소드
	public void insertEmp() {
		System.out.print("사원번호 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("사원이름 : ");
		String name = sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		while(true) {
			System.out.print("추가정보를 입력하시겠습니까?(Y/N) ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			
			if(choice == 'Y') {
				System.out.print("사원부서 : ");
				String dept = sc.nextLine();
				System.out.print("연봉 : ");
				int salary = sc.nextInt();
				sc.nextLine();
				System.out.print("보너스 : ");
				double bonus = sc.nextDouble();
				sc.nextLine();
				ec.add(empNo, name, gender, phone, dept, salary, bonus); return;
			} else if(choice == 'N') {
				ec.add(empNo, name, gender, phone); return;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void updateEmp() {
		System.out.println("가장 최근에 등록한 사원정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원연봉");
		System.out.println("3. 보너스");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴를 고르세요 : ");
		int menuChoice = sc.nextInt();
		sc.nextLine();
		
		switch(menuChoice) {
			case 1 : 
				System.out.print("수정할 전화번호 : ");
				String updatePhone = sc.nextLine();
				ec.modify(updatePhone);
				System.out.println("===== 수정 성공 ======");
				break;
			case 2 :
				System.out.print("수정할 연봉 : ");
				int updateSalary = sc.nextInt();
				ec.modify(updateSalary);
				System.out.println("===== 수정 성공 ======");
				break;
			case 3 :
				System.out.print("수정할 보너스");
				double updateBonus = sc.nextDouble();
				ec.modify(updateBonus);
				System.out.println("===== 수정 성공 ======");
				break;
			case 9 : System.out.println("메인메뉴로 돌아갑니다."); return;
			default : System.out.println("잘못입력하셨습니다. 메인메뉴로 돌아갑니다."); return;
		}
	}
	
	public void deleteEmp() {
		while(true) {
			System.out.println("정말로 삭제하시겠습니까?(Y/N) ");
			char choice = sc.next().charAt(0);
			
			if(choice == 'Y') {
				System.out.println(ec.remove().getName() == null ? "데이터삭제 성공" : "데이터삭제 실패" );
				return;
			} else if(choice == 'N') {
				return;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void printEmp() {
		String print = ec.inform();
		System.out.println(print == null ? "사원데이터가 없습니다." : print);
		return;
	}
}
