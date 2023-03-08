package Variable.com.bs.practice;
import java.util.Scanner;

public class VariablePractice {
	public void user() {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 실습 문제 1
		 * 1. 이름, 성별, 나이, 키를 각 변수에 입력받는다.
		 * 2. 입력받은 변수에 값을 출력한다.
		 */
		
		// 1. 이름, 성별, 나이, 키를 각 변수에 입력받는다.
		System.out.println("이름을 입력해주세요 : ");
		String name = sc.next();
		
		System.out.println("성별(남/여)을 입력해주세요 : ");
		char gender = sc.next().charAt(0);
		
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		System.out.println("키를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		// 2. 입력받은 변수에 값을 출력한다.
		System.out.printf("키 %.1fcm인 %d살 %c %s님 반갑습니다^^", height, age, gender, name);
	}
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 실습 문제2
		 * 1. 정수 두 개의 값을 입력 받는다.
		 * 2. 두 개의 값과 각 정수의 합, 빼기, 곱하기, 나누기를 화면에 출력한다.
		 */
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int firstNum = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int twoNum = sc.nextInt();
		
		System.out.printf("첫번째 숫자 : %d 두번째 숫자 : %d", firstNum, twoNum);
		System.out.println("\n더하기 결과 : " + (firstNum + twoNum));
		System.out.println("빼기 결과 : " + (firstNum - twoNum));
		System.out.println("곱하기 결과 : " + (firstNum * twoNum));
		System.out.println("나누기 결과 : " + (firstNum / twoNum));
	}
}
