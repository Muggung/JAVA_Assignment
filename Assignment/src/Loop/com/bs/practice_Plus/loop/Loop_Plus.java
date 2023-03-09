package Loop.com.bs.practice_Plus.loop;

import java.util.Scanner;

public class Loop_Plus {
	public void practice1() {
		/*
		 * 1부터 100까지 출력하기
		 */
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	public void practice2() {
		/*
		 * 100부터 1까지 출력하기
		 */
		for(int i=100; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	public void practice3() {
		/*
		 * 1부터 100까지 숫자 중 짝수만 출력하기
		 */
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void practice4() {
		/*
		 * 1부터 100까지 전부 더하기
		 */
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 입력한 정수 짝수만 출력
		 */
		System.out.print("정수 입력 : ");
		int inputNum = sc.nextInt();
		
		for(int i=1; i<=inputNum; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 입력한 정수 짝수만 출력하고 더하기
		 */
		System.out.print("정수 입력 : ");
		int inputNum = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=inputNum; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("합계 : " + sum);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 정수를 입력받는다.
		 * 2. 입력받은 정수만큼 "수박"을 출력
		 * 3. 짝수면 "박"
		 * 3-1. 홀수면 "수" 출력
		 */
		System.out.print("정수 입력 : ");
		int waterMelon = sc.nextInt();
		
		for(int i=1; i<= waterMelon; i++) {
			if(i % 2 == 0) {
				System.out.print("박");
			} else {
				System.out.print("수");
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 정수를 입력한다.
		 * 2. 입력한 정수의 구구단을 출력
		 * 3. 정수는 1 ~ 9사이의 숫자를 입력받고 숫자가 일치하지않으면 "잘못입력했습니다." 출력
		 */
		System.out.println("=====구구단=====");
		System.out.print("몇 단 : ");
		int multiNum = sc.nextInt();
		if(multiNum > 10 || multiNum < 1) {
			System.out.println("잘못입력했습니다. 프로그램을 종료합니다.");
		} else {
			for(int i=1; i<=9; i++) {
				System.out.println(multiNum + " * " + i + " = " + multiNum * i);
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 문자열을 입력받는다.
		 * 2. 문자 값을 입력받고 문자열에 포함되어있는지 확인
		 * 3. 문자열에 포함된 문자 값이라면 "포함된 갯수 : @개" 출력
		 * 4. 입력받은 문자열에 영어가 아니면 "영문자가 아닙니다." 출력
		 */
		System.out.print("문자열을 입력 : ");
		String userInput = sc.next();
		
		int count = 0;
		
		for(int i=0; i<userInput.length(); i++) {
			if(userInput.charAt(i) >= 'a' && userInput.charAt(i) <= 'z' || userInput.charAt(i) <= 'A' && userInput.charAt(i) <= 'Z') {
				System.out.print("문자 입력 : ");
				char userChoice = sc.next().charAt(0);
				if(userInput.charAt(i) == userChoice) {
					count++;
				}
				System.out.println("포함된 갯수 : " + count + "개");
				break;
			} else {
				System.out.println("영문자가 아닙니다.");
				break;
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 이름, 나이, 주소, 키, 몸무게, 연락처를 입력받는다.
		 * 2. 입력받은 값들을 저장한다.
		 * 3. 저장받은 값들을 마지막에 모두 출력한다.
		 */
		boolean isOK = false;
		String msg = "";
		
		while(!isOK) {
			System.out.println("이름을 입력해주세요 : ");
			String name = sc.next();
			System.out.println("나이를 입력해주세요 : ");
			int age = sc.nextInt();
			System.out.println("주소를 입력해주세요 : ");
			String address = sc.next();
			System.out.println("키를 입력해주세요 : ");
			double height = sc.nextDouble();
			System.out.println("몸무게를 입력해주세요 : ");
			double weight = sc.nextDouble();
			System.out.println("연락처를 입력해주세요 : ");
			String phone = sc.next();
			
			msg += name + " " + age + "세 " + address + " " + height + "cm " + weight + "kg " + phone + "\n";
			
			System.out.println("저장되었습니다. 다시 작성하시겠습니까??(Y/N) ");
			char isfine = sc.next().charAt(0);
			
			if(isfine == 'N') {
				System.out.println(msg + "\n");
				isOK = true;
			}
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 숫자를 입력받는다.
		 * 2. 각 숫자마다 0. 게임시작  1.  오크사냥(+1exp)  2. 용사냥(+15exp)  3. 사람사냥  99.게임종료
		 * 3. 위의 값들 중 하나를 입력받고 '게임종료'를 입력받을 때 까지 반복한다.
		 * 4. '게임종료'를 입력받으면 "정말로 종료하시겠습니까?" 출력 후 결정에 따르기
		 */
		System.out.println("\t0. 사냥시작");
		System.out.print("여기에 0을 입력하면 게임시작 : ");
		
		int userEXP = 0;
		int count = 0;
		int gameStart = sc.nextInt();
		char userMSG = ' ';
		boolean exit = false;
		
		if(gameStart == 0) {
			while(!exit) {
				System.out.println("\n사냥을 시작합니다. 1. 오크사냥   2. 용사냥   3. 사람사냥   99. 게임종료");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1 :
					System.out.println("\n오크사냥 완료!! +1exp");
					count++;
					userEXP++;
					if(userEXP >= 100) {
						System.out.println("당신은 최강이 됐습니다..");
						exit =true;
					}
					break;
				case 2 :
					System.out.println("\n용사냥 완료!! +15exp");
					count++;
					userEXP += 15;
					if(userEXP >= 100) {
						System.out.println("당신은 최강이 됐습니다..");
						exit =true;
					}
					break;
				case 3 :
					System.out.println("\n사람사냥 실패... 다시 시작하시겠습니까??");
					userMSG = sc.next().charAt(0);
					if(userMSG == 'Y') {
						userEXP = 0;
						count = 0;
						System.out.println("~~~~~~~파이팅~~~~~~~~");
					} else {
						exit = true;
					}
					break;
				case 99 :
					System.out.println("게임을 종료하시겠습니까??\n(Y/N)");
					userMSG = sc.next().charAt(0);
					if(userMSG == 'Y') {
						exit = true;
					} else {
						System.out.println("게임을 다시 시작합니다.");
						userEXP = 0;
						count = 0;
					}
					break;
				}
			}
		}
		System.out.println("사냥을 마쳤습니다. 사냥한 몹의 수는 " + count + "마리, 획득한 경험치는 " + userEXP + "EXP 입니다.");
	}
}
