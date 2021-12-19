package by.epam.training.onlineshop.entity;

import java.util.Objects;

import by.epam.training.onlineshop.enums.EnergySaveType;

public class Fridge extends Appliances{
	private int weight;
	private int freezeVolume;
	private int numberShelves;
	
	public Fridge() {}
	
	public Fridge(String model, int price, int powerConsumption, EnergySaveType energySavingType,
			int weight, int freezeVolume, int numberShelves) {
		super(model, price, powerConsumption, energySavingType);
		this.weight = weight;
		this.freezeVolume = freezeVolume;
		this.numberShelves = numberShelves;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezeVolume() {
		return freezeVolume;
	}

	public void setFreezeVolume(int freezeVolume) {
		this.freezeVolume = freezeVolume;
	}

	public int getNumberShelves() {
		return numberShelves;
	}

	public void setNumberShelves(int numberShelves) {
		this.numberShelves = numberShelves;
	}
	
	public String info() {
		return "Fridge weight=" + weight + ", freezeVolume=" + freezeVolume + ", numberShelves=" + numberShelves;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(freezeVolume, numberShelves, weight);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fridge other = (Fridge) obj;
		return freezeVolume == other.freezeVolume && numberShelves == other.numberShelves && weight == other.weight;
	}

	
}
