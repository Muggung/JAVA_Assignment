package com.bs.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bs.practice.generics.controller.FarmController;
import com.bs.practice.generics.model.vo.Farm;
import com.bs.practice.generics.model.vo.Fruit;
import com.bs.practice.generics.model.vo.Nut;
import com.bs.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	// 메인 메뉴
	public void mainMenu() {
		System.out.println("=====***** BS 마트 *****=====");
		while(true) {
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("입력 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : adminMenu(); break;
				case 2 : customerMenu(); break;
				case 9 : System.out.println("===== 프로그램 종료 ====="); return;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	// 직원 메뉴
	public void adminMenu() {
		while(true) {
			System.out.println("=====***** 직원 메뉴 *****=====");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로");
			System.out.print("입력 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : addNewKind(); break;
				case 2 : removeKind(); break;
				case 3 : changeAmount(); break;
				case 4 : printFarm(); break;
				case 9 : return;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	// 고객 메뉴
	public void customerMenu() {
		while(true) {
			System.out.println("===== 현재 저희 BS마트 농산물 수량 =====");
			printFarm();
			System.out.println("=====***** 고객 메뉴 *****=====");
			System.out.println("1. 농산물 구매");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로");
			System.out.print("입력 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : buyFarm(); break;
				case 2 : removeFarm(); break;
				case 3 : printBuyFarm(); break;
				case 9 : return;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	// 농산물 추가
	public void addNewKind() {
		// 농산물 추가 실패 시 반복되는 기능을 바꿔서 추가 실패 시 메인메뉴로 돌아감
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 입력 : ");
			int choice = sc.nextInt();
			
			Farm f = new Farm();
			
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("수량 : ");
			int quantity = sc.nextInt();
			
			switch(choice) {
				case 1 : f = new Fruit("과일", name); break;
				case 2 : f = new Vegetable("채소", name); break;
				case 3 : f = new Nut("견과", name); break;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
			
			System.out.println(fc.addNewKind(f, quantity) ? "새 농산물이 추가되었습니다. :)" : "새 농산물 추가 실패했습니다. :(");
			return;
		}
	}
	
	// 농산물 삭제
	public void removeKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 입력 : ");
			int choice = sc.nextInt();
			
			Farm f = new Farm();
			
			sc.nextLine();
			System.out.print("삭제할 이름 : ");
			String name = sc.nextLine();
			
			switch(choice) {
				case 1 : f = new Fruit("과일", name); break;
				case 2 : f = new Vegetable("채소", name); break;
				case 3 : f = new Nut("견과", name); break;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
			
			System.out.println(fc.removeKind(f) ? "농산물 삭제 성공했습니다. :)" : "농산물 삭제 실패했습니다. :(");
			return;
		}
	}
	
	// 농산물 수량 수정
	public void changeAmount() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 입력 : ");
			int choice = sc.nextInt();
			
			Farm f = new Farm();
			
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int quantity = sc.nextInt();
			
			switch(choice) {
				case 1 : f = new Fruit("과일", name); break;
				case 2 : f = new Vegetable("채소", name); break;
				case 3 : f = new Nut("견과", name); break;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
			
			System.out.println(fc.changeAmount(f, quantity) ? "수량 수정 성공했습니다. :)" : "수량 수정 실패했습니다. :(");
			return;
		}
	}
	
	// 농산물 목록
	public void printFarm() {
		System.out.println("=====***** 농산물 *****=====");
		
		HashMap<Farm, Integer> farmMap = fc.printFarm();
		
		// 심심한 출력이면 메뉴로 돌아가는 기능 구현
		if(farmMap.size() < 1) {
			System.out.println("!!!!! 농산물이 없어요. 직원에게 추가해달라고 하세요 !!!!!");
			return;
		}
		
		// 정렬 기능 구현해봄
	    List<Farm> farmList = new ArrayList<Farm>(farmMap.keySet());
	    farmList.sort((f1, f2) -> f1.getKind().compareTo(f2.getKind()));
		
	    farmList.forEach((f) -> {
			if(f instanceof Fruit) {
				System.out.println(((Fruit)f) + "(" + farmMap.get(f) + "개)");
			} else if(f instanceof Vegetable) {
				System.out.println(((Vegetable)f) + "(" + farmMap.get(f) + "개)");
			} else if(f instanceof Nut) {
				System.out.println(((Nut)f) + "(" + farmMap.get(f) + "개)");
			}
		});
	}
	
	// 농산물 구매
	public void buyFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매할 종류 입력 : ");
			int choice = sc.nextInt();
			
			Farm f = new Farm();
			
			sc.nextLine();
			System.out.print("구매할 농산물 : ");
			String name = sc.nextLine();
			
			switch(choice) {
				case 1 : f = new Fruit("과일", name); break;
				case 2 : f = new Vegetable("채소", name); break;
				case 3 : f = new Nut("견과", name); break;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
			
			System.out.println(fc.buyFarm(f) ? "구매 성공 :)" : "구매 실패 :(");
			return;
		}
	}
	
	// 농산물 구매 취소
	public void removeFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("제거할 종류 입력 : ");
			int choice = sc.nextInt();
			
			Farm f = new Farm();
			
			sc.nextLine();
			System.out.print("구매취소할 농산물 : ");
			String name = sc.nextLine();
			
			switch(choice) {
				case 1 : f = new Fruit("과일", name); break;
				case 2 : f = new Vegetable("채소", name); break;
				case 3 : f = new Nut("견과", name); break;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
			
			System.out.println(fc.removeFarm(f) ? "구매취소 성공했습니다. :)" : "구매취소 실패했습니다. :(");
			return;
		}
	}
	
	// 구입한 농산물 출력
	public void printBuyFarm() {
		System.out.println("===== 구매하신 목록 =====");
		ArrayList<Farm> farmList = fc.printBuyFarm();
		Iterator<Farm> it = farmList.iterator();
		
		if(farmList.size() < 1) {
			System.out.println("구매하신 농산물이 없어요 :(");
		} else {
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
