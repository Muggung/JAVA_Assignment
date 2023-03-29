package com.bs.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.bs.practice.list.library.controller.BookController;
import com.bs.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	// 메인메뉴 출력
	public void mainMenu() {
		while(true) {
			System.out.println("=====***** 메인메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : insertBook(); break;
				case 2 : selectList(); break;
				case 3 : searchBook(); break;
				case 4 : deleteBook(); break;
				case 5 : ascBook(); break;
				case 9 : System.out.println("===== 프로그램을 종료합니다. ======"); return; 
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	// 1. 새 도서 추가
	public void insertBook() {
		String category = "";
		boolean isLoop = true;
		
		sc.nextLine();
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		while(isLoop) {
			System.out.println("1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타");
			System.out.print("장르 : ");
			int categoryInt = sc.nextInt();
		
			switch(categoryInt) {
				case 1 : category = "인문"; isLoop = false; break;
				case 2 : category = "자연과학"; isLoop = false; break;
				case 3 : category = "의료"; isLoop = false; break;
				case 4 : category = "기타"; isLoop = false; break;
				default : System.out.println("장르 번호를 다시 입력해주세요."); break;
			}
		}
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		bc.insertBook(new Book(title, author, category, price));
	}
	
	// 2. 도서 전체 조회
	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다. :(");
		} else {
			System.out.println("=====***** 책 전체 조회 *****=====");
			bookList.forEach((b) -> System.out.println(b));
		}
	}
	
	// 3. 도서 검색 조회
	public void searchBook() {
		System.out.println("=====***** 도서 검색 *****=====");
		System.out.print("찾는 책 입력 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다. :(");
		} else {
			System.out.println("=====***** 검색 조회 *****=====");
			searchList.forEach((b) -> System.out.println(b));
		}
	}
	
	// 4. 도서 삭제
	public void deleteBook() {
		System.out.println("=====***** 도서 삭제 *****=====");
		System.out.print("삭제할 책 입력 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("삭제할 책 저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다. :(");
		} else {
			System.out.println("성공적으로 삭제되었습니다. :)");
		}
	}
	
	// 5. 오름차순 정렬
	public void ascBook() {
		if(bc.ascBook() > 0) {
			System.out.println("정렬 성공하였습니다. :)");
		} else {
			System.out.println("정렬 실패했습니다. :(");
		}
	}
}
