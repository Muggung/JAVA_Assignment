package com.bs.hw3.member.controller;

import com.bs.hw3.member.model.vo.Member;

// MemberMenu의 각 기능을 담당하는 클래스
public class MemberController {
	// 필드 선언 (Member import)
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	// 메소드
	// Member[]에 저장된 객체 수
	public int existMemberNum() {
		int count = 1;
		for(Member mb : m) {
			if(mb != null) {
				count++;   
			} else {
				count--;
				break;
			}
		}
		return count;
	}
	
	// 중복 아이디 확인
	public boolean checkId(String inputId) {
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}
	
	// Member[]에 Member 객체 저장
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i=0; i<m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				return;
			}
		}
	}
	
	// id로 회원조회
	public String searchId(String id) {
		String findId = "";
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(id)) {
				findId = mb.inform();
				break;
			} else {
				findId = "검색결과가 없습니다.";
			}
		}
		return findId;
	}
	
	// 이름으로 회원조회
	public Member[] searchName(String name) {
		// 문제대로 풀기 너무 복잡했음...ㅠㅠ
		Member[] nameArr;
		int arrLength = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)){
				arrLength++;
			}
		}
		nameArr = new Member[arrLength];
		for(int i=0; i<m.length; i++) {
			arrLength = 0;
			if(m[i] != null && m[i].getName().equals(name)){
				nameArr[arrLength++] = m[i];
			}
		}
		return nameArr;
	}
	
	// 이메일로 회원조회
	public Member[] searchEmail(String email) {
		Member[] emailArr;
		int arrLength = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)){
				arrLength++;
			}
		}
		emailArr = new Member[arrLength];
		for(int i=0; i<m.length; i++) {
			arrLength = 0;
			if(m[i] != null && m[i].getEmail().equals(email)){
				emailArr[arrLength++] = m[i];
			}
		}
		return emailArr;
	}
	
	// 비밀번호 변경
	public boolean updatePassword(String id, String password) {
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(id)) {
				mb.setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	// 이름 변경
	public boolean updateName(String id, String name) {
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(id)) {
				mb.setName(name);
				return true;
			}
		}
		return false;
	}
	
	// 이메일 변경
	public boolean updateEmail(String id, String email) {
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(id)) {
				mb.setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	// 회원정보 하나 삭제
	public boolean delete(String id) {	
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(id)) {
				mb.setId(null);
				mb.setName(null);
				mb.setPassword(null);
				mb.setEmail(null);
				mb.setAge(0);
				mb.setGender(' ');
				mb = null;
				return true;
			}
		}
		return false;
	}
	
	// 전체회원정보 삭제
	public void delete() {
		
	}
	
	// 
	public Member[] printAll() {
		
	}
}
