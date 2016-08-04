package com.workscape.vehicleidentifier.bind;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.workscape.vehicleidentifier.constants.Frames;
import com.workscape.vehicleidentifier.constants.Powertrains;
import com.workscape.vehicleidentifier.constants.VehicleType;


public class Vehicle implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4553258578944935436L;
	
	
	private String id;
	private Frame frame;
	private List<Wheel> wheels;
	private Powertrain powertrain;
	
	private VehicleType vehicleType;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String id, Frame frame, List<Wheel> wheels, Powertrain powertrain, VehicleType vehicleType) {
		super();
		this.id = id;
		this.frame = frame;
		this.wheels = wheels;
		this.powertrain = powertrain;
		this.vehicleType = vehicleType;
	}
	
	@XmlElement
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement
	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	
	@XmlElementWrapper
	@XmlElement(name="wheel")
	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	
	@XmlElement
	public Powertrain getPowertrain() {
		return powertrain;
	}

	public void setPowertrain(Powertrain powertrain) {
		this.powertrain = powertrain;
	}

	public VehicleType getVehicleType() {
		if(null==vehicleType){
			identifyAndSetVehicleType();
		}
		return vehicleType;
	}

	/*public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}*/
	
	public void identifyAndSetVehicleType(){
		if(null==vehicleType){
			if(Frames.PLASTIC.equals(this.frame.getMaterial()) 
					&& Powertrains.HUMAN.equals(this.powertrain.getHuman())
					&& 3==this.getWheels().size()){
				this.vehicleType = VehicleType.BIGWHEEL;
			} else if(Frames.METAL.equals(this.frame.getMaterial()) 
					&& Powertrains.HUMAN.equals(this.powertrain.getHuman())
					&& 2==this.getWheels().size()){
				this.vehicleType = VehicleType.BICYCLE;
			} else if(Frames.METAL.equals(this.frame.getMaterial()) 
					&& Powertrains.INTERNALCOMBUSTION.equals(this.powertrain.getInternalCombustion())
					&& 2==this.getWheels().size()){
				this.vehicleType = VehicleType.MOTORCYCLE;
			} else if(Frames.PLASTIC.equals(this.frame.getMaterial()) 
					&& Powertrains.BERNOULLI.equals(this.powertrain.getBernoulli())
					&& 0==this.getWheels().size()){
				this.vehicleType = VehicleType.HANGGLIDER;
			} else if(Frames.METAL.equals(this.frame.getMaterial()) 
					&& Powertrains.INTERNALCOMBUSTION.equals(this.powertrain.getInternalCombustion())
					&& 4==this.getWheels().size()){
				this.vehicleType = VehicleType.CAR;
			}
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vehicle){
			Vehicle vehicle = (Vehicle)obj;
			return this.getVehicleType().equals(vehicle.getVehicleType());
		}
		return false;
	}
	
}
