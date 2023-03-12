package com.bs.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		/*
		 * 1. 3행 3열짜리 문자열 배열을 선언 및 할당한다.
		 * 2. 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 "(0,0)"과 같은 형식으로 출력한다.
		 */
		String strArr[][] = new String[3][3];
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				strArr[i][j] = i + "," + j;
				System.out.print("(" + strArr[i][j] + ")");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		/*
		 * 1. 4행 4열짜리 정수형 배열을 선언 및 할당한다.
		 * 2. 1 ~ 16까지 값을 차례대로 저장하고 출력한다.
		 */
		int intArr[][] = new int[4][4];
		int count = 1;
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = count++;
				System.out.printf("%-3d", intArr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		/*
		 * 1. 4행 4열짜리 정수형 배열을 선언 및 할당한다.
		 * 2. 1 ~ 16까지 값을 차례대로 저장하고 거꾸로 출력한다.
		 */
		int intArr[][] = new int[4][4];
		
		int count = 16;
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = count--;
				System.out.printf("%-3d", intArr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		/*
		 * 1. 4행 4열의 2차원 배열을 생성한다.
		 * 2. 0행 0열부터 2행 2열까지는 1 ~ 10까지의 임의의 정수 값을 저장한다.
		 * 3. '실습문제4' 그림표 처럼 결과를 출력한다.
		 */
		int sumArr[][] = new int[4][4];
		
		for(int i=0; i<sumArr.length; i++) {
			for(int j=0; j<sumArr.length-1; j++) {
				if(i==3) {
					System.out.print(" " + sumArr[3][j]);	
				} else {
					sumArr[i][j] = (int) (Math.random() * 10) + 1;
					System.out.print(" " + sumArr[i][j]);
					sumArr[i][3] += sumArr[i][j];
					sumArr[3][j] += sumArr[i][j];
					sumArr[3][3] += sumArr[i][j] * 2;
				}
			}
			System.out.println(" " + sumArr[i][3]);
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 배열의 행과 열의 크기를 입력받는다.
		 * 2. 1 ~ 10사이의 숫자가 아니면 "반드시 1 ~ 10사이의 정수를 입력해야 합니다." 출력 후 다시 입력받기
		 * 3. 크기가 정해진 2차원 배열 안에 영어 대문자가 랜덤으로 들어가게 한 뒤 출력
		 */
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		System.out.print("열 크기 : ");
		int col = sc.nextInt();
		
		while(1 > row || 10 < row || 1 > col || 10 < col) {
			System.out.print("반드시 1 ~ 10사이의 정수를 입력해야 합니다. 다시 입력해주세요.");
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			System.out.print("열 크기 : ");
			col = sc.nextInt();
		}
		
		char engArr[][] = new char[row][col];
		
		for(int i=0; i<engArr.length; i++) {
			for(int j=0; j<engArr[i].length; j++) {
				char randomAlpha = (char) ((Math.random() * 25) + 65);
				engArr[i][j] = randomAlpha;
				System.out.print(engArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		/*
		 * 1. 아래 초기화된 배열을 가지고 '실습문제6 그림'의 흐름대로 출력한다.
		 * 2. 단, print()를 사용하고 값 사이에 띄어쓰기가 존재하도록 출력
		 */
		// 초기화된 배열
		String[][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"},
			{"원","열", "니", "로", "시"},
			{"배", "심", "다", "좀", "다"},
			{"열", "히", "! ", "더", "!! "}};
		
		// 문제 풀이
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr.length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 행의 크기를 입력받고 입력받은 수만큼 반복을 통해 열의 크기도 받는다.
		 * 2. 문자형 가변 배열을 선언 및 할당한다.
		 * 3. 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장 후 출력
		 */
		System.out.print("행 크기를 입력해주세요 : ");
		int row = sc.nextInt();
		
		char alpha = 'a';
		
		char alphaArr[][] = new char[row][];
		
		for(int i=0; i<alphaArr.length; i++) {
			System.out.print(i + "행의 크기 : ");
			int col = sc.nextInt();
			alphaArr[i] = new char[col]; 
			for(int j=0; j<col; j++) {
				alphaArr[i][j] = alpha++;
			}
		}
		
		for(int i=0; i<alphaArr.length; i++) {
			for(int j=0; j<alphaArr[i].length; j++) {
				System.out.print(alphaArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		/*
		 * 1. 1차원 배열에 12명의 학생들을 출석부 순으로 초기화한다.
		 * 2. 2열 3행으로 2차원 배열 2개를 이용해 분단을 나눈다,
		 * 3. 1분단 왼쪽부터 오른쪽, 1행에서 아래 순으로 자리 배치
		 */
		String studentArr[] = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배"
				, "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		int studentNum = 0;
		
		String studentArrOne[][] = new String [3][2];
		String studentArrTwo[][] = new String [3][2];
		
		System.out.println("== 1분단 == ");
		for(int i=0; i<studentArrOne.length; i++) {
			for(int j=0; j<studentArrOne[i].length; j++) {
				studentArrOne[i][j] = studentArr[studentNum];
				studentNum++;
				System.out.print(studentArrOne[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0; i<studentArrTwo.length; i++) {
			for(int j=0; j<studentArrTwo[i].length; j++) {
				studentArrTwo[i][j] = studentArr[studentNum];
				studentNum++;
				System.out.print(studentArrTwo[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. practice8번 문제랑 동일
		 * 2. 자리 배치한것을 가지고 학생이름을 검색하여 해당 학생 자리 출력하기
		 */
		String studentArr[] = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배"
				, "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		int studentNum = 0;
		char row = ' ';
		String col = "";
		
		String studentArrOne[][] = new String [3][2];
		String studentArrTwo[][] = new String [3][2];
		
		System.out.println("== 1분단 == ");
		for(int i=0; i<studentArrOne.length; i++) {
			for(int j=0; j<studentArrOne[i].length; j++) {
				studentArrOne[i][j] = studentArr[studentNum];
				studentNum++;
				System.out.print(studentArrOne[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0; i<studentArrTwo.length; i++) {
			for(int j=0; j<studentArrTwo[i].length; j++) {
				studentArrTwo[i][j] = studentArr[studentNum];
				studentNum++;
				System.out.print(studentArrTwo[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("====================");
		System.out.print("검색할 학생 이름을 입력해주세요 : ");
		String studentName = sc.next();
		
		for(int i=0; i<studentArrOne.length; i++) {
			for(int j=0; j<studentArrOne[i].length; j++) {
				if(studentArrOne[i][j].equals(studentName)) {
					if(i==0) {
						row = '첫';
					} else if(i==1) {
						row = '두';
					} else if(i==2) {
						row = '세';
					}
					if(j==0) {
						col = "왼";
					} else if(j==1) {
						col = "오른";
					}
					System.out.printf("검색하신 %s 학생은 1분단 %c번째 줄 %s쪽에 있습니다.",studentName, row, col);
				}
			}
		}
		
		for(int i=0; i<studentArrTwo.length; i++) {
			for(int j=0; j<studentArrTwo[i].length; j++) {
				if(studentArrTwo[i][j].equals(studentName)) {
					if(i==0) {
						row = '첫';
					} else if(i==1) {
						row = '두';
					} else if(i==2) {
						row = '세';
					}
					if(j==0) {
						col = "왼";
					} else if(j==1) {
						col = "오른";
					}
					System.out.printf("검색하신 %s 학생은 2분단 %c 번째 줄 %s쪽에 있습니다.",studentName, row, col);
				}
			}
		}
	}
}
