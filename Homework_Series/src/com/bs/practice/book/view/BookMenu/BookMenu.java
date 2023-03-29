package com.bs.practice.book.view.BookMenu;

import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

import com.bs.practice.book.controller.BookController;
import com.bs.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		File f = new File("./book.txt");
		
		if(f.isFile()) {
			bArr = bc.fileRead();
		}else {
			bc.makeFile();
		}
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : fileSave(); break;
				case 2 : fileRead(); break;
				case 9 : System.out.println("프로그램 종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void fileSave() {
		Calendar c = Calendar.getInstance();
		
		sc.nextLine();
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("출판날짜(yyyy-mm-dd) : ");
		String date = sc.next();
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		
		String[] cArr = date.split("-");
		
		c.set(Calendar.YEAR, Integer.parseInt(cArr[0]));
		c.set(Calendar.MONTH, Integer.parseInt(cArr[1]));
		c.set(Calendar.DATE, Integer.parseInt(cArr[2]));
		
		for(int i=0; i<bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = new Book(title, author, price, c, discount);
				break;
			}
		}
		
		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		bArr = bc.fileRead();
		
		for(Book b : bArr) {
			if(b != null) {
				System.out.println(b);
			}
		}
	}
}
