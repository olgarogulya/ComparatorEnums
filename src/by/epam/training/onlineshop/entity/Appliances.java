package by.epam.training.onlineshop.entity;

import java.util.Objects;

import by.epam.training.onlineshop.enums.EnergySaveType;

public class Appliances implements Goods{
	private String title;
	private int price;
	private int powerConsumption;
	private EnergySaveType energySavingType;
	
	public Appliances() {}
	
	public Appliances(String title, int price, int powerConsumption, EnergySaveType energySavingType) {
		super();
		this.title = title;
		this.price = price;
		this.powerConsumption = powerConsumption;
		this.energySavingType = energySavingType;	
	}

	public String getTitle() {
		return title;
	}

	public void setModel(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public EnergySaveType getEnergySavingType() {
		return energySavingType;
	}

	public void setEnergySavingType(EnergySaveType energySavingType) {
		this.energySavingType = energySavingType;
	}
	
	public String info() {
		return "price=" + price + ", powerConsumption=" + powerConsumption + ", energySavingType - " + energySavingType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(energySavingType, title, powerConsumption, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliances other = (Appliances) obj;
		return Objects.equals(energySavingType, other.energySavingType) && Objects.equals(title, other.title)
				&& powerConsumption == other.powerConsumption && price == other.price;
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
