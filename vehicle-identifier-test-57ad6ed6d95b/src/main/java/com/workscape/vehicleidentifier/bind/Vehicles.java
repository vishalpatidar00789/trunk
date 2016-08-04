package com.workscape.vehicleidentifier.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vehicles {
	private List<Vehicle> vehicles;
	
	public Vehicles() {
		super();
	}
	
	public Vehicles(List<Vehicle> vehicles) {
		super();
		this.vehicles = vehicles;
	}
	
	@XmlElement(name="vehicle")
	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
}
