package com.workscape.vehicleidentifier.bind;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class Wheel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2582517143898572760L;
	private String position;
	private String material;
	
	public Wheel() {
		super();
	}

	public Wheel(String position, String material) {
		super();
		this.position = position;
		this.material = material;
	}
	
	
	@XmlElement
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@XmlElement
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
