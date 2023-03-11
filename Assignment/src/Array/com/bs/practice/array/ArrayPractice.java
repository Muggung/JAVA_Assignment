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
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 3이상인 홀수를 입력받는다.
		 * 2. 배열의 중간까지 1부터 1씩 증가하여 오름차순으로 값을 넣는다.
		 * 3. 중간 이후부터 끝까지 1씩 감소하여 내림차순으로 값을 넣는다.
		 * 4, 단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요" 출력 후 다시 입력받기
		 */
		System.out.print("숫자를 입력해주세요 : ");
		int userNum = sc.nextInt();
		
		while(userNum % 2 == 0 || userNum < 3) {
			System.out.print("다시 입력하세요 : ");
			userNum = sc.nextInt();
		}
		
		int middleArr[] = new int[userNum];
		int middleNum = (userNum-1) / 2; 
		
		for(int i=0; i<middleArr.length; i++) {
			if(middleNum < i) {
				middleArr[i] = userNum - i;
			} else {
				middleArr[i] = i + 1;
			}
			System.out.print(middleArr[i] + " ");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자가 값을 입력한다.
		 * 2. 사용자가 입력한 값이 (치킨메뉴)배열에 있는지 검색
		 * 2-1. 입력한 값이 배열에 있으면 "00치킨 배달 가능" 출력
		 * 2-2. 입력한 값이 배열에 없으면 "00치킨은 없는 메뉴입니다." 출력
		 * 3. 단, (치킨메뉴)배열의 메뉴는 스스로 정한다.
		 */
		System.out.println("=====메뉴=====");
		System.out.println("후라이드 : 15000원\n양념 : 16000원\n반반 : 16000원\n갈릭 : 17000원\n불닭 : 17000원\n치즈 : 17000원");
		
		System.out.print("주문하실 치킨을 입력해주세요 : ");
		String chicken = sc.next();
		String menuMsg = "";
		
		String menu[] = {"후라이드", "양념", "반반", "갈릭", "불닭", "치즈"};
		
		for(int i=0; i<menu.length; i++) {
			if(menu[i].equals(chicken)) {
				menuMsg = chicken + "치킨 배달 가능";
				break;
			} else {
				menuMsg = chicken + "치킨은 없는 메뉴입니다.";
			}
		}
		System.out.println(menuMsg);
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 주민등록번호(-포함)를 입력받는다.
		 * 2. 입력받은 주민등록번호 성별자리부터 *표시로 출력한다.
		 * 3. 단, 원본배열 값은 변경없이 배열 복사본을 이용
		 */
		System.out.print("주민등록번호(-포함)를 입력해주세요 : ");
		String rrn = sc.next();
		
		char rrnArr[] = new char[rrn.length()];
		
		while(rrn.length() > 14 || rrn.length() < 14) {
			System.out.print("다시 입력해주세요 : ");
			rrn = sc.next();
		}
		
		for(int i=0; i<rrnArr.length; i++) {
			rrnArr[i] = rrn.charAt(i);
		}
		
		char rrnClone[] = Arrays.copyOf(rrnArr, rrnArr.length);
		int rrnClonLength = (rrnClone.length + 1) / 2;
		
		for(int i=0; i<rrnClone.length; i++) {
			if(rrnClonLength < i) {
				rrnClone[i] = '*';
			}
			System.out.print(rrnClone[i]);
		}
	}
	
	public void practice11() {
		/*
		 * 1. 길이가 10인 정수형 배열을 만든다.
		 * 2. 배열에 1 ~ 10 사이의 난수를 발생시키고 배열에 초기화 후 출력
		 */
		int randomArr[] = new int[10];
		
		for(int i=0; i<randomArr.length; i++) {
			randomArr[i] = (int) (Math.random() * 10) + 1;		
			System.out.print(randomArr[i] + " ");
		}
	}
	
	public void practice12() {
		/*
		 * 1. 길이가 10인 정수형 배열을 만든다.
		 * 2. 배열에 1 ~ 10 사이의 난수를 발생시키고 배열에 초기화 후 출력
		 * 3. 배열 전체 값들 중 최대값과 최솟값을 출력한다.
		 */
		int randomArr[] = new int[10];
		int max_ArrNum = 0;
		int min_ArrNum = 10;
		
		for(int i=0; i<randomArr.length; i++) {
			randomArr[i] = (int) (Math.random() * 10) + 1;
			if(randomArr[i] > max_ArrNum) {
				max_ArrNum = randomArr[i];
			}
			if(randomArr[i] < min_ArrNum) {
				min_ArrNum = randomArr[i];
			}
			System.out.print(randomArr[i] + " ");
		}
		System.out.println("\n최대값 : " + max_ArrNum);
		System.out.println("최소값 : " + min_ArrNum);
	}
	
	public void practice13() {
		/*
		 * 1. 길이가 10인 정수형 배열을 만든다.
		 * 2. 배열에 1 ~ 10 사이의 난수를 발생시키고 배열에 초기화 후 출력
		 * 3. 단, 배열에 중복된 값이 없어야한다.
		 */
		int randomArr[] = new int[10];
		
		for(int i=0; i<randomArr.length; i++) {
			randomArr[i] = (int) (Math.random() * 10) + 1;
			for(int j=0; j<i; j++) {
				if(randomArr[i] == randomArr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<randomArr.length; i++) {
			System.out.print(randomArr[i] + " ");
		}
	}
	
	public void practice14() {
		/*
		 * 1. 로또번호 생성기를 만든다.
		 * 2. 총 6개의 숫자를 랜덤으로 만들고 중복된 값 없이 오름차순으로 정렬 후 출력
		 */
		int lottoArr[] = new int[6];
		
		for(int i=0; i<lottoArr.length; i++) {
			lottoArr[i] = (int)(Math.random() * 45) + 1;
			for(int j=0; j<i; j++) {
				if(lottoArr[i] == lottoArr[j]) {
					i--;
					break;
				} else if(lottoArr[i] < lottoArr[j]) {
					int t = lottoArr[i];
					lottoArr[i] = lottoArr[j];
					lottoArr[j] = t;
				}
			}
		}
		
		for(int i=0; i<lottoArr.length; i++) {
			System.out.print(lottoArr[i] + " ");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 문자열을 입력받는다.
		 * 2. 입력받은 문자 하나하나를 배열에 넣는다.
		 * 3. 문자열에 있는 문자를 하나씩 출력하고 문자 개수도 함께 출력
		 */
		System.out.print("문자열 입력 : ");
		String msg = sc.next();
		int count = 0;
		
		String msgSum = "";
		char msgArr[] = new char[msg.length()];
		
		for(int i=0; i<msgArr.length; i++) {
			msgArr[i] = msg.charAt(i);
			count++;
			for(int j=0; j<i; j++) {
				if(msgArr[i] == msgArr[j]) {
					count--;
				}
			}
			msgSum += msgArr[i] + ", ";
		}
		System.out.print("문자열에 있는 문자 : " + msgSum);
		System.out.print("\n" + count);
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 사용자가 입력한 정수만큼의 배열의 크기를 선언 및 할당한다.
		 * 2. 배열의 각 인덱스에 넣을 값 또한 사용자가 입력하여 초기화한다.
		 * 3. 단, 사용자에게 값을 더 넣을건지, 몇개를 더 입력할건지, 늘린 공간에 어떤 데이터를 넣을건지 입력받는다.
		 * 4. 사용자가 더이상 입력하지 않겠다고 하면 배열 전체 값을 출력
		 */
		boolean isEnd = false;
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrSize = sc.nextInt();
		
		String msgArr[] = new String[1000];
		
		for(int i=0; i<arrSize; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			msgArr[i] = sc.next();
			if(i == arrSize-1) {
				System.out.print("값을 더 입력하시겠습니까?(Y/N) ");
				char isContinue = sc.next().charAt(0);
				if(isContinue == 'Y') {
					while(!isEnd) {
						System.out.print("더 입력하고 싶은 개수 : ");
						int moreArr = sc.nextInt();
						arrSize += moreArr;
						break;
					}
				} else if (isContinue == 'N') {
					String newArr[] = Arrays.copyOf(msgArr, arrSize);
					System.out.println(Arrays.toString(newArr));
				}
			}
		}
	}
}