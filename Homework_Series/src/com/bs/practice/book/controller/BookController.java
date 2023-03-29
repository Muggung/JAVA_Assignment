package com.bs.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.bs.practice.book.model.dao.BookDAO;
import com.bs.practice.book.model.vo.Book;

public class BookController {
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		File f = new File("./book.txt");
		try {
			f.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
