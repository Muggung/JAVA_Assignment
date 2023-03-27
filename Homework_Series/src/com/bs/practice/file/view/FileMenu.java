package com.bs.practice.file.view;

import java.util.Scanner;

import com.bs.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		// 메인 메뉴 구현
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 노트 닫기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : fileSave(); break;
				case 2 : fileOpen(); break;
				case 3 : fileEdit(); break;
				case 9 : System.out.println("===== 프로그램을 종료합니다. ====="); return;
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void fileSave() {
		/* 1. 'ex끝it'를 입력할 때까지 사용자가 내용을 입력하고 StringBuilder에 저장한다.
		 * 2. 저장할 파일명을 사용자에게 입력받는다.
		 * 2-1. 이 때 이미 존재하는 파일명이라면 '이미 존재하는 파일입니다. 덮어쓰시겠습니까?(Y/N)' 출력
		 * 2-2. 'Y'를 입력했을 때, FileController에 fileSave() 메서드로 파일명과 StringBuilder 넘김
		 * 2-3. 'N'을 입력했을 때, 저장할 파일명을 입력받게 반복
		 * 3. 저장할 파일명이 존재하지 않으면 FileController에 fileSave() 메서드로 파일명과 내용을 넘김
		 */
		StringBuilder content = new StringBuilder();
		String fileName = "";
		String userInput = "";
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력해주세요\nex끝it <- 입력하면 종료됩니다.");
			System.out.print("입력 : ");
			userInput = sc.next();
			
			if(userInput.equals("ex끝it")) {
				break;
			} else {
				content.append(userInput);
			}
		}
		
		
		while(true) {
			System.out.print("저장할 파일명을 입력해주세요 : ");
			fileName = sc.next();
			
			if(fc.checkName(fileName)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(Y/N)");
				char choice = sc.next().charAt(0);
				if(choice == 'Y') {
					break;
				}
			} else {
				break;
			}
		}
		fc.fileSave(fileName, content);
		
	}
	
	public void fileOpen() {
		/* 1. 파일명을 입력받는다.
		 * 2. 입력받은 파일명은 FileController의 checkName()메서드의 반환 값에 따라 나뉜다.
		 * 3-1. 반환 값이 true면 FileController의 fileOpen() 메서드의 매개변수로 넘겨 반환 값 출력
		 * 3-2. 반환 값이 false면 "없는 파일입니다." 출력 후 메인메뉴로 돌아감 
		 */
		System.out.print("파일명을 입력해주세요 : ");
		String fileName = sc.next();
		if(fc.checkName(fileName)) {
			System.out.println(fc.fileOpen(fileName));
		} else {
			System.out.println("없는 파일입니다. 메인메뉴로 돌아갑니다.");
			return;
		}
		
	}
	
	public void fileEdit() {
		/* 1. 파일명을 입력받는다.
		 * 2. 입력받은 파일명은 FileController의 checkName()메서드의 반환 값에 따라 나뉜다.
		 * 3-1. 반환 값이 true면 fileSave()메서드처럼 입력받기, 반복 종료 후 FileController의 fileEdit()메서드에 파일명과 StringBuilder 전달
		 * 3-2. 반환 값이 false면 "없는 파일입니다." 출력 후 메인메뉴로 돌아감
		 */
		String userInput = "";
		StringBuilder content = new StringBuilder();
		
		System.out.print("수정할 파일명 : ");
		String editFileName = sc.next();
		
		if(fc.checkName(editFileName)) {
			while(true) {
				System.out.println("파일에 저장할 내용을 입력해주세요\nex끝it <- 입력하면 종료됩니다.");
				System.out.print("입력 : ");
				userInput = sc.next();
				
				if(userInput.equals("ex끝it")) {
					fc.fileEdit(editFileName, content);
					return;
				} else {
					content.append(userInput);
				}
			}
		} else {
			System.out.println("없는 파일입니다. 메인메뉴로 돌아갑니다.");
			return;
		}
	}
}
