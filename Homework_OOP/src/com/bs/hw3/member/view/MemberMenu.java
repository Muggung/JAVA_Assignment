package com.bs.hw3.member.view;

import java.util.Arrays;
import java.util.Scanner;

import com.bs.hw3.member.controller.MemberController;

// 화면 출력 & 사용자에게 입력받는 클래스
public class MemberMenu {
	// import
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	// 생성자
	public MemberMenu() {}
	
	// 메소드
	// 메인메뉴 출력
	public void mainMenu() {
		// 조건1. 현재 등록된 회원 수에 따라 메인메뉴를 다르게 출력한다.
		if(mc.existMemberNum() < 10) {
			// 1-1. 현재 등록된 회원 수가 10명이 아닐 때
			while(true) {
				System.out.println("===== 최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다. =====");
				System.out.println("===== 현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다. =====");
				System.out.println("1. 신규 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 전체 회원 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int menuChoice = sc.nextInt();
				
				switch(menuChoice) {
					case 1 : insertMember(); break;
					case 2 : searchMember(); break;
					case 3 : updateMember(); break;
					case 4 : deleteMember(); break;
					case 5 : printAll(); break;
					case 9 : System.out.println("프로그램 종료합니다."); return;
					default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
				}
			}
		} else {
			// 1-2. 현재 등록된 회원 수가 10명일 때
			while(true) {
				System.out.println("===== 회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다. =====");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 전체 회원 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int menuChoice = sc.nextInt();
				
				switch(menuChoice) {
					case 2 : searchMember(); break;
					case 3 : updateMember(); break;
					case 4 : deleteMember(); break;
					case 5 : printAll(); break;
					case 9 : System.out.println("프로그램 종료합니다."); return;
					default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
				}
			}
		}
	}
	
	// 회원등록정보 입력
	public void insertMember() {
		/* 1. 아이디, 이름, 비밀번호, 이메일, 성별, 나이 입력받기
		 * 2. MemberController checkId() 메소드를 통해 회원 아이디 중복 검사
		 * 2-1. 중복 값이 없으면 다음으로 넘어감
		 * 2-2. 중복 값이 있으면 "중복된 아이디입니다. 다시 입력해주세요." 출력 후 다시 입력받기
		 * 3. 성별은 M,F || m,f가 아니면 "성병을 다시 입력해주세요." 출력 후 다시 입력받기
		 * 4. 모든 데이터를 입력받았으면 MemberController insertMember() 메소드의 매개변수로 넘김
		 */
		String id = "";
		char gender = ' ';
		while(true) {
			// 아이디 중복 확인
			System.out.print("아이디 입력 : ");
			id = sc.next();
			if(mc.checkId(id))	break;
			else System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("비밀번호 입력 : ");
		String password = sc.next();
		sc.nextLine();
		System.out.print("이메일 입력 : ");
		String email = sc.nextLine();
		while(true) {
			// 성별 값 확인
			System.out.print("성별(M/F) 입력 : ");
			gender = sc.next().charAt(0);
			if(gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') break;
			else System.out.println("성별을 다시 입력해주세요.");
		}
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	// 검색메뉴 출력
	public void searchMember() {
		// 메뉴에 없는 번호 입력했을 경우 "잘못입력하셨습니다." 출력 후 mainMenu로 돌아감
		System.out.println("===== 회원 검색 메뉴 =====");
		System.out.println("1. 아이디로 검색");
		System.out.println("2. 이름으로 검색");
		System.out.println("3. 이메일로 검색");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuChoice = sc.nextInt();
		
		switch(menuChoice) {
			case 1 : searchId(); break;
			case 2 : searchName(); break;
			case 3 : searchEmail(); break;
			case 9 : return;
			default : System.out.println("잘못입력하셨습니다. 메인메뉴로 돌아갑니다."); return;
		}
	}
	
	// ID검색 입력
	public void searchId() {
		/* 1. 아이디를 사용자에게 입력받는다.
		 * 2. MainController searchId() 메소드의 매개변수로 넘기고 반환 값에 따라 결과 출력
		 * 2-1. 검색 결과 없으면 "검색 결과 없습니다." 출력 후 mainMenu로 돌아감
		 * 2-2. 검색 결과 있으면 "찾으신 회원 조회 결과입니다." 출력 후 검색 결과 출력
		 */
		System.out.println("===== 아이디로 회원 조회 =====");
		System.out.print("찾으실 회원 아이디 : ");
		String id = sc.next();
		System.out.println("찾으신 회원 조회 결과입니다.");
		System.out.println(mc.searchId(id));
	}
	
	// 이름검색 입력
	public void searchName() {
		// searchId()랑 동일 단, 객체배열로 반환 받음
		System.out.println("===== 이름으로 회원 조회 =====");
		System.out.print("찾으실 회원 이름 : ");
		String name = sc.next();
		// Member를 import하면 쉬울것 같은데... 추가하면 안되는 것 같아 이렇게 풀었음... 
		if(mc.searchName(name).length < 1) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i=0; i<mc.searchName(name).length; i++) {
				System.out.println(mc.searchName(name)[i].inform());
			}
		}
	}
	
	// 이메일검색 입력
	public void searchEmail() {
		// searchName()과 동일
		System.out.println("===== 이메일로 회원 조회 =====");
		System.out.print("찾으실 회원 이메일 : ");
		String email = sc.next();
		if(mc.searchEmail(email).length < 1) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i=0; i<mc.searchEmail(email).length; i++) {
				System.out.println(mc.searchEmail(email)[i].inform());
			}
		}
	}
	
