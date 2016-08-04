package com.workscape.vehicleidentifier.constants;

public enum VehicleType {
	
	BIGWHEEL("Big Wheel", Frames.PLASTIC,Powertrains.HUMAN,3),
	BICYCLE("Bicycle", Frames.METAL,Powertrains.HUMAN,2),
	MOTORCYCLE("Motercycle", Frames.METAL,Powertrains.INTERNALCOMBUSTION,2),
	HANGGLIDER("Hang Glider", Frames.PLASTIC,Powertrains.BERNOULLI,0),
	CAR("Car", Frames.METAL,Powertrains.INTERNALCOMBUSTION,4);
	
	private String name;
	private String frame;
	private String powetrain;
	private int wheels;
	
	VehicleType(String name, String frame, String powertrain, int wheels){
		this.name = name;
		this.frame = frame;
		this.powetrain = powertrain;
		this.wheels = wheels;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public String getPowetrain() {
		return powetrain;
	}

	public void setPowetrain(String powetrain) {
		this.powetrain = powetrain;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
}
