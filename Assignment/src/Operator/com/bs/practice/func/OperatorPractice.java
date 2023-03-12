package Operator.com.bs.practice.func;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 1
		 * 1. 숫자를 입력받는다.
		 * 2. 입력받은 숫자가 양수면 "양수입니다", 음수면 "양수가 아닙니다" 출력
		 */
		
		System.out.println("숫자를 입력해주세요 : ");
		int inputNum = sc.nextInt();
		
		System.out.println(inputNum > 0 ? "양수입니다." : "양수가 아닙니다.");
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 2
		 * 1. 숫자를 입력받는다.
		 * 2. 입력받은 숫자가 양수면 "양수입니다.", 0이면 "0입니다.", 0이 아니면 "음수입니다." 출력
		 */
		
		System.out.println("숫자를 입력해주세요 : ");
		int inputNum = sc.nextInt();
		
		System.out.println(inputNum > 0 ? "양수입니다." : inputNum == 0 ? "0입니다." : inputNum < 0 ? "음수입니다." : "");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 3
		 * 1. 숫자를 입력받는다.
		 * 2. 입력받은 숫자가 짝수면 "짝수입니다.", 짝수가 아니면 "홀수입니다." 출력
		 */
		
		System.out.println("숫자를 입력해주세요 : ");
		int inputNum = sc.nextInt();
		
		System.out.println(inputNum % 2 == 0 ? "짝수입니다." : "홀수입니다.");
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 4
		 * 1. 인원 수 변수와 사탕 개수 변수를 만들고 변수에 각각 입력받는다.
		 * 2. 1인당 받은 사탕 개수와 남은 사탕 개수를 출력한다.
		 */
		
		System.out.print("인원 수 : ");
		int peopleNum = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candyNum = sc.nextInt();
		
		System.out.print("1인당 사탕 개수 : " + candyNum / peopleNum + "명");
		System.out.print("\n남은 사탕 개수 : " + candyNum % peopleNum + "개");
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 5
		 * 1. 이름, 학년(숫자만), 반(숫자만), 번호(숫자만), 성별(M/F), 성적(소수점 둘째자리까지)를 입력받는다.
		 * 2. 입력 받은 정보를 "@학년 @반 @번 @@@ @학생의 성적은 @점이다." 처럼 출력한다.
		 * 2-1. 이 때 성별이 'M'이면 "남학생", 'F'면 "여학생"으로 출력한다.
		 */
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		System.out.print("학년 : ");
		int userGrade = sc.nextInt();
		
		System.out.print("반 : ");
		int userClass = sc.nextInt();
		
		System.out.print("번호 : ");
		int userNum = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char userGender = sc.next().charAt(0);
		userGender = userGender == 'M' ? '남' : '여';
		
		System.out.print("성적 : ");
		double userScore = sc.nextDouble();
		
		System.out.printf("\n%d학년 %d반 %d번 %s %c학생의 성적은 %.2f점이다.",
				userGrade, userClass, userNum, userName, userGender, userScore);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 6
		 * 1. 나이를 입력받는다.
		 * 2. 입력받은 나이가 어린이(13세 이하)인지, 청소년(13초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력한다.
		 */
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print(age <= 13 ? "어린이" : 13 < age && age <= 19 ? "청소년" : 19 < age ? "성인" : "Err" );
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 7
		 * 1. 국어, 영어, 수학에 대한 점수를 입력받는다.
		 * 2. 세 과목의 합계와 평균을 출력한다.
		 * 3. 점수로 합격 여부를 결정하는데, 세 과목 점수가 각각 40점 이상이며 평균이 60점이상 일 때 "합격", 아니면 "불합격"을 출력한다. 
		 */
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int Score = kor + eng + math;
		double average = Score / 3.0;
		
		System.out.println("합계 : " + Score + "\n평균 : " + average);
		System.out.print(kor < 40 && eng < 40 && math < 40 ? "불합격" : 60 <= average ? "합격" : "불합격");
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 8
		 * 1. 주민번호(- 포함)를 입력받는다.
		 * 2. 입력받은 주민번호(-포함)로 남자인지, 여자인지 출력한다.
		 */
		
		System.out.println("주민번호(- 포함)를 입력해주세요 : ");
		String securityNum = sc.nextLine();
		
		System.out.println(securityNum.length() < 14 || securityNum.length() > 14 ? "잘못입력하셨습니다." :
			securityNum.charAt(8) == '1' ? "남자" : "여자");
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 9
		 * 1. 정수 두개를 입력받아 각각 num1, num2 변수에 저장한다.
		 * 2. 또 다른 정수를 입력받는다.
		 * 3. 입력 받은 정수가 num1 이하거나 num2 초과라면 true 출력, 아니면 false 출력
		 * 4. num1은 num2보다 작아야한다.
		 */
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		System.out.print("정수 3 : ");
		int num3 = sc.nextInt();
		
		System.out.println(num1 < num2 && num1 >= num3 || num2 < num3 ? true : false);
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습문제 10
		 * 1. 세개의 수를 입력받는다.
		 * 2. 세개의 수가 모두 같은 수면 true, 아니면 false 출력
		 */
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 수 : ");
		int num3 = sc.nextInt();
		
		boolean isSame = num1 == num2 && num2 == num3 && num1 == num3 ? true : false;
		System.out.println(isSame);
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		/*
		 * 실습문제 11
		 * 1. 각각 A, B, C사원의 연봉을 입력받는다.
		 * 2. 입력받은 각각의 연봉과 인센티브 포함한 연봉을 출력한다.
		 * 3. 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000미만" 출력
		 * 4. 인센티브는 A = 0.4, B = 없음, C = 0.15다.
		 */
		
		double incen_A = 0.4, incen_B = 0, incen_C = 0.15;
		
		System.out.print("A사원 연봉 : ");
		int salary_A = sc.nextInt();
		System.out.print("B사원 연봉 : ");
		int salary_B = sc.nextInt();
		System.out.print("C사원 연봉 : ");
		int salary_C = sc.nextInt();
		
		double resultA = salary_A + (salary_A * incen_A);
		double resultB = salary_B + (salary_B * incen_B);
		double resultC = salary_C + (salary_C * incen_C);
		
		System.out.println("A사원 연봉/연봉 + a : " + salary_A + "/" + df.format(resultA));
		System.out.println(resultA >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("B사원 연봉/연봉 + a : " + salary_B + "/" + df.format(resultB));
		System.out.println(resultB >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("C사원 연봉/연봉 + a : " + salary_C + "/" + df.format(resultC));
		System.out.println(resultC >= 3000 ? "3000 이상" : "3000 미만");
	}
}