	// 회원정보수정 메뉴출력
	public void updateMember() {
		// 메뉴에 없는 번호 입력했을 경우 "잘못입력하셨습니다." 출력 후 mainMenu로 돌아감
		System.out.println("===== 회원 정보 수정 =====");
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 이름 수정");
		System.out.println("3. 이메일 수정");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuChoice = sc.nextInt();
		
		switch(menuChoice) {
			case 1 : updatePassword(); break;
			case 2 : updateName(); break;
			case 3 : updateEmail(); break;
			case 9 : return;
			default : System.out.println("잘못입력하셨습니다. 메인 메뉴로 돌아갑니다."); return;
		}
	}
	
	// 비밀번호수정 입력
	public void updatePassword() {
		/* 1. 수정할 회원 아이디와 비밀번호를 입력받는다.
		 * 2. 입력받은 데이터를 MemberController updatePassword() 메소드의 매개변수로 넘김
		 * 3. 반환 값에 따라 출력 후 mainMenu로 돌아감
		 * 3-1. 검색결과 없으면 "존재하지않는 아이디입니다." 출력
		 * 3-2. 검색결과 있으면 "수정이 성공적으로 되었습니다." 출력
		 */
		System.out.println("===== 비밀번호 수정 =====");
		System.out.print("회원 아이디 : ");
		String id = sc.next();
		if(mc.checkId(id)) {
			System.out.println("존재하지않는 아이디입니다.");
			return;
		} else {
			System.out.print("수정할 비밀번호 : ");
			String pw = sc.next();
			if(mc.updatePassword(id, pw)) {
				System.out.println("수정이 성공적으로 되었습니다.");
				return;
			}
		}
	}
	
	// 이름수정 입력
	public void updateName() {
		// updatePassword()과 동일
		System.out.println("===== 이름 수정 =====");
		System.out.print("회원 아이디 : ");
		String id = sc.next();
		if(mc.checkId(id)) {
			System.out.println("존재하지않는 아이디입니다.");
			return;
		} else {
			System.out.print("수정할 이름 : ");
			String name = sc.next();
			if(mc.updateName(id, name)) {
				System.out.println("수정이 성공적으로 되었습니다.");
				return;
			}
		} 
	}
	
	// 이메일수정 입력
	public void updateEmail() {
		// updateName()과 동일
		System.out.println("===== 이메일 수정 =====");
		System.out.print("회원 아이디 : ");
		String id = sc.next();
		if(mc.checkId(id)) {
			System.out.println("존재하지않는 아이디입니다.");
			return;
		} else {
			System.out.print("수정할 이메일 : ");
			String email = sc.next();
			if(mc.updateEmail(id, email)) {
				System.out.println("수정이 성공적으로 되었습니다.");
				return;
			}
		}
	}
	
	// 삭제메뉴 출력
	public void deleteMember() {
		// 메뉴에 없는 번호 입력했을 경우 "잘못입력하셨습니다." 출력 후 mainMenu로 돌아감
		System.out.println("===== 회원 삭제 메뉴 =====");
		System.out.println("1. 특정 회원 삭제");
		System.out.println("2. 모든 회원 삭제");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuChoice = sc.nextInt();
		
		switch(menuChoice) {
			case 1 : deleteOne(); return;
			case 2 : deleteAll(); return;
			case 9 : return;
			default : System.out.println("잘못입력하셨습니다. 메인 메뉴로 돌아갑니다."); return;
		}
	}
	
	// 회원정보 하나 삭제 후 결과 출력
	public void deleteOne() {
		/* 1. 삭제할 회원 아이디를 입력받는다.
		 * 2. 사용자에게 정말 삭제할건지 Y/N으로 묻는다.
		 * 3. Y의 경우 MemberController delete() 메소드의 매개변수로 아이디를 넘김
		 * 3-1. N의 경우 mainMenu로 돌아감
		 * 4. MemberController delete()의 반환 값에 따라 출력 후 mainMenu로 돌아감
		 * 4-1. 검색결과 없으면 "존재하지않는 아이디입니다." 출력
		 * 4-2. 검색결과 있으면 "성공적으로 삭제하였습니다." 출력
		 */
		System.out.println("===== 특정 회원 삭제 =====");
		System.out.print("삭제할 회원 아이디 : ");
		String id = sc.next();
		
		if(mc.checkId(id)) {
			System.out.println("존재하지않는 아이디입니다.");
		} else {
			System.out.print("정말로 삭제하시겠습니까?(Y/N)");
			char choice = sc.next().charAt(0);
			if(choice == 'N') {
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			} else if (choice == 'Y') {
				System.out.println(mc.delete(id) ? "성공적으로 삭제했습니다." : "삭제 실패했습니다. :(");
				return;
			}
		}
		
	}
	
	// 회원정보 전체 삭제 후 결과 출력
	public void deleteAll() {
		
	}
	
	// 전체회원 조회 후 출력
	public void printAll() {
		
	}
}
