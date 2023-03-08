package Loop.com.bs.practice.chap02.loop.LoopPractice;
import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 값을 하나 입력받는다.
		 * 2. 1부터 입력받은 숫자까지 모두 출력한다.
		 * 2-1. 단, 입력받은 값은 1이상이어야한다.
		 * 2-2. 만일 1미만의 숫자를 입력받았으면 "1이상의 숫자를 입력해주세요."를 출력
		 */
		System.out.print("1이상의 숫자를 입력해주세요 : ");
		int userNum = sc.nextInt();
		
		if(userNum < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for(int i=1; i<=userNum; i++) {
				System.out.print(i + "  ");
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. practice1과 동일
		 * 2. 1미만의 숫자를 입력받고 "1이상의 숫자를 입력해주세요."를 출력
		 * 2-1. 다시 사용자가 값을 입력할 수 있도록 한다.
		 */
		System.out.println("1이상의 숫자를 입력해주세요 : ");
		int userNum = sc.nextInt();

			while(userNum < 1) {
				System.out.println("1이상의 숫자를 입력해주세요 : ");
				userNum = sc.nextInt();
			} for(int i=1; i<=userNum; i++) System.out.print(i + "  ");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 입력 값을 받는다.
		 * 2. 1부터 입력받은 값까지 거꾸로 출력한다.
		 * 3. 단, 입력받은 값이 1미만의 숫자라면 "1이상의 숫자를 입력해주세요."를 출력
		 */
		System.out.println("1이상의 숫자를 입력해주세요 : ");
		int userNum = sc.nextInt();
		
		while(1 <= userNum) {
			System.out.print(userNum + "  ");
			userNum--;
		}
		System.out.println(userNum < 1 ? "1이상의 숫자를 입력해주세요." : " ");
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. practice3와 동일
		 * 2. 1미만의 숫자를 입력받고 "1이상의 숫자를 입력해주세요."를 출력
		 * 2-1. 다시 사용자가 값을 입력할 수 있도록 한다.
		 */
		System.out.println("1이상의 숫자를 입력해주세요 : ");
		int userNum = sc.nextInt();
		
		while(1 > userNum) {
			System.out.println("1이상의 숫자를 입력해주세요 : ");
			userNum = sc.nextInt();
		}
		
		if(1 < userNum) {
			for(int i=1; i<=userNum;) {
				for(int j=userNum; j>=i; j--) {
					System.out.print(j + "  ");
				} break;
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 값을 입력받는다.
		 * 2. 1부터 입력받은 값까지의 정수들의 합을 출력한다.
		 */
		System.out.print("정수 하나를 입력하세요 : ");
		int userNum = sc.nextInt();
		int sum = 0;
		String result = "";
		
		for(int i=1; i<=userNum; i++) {
			sum += i;
			if(i == userNum) {
				System.out.println(i + " = " + sum);
			} else {
				System.out.print(i + " + ");
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 두 개의 값을 입력받는다.
		 * 2. 입력받은 두 값의 사이에 있는 숫자를 출력한다.
		 * 3. 만일 1미만의 숫자가 입력된다면 "1이상의 숫자를 입력해주세요." 출력
		 */
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int secondNum = sc.nextInt();
		
		if(firstNum > secondNum) {		
			while(firstNum>=secondNum) {
				System.out.println(secondNum);
				secondNum++;
			}
		} else if(firstNum < secondNum) {
			while(firstNum <= secondNum) {
				System.out.println(firstNum);
				firstNum++;
			}
		} else if(firstNum < 1 || secondNum < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 두 개의 값을 입력받는다.
		 * 2. 입력받은 두 값의 사이에 있는 숫자를 출력한다.
		 * 3. 만일 1미만의 숫자가 입력된다면 "1이상의 숫자를 입력해주세요." 출력
		 */
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int secondNum = sc.nextInt();
		
		while(firstNum < 1 || secondNum < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			
			System.out.print("첫번째 숫자를 입력해주세요 : ");
			firstNum = sc.nextInt();
			System.out.print("두번째 숫자를 입력해주세요 : ");
			secondNum = sc.nextInt();
		}
	
		if(firstNum > secondNum) {		
			while(firstNum>=secondNum) {
				System.out.println(secondNum);
				secondNum++;
			}
		} else if(firstNum < secondNum) {
			while(firstNum <= secondNum) {
				System.out.println(firstNum);
				firstNum++;
			}
		}
	}
}
