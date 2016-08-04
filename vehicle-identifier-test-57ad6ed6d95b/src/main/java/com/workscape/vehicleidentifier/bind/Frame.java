package com.workscape.vehicleidentifier.bind;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class Frame implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5744855334068132907L;
	
	
	private String material;
	
	public Frame() {
		super();
	}

	public Frame(String material) {
		super();
		this.material = material;
	}
	
	@XmlElement
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
