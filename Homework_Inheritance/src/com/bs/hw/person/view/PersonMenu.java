package com.bs.hw.person.view;

import java.util.Scanner;

import com.bs.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		/* 1. 메뉴를 출력
		 * 2-1. 저장된 학생, 사원 수는 PersonController 클래스의 personCount() 메소드의 반환 값을 사용한다.
		 * 2-2. 메뉴를 고르면 고른 메뉴화면으로 이동한다.
		 * 2-3. 메뉴에 없는 번호 입력시 "다시 입력해주세요." 출력 후 다시 입력받는다.
		 */
		while(true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
	
		
			System.out.print("메뉴 번호 : ");
			int menuChoice = sc.nextInt();
			
			switch(menuChoice) {
				case 1 : studentMenu(); break;
				case 2 : employeeMenu(); break;
				case 9 : System.out.println("===== 프로그램을 종료합니다. ======"); return;
				default : System.out.println("=== 잘못입력하셨습니다. 다시 입력해주세요. ==="); break;
			}
		}
	}
	
	public void studentMenu() {
		/* 1. 학생메뉴를 출력
		 * 2-1. 학생 객체 배열에 담긴 데이터의 수가 3일 때 "학생 저장공간이 꽉 찼기 때문에 학생 추가 메뉴는 더이상 활성화되지 않습니다." 출력 후 비활성화
		 * 2-2. 2-1번에 조건에서 다시 1번을 눌렀을 경우 "잘못입력하셨습니다. 다시 입력해주세요." 출력
		 * 3. 학생 객체 배열에 담긴 데이터의 수가 3개가 아닐 때는 메뉴를 모두 받을 수 있게한다.
		 */
		int menuChoice;
		
		while(true) {
			if(pc.personCount()[0] == 3) {
				System.out.println();
				System.out.println("2. 학생 보기");
				System.out.println("9. 메인으로");
				System.out.print("메뉴 번호 : ");
				menuChoice = sc.nextInt();
				
				switch(menuChoice) {
					case 2 : printStudent(); break;
					case 9 : System.out.println("===== 메인화면으로 이동합니다. ====="); return;
					default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
				}
			} else {
				System.out.println("1. 학생 추가");
				System.out.println("2. 학생 보기");
				System.out.println("9. 메인으로");
				System.out.print("메뉴 번호 : ");
				menuChoice = sc.nextInt();
				
				switch(menuChoice) {
					case 1 : insertStudent(); break;
					case 2 : printStudent(); break;
					case 9 : System.out.println("===== 메인화면으로 이동합니다. ====="); return;
					default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
				}
			}
		}
	}
	
	public void employeeMenu() {
		// studentMenu와 동일
		int menuChoice;
		
		while(true) {
			if(pc.personCount()[1] == 10) {
				System.out.println("=== 사원 저장공간이 꽉 찼기 때문에 \'사원 추가 메뉴\'는 더이상 활성화되지 않습니다. ===");
				System.out.println("2. 사원 보기");
				System.out.println("9. 메인으로");
				System.out.print("메뉴 번호 : ");
				menuChoice = sc.nextInt();
				
				switch(menuChoice) {
					case 2 : printEmployee(); break;
					case 9 : System.out.println("===== 메인화면으로 이동합니다. ====="); return;
					default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
				}
			} else {
				System.out.println("1. 사원 추가");
				System.out.println("2. 사원 보기");
				System.out.println("9. 메인으로");
				System.out.print("메뉴 번호 : ");
				menuChoice = sc.nextInt();
				
				switch(menuChoice) {
					case 1 : insertEmployee(); break;
					case 2 : printEmployee(); break;
					case 9 : System.out.println("===== 메인화면으로 이동합니다. ====="); return;
					default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
				}
			}
		}
	}
	
	public void insertStudent() {
		/* 1. 학생정보를 입력받아 PersonController의 insertStudent() 메소드의 매개변수로 넘겨줌
		 * 2. 학생 객체 배열에 담긴 데이터 수가 3개 이상이 아닌 경우 "그만하시려면 N 또는 n, 이어하시려면 아무 키나 입력해주세요." 출력
		 * 2-1. N 또는 n이 아니면 학생정보 입력받는 것을 반복하고
		 * 2-2. N 또는 n이라면 반복 멈춤
		 * 3. 학생 객체 배열에 담긴 데이터 수가 3개가 되었을 때 "학생 저장공간이 꽉 찼기 때문에 학생 추가 메뉴를 종료하고 메인메뉴로 돌아갑니다." 출력 후 종료
		 */
		while(true) {
			if(pc.personCount()[0] == 3) {
				System.out.println("=== 학생 저장공간이 꽉 찼기 때문에 \'학생 추가 메뉴\'를 종료하고 메인메뉴로 돌아갑니다. ===");
				return;
			} else {
				System.out.print("학생 이름 : ");
				String name = sc.next();
				System.out.print("학생 나이 : ");
				int age = sc.nextInt();
				System.out.print("학생 키 : ");
				double height = sc.nextDouble();
				System.out.print("학생 몸무게 : ");
				double weight = sc.nextDouble();
				System.out.print("학생 학년 : ");
				int grade = sc.nextInt();
				System.out.print("학생 전공 : ");
				String major = sc.nextLine();
				
				pc.insertStudnet(name, age, height, weight, grade, major);
				
				System.out.println("\n=== 이어서 입력하시겠습니까? ===");
				System.out.print("그만하시려면 N 또는 n, 이어하시려면 아무 키나 입력해주세요 : ");
				char menuChoice = sc.next().charAt(0);
				
				if(menuChoice == 'N' || menuChoice == 'n') {
					System.out.println("메인메뉴로 돌아갑니다.");
					return;
				}
			}
		}
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
