package Casting.com.bs.practice;

import java.util.Scanner;

public class CastingPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 문자 하나를 입력받는다.
		 * 2. 입력받은 문자의 유니코드를 출력한다.
		 */
		System.out.println("문자 하나를 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		System.out.println(ch + " unicode : " + (int) ch);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받는다.
		 * 2. 입력받은 세 과목의 합과 평균을 출력한다.
		 * 3. 출력하는 합과 평균은 정수형으로 한다.
		 */
		System.out.print("국어 점수를 입력해주세요 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 점수를 입력해주세요 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 점수를 입력해주세요 : ");
		double mat = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(kor + eng + mat));
		System.out.println("평균 : " + (int)(kor + eng + mat) / 3);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 선언 및 초기화된 5개의 변수를 가진다.
		 * 2. 5개의 변수로 알맞은 사칙연산(+,-,*,/)과 형변환을 이용한다.
		 * 3. 적힌 값과 같은 값이 나오도록 코드를 작성한다.
		 */
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 - iNum2 * 2);					// 2
		System.out.println((int)dNum);							// 2
		
		System.out.println((double)(iNum2 * 2 + (int)dNum));	// 10.0
		System.out.println((double)iNum1);						// 10.0
		
		System.out.println((double)(iNum1 - iNum2 * 2) + 0.5);	// 2.5
		System.out.println(dNum);								// 2.5
		
		System.out.println((int)fNum);							// 3
		System.out.println(iNum1 - (int)fNum - iNum2);  		// 3
		
		System.out.println(iNum1 / fNum);						// 3.3333333
		System.out.println(iNum1 / (double)fNum);				// 3.3333333333333335
		
		System.out.println(ch);									// 'A'
		System.out.println((int)ch);							// 65
		
		System.out.println((int)ch + iNum1);					// 75
		System.out.println((char)((int)ch + iNum1));			// 'K'
	}

}
