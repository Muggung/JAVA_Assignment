package com.bs.practice.book.model.vo;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable{
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
	
	public Book() {}

	public Book(String title, String author, int price, Calendar date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DATE);
		return title + ", 저자 : " + author + "\t 가격 : " + price + "\t 출판날짜 : " + year + "년 " + month + "월 " + day + "일" + "\t 할인율 : " + discount;
	}
}
