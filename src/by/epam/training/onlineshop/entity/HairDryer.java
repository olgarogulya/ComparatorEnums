package by.epam.training.onlineshop.entity;

import java.util.Objects;

import by.epam.training.onlineshop.enums.EnergySaveType;

public class HairDryer extends Appliances{
	private int numberVolumes;
	private int temperatureMode;
	private boolean airIonizer;
	
	public HairDryer() {}
	
	public HairDryer(String model, int price, int powerConsumption, EnergySaveType energySavingType,
			int numberVolumes, int temperatureMode, boolean  airIonizer) {
		super(model, price, powerConsumption, energySavingType);
		this.numberVolumes = numberVolumes;
		this.temperatureMode = temperatureMode;
		this.airIonizer = airIonizer;
	}

	public int getNumberVolumes() {
		return numberVolumes;
	}

	public void setNumberVolumes(int numberVolumes) {
		this.numberVolumes = numberVolumes;
	}

	public int getTemperatureMode() {
		return temperatureMode;
	}

	public void setTemperatureMode(int temperatureMode) {
		this.temperatureMode = temperatureMode;
	}

	public boolean isAirIonizer() {
		return airIonizer;
	}

	public void setAirIonizer(boolean airIonizer) {
		this.airIonizer = airIonizer;
	}
	
	public String info() {
		return "HairDryer numberVolumes=" + numberVolumes + ", temperatureMode=" + temperatureMode + ", airIonizer=" + airIonizer; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(airIonizer, numberVolumes, temperatureMode);
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
		HairDryer other = (HairDryer) obj;
		return airIonizer == other.airIonizer && numberVolumes == other.numberVolumes
				&& temperatureMode == other.temperatureMode;
	}

}
