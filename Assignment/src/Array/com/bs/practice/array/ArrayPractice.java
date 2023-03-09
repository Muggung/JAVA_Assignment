package Array.com.bs.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		/*
		 * 1. 길이가 10인 배열을 선언한다.
		 * 2. 1부터 10까지의 값을 반복문을 이용해 순서대로 배열 인덱스에 넣고 출력한다.
		 */
		
		int arrTen[] = new int [10];
		
		for(int i=0; i<arrTen.length; i++) {
			arrTen[i] = i + 1;
			System.out.print(arrTen[i] + " ");
		}
	}
	
	public void practice2() {
		/*
		 * 1. 길이가 10인 배열을 선언한다.
		 * 2. 1부터 10까지의 값을 역순으로 배열 인덱스에 넣고 출력한다.
		 */
		
		int arrRevers[] = new int[10];
		
		for(int i=0; i<arrRevers.length; i++) {
			arrRevers[i] = arrRevers.length - i;
			System.out.print(arrRevers[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 입력받은 정수만큼 배열크기를 할당한다.
		 * 2. 1부터 입력받은 값까지 배열에 초기화한 후 출력
		 */
		System.out.print("정수를 입력해주세요 : ");
		int arrNum = sc.nextInt();
		
		int userArr[] = new int[arrNum];
		
		for(int i=0; i<userArr.length; i++) {
			userArr[i] = i + 1;
			System.out.print(userArr[i] + " ");
		}
	}
	
	public void practice4() {
		/*
		 * 1. 길이가 5인 String 배열을 선언한다.
		 * 2. 배열에 "사과", "귤", "포도", "복숭아", "참외" 값을 초기화한다.
		 * 3. 배열 인덱스를 활용해 "귤" 출력
		 */
		String fruit[] = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 문자열을 입력받는다.
		 * 2. 입력받은 문자 하나하나를 배열에 넣는다.
		 * 3. 배열에 검색할 문자가 문자열에 몇 개 들어있는지 개수와 위치한 인덱스 번호를 출력한다.
		 */
		System.out.print("문자열 : ");
		String msg = sc.next();
		System.out.print("문자 : ");
		char letter = sc.next().charAt(0);
		
		String indexNum = "";
		int count = 0;
		char msgArr[] = new char[msg.length()];
		
		for(int i=0; i<msgArr.length; i++) {
			msgArr[i] = msg.charAt(i);
			if(msgArr[i] == letter) {
				indexNum += i + " ";
				count++;
			}
		}
		System.out.printf("%s에 %c가 존재하는 인덱스 : %s\n%c의 개수 : %d", msg, letter, indexNum, letter, count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 문자열 배열을 만들고 "월" ~ "일"까지 값을 초기화한다.
		 * 2. 0부터 6까지 숫자를 입력받아 입력한 숫자와 같은 인덱스에 있는 요일 출력
		 * 3. 범위에 없는 숫자 입력시 "잘못입력했습니다." 출력
		 */
		String monthArr[] = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		System.out.print("월요일(0) ~ 일요일(6)사이 숫자 입력 : ");
		int inputMonth = sc.nextInt();
		
		switch(inputMonth) {
			case 0 :
				System.out.println(monthArr[inputMonth]);
				break;
			case 1 :
				System.out.println(monthArr[inputMonth]);
				break;
			case 2 :
				System.out.println(monthArr[inputMonth]);
				break;
			case 3 :
				System.out.println(monthArr[inputMonth]);
				break;
			case 4 :
				System.out.println(monthArr[inputMonth]);
				break;
			case 5 :
				System.out.println(monthArr[inputMonth]);
				break;
			case 6 :
				System.out.println(monthArr[inputMonth]);
				break;
			default :
				System.out.println("잘못입력했습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 값을 입력받고 값만큼의 크기를 가진 배열을 선언 및 할당한다.
		 * 2. 배열의 크기만큼 사용자가 값을 입력하여 각 인덱스의 값을 초기화한다.
		 * 3. 배열 전체 값을 출력하고 각 인덱스 값의 합을 출력한다.
		 */
		int sum = 0;
		System.out.print("정수를 입력해주세요(배열크기) : ");
		int arrSize = sc.nextInt();
		
		int numArr[] = new int[arrSize];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.printf("배열 %d번째 인덱스 값 : ", i);
			numArr[i] = sc.nextInt();
			sum += numArr[i];
		}
		System.out.println(Arrays.toString(numArr) + "\n총합 : " + sum);
	}
}
