package com.bs.practice.list.library.model.vo;

import java.util.Objects;
import java.util.jar.Attributes.Name;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}

	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "제목 : " + title + ", 저자 : " + author + ", 장르 : " + category + ", 가격 : " + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
	}
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}
}
