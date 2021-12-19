package by.epam.training.onlineshop.entity;

import java.util.Objects;

import by.epam.training.onlineshop.enums.EnergySaveType;

public class VacuumCleaner extends Appliances{
	private int numberPowerLevels;
	private int numberBrushes;
	private String brushName;
	
	public VacuumCleaner() {}
	
	public VacuumCleaner(String model, int price, int powerConsumption, EnergySaveType energySavingType, 
			int numberPowerLevels, int numberBrushes, String brushName) {
		super(model, price, powerConsumption, energySavingType);
		this.numberPowerLevels = numberPowerLevels;
		this.numberBrushes = numberBrushes;
		this.brushName = brushName;
	}

	public int getNumberPowerLevels() {
		return numberPowerLevels;
	}

	public void setNumberPowerLevels(int numberPowerLevels) {
		this.numberPowerLevels = numberPowerLevels;
	}

	public int getNumberBrushes() {
		return numberBrushes;
	}

	public void setNumberBrushes(int numberBrushes) {
		this.numberBrushes = numberBrushes;
	}

	public String getBrushName() {
		return brushName;
	}

	public void setBrushName(String brushName) {
		this.brushName = brushName;
	}
	
	public String info() {
		return "VacuumCleaner numberPowerLevels=" + numberPowerLevels + ", numberBrushes=" + numberBrushes + ", brushName=" + brushName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(brushName, numberBrushes, numberPowerLevels);
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
		VacuumCleaner other = (VacuumCleaner) obj;
		return Objects.equals(brushName, other.brushName) && numberBrushes == other.numberBrushes
				&& numberPowerLevels == other.numberPowerLevels;
	}

}
