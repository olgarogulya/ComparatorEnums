package by.epam.training.onlineshop.entity;

import java.util.Objects;

public class FlowerPot implements Goods{
	private String title;
	private int price;
	private String flower;
	
	public FlowerPot(String title, int price, String flower) {
		this.title = title;
		this.price = price;
		this.flower = flower;
	}

	public FlowerPot(String title, int price) {
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

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	public String info() {
		return "FlowerPot title=" + title + ", price=" + price; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(flower, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlowerPot other = (FlowerPot) obj;
		return Objects.equals(flower, other.flower) && price == other.price && Objects.equals(title, other.title);
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
