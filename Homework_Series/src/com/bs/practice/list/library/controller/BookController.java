package com.bs.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bs.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList<Book>();
	
	public BookController() {}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		return (ArrayList<Book>)list;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> copyList = new ArrayList<Book>();
		
		list.forEach((b) -> {
			if(b.getTitle().contains(keyword)) {
				copyList.add(b);
			} 
		}); return copyList;
	}
	
	public Book deleteBook(String title, String author) {
		Book book = new Book();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title) && list.get(i).getAuthor().equals(author)) {
				book = list.get(i);
				list.remove(i);
			}
		} return book;
	}
	
	public int ascBook() {
		list.sort((o1, o2) -> ((Book)o1).getTitle().compareTo(((Book)o2).getTitle()));
		return 1;
	}
}
