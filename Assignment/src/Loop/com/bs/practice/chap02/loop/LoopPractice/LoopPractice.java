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
		} else {
			System.out.println("같은 숫자를 입력했습니다.");
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
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 값을 입력받는다.
		 * 2. 입력받은 값의 구구단 값 * 9까지 출력한다.
		 */
		System.out.print("값을 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.printf("======%d단======\n", num);
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. practice9와 동일
		 * 2. 9를 초과하는 수를 입력했으면 "9이하의 숫자를 입력해주세요" 출력
		 * 3. 출력 후 다시 사용자가 값을 입력한다.
		 */
		System.out.print("값을 입력해주세요 : ");
		int num = sc.nextInt();
		
		while(num > 9) {
			System.out.println("9이하의 숫자를 다시 입력해주세요.");
			num = sc.nextInt();
		}
		
		System.out.printf("======%d단======\n", num);
		for(int i=0; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. practice9와 동일
		 * 2. 9를 초과하는 수를 입력했으면 "9이하의 숫자를 입력해주세요" 출력
		 * 3. 출력 후 다시 사용자가 값을 입력한다.
		 */
		System.out.print("값을 입력해주세요 : ");
		int num = sc.nextInt();
		
		while(num > 9) {
			System.out.println("9이하의 숫자를 다시 입력해주세요.");
			num = sc.nextInt();
		}
		
		System.out.printf("======%d단======\n", num);
		for(int i=0; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 숫자와 공차를 입력받는다.
		 * 2. 일정한 값으로 숫자가 커지거나 작아지는 기능구현
		 * 3. 단, 출력되는 숫자는 총 10개다.
		 */
		System.out.print("숫자를 입력해주세요 : ");
		int userNum = sc.nextInt();
		System.out.print("공차를 입력해주세요 : ");
		int toleNum = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(userNum + " ");
			userNum += toleNum;
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 정수 두 개의 값과 연산자를 입력받고 연산자에 따라 알맞게 연산 후 출력
		 * 2. 연산자 입력 시 "exit"가 들어올 때 까지 반복
		 * 3. exit입력받으면 "프로그램 종료합니다." 출력
		 * 3-1. 연산자가 나누기이면서 두번째 정수가 0일 경우 "0으로 나눌 수 없습니다. 다시 입력해주세요." 출력
		 * 3-2. 없는 연산자 입력시 "없는 연산자입니다. 다시 입력해주세요." 출력
		 * 3-3. 두 경우 모두 처음으로 돌아가 다시 연산자부터 입력받는다.
		 */
		boolean isOver = false;
		String opStr = "";
		
		while(!isOver) {
			System.out.print("연산자를 입력해주세요(+,-,*,/) : ");
			opStr = sc.next();
			if(opStr.equals("exit")) {
				System.out.println("프로구램을 종료합니다.");
				break;								// break문은 가까운 반복문을 종료한다.
			}
			System.out.print("첫번째 정수를 입력해주세요 : ");
			int firstNum = sc.nextInt();
			System.out.print("두번째 정수를 입력해주세요 : ");
			int secondNum = sc.nextInt();
			
			switch(opStr) {
				case "+" :
					System.out.print(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
					isOver = true;
					break;
				case "-" :
					System.out.print(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
					isOver = true;
					break;
				case "*" :
					System.out.print(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
					isOver = true;
					break;
				case "/" :
					System.out.print(firstNum + " / " + secondNum + " = " + (double)(firstNum / secondNum));
					isOver = true;
					break;
				default :
					if(!(opStr.equals("+") || opStr.equals("-") || opStr.equals("*") || opStr.equals("/"))) {
						System.out.println("없는 연산자입니다. 다시 입력해주세요.");
						break;
					}
					break;
				}
			while(secondNum == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void  practice13(){
		Scanner sc = new Scanner(System.in);
		/*
		 * 별찍기
		 */
		System.out.print("숫자를 입력해주세요 : ");
		int starNum = sc.nextInt();
		
		for(int i=1; i<=starNum; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 별찍기 거꾸로
		 */
		System.out.print("숫자를 입력해주세요 : ");
		int starNum = sc.nextInt();
		
		for(int i=1; i<=starNum; i++) {
			for(int j=starNum; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자한테 하나의 값을 입력받는다.
		 * 2. 입력받은 값이 소수인지 판별한다.
		 * 3. 단, 입력받은 값이 2 미만일 경우 "잘못입력하셨습니다." 출력
		 */
		System.out.print("숫자를 입력해주세요 : ");
		int decimal = sc.nextInt();
		int isDecimal = -1;
		
		if(decimal < 2) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			for(int i=1; i<=decimal; i++) {
				if(decimal % i == 0 || decimal % i == 0) {
					isDecimal += 1;
				}
			}
			System.out.println(isDecimal == 1 ? "소수입니다." : "소수가 아닙니다.");
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. practice15랑 동일한 기능이다.
		 * 2. 단, 입력받은 값이 2 미만일 경우 "잘못입력했습니다." 출력 후 다시 사용자가 값을 입력
		 */
		System.out.print("숫자를 입력해주세요 : ");
		int decimal = sc.nextInt();
		int isDecimal = -1;
		
		while(decimal < 2) {
			System.out.println("잘못입력했습니다. 다시입력해주세요 : ");
			decimal = sc.nextInt();
		}
		
		for(int i=1; i<=decimal; i++) {
			if(decimal % i == 0) {
				isDecimal++;
			}
		}
		System.out.println(isDecimal == 1 ? "소수입니다." : "소수가 아닙니다.");
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자에게 정수를 입력받는다.
		 * 2. 입력받은 정수를 2부터 정수까지의 모든 소수를 출력한다.
		 * 3. 입력한 수가 2 미만일 경우 "잘못입력했습니다." 출력
		 */
		System.out.print("숫자를 입력해주세요 : ");
		int decimal = sc.nextInt();
		
		if(decimal < 2) {
			System.out.print("잘못입력했습니다.");
		} else {
			for(int i=1; i<=decimal; i++) {
				int isDecimal = -1;
				for(int j=1; j<=i; j++) {
					if(i % j == 0) {
						isDecimal++;
					}
				}
				if(isDecimal == 1) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 값을 입력받는다.
		 * 2. 1부터 입력받은 값까지 중 아래 조건을 출력한다.
		 * 2-1. 2와 3의 배수를 모두 출력
		 * 2-2. 2와 3의 공배수를 출력
		 */
		System.out.print("수를 입력해주세요 : ");
		int drainAge = sc.nextInt();
		int drainCount = 0;
		
		for(int i=1; i<=drainAge; i++) {
			if(i % 3 == 0 || i % 2 ==0) {
				System.out.print(i + " \n");
				drainCount++;
			}
		}
		System.out.println("count = " + drainCount + "개");
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 별찍기
		 */
		System.out.println("수를 입력해주세요 : ");
		int starNum = sc.nextInt();
		
		for(int i=1; i<=starNum; i++) {
			for(int j=starNum; j>=1; j--) {
				if(j>i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 별찍기
		 */
		System.out.print("수를 입력해주세요 : ");
		int starNum = sc.nextInt();
		for(int i=1; i<=starNum; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=2; i<=starNum; i++) {
			for(int j=starNum; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 별찍기
		 */
		System.out.print("수를 입력해주세요 : ");
		int starNum = sc.nextInt();
		
		for(int i=1; i<=starNum; i++) {
			for(int j=starNum; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int j=2; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 별찍기
		 */
		System.out.println("수를 입력해주세요 : ");
		int starNum = sc.nextInt();
		
		for(int i=1; i<=starNum; i++) {
			for(int j=1; j<=starNum; j++) {
				if(i==1 || i==starNum || j==1 || j==starNum) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}