package Control.com.bs.practice.chap01.ControlPractice;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 예시와 같이 메뉴를 출력한다.
		 * 예시
		 * 1. 입력
		 * 2. 수정
		 * 3. 조회
		 * 4. 삭제
		 * 7. 종료
		 * 2. 메뉴 번호를 누르면 "00메뉴입니다." 출력
		 * 3. 종료 번호를 누르면 "프로그램이 종료됩니다" 출력
		 */
		
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		System.out.print("메뉴번호를 선택해주세요 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1 :
				System.out.println("입력 메뉴입니다.");
				break;
			case 2 :
				System.out.println("수정 메뉴입니다.");
				break;
			case 3 :
				System.out.println("조회 메뉴입니다.");
				break;
			case 4 : 
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7 :
				System.out.println("프로그램이 종료됩니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 정수를 입력받는다.
		 * 2. 정수가 양수이면서 짝수면 "짝수다" 출력
		 * 3. 정수가 양수이면서 짝수가 아니면 "홀수다" 출력
		 * 4. 정수가 양수가 아니면 "양수만 입력해주세요" 출력
		 */
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(0 < num && num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if(num % 3 == 0 || num == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 국어, 영어, 수학 세 과목의 점수를 입력받는다.
		 * 2. 세 과목의 합계와 평균을 계산한다.
		 * 2-1. 합계와 평균을 이용해 합격 / 불합격을 출력한다.
		 * 2-2. 합격 : 세 과목의 점수가 각각 40점 이상 평균 60점 이상
		 * 2-3. 불합격 : 합격 조건에 부합하지 않은 경우
		 * 3. 합격일 경우 "축하합니다. 합격입니다!" / 불합격일 경우 "불합격입니다." 출력
		 */
		System.out.print("국어 점수를 입력해주세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력해주세요 : ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		double average = total / 3.0;
		
		if(kor < 40 || eng < 40 || mat < 40 || average < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.printf("국어점수 : %d\n영어점수 : %d\n수학점수 : %d\n합계 : %d\n평균 : %.1f\n",
					kor, eng, mat, total, average);
			System.out.println("축하합니다. 합격입니다!");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		/*
		 * switch문으로 봄, 여름, 가을, 겨울 표현하기
		 * 1, 2, 12월 -> 겨울 | 3, 4, 5월 -> 봄 | 6, 7, 8월 -> 여름 | 9, 10, 11월 -> 가을 
		 */
		System.out.println("월을 입력해주세요 : ");
		int season = sc.nextInt();
		switch(season) {
			case 12, 1, 2 :
				System.out.printf("%d월은 겨울입니다.", season);
				break;
			case 3, 4, 5 :
				System.out.printf("%d월은 봄입니다.", season);
				break;
			case 6, 7, 8 :
				System.out.printf("%d월은 여름입니다.", season);
				break;
			case 9, 10, 11 :
				System.out.printf("%d월은 가을입니다.", season);
				break;
			default :
				System.out.printf("%d월은 잘못 입력된 달입니다.", season);
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 아이디와 비밀번호를 저장한 변수를 만든다.
		 * 2. 사용자에게 아이디와 비밀번호를 입력받는다.
		 * 3. 저장한 변수의 값과 사용자가 입력한 값을 비교한다.
		 * 3-1. 둘 다 같으면 "로그인 성공" 출력
		 * 3-2. 둘 다 다르면 "로그인 실패" 출력
		 * 3-3. 아이디 혹은 비밀번호가 틀렸을시, "아이디가 틀렸습니다.", "비밀번호가 틀렸습니다" 처럼 출력해서 알려주기
		 */
		String userID = "admin";
		String userPW = "12345";
		
		System.out.print("아이디를 입력해주세요 : ");
		String idInput = sc.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		String pwInput = sc.next();
		
		if(idInput.equals(userID) && pwInput.equals(userPW)) {
			System.out.println("로그인 성공");
		} else if(!idInput.equals(userID)) {
			System.out.println("아이디가 틀렸습니다.");
		} else if(!pwInput.equals(userPW)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 관리자, 회원, 비회원 중 하나를 입력받고 각 등급의 권한을 출력한다.
		 * 2. 관리자 = 회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
		 * 3. 회원 = 게시글 작성, 게시글 조회, 댓글 작성
		 * 4. 비회원 = 게시글 조회
		 */
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String user = sc.next();
		
		switch(user) {
			case "관리자" :
				System.out.print("회원 관리 	게시글 관리		게시글 작성		게시글 조회		댓글 작성");
				break;
			case "회원" :
				System.out.print("게시글 작성	게시글 조회 	댓글 작성");
				break;
			case "비회원" :
				System.out.print("게시글 조회");
				break;
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 키, 몸무게를 입력받는다. (double 형)
		 * 2. BMI지수 계산 : BMI = 몸무게 / (키(m) * (키(m))
		 * 2-1. BMI 지수가 18.5미만일 경우 저체중
		 * 2-2. BMI 지수가 18.5이상 23미만일 경우 정상체중
		 * 2-3. BMI 지수가 23이상 25미만일 경우 과체중
		 * 2-4. BMI 지수가 25이상 30미만일 경우 비만
		 * 2-5. BMI 지수가 30이상일 경우 고도 비만
		 */
		System.out.print("키를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double result = weight / (height * height);
		
		if(result < 18.5) {
			System.out.printf("BMI지수 : %f\n저체중", result);
		} else if (18.5 <= result && result < 23) {
			System.out.printf("BMI지수 : %f\n정상체중", result);
		} else if (23 <= result && result < 25) {
			System.out.printf("BMI지수 : %f\n과체중", result);
		} else if (25 <= result && result < 30) {
			System.out.printf("BMI지수 : %f\n비만", result);
		} else {
			System.out.printf("BMI지수 : %f\n고도 비만", result);
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 두 개의 정수와 연산 기호를 입력받는다.
		 * 2. 입력받은 정수와 연산기호에 맞춰 연산 결과를 출력한다.
		 * 3. 단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력했을 시 "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력
		 */
		System.out.print("첫번째 피연산자 입력 : ");
		int num = sc.nextInt();
		System.out.print("두번째 피연산자 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
			case '+' :
				System.out.printf(num + " %c " + num2 + " = " + (num + num2), operator);
				break;
			case '-' :
				System.out.printf(num + " %c " + num2 + " = " + (num - num2), operator);
				break;
			case '*' :
				System.out.printf(num + " %c " + num2 + " = " + (num * num2), operator);
				break;
			case '/' :
				System.out.printf(num + " %c " + num2 + " = " + (num / (double) num2), operator);
				break;
			case '%' :
				System.out.printf(num + " %c " + num2 + " = " + (num % (double) num2), operator);
				break;
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 중간고사, 기말고사, 과제점수, 출석회수를 입력받는다.
		 * 2. 입력받은 값으로 "Pass" 또는 "Fail"을 출력한다.
		 * 3. 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어졌다.
		 * 4. 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산한다.
		 * 5. 70점 이상일 경우 "Pass", 70점 미만이거나 전체 강의에 30% 이상 결석 시 "Fail"을 출력한다.
		 */
		System.out.print("중간고사 점수를 입력하세요 : ");
		int test1 = sc.nextInt();
		System.out.print("기말고사 점수를 입력하세요 : ");
		int test2 = sc.nextInt();
		System.out.print("과제점수를 입력하세요 : ");
		int test3 = sc.nextInt();
		System.out.print("출석회수를 입력하세요 : ");
		int attendance = sc.nextInt();
		
		double result = (test1 * 0.2) + (test2 * 0.3) + (test3 * 0.3) + attendance;
		
		System.out.println("중간고사 점수(20%) : " + (double) (test1 * 0.2));
		System.out.println("기말고사 점수(30%) : " + (double) (test2 * 0.3));
		System.out.println("과제점수(30%) : " + (double) (test3 * 0.3));
		System.out.println("출석회수(20%) : " + (double) (attendance));
		System.out.println("총점 : " + result);
		
		if(attendance <= 14) {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]", attendance);
		} else if (result < 70) {
			System.out.println("Fail [점수미달]");
		} else {
			System.out.println("Pass");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현
		 */
		System.out.println("실행할 기능을 선택하세요 : ");
		System.out.println("1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n9. P/F");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1 :
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice1();
				break;
			case 2 :
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice2();
				break;
			case 3 :
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice3();
				break;
			case 4 : 
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice4();
				break;
			case 5 :
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice5();
				break;
			case 6 :
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice6();
				break;
			case 7 :
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice7();
				break;
			case 8 : 
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice8();
				

	case 9 :
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice9();
				break;
			case 10 :
				System.out.printf("선택 %d, 프로그램 실행\n", choice);
				practice10();
				break;
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 4자리 비밀번호 정수를 입력받는다.
		 * 2. 입력받은 정수가 각 자리수에 중복되는 값이 없으면 "생성 성공" 출력
		 * 2-1. 중복되는 값이 있으면 "중복 값 있음" 출력
		 * 2-2. 자리수가 4자리 초과면 "자리수 안맞음" 출력
		 * 3. 단, 제일 앞자리수는 1~9 사이 정수
		 */
		System.out.print("비밀번호 입력(10000~9999) : ");
		int num = sc.nextInt();
		double remainNum1 = (num * 0.001) % 10;
		double remainNum2 = (num * 0.01) % 10;
		double remainNum3 = (num * 0.1) % 10;
		int remainNum4 = num % 10;
		
		String maxNum =  Integer.toString(num);
		
		if(maxNum.length() > 4) {
			System.out.println("자리수 안맞음");
		} else if((int) remainNum1 == (int) remainNum2 || (int) remainNum1 == (int) remainNum3
				|| (int) remainNum1 == remainNum4 || (int) remainNum2 == (int) remainNum3
				|| (int) remainNum2 == remainNum4 || (int) remainNum3 == remainNum4) {
			System.out.println("중복값 있음");
		} else if((int) remainNum1 >= 10 || (int) remainNum1 <= 0) {
			System.out.println("1~9사이의 정수를 입력해주세요.");
		} else {
			System.out.println("생성 성공!");
		}
	}
}
