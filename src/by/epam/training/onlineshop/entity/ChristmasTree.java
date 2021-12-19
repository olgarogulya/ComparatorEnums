package by.epam.training.onlineshop.entity;

import java.util.Objects;

public class ChristmasTree implements Goods{
	private String title;
	private int price;
	private int height;
	private String material;
	
	public ChristmasTree(String title, int price, int height, String material) {
		this.title = title;
		this.price = price;
		this.height = height;
		this.material = material;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String info() {
		return "ChristmasTree title=" + title + ", price=" + price; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, material, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChristmasTree other = (ChristmasTree) obj;
		return height == other.height && Objects.equals(material, other.material) && price == other.price
				&& Objects.equals(title, other.title);
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
