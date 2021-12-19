package by.epam.training.onlineshop.entity;

import java.util.Objects;

public class Book implements Goods{
	private String title;
	private int price;
	private String author;
	
	public Book(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String info() {
		return "Book title=" + title + ", price=" + price; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, price, title);
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
		return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
	}

	@Override
	public int price() {
		return price;
	}

	@Override
	public String title() {
		return title;
	}

	@Override
	public int compareTo(Goods o) {
		return this.price - o.price();
	}
	
	
	
}
